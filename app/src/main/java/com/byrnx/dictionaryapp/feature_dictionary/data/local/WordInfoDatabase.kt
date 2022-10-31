package com.byrnx.dictionaryapp.feature_dictionary.data.local

import androidx.room.AutoMigration
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.byrnx.dictionaryapp.feature_dictionary.data.local.entities.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 5,
    exportSchema = true
)
@TypeConverters(Converters::class)
abstract class WordInfoDatabase: RoomDatabase() {

    abstract val dao: WordInfoDao
}