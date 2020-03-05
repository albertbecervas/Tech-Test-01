package com.abecerra.tech_test_ed.navigation.routers

import com.abecerra.tech_test_ed.navigation.coordinator.Coordinator
import com.abecerra.tech_test_ed.scenes.main.router.MainRouter
import javax.inject.Inject

class MainRouterImpl @Inject constructor(private val coordinator: Coordinator) : MainRouter {
    override fun loadDefaultFragment(layout: Int) {
    }
}