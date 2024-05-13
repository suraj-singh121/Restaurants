package com.example.project_dequeue

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlin.concurrent.fixedRateTimer

class FirstScreen : Fragment() {

    lateinit var viewf:View
    lateinit var signup_button: Button
    lateinit var login_button:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        viewf=inflater.inflate(R.layout.fragment_first_screen, container, false)

        signup_button=viewf.findViewById(R.id.signup)
        signup_button.setOnClickListener(){
            val sigup_frag=Signup()
            fragmentManager?.beginTransaction()?.replace(R.id.main,sigup_frag)?.commit()
        }

        login_button=viewf.findViewById(R.id.femail)
        login_button.setOnClickListener(){
            fragmentManager?.beginTransaction()?.replace(R.id.main1,LoginPage())?.commit()
            Toast.makeText(context,"Welcome to Login Screen",Toast.LENGTH_SHORT).show()
        }

        return viewf
    }
}