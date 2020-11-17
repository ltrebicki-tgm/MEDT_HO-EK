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
import com.example.kotlin_ek3.databinding.FragmentSecondQuestionBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [SecondQuestion.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [SecondQuestion.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondQuestion : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Zweite Frage"
        val binding = DataBindingUtil.inflate<FragmentSecondQuestionBinding>(inflater,
            R.layout.fragment_second_question,container,false)
        binding.buttonSubmitSecond.setOnClickListener @Suppress("UNUSED_ANONYMOUS_PARAMETER")
        { view: View ->
            val id = binding.radioGroupSecond.checkedRadioButtonId
            if (id == R.id.radioButton_gut_second && id != 1) {
                view.findNavController()
                    .navigate(R.id.action_secondQuestion_to_thirdQuestion)
            } else {
                view.findNavController()
                    .navigate(R.id.action_secondQuestion_to_falschFragment)
            }
        }

        return binding.root
    }
}
