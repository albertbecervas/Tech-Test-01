package com.abecerra.tech_test_ed.di.component

import com.abecerra.tech_test_ed.di.module.CoordinatorModule
import com.abecerra.tech_test_ed.di.module.data.RepositoryModule
import com.abecerra.tech_test_ed.di.module.domain.InteractorModule
import com.abecerra.tech_test_ed.di.module.presentation.PresenterModule
import com.abecerra.tech_test_ed.di.module.presentation.RouterModule
import com.abecerra.tech_test_ed.di.module.presentation.ViewModule
import com.abecerra.tech_test_ed.scenes.main.view.MainActivity
import dagger.Component

@Component(
    modules = [ViewModule::class, PresenterModule::class, RouterModule::class,
        CoordinatorModule::class, InteractorModule::class, RepositoryModule::class]
)
interface ViewComponent {

    fun inject(mainActivity: MainActivity)
}