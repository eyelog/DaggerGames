package ru.eyelog.daggergames.sample_06

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.eyelog.daggergames.sample_01.Gen01

@Module
class ModuleSam06(val context: Context?) {

    @Provides
    fun getGen() = Gen06(context)
}
