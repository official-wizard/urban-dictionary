package com.urbandictionary.v0

import com.urbandictionary.v0.response.Definitions
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface UrbanInterface {

    /**
     * Searches for the specified [term] in the urban dictionary
     */
    @GET("/v0/define")
    fun define(
        @Query("term") term: String
    ): Call<Definitions>
}