package com.example.davidsteam.data.Mapper

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.davidsteam.data.network.pojo.SongDto
import com.example.davidsteam.data.network.pojo.SongListDto
import com.example.davidsteam.domain.entity.Instrument
import com.example.davidsteam.domain.entity.Song
import kotlinx.coroutines.Deferred
import java.util.Locale
import java.util.TimeZone
import javax.inject.Inject

class SongsMapper @Inject constructor(){
    lateinit var instrument: Instrument
    suspend fun mapSongListDtoToLiveDataListSongs(songListDto: SongListDto): LiveData<List<Song>> {

        Log.d("tester", instrument.toString())
        val listSongsDto = songListDto.songs
        val listSongs: List<Song> = listSongsDto?.let {
            it.map { it: Song ->
                Song(
                    it.name,
                    it.haveAG,
                    it.haveBASS,
                    it.haveEG,
                    it.havePIANO,
                    it.haveDRUMS
                )

            }
        }!!.toList<Song>()
        return MutableLiveData(listSongs.filter { filterSongByHaveCurrentInstrument(it) })

    }
    private fun filterSongByHaveCurrentInstrument(song :Song): Boolean{
        val result =  when(instrument){
            Instrument.ACOUSTIC -> song.haveAG
            Instrument.ELECTRO -> song.haveEG
            Instrument.PIANO -> song.havePIANO
            Instrument.BASS -> song.haveBASS
            Instrument.DRUMS -> song.haveDRUMS
        }
        Log.d("tester2", "${song.name}  ${result}")
        return result
    }
}