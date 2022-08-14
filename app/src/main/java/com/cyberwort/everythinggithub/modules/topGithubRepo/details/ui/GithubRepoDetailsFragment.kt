package com.cyberwort.everythinggithub.modules.topGithubRepo.details.ui

import androidx.fragment.app.viewModels
import com.cyberwort.everythinggithub.R
import com.cyberwort.everythinggithub.core.ui.BaseFragment
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.viewmodel.GithubRepoDetailsViewModel

class GithubRepoDetailsFragment : BaseFragment<GithubRepoDetailsViewModel>() {

    override val viewModel : GithubRepoDetailsViewModel by viewModels()

    override fun getLayoutId() = R.layout.fragment_github_repo_details

}