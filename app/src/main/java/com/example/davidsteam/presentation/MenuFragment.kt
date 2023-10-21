package com.example.davidsteam.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.davidsteam.databinding.FragmentMenuBinding
import com.example.davidsteam.domain.entity.Instrument


class MenuFragment : Fragment() {
    private lateinit var binding: FragmentMenuBinding
    private lateinit var communicator: MainFragmentCommunicator


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.acButton.setOnClickListener{
            communicator = activity as MainFragmentCommunicator
            communicator.passDataToSongListFragment(Instrument.ACOUSTIC)
        }
        binding.egButton.setOnClickListener{
            communicator = activity as MainFragmentCommunicator
            communicator.passDataToSongListFragment(Instrument.ELECTRO)
        }
        binding.bassButton.setOnClickListener{
            communicator = activity as MainFragmentCommunicator
            communicator.passDataToSongListFragment(Instrument.BASS)
        }
        binding.drumsButton.setOnClickListener{
            communicator = activity as MainFragmentCommunicator
            communicator.passDataToSongListFragment(Instrument.DRUMS)
        }
        binding.pianoButton.setOnClickListener{
            communicator = activity as MainFragmentCommunicator
            communicator.passDataToSongListFragment(Instrument.PIANO)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MenuFragment()
    }
}