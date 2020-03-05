package com.abecerra.tech_test_ed.navigation.coordinator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import java.lang.ref.WeakReference

class CoordinatorImpl(private val context: WeakReference<Context?>?) : Coordinator {

    override fun replaceFragment(fragment: Fragment, layout: Int) {
        when (context?.get()) {
            is AppCompatActivity -> {
                (context.get() as AppCompatActivity).supportFragmentManager.beginTransaction()
                    .add(layout, fragment).commit()
            }
        }
    }
}