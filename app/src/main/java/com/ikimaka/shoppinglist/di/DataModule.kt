package com.ikimaka.shoppinglist.di

import android.app.Application
import com.ikimaka.shoppinglist.data.AppDatabase
import com.ikimaka.shoppinglist.data.ShopListDao
import com.ikimaka.shoppinglist.data.ShopListRepositoryImpl
import com.ikimaka.shoppinglist.domain.ShopListRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindShopListRepository(impl: ShopListRepositoryImpl): ShopListRepository

    companion object {
        @ApplicationScope
        @Provides
        fun provideShopListDao(application: Application): ShopListDao {
            return AppDatabase.getInstance(application).shopListDao()
        }
    }
}