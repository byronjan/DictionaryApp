package com.byrnx.dictionaryapp.feature_dictionary.data.remote.dto


import com.byrnx.dictionaryapp.feature_dictionary.domain.models.License
import com.google.gson.annotations.SerializedName

data class LicenseDto(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
) {
    fun toLicense(): License {
        return License(
            name = name,
            url = url
        )
    }
}