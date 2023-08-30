package com.example.davidsteam.presentation

import android.app.Application
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Debug
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.davidsteam.R
import com.example.davidsteam.di.ApplicationComponent
import com.example.davidsteam.di.DaggerApplicationComponent
import com.example.davidsteam.domain.entity.Instrument
import javax.inject.Inject

class SongListFragment : Fragment()   {

    companion object {
        fun newInstance() = SongListFragment()
    }

    @Inject
    lateinit var viewModelFactory: SongListViewModelFactory

    val viewModel by lazy {
        ViewModelProvider(this,viewModelFactory)[SongListViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_song_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        DaggerApplicationComponent.create().inject(this)

        viewModel.liveData.observe(viewLifecycleOwner){ songs ->
            songs.forEach{ Log.d("Tester",it.toString()) }
        }
        viewModel.loadSongList(instrument = Instrument.BASS)
    }

}