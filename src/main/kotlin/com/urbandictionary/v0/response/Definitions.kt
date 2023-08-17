package com.urbandictionary.v0.response

/**
 * A POJO Object for formatting responses from the API for term queries
 */
data class Definitions (val list: List<Definition>) {
    data class Definition(
        val word: String,
        val definition: String,
        val example: String,
        val author: String,

        val permalink: String,
        val defid: Long,

        val current_vote: Any?,
        val written_on: String,
        val thumbs_up: Long,
        val thumbs_down: Long
    )
}