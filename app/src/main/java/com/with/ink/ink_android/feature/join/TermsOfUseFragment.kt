package com.with.ink.ink_android.feature.join

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.with.ink.ink_android.R
import com.with.ink.ink_android.databinding.FragmentTermsOfUseBinding
import dagger.hilt.android.AndroidEntryPoint

/**
 * @author 박소연
 * @created 2023/05/16
 * @updated 2023/05/16
 * @desc
 */
@AndroidEntryPoint
class TermsOfUseFragment : Fragment() {
    private val binding by lazy { FragmentTermsOfUseBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<TermsOfUseViewModel>()

    private fun setUI() {
        // TODO: 이용약관 노출
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        initUI()
        return binding.root
    }

    private fun initUI() {
        initClickListener()
    }

    private fun initClickListener() {
        binding.ivAllAgree.setOnClickListener {
            binding.ivAllAgree.isSelected = !binding.ivAllAgree.isSelected

            if (binding.ivAllAgree.isSelected) {
                binding.ivTerm1Agree.isSelected = true
                binding.ivTerm2Agree.isSelected = true
            } else {
                binding.ivTerm1Agree.isSelected = false
                binding.ivTerm2Agree.isSelected = false
            }

            checkNextButtonState()
        }
        binding.ivTerm1Agree.setOnClickListener {
            binding.ivTerm1Agree.isSelected = !binding.ivTerm1Agree.isSelected
            if (!binding.ivTerm2Agree.isSelected) {
                binding.ivAllAgree.isSelected = false
            }
            checkNextButtonState()
        }
        binding.ivTerm2Agree.setOnClickListener {
            binding.ivTerm2Agree.isSelected = !binding.ivTerm2Agree.isSelected
            checkNextButtonState()
        }

        binding.ivTerm1Detail.setOnClickListener {
            // TODO: 서비스 이용약관 동의 웹뷰
            findNavController().navigate(R.id.navigation_terms_of_use_detail)
        }

        binding.ivTerm2Detail.setOnClickListener {
            // TODO: 개인정보 수집/이용약관 동의 웹뷰
            findNavController().navigate(R.id.navigation_terms_of_use_detail)
        }
    }

    private fun checkNextButtonState() {
        binding.btnNext.isSelected =
            binding.ivTerm1Agree.isSelected && binding.ivTerm2Agree.isSelected
        binding.ivAllAgree.isSelected =
            binding.ivTerm1Agree.isSelected && binding.ivTerm2Agree.isSelected
    }
}