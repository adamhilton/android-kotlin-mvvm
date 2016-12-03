package net.adamhilton.androidkotlinmvvm.injection.component

import dagger.Component
import net.adamhilton.androidkotlinmvvm.injection.scope.PerActivity
import net.adamhilton.androidkotlinmvvm.ui.main.MainActivity

@PerActivity
@Component(dependencies = arrayOf(AppComponent::class))
interface MainScreenComponent {
    fun inject(activity: MainActivity)
}
