package com.kehes.fragmentslesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.kehes.fragmentslesson.base.BaseFragment
import com.kehes.fragmentslesson.databinding.FragmentMainBinding

class SecondFragment: BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleView.text = args.name
    }
}