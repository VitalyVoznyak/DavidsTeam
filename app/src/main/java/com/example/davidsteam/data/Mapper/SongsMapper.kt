package com.example.davidsteam.data.Mapper

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.davidsteam.data.network.pojo.SongDto
import com.example.davidsteam.data.network.pojo.SongListDto
import com.example.davidsteam.domain.entity.Song
import kotlinx.coroutines.Deferred
import java.util.Locale
import java.util.TimeZone

class SongsMapper {
    fun mapSongListDtoToLiveDataListSongs(songListDto: SongListDto): LiveData<List<Song>> {
        val listSongsDto = songListDto.data
        val listSongs: List<Song> = listSongsDto.map { it: SongDto ->
            Song(
                it.name,
                it.haveAG,
                it.haveBASS,
                it.haveEG,
                it.havePIANO,
                it.haveDRUMS
            )
        }
        return MutableLiveData(listSongs)
    }
}