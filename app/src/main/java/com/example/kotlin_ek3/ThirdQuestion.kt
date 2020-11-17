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
import androidx.navigation.findNavController
import com.example.kotlin_ek3.databinding.FragmentThirdQuestionBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ThirdQuestion.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ThirdQuestion.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdQuestion : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Zweite Frage"
        val binding = DataBindingUtil.inflate<FragmentThirdQuestionBinding>(inflater,
            R.layout.fragment_third_question,container,false)
        binding.buttonSubmitThird.setOnClickListener @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            val id = binding.radioGroupThird.checkedRadioButtonId
            if (id == R.id.radioButton_gut_third && id != 1) {
                view.findNavController()
                    .navigate(R.id.action_thirdQuestion_to_falschFragment)
            } else {
                view.findNavController()
                    .navigate(R.id.action_thirdQuestion_to_richtigFragment)
            }
        }

        return binding.root
    }
}
