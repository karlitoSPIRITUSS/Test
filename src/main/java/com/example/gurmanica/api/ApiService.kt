package com.example.gurmanica.api


import com.example.gurmanica.pojo.Data
import com.example.gurmanica.pojo.JsonData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/menu/list?executed=1,2,3,4,5&query=&orgId=09ee33b8-44a3-4273-bd7c-eabd81235160&delivery=true")
    fun getData(
        //@Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        //@Query(QUERY_PARAM_LIMIT) limit: Int = 10,
        //@Query(QUERY_PARAM_TO_SYMBOL) tSym: String = CURRENCY
    ): Single<Data>

    @GET("v2/menu/list?executed=1,2,3,4,5&query=&orgId=09ee33b8-44a3-4273-bd7c-eabd81235160&delivery=true")
    fun getJsonData(
        //@Query(QUERY_PARAM_API_KEY) apiKey: String = "",
        //@Query(QUERY_PARAM_FROM_SYMBOLS) fSyms: String,
        //@Query(QUERY_PARAM_TO_SYMBOLS) tSyms: String = CURRENCY
    ): Single<JsonData>

    /*companion object {
        private const val QUERY_PARAM_API_KEY = "api_key"
        private const val QUERY_PARAM_LIMIT = "limit"
        private const val QUERY_PARAM_TO_SYMBOL = "tsym"
        private const val QUERY_PARAM_TO_SYMBOLS = "tsyms"
        private const val QUERY_PARAM_FROM_SYMBOLS = "fsyms"

        private const val CURRENCY = "USD"
    }

     */
}