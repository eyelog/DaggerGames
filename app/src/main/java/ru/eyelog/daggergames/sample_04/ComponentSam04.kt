package ru.eyelog.daggergames.sample_04

import dagger.Component

@Component(modules = [ModuleSam04::class])
interface ComponentSam04 {
    fun inject(fragment: Fragment04Sample)
}