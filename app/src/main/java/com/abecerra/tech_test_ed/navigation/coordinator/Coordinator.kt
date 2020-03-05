package com.abecerra.tech_test_ed.navigation.coordinator

import androidx.fragment.app.Fragment

interface Coordinator {

    fun replaceFragment(fragment: Fragment, layout: Int)
}