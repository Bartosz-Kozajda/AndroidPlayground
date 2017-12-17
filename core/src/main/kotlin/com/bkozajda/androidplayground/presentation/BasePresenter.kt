package com.bkozajda.androidplayground.presentation

open class BasePresenter : Mvp.Presenter {

    private lateinit var view: Mvp.View

    override fun attach(view: Mvp.View) {
        this.view = view
    }

    override fun detach(view: Mvp.View) {
        this.view = view
    }
}