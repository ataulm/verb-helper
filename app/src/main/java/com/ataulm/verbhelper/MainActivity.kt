package com.ataulm.verbhelper

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.room.*
import com.ataulm.verbhelper.ui.theme.VerbHelperTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initDb()

        setContent {
            VerbHelperTheme {
                Text(text = "hey")
            }
        }
    }

    private fun initDb() {
        val database: VerbsDatabase =
            Room.databaseBuilder(applicationContext, VerbsDatabase::class.java, "verbs.db")
                .createFromAsset("verbs.db")
                .allowMainThreadQueries() // TODO: let's not
                .build()

        val result = database.verb().query("comer")
        Log.d("!!!", result.toString())
    }
}
