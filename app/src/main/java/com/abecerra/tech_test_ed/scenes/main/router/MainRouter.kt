package com.abecerra.tech_test_ed.scenes.main.router

import androidx.annotation.IdRes

interface MainRouter {
    fun loadDefaultFragment(@IdRes layout: Int)
}