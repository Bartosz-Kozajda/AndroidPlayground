package com.bkozajda.androidplayground

import android.app.Application
import org.koin.android.ext.android.startKoin

class PlaygroundApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this, ArrayList())
    }
}