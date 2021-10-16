package com.ataulm.verbhelper

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Query
import androidx.room.RoomDatabase

@Database(
    version = 1,
    entities = [
        Gerund::class,
        Infinitive::class,
        Mood::class,
        PastParticiple::class,
        Tense::class,
        Verb::class
    ],
)
abstract class VerbsDatabase : RoomDatabase() {
    abstract fun gerund(): GerundDao
    abstract fun infinitive(): InfinitiveDao
    abstract fun mood(): MoodDao
    abstract fun pastParticiple(): PastParticipleDao
    abstract fun tense(): TenseDao
    abstract fun verb(): VerbDao
}

@Dao
interface GerundDao {
}

@Dao
interface InfinitiveDao {
}

@Dao
interface MoodDao {
}

@Dao
interface PastParticipleDao {
}

@Dao
interface TenseDao {
}

@Dao
interface VerbDao {

    @Query("SELECT * FROM verbs WHERE infinitive = :infinitive")
    fun query(infinitive: String): Verb
}
