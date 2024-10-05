package com.kehes.fragmentslesson

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.kehes.fragmentslesson.base.BaseFragment
import com.kehes.fragmentslesson.databinding.FragmentMainBinding

class MainFragment: BaseFragment<FragmentMainBinding>(FragmentMainBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.titleView.setOnClickListener {
            // navigate(SecondFragment().javaClass)
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToSecondFragment("Hello second fragment"))
        }
    }
}

enum class ArgumentKey {
    NAME
}