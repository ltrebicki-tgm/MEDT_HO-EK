package com.example.kotlin_ek3

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlin_ek3.databinding.FragmentRegelnBinding
import kotlinx.android.synthetic.main.fragment_regeln.*
import kotlinx.android.synthetic.main.fragment_title.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [RegelnFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [RegelnFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegelnFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRegelnBinding>(
            inflater,
            R.layout.fragment_regeln, container, false
        )
        (activity as AppCompatActivity).supportActionBar?.title = "Regeln"
        var sharedPreference =  this.activity?.getSharedPreferences("pref", Context.MODE_PRIVATE)
        binding.textViewRegel.text = sharedPreference?.getString("regeltext","Klicke die Radiobuttons an").toString()
        binding.textField.editText?.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.textViewRegel.text = s
            }
        })
        binding.buttonClearPreference.setOnClickListener {
            sharedPreference?.edit()?.remove("regeltext")?.apply()
            Log.d("Cleared",sharedPreference?.getString("regelext","ds").toString())
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onStop() {
        super.onStop()
        var sharedPreference =  this.activity?.getSharedPreferences("pref", Context.MODE_PRIVATE)
        var editor = sharedPreference?.edit()?.putString("regeltext", textViewRegel.text.toString())?.apply()
    }

    override fun onResume() {
        super.onResume()

        var sharedPreference =  this.activity?.getSharedPreferences("pref", Context.MODE_PRIVATE)
        Log.d("onResume", sharedPreference?.getString("regelext","ds").toString())
        textViewRegel.text =  sharedPreference?.getString("regeltext","Klicke die Radiobuttons an").toString()
    }

}
