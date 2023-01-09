package com.example.marsphotos.network

import com.example.marsphotos.data.AppContainer
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit
import retrofit2.http.GET



// val contentType = "application/json".toMediaType()





interface MarsApiService {
    @GET("photos")
   suspend fun getPhotos(): List<MarsPhoto>
}


object MarsApi{

}