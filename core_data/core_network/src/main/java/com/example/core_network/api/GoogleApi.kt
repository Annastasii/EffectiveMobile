package com.example.core_network.api

import com.example.core_network.dto.dtoi.DataDTOI
import retrofit2.Response
import retrofit2.http.GET

interface GoogleApi {
    @GET("u/0/uc?export=download&id=1z4TbeDkbfXkvgpoJprXbN85uCcD7f00r")
    suspend fun getJsonData(): Response<DataDTOI>
}