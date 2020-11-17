package com.example.kotlin_ek3

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.kotlin_ek3.databinding.FragmentAboutBinding
import com.example.kotlin_ek3.databinding.FragmentFalschBinding
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
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



        var viewPager = binding.viewPager2
        var adapter = StateAdapter((activity as FragmentActivity).supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        var names:ArrayList<String> = arrayListOf("Autor", "Version")
        // Icons werden beim Mediator überschrieben, wieder adden in der Schleife
        var icons:ArrayList<Int> = arrayListOf(R.drawable.ic_tag_faces_24px, R.drawable.ic_help_outline_24px)

        var tabLayout: TabLayout = binding.tabLayout
        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = names[position]
            tab.icon = context!!.getResources().getDrawable(icons[position], context!!.theme)
        }.attach()


        // Inflate the layout for this fragment
        return binding.root
    }

}
