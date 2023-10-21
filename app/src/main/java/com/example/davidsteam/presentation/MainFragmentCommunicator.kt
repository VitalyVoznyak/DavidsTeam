package com.example.davidsteam.presentation

import com.example.davidsteam.domain.entity.Instrument

interface MainFragmentCommunicator {
    fun passDataToSongListFragment(currentInstrument: Instrument)
}