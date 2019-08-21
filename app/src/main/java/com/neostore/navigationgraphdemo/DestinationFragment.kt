package com.neostore.navigationgraphdemo


import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class DestinationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val safeArgs: DestinationFragmentArgs by navArgs()
        val userName = safeArgs.userName

        Log.d("UserName", userName)
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_destination, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val safeArgs: DestinationFragmentArgs by navArgs()
        Log.d(
            "User Name",
            arguments?.let { DestinationFragmentArgs.fromBundle(it).userName } ?: "User Name is not provided"
        )

//        Log.d("User Name", arguments?.getString("user name") ?: "")
//        txt_welcome_msg.text = "Hello "+ String.format("%s","${arguments?.getString("user name" )}")

//        val userName =
//        txt_welcome_msg.text = userName
    }

}
