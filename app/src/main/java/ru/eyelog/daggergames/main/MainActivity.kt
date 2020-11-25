package ru.eyelog.daggergames.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.eyelog.daggergames.R

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.mainScreen, MainFragment())
            .commit()
    }
}