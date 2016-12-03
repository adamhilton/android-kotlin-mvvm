package net.adamhilton.androidkotlinmvvm.data.remote

import io.reactivex.Observable

interface DataService {
    fun getData() : Observable<String>
}
