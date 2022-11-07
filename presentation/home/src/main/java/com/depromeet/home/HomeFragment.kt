package com.depromeet.home

import androidx.fragment.app.viewModels
import com.depromeet.core.BaseFragment
import com.depromeet.home.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {
    override val viewModel by viewModels<HomeViewModel>()
}
