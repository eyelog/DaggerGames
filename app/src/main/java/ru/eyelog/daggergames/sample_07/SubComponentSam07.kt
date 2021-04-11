package ru.eyelog.daggergames.sample_07

import dagger.Subcomponent

@Subcomponent
interface SubComponentSam07 {

    @Subcomponent.Factory
    interface Factory{
        fun create(): SubComponentSam07
    }

    fun inject(fragment: Fragment07Sample)
}