package net.adamhilton.androidkotlinmvvm.data.remote

import net.adamhilton.androidkotlinmvvm.injection.scope.PerApplication
import javax.inject.Inject

@PerApplication
class LocalDataService @Inject constructor() : DataService {
    override fun getData(): String {
        return "Hello from LocalDataService class!"
    }
}
