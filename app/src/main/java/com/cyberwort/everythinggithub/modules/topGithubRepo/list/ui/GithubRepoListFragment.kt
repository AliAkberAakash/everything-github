package com.cyberwort.everythinggithub.modules.topGithubRepo.list.ui

import androidx.fragment.app.viewModels
import com.cyberwort.everythinggithub.R
import com.cyberwort.everythinggithub.core.ui.BaseFragment
import com.cyberwort.everythinggithub.modules.topGithubRepo.list.viewmodel.GithubRepoListViewModel

class GithubRepoListFragment : BaseFragment<GithubRepoListViewModel>() {

    override val viewModel: GithubRepoListViewModel by viewModels()

    override fun getLayoutId() = R.layout.fragment_github_repo_list
}