package net.adamhilton.androidkotlinmvvm.data.remote

import io.reactivex.Observable
import net.adamhilton.androidkotlinmvvm.injection.scope.PerApplication
import javax.inject.Inject

@PerApplication
class LocalDataService @Inject constructor() : DataService {
    override fun getData(): Observable<String> {
        return Observable.just("Hello from LocalDataService class! Your luck number is: \n${Math.random()}")
    }
}
