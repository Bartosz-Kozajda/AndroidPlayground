package com.bkozajda.androidplayground.presentation

interface Mvp {
    interface View

    interface Presenter {
        fun attach(view: View)

        fun detach(view: View)
    }
}