package com.cyberwort.everythinggithub.modules.topGithubRepo.list.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.cyberwort.everythinggithub.R
import com.cyberwort.everythinggithub.core.data.networkResult.NetworkResult
import com.cyberwort.everythinggithub.core.ui.BaseFragment
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodel.GithubRepoListViewModel
import com.orhanobut.logger.Logger
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GithubRepoListFragment : BaseFragment() {

    override val viewModel: GithubRepoListViewModel by viewModels()

    override fun getLayoutId() = R.layout.fragment_github_repo_list

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setObservers()
    }

    private fun setObservers(){
        viewModel.getGithubRepList()
            .observe(viewLifecycleOwner) {
                if(it is NetworkResult.Success){
                    Logger.d("Got data in Fragment ${it.data?.items!![0].name}")
                }else{
                    Logger.d(it.message)
                }
            }
    }

}