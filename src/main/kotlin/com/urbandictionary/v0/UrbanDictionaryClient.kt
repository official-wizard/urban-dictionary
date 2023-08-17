package com.urbandictionary.v0

import com.urbandictionary.CoreClient

object UrbanDictionaryClient: CoreClient("https://api.urbandictionary.com/") {
    val api: UrbanInterface = retroClient.create(UrbanInterface::class.java)
}