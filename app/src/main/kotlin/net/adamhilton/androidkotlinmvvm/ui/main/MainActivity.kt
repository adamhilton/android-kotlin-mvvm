package net.adamhilton.androidkotlinmvvm.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import net.adamhilton.androidkotlinmvvm.App
import net.adamhilton.androidkotlinmvvm.R
import net.adamhilton.androidkotlinmvvm.injection.component.DaggerMainScreenComponent
import net.adamhilton.androidkotlinmvvm.injection.module.MainScreenModule

class MainActivity : AppCompatActivity() {

    @BindView(R.id.data)
    lateinit var data: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        DaggerMainScreenComponent.builder()
                .appComponent(App.appComponent)
                .mainScreenModule(MainScreenModule())
                .build()
                .inject(this)
    }

    @OnClick(R.id.get_data_button)
    fun getDataButtonClicked() {
        // do something...
    }
}
