package com.bintangpoetra.rickmortyapp.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bintangpoetra.rickmortyapp.base.BaseFragment
import com.bintangpoetra.rickmortyapp.databinding.FragmentHomeBinding

class HomeFragment: BaseFragment<FragmentHomeBinding>() {

    override fun getViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): FragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

    override fun initIntent() {
    }

    override fun initUI() {
    }

    override fun initAction() {
    }

    override fun initProcess() {
    }

    override fun initObservers() {
    }
}