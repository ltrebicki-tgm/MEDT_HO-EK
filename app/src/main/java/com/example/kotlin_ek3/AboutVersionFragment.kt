package com.example.kotlin_ek3

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlin_ek3.databinding.FragmentAboutVersionBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_about.*
import kotlinx.android.synthetic.main.fragment_about_version.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [AboutVersionFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [AboutVersionFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AboutVersionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutVersionBinding>(
            inflater,
            R.layout.fragment_about_version, container, false
        )
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
