package com.cyberwort.everythinggithub.core.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel

abstract class BaseActivity<ViewModel : BaseViewModel> : AppCompatActivity() {

    abstract val viewModel : ViewModel

    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }
}