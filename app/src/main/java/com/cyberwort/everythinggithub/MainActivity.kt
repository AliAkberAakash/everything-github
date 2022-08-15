package com.cyberwort.everythinggithub

import com.cyberwort.everythinggithub.core.ui.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {
    override fun getLayoutId() = R.layout.activity_main
}