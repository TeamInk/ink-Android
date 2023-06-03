package com.with.ink.ink_android.feature.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.with.ink.ink_android.databinding.FragmentOnboardBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author 박소연
 * @created 2023/06/03
 * @updated 2023/06/03
 * @desc
 */
@AndroidEntryPoint
class OnBoardNicknameFragment : Fragment() {
    private val binding by lazy { FragmentOnboardBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<OnBoardViewModel>()

    private fun setUI() {
        // TODO: 카카오 로그인 요청
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}