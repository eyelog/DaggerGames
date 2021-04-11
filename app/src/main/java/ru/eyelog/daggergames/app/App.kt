package ru.eyelog.daggergames.app

import android.app.Application

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        DaggerComponentApp
                .builder()
                .appModule(ModuleApp(applicationContext))
                .build()
                .inject(this)
    }
}
