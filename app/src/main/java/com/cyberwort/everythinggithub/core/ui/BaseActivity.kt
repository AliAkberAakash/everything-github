package com.cyberwort.everythinggithub.core.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel

abstract class BaseActivity : AppCompatActivity() {

    abstract val viewModel : BaseViewModel

    abstract fun getLayoutId(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
    }
}