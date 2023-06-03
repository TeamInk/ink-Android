package com.with.ink.ink_android.feature.join

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.with.ink.ink_android.databinding.FragmentOnboardBinding
import com.with.ink.ink_android.databinding.FragmentTermsOfUseDetailBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author 박소연
 * @created 2023/06/03
 * @updated 2023/06/03
 * @desc
 */
@AndroidEntryPoint
class TermsOfUseDetailFragment : Fragment() {
    private val binding by lazy { FragmentTermsOfUseDetailBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initUI()
        return binding.root
    }

    private fun initUI() {
        // TODO: 웹뷰 연결
    }
}