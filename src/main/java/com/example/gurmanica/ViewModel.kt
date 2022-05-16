package com.example.gurmanica

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.gurmanica.api.ApiFactory
import com.example.gurmanica.pojo.JsonData
import com.example.gurmanica.pojo.Position
import com.google.gson.Gson
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class ViewModel(application: Application):AndroidViewModel(application) {
    private val db = AppDatabase.getInstance(application)

    private val compositeDisposable = CompositeDisposable()

    val priceList = db.positionDao().getPositionList()

    fun getDetailInfo(): LiveData<List<Position>> {
        return db.positionDao().getPositionList()
    }

    init {
        loadData()
    }

    fun loadData() {
        val disposable = ApiFactory.apiService.getData()
            //.map { it.data?.map { it.coinInfo?.name }?.joinToString(",") }
            .flatMap { ApiFactory.apiService.getData() }
            //.map { getJsonData() }
            .delaySubscription(10, TimeUnit.SECONDS)
            .repeat()
            .retry()
            .subscribeOn(Schedulers.io())
            .subscribe({
                //db.positionDao().insertPositionList()
                Log.d("TEST_OF_LOADING_DATA", "Success: $it")
            }, {
                Log.d("TEST_OF_LOADING_DATA", "Failure: ${it.message}")
            })
        compositeDisposable.add(disposable)
    }

    //  !!!!!!!!!!!!!!!!!

    /*
    private fun getJsonData(
        getJsonData: JsonData
    ): List<List<Position>> {
        val result = ArrayList<Position>()
        val jsonObject = coinPriceInfoRawData.coinPriceInfoJsonObject ?: return result
        val coinKeySet = jsonObject.keySet()
        for (coinKey in coinKeySet) {
            val currencyJson = jsonObject.getAsJsonObject(coinKey)
            val currencyKeySet = currencyJson.keySet()
            for (currencyKey in currencyKeySet) {
                val priceInfo = Gson().fromJson(
                    currencyJson.getAsJsonObject(currencyKey),
                    CoinPriceInfo::class.java
                )
                result.add(priceInfo)
            }
        }
        return result
    }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

     */
}
