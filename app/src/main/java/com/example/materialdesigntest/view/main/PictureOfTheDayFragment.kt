package com.example.materialdesigntest.view.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.materialdesigntest.databinding.FragmentMainBinding

class PictureOfTheDayFragment : Fragment() {
    private var _binding: FragmentMainBinding ?= null
    val binding : FragmentMainBinding
    get ()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}