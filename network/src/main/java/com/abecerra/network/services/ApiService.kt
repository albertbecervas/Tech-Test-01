package com.abecerra.network.services

import com.abecerra.network.utils.Endpoints
import retrofit2.http.GET

interface ApiService {

    @GET(Endpoints.LIST_EP)
    fun getList()
}