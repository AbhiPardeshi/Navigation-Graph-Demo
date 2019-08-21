package com.neostore.navigationgraphdemo


import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_welcome_me)
        button?.setOnClickListener {
            val edtUserName = view.findViewById<EditText>(R.id.edt_name)
            val userName = edtUserName.text.toString()
//            if (!userName.isEmpty()) {
//                val action = MainFragmentDirections.actionMainFragmentToDestinationFragment("hello")
//                val nameArgs = Bundle()
//                nameArgs.putString("user name", name)

            val options = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val action = MainFragmentDirections.actionMainFragmentToDestinationFragment()
            findNavController().navigate(action, options)
//            } else {
//                edtUserName.error = "Please enter your name"
//            }
        }

//        buttonWelcomeMe.setOnClickListener {
//            val name = enterName.text.toString()
//
//            if (name.isEmpty()) {
//                enterName.error = "Please enter a name"
//            } else {
//                view.findNavController().navigate(R.id.destinationFragment)
//            }
//        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.main_menu, menu)
    }

}
