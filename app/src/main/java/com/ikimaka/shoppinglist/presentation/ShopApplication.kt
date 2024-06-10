package com.ikimaka.shoppinglist.presentation

import android.app.Application
import com.ikimaka.shoppinglist.di.DaggerApplicationComponent

class ShopApplication: Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}