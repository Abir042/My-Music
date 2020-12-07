package io.github.approsoft.music.interfaces

import io.github.approsoft.music.model.Album
import io.github.approsoft.music.model.Artist
import io.github.approsoft.music.model.Genre

interface IHomeClickListener {
    fun onAlbumClick(album: Album)

    fun onArtistClick(artist: Artist)

    fun onGenreClick(genre: Genre)
}