package com.cyberwort.everythinggithub.core.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cyberwort.everythinggithub.core.viewmodel.BaseViewModel

abstract class BaseFragment<ViewModel : BaseViewModel> : Fragment() {

    abstract val viewModel : ViewModel

    abstract fun getLayoutId(): Int

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(getLayoutId(), container, false)
    }

}