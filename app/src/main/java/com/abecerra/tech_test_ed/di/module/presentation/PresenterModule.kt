package com.abecerra.tech_test_ed.di.module.presentation

import com.abecerra.tech_test_ed.scenes.main.presenter.MainPresenter
import com.abecerra.tech_test_ed.scenes.main.presenter.MainPresenterImpl
import dagger.Module
import dagger.Provides

@Module
open class PresenterModule {

    @Provides
    fun provideMainPresenter(): MainPresenter {
        return MainPresenterImpl()
    }
}