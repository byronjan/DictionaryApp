package com.byrnx.dictionaryapp.feature_dictionary.data.local

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.byrnx.dictionaryapp.feature_dictionary.data.util.JsonParser
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.License
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.Meaning
import com.byrnx.dictionaryapp.feature_dictionary.domain.models.Phonetic
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class Converters(
    private val jsonParser: JsonParser
) {
    @TypeConverter
    fun fromMeaningsJson(json: String): List<Meaning> {
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings: List<Meaning>): String {
        return jsonParser.toJson(
            meanings,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: "[]"
    }

    @TypeConverter
    fun fromLicenseJson(json: String): License? {
        return jsonParser.fromJson<License>(
            json,
            object: TypeToken<License>(){}.type
        )
    }

    @TypeConverter
    fun toLicenseJson(license: License): String {
        return jsonParser.toJson(
            license,
            object : TypeToken<License>(){}.type
        ) ?: ""
    }

    @TypeConverter
    fun fromPhoneticsJson(json: String): List<Phonetic> {
        return jsonParser.fromJson<ArrayList<Phonetic>>(
            json,
            object : TypeToken<ArrayList<Phonetic>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toPhoneticsJson(phonetics: List<Phonetic>): String {
        return jsonParser.toJson(
            phonetics,
            object : TypeToken<ArrayList<Phonetic>>(){}.type
        ) ?: "[]"
    }

    @TypeConverter
    fun fromStringListJson(json: String): List<String> {
        return jsonParser.fromJson<ArrayList<String>>(
            json,
            object : TypeToken<ArrayList<String>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toStringListJson(list: List<String>): String {
        return jsonParser.toJson(
            list,
            object : TypeToken<ArrayList<String>>(){}.type
        ) ?: "[]"
    }
}