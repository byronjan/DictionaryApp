package com.byrnx.dictionaryapp.feature_dictionary.domain.repository

import com.byrnx.dictionaryapp.core.util.Resource
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}