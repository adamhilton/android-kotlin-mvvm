package net.adamhilton.androidkotlinmvvm.injection.component

import dagger.Component
import net.adamhilton.androidkotlinmvvm.injection.module.DataModule
import net.adamhilton.androidkotlinmvvm.injection.scope.PerApplication
import net.adamhilton.androidkotlinmvvm.data.remote.DataService

@PerApplication
@Component(modules = arrayOf(DataModule::class))
interface AppComponent {

    fun dataService(): DataService

}

