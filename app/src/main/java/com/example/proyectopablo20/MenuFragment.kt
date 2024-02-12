package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class MenuFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_menu, container, false)
        val btnSalir = root.findViewById<Button>(R.id.btnSalir)
        val btnCreditos = root.findViewById<Button>(R.id.btnCreditos)


        btnSalir.setOnClickListener {

            findNavController().navigate(R.id.action_menuFragment_to_loginFragment)

        }

        btnCreditos.setOnClickListener {

            findNavController().navigate(R.id.action_menuFragment_to_creditFragment)
        }
        return root
    }



}