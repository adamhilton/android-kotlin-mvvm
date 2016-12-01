package net.adamhilton.androidkotlinmvvm

import android.app.Application
import android.support.annotation.CallSuper
import net.adamhilton.androidkotlinmvvm.injection.component.AppComponent
import net.adamhilton.androidkotlinmvvm.injection.component.DaggerAppComponent

open class App : Application() {

    companion object {
        @JvmStatic lateinit  var appComponent: AppComponent
            private set
    }

    @CallSuper
    override fun onCreate() {
        super.onCreate()
        appComponent = createAppComponent()
    }

    open protected fun createAppComponent(): AppComponent {
        return DaggerAppComponent.builder().build()
    }

}
