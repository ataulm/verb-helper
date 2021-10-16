package com.ataulm.verbhelper

import androidx.room.*

@Entity(tableName = "gerund")
data class Gerund(
    @PrimaryKey
    @ColumnInfo(name = "infinitive")
    val infinitive: String,

    @ColumnInfo(name = "gerund_english")
    val gerundEnglish: String,

    @ColumnInfo(name = "gerund")
    val gerund: String,
)

@Entity(tableName = "infinitive")
data class Infinitive(
    @PrimaryKey
    @ColumnInfo(name = "infinitive")
    val infinitive: String,

    @ColumnInfo(name = "infinitive_english")
    val infinitiveEnglish: String
)

@Entity(tableName = "mood")
data class Mood(
    @PrimaryKey
    @ColumnInfo(name = "mood")
    val mood: String,

    @ColumnInfo(name = "mood_english")
    val moodEnglish: String
)

@Entity(tableName = "pastparticiple")
data class PastParticiple(
    @PrimaryKey
    @ColumnInfo(name = "infinitive")
    val infinitive: String,

    @ColumnInfo(name = "pastparticiple")
    val pastParticiple: String,

    @ColumnInfo(name = "pastparticiple_english")
    val pastParticipleEnglish: String
)

@Entity(tableName = "tense")
data class Tense(
    @PrimaryKey
    @ColumnInfo(name = "tense")
    val tense: String,

    @ColumnInfo(name = "tense_english")
    val tenseEnglish: String,
)

@Entity(tableName = "verbs", primaryKeys = ["infinitive", "mood", "tense"])
data class Verb(
    @ColumnInfo(name = "infinitive")
    val infinitive: String,

    @ColumnInfo(name = "mood")
    val mood: String,

    @ColumnInfo(name = "tense")
    val tense: String,

    @ColumnInfo(name = "verb_english")
    val verbEnglish: String,

    @ColumnInfo(name = "form_1s")
    val firstPersonSingular: String,

    @ColumnInfo(name = "form_2s")
    val secondPersonSingular: String,

    @ColumnInfo(name = "form_3s")
    val thirdPersonSingular: String,

    @ColumnInfo(name = "form_1p")
    val firstPersonPlural: String,

    @ColumnInfo(name = "form_2p")
    val secondPersonPlural: String,

    @ColumnInfo(name = "form_3p")
    val thirdPersonPlural: String,
)
