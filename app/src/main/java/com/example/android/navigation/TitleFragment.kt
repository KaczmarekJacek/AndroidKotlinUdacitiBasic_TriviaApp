package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
/*
        return TextView(activity).apply {
            setText(R.string.hello_blank_fragment)
*/
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater, R.layout.fragment_title,
                container, false)
/*
        binding.playButton.setOnClickListener {view : View ->
            Navigation.findNavController(view).navigate(R.id.action_titleFragment_to_gameFragment)
        }

        binding.playButton.setOnClickListener {view : View ->
            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
        }
 */
        binding.playButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment)
        )

        return binding.root //!!!!!!!!!!!!!
        }
    }

