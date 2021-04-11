package ru.eyelog.daggergames.app

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ModuleApp(private var appContext: Context) {

    @Provides
    fun getContext(): Context = appContext
}
