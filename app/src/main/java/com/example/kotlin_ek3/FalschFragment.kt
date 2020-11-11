package com.example.kotlin_ek3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.kotlin_ek3.databinding.FragmentFalschBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SchlechtFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SchlechtFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SchlechtFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Ergebnis"
        val binding = DataBindingUtil.inflate<FragmentFalschBinding>(inflater,
            R.layout.fragment_falsch,container,false)
        binding.buttonNeuerVersuch.setOnClickListener{view: View->
            view.findNavController()
                .navigate(R.id.action_falschFragment_to_mainFragment)}
        return binding.root
    }
}