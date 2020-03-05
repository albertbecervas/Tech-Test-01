package com.abecerra.tech_test_ed.di.module.presentation

import com.abecerra.tech_test_ed.navigation.coordinator.Coordinator
import com.abecerra.tech_test_ed.navigation.routers.MainRouterImpl
import com.abecerra.tech_test_ed.scenes.main.router.MainRouter
import dagger.Module
import dagger.Provides

@Module
open class RouterModule {

    @Provides
    open fun provideMainRouter(coordinator: Coordinator): MainRouter {
        return MainRouterImpl(coordinator)
    }
}