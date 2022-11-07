package com.depromeet.map

import androidx.fragment.app.viewModels
import com.depromeet.core.BaseFragment
import com.depromeet.map.databinding.FragmentMapBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapFragment : BaseFragment<FragmentMapBinding, MapViewModel>(R.layout.fragment_map) {
    override val viewModel by viewModels<MapViewModel>()
}
