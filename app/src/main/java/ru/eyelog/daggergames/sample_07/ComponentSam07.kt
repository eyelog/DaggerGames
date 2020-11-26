package ru.eyelog.daggergames.sample_07

import dagger.Component
import ru.eyelog.daggergames.app.ModuleApp

@Component(
    modules = [
        ModuleApp::class,
        ModuleSam07::class
    ]
)
interface ComponentSam07 {

    fun inject(fragment: Fragment07Sample)
}