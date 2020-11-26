package ru.eyelog.daggergames.app

import dagger.Component

@Component(modules = [ModuleApp::class])
interface ComponentApp {

    @Component.Builder
    interface Builder {

        fun withContext(moduleApp: ModuleApp): Builder

        fun build(): ComponentApp
    }
}
