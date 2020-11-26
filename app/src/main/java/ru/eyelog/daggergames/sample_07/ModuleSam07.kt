package ru.eyelog.daggergames.sample_07

import android.content.Context
import dagger.Module
import dagger.Provides

@Module
class ModuleSam07 {

    @Provides
    fun getGen(context: Context) = Gen07(context)
}
