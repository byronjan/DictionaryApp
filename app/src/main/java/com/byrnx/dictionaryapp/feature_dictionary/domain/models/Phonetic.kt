package com.byrnx.dictionaryapp.feature_dictionary.domain.models


data class Phonetic(
    val audio: String,
    val license: License?,
    val sourceUrl: String?,
    val text: String
)
