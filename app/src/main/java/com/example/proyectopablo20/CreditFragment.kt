package com.example.proyectopablo20

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CreditFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CreditFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root =inflater.inflate(R.layout.fragment_credit, container, false)
        val btnVolver = root.findViewById<Button>(R.id.btnVolver)

        btnVolver.setOnClickListener {

            findNavController().navigate(R.id.action_creditFragment_to_menuFragment)
        }


        return root
    }


}