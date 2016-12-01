package net.adamhilton.androidkotlinmvvm.injection.module

import dagger.Binds
import dagger.Module
import net.adamhilton.androidkotlinmvvm.data.remote.DataService
import net.adamhilton.androidkotlinmvvm.data.remote.LocalDataService

@Module
abstract class DataModule {
    @Binds
    abstract fun bindDataService(dataService: LocalDataService) : DataService
}
