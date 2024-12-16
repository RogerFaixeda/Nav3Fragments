package com.faixeda.nav3fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.faixeda.nav3fragments.databinding.FragmentBlank1Binding
import com.faixeda.nav3fragments.databinding.FragmentBlank2Binding
import com.faixeda.nav3fragments.databinding.FragmentBlank3Binding


class BlankFragment3 : Fragment() {
    private lateinit var binding: FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicializa el binding correctamente
        binding = FragmentBlank3Binding.inflate(inflater, container, false)

        // Ahora puedes usar el binding
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment1, null)
        }

        // Devuelve la raíz de la vista
        return binding.root
    }
}
