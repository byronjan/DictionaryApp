package com.byrnx.dictionaryapp.feature_dictionary.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.License
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.Meaning
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.Phonetic
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.WordInfo

@Entity
data class WordInfoEntity(
    val license: License?,
    val meanings: List<Meaning>,
    val phonetic: String?,
    val phonetics: List<Phonetic?>? = emptyList(),
    val sourceUrls: List<String>,
    val word: String,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            license = license,
            meanings = meanings,
            phonetic = phonetic,
            phonetics = phonetics,
            sourceUrls = sourceUrls,
            word = word
        )
    }
}
