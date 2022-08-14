package com.cyberwort.everythinggithub.modules.topGithubRepo.details.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.cyberwort.everythinggithub.R
import com.cyberwort.everythinggithub.modules.topGithubRepo.details.viewmodels.GithubRepoDetailsViewModel

class GithubRepoDetailsFragment : Fragment() {

    val viewModel : GithubRepoDetailsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_github_repo_details, container, false)
    }

}