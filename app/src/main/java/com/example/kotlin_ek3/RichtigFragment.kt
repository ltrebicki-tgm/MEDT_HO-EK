package com.example.kotlin_ek3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.kotlin_ek3.databinding.FragmentRichtigBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [GutFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [GutFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRichtigBinding>(inflater,
            R.layout.fragment_richtig,container,false)
        return binding.root
    }
}