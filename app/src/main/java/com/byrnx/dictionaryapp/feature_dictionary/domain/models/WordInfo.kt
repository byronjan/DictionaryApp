package com.byrnx.dictionaryapp.feature_dictionary.domain.models


data class WordInfo(
    val license: License?,
    val meanings: List<Meaning>,
    val phonetic: String?,
    val phonetics: List<Phonetic?>? = emptyList(),
    val sourceUrls: List<String>,
    val word: String
)
