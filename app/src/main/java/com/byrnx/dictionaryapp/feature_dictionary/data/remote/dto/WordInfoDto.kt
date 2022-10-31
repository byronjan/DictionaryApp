package com.byrnx.dictionaryapp.feature_dictionary.data.remote.dto


import com.byrnx.dictionaryapp.feature_dictionary.data.local.entities.WordInfoEntity
import com.google.gson.annotations.SerializedName

data class WordInfoDto(
    @SerializedName("license")
    val license: LicenseDto?,
    @SerializedName("meanings")
    val meanings: List<MeaningDto>,
    @SerializedName("phonetic")
    val phonetic: String?,
    @SerializedName("phonetics")
    val phonetics: List<PhoneticDto?>? = emptyList(),
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>,
    @SerializedName("word")
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            license = license?.toLicense(),
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            phonetics = phonetics?.map { it?.toPhonetic() },
            sourceUrls = sourceUrls,
            word = word
        )
    }

}