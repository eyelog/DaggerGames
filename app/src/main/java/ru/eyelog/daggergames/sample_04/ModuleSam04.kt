package ru.eyelog.daggergames.sample_04

import dagger.Module
import dagger.Provides
import ru.eyelog.daggergames.sample_01.Gen01

@Module
class ModuleSam04 {

    @Provides
    fun getGen01() = Gen01()

    @Provides
    fun getGen04(gen: Gen01) = Gen04(gen)
}
