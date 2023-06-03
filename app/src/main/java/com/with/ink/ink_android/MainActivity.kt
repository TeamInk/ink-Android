package com.with.ink.ink_android

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.with.ink.ink_android.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcvMain) as NavHostFragment
        navController = navHostFragment.navController
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (destination.id == R.id.navigation_onboard || destination.id == R.id.navigation_terms_of_use
//            ) {
//                binding.btnvView.visibility = View.GONE
//            } else {
//                binding.btnvView.visibility = View.VISIBLE
//            }
//        }
//
//        binding.btnvView.setupWithNavController(navController)
    }
}