package ru.eyelog.daggergames.sample_05

import dagger.Module
import dagger.Provides
import ru.eyelog.daggergames.sample_01.Gen01

@Module
class ModuleSam05_01 {

    @Provides
    fun getGen04(gen: Gen01) = Gen05(gen)
}
