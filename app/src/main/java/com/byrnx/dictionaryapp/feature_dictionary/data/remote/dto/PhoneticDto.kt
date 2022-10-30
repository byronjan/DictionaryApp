package com.byrnx.dictionaryapp.feature_dictionary.data.remote.dto


import com.byrnx.dictionaryapp.feature_dictionary.domain.models.Phonetic
import com.google.gson.annotations.SerializedName

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("license")
    val license: LicenseDto?,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("text")
    val text: String
) {
    fun toPhonetic(): Phonetic {
        return Phonetic(
            audio = audio,
            license = license?.toLicense(),
            sourceUrl = sourceUrl,
            text = text
        )
    }
}