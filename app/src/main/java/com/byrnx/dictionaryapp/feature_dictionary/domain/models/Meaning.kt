package com.byrnx.dictionaryapp.feature_dictionary.domain.models

import com.byrnx.dictionaryapp.feature_dictionary.data.remote.dto.DefinitionDto
import com.google.gson.annotations.SerializedName

data class Meaning(
    val antonyms: List<String>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
