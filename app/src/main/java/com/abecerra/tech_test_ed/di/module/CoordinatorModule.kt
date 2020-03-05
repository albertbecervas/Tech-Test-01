package com.abecerra.tech_test_ed.di.module

import android.content.Context
import com.abecerra.tech_test_ed.navigation.coordinator.Coordinator
import com.abecerra.tech_test_ed.navigation.coordinator.CoordinatorImpl
import dagger.Module
import dagger.Provides
import java.lang.ref.WeakReference

@Module
class CoordinatorModule {

    @Provides
    fun provideCoordinator(context: Context?): Coordinator {
        return CoordinatorImpl(WeakReference(context))
    }
}