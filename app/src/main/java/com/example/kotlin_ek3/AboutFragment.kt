package com.example.kotlin_ek3

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlin_ek3.databinding.FragmentAboutBinding
import com.example.kotlin_ek3.databinding.FragmentFalschBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_about.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AboutFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AboutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater,
            R.layout.fragment_about, container, false
        )
        (activity as AppCompatActivity).supportActionBar?.title = "Über die App"
        binding.buttonAutor.setOnClickListener {
            Snackbar.make(
                buttonAutor,
                "Autor: Lukas Trebicki",
                Snackbar.LENGTH_LONG
            ).setAction("Schliessen"){}.setActionTextColor(resources.getColor(R.color.colorAccent)).show()
        }
        binding.buttonVersion.setOnClickListener {
            Snackbar.make(
                buttonVersion,
                "Version: 1.2.0",
                Snackbar.LENGTH_LONG
            ).setAction("Schliessen"){}.setActionTextColor(resources.getColor(R.color.colorAccent)).show()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}
