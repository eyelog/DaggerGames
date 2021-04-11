package ru.eyelog.daggergames.app

import dagger.Component
import ru.eyelog.daggergames.sample_07.SubComponentSam07
import ru.eyelog.daggergames.sample_07.SubModuleSam07

@Component(
        modules = [
            ModuleApp::class,
            SubModuleSam07::class
        ]
)
interface ComponentApp {

    @Component.Builder
    interface Builder {

        fun appModule(appModule: ModuleApp): Builder

        fun build(): ComponentApp
    }

    fun subComponentSam07(): SubComponentSam07.Factory

    fun inject(app: App)
}
