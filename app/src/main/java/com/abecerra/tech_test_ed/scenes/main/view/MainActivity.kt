package com.abecerra.tech_test_ed.scenes.main.view

import android.os.Bundle
import com.abecerra.base.presentation.BaseActivity
import com.abecerra.tech_test_ed.R
import com.abecerra.tech_test_ed.di.component.DaggerViewComponent
import com.abecerra.tech_test_ed.scenes.main.presenter.MainPresenter
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun getLayout(): Int = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerViewComponent.builder().build().inject(this)

        presenter.setView(this)
    }
}
