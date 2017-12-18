package com.bkozajda.androidplayground.di

import com.bkozajda.androidplayground.PlaygroundApp
import com.bkozajda.androidplayground.common.network.di.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [(AppModule::class), (NetworkModule::class)])
interface AppComponent {

    fun inject(application: PlaygroundApp): PlaygroundApp
}