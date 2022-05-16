package com.example.gurmanica.api


import com.example.gurmanica.pojo.Datum
import com.example.gurmanica.pojo.JsonData
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("api/v2/menu/list?executed=1,2,3,4,5&query=&orgId=09ee33b8-44a3-4273-bd7c-eabd81235160&delivery=true")
    fun getData(

    ): Single<Datum>

    @GET("api/v2/menu/list?executed=1,2,3,4,5&query=&orgId=09ee33b8-44a3-4273-bd7c-eabd81235160&delivery=true")
    fun getJsonData(

    ): Single<JsonData>


}