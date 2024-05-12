package com.example.nelsonfinalyearproject

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nelsonfinalyearproject.databinding.FragmentLoginBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class LoginFragment: Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.tvSignup.setOnClickListener {
            findNavController().navigate(R.id.signupFragment)
        }

        binding.tvSignupBottom.setOnClickListener {
            findNavController().navigate(R.id.signupFragment)
        }

        binding.tvForgotPass.setOnClickListener {
            findNavController().navigate(R.id.forgotPasswordFragment)
        }


    }

}