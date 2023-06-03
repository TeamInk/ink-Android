package com.with.ink.ink_android.feature.onboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.with.ink.ink_android.R
import com.with.ink.ink_android.databinding.FragmentOnboardBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author 박소연
 * @created 2023/05/16
 * @updated 2023/05/16
 * @desc
 */
@AndroidEntryPoint
class OnBoardFragment: Fragment() {
    private val binding by lazy { FragmentOnboardBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<OnBoardViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        initUI()
        return binding.root
    }

    private fun initUI() {
        binding.tvLoginGoogle.setOnClickListener {
            // TODO: success일때 다음 뷰로 넘김
            findNavController().navigate(R.id.navigation_terms_of_use)
        }

        binding.tvLoginKakao.setOnClickListener {
            // TODO: success일때 다음 뷰로 넘김
            findNavController().navigate(R.id.navigation_terms_of_use)
        }
    }
}