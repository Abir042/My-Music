package io.github.approsoft.music.interfaces

import android.view.View
import io.github.approsoft.music.db.PlaylistWithSongs

interface IPlaylistClickListener {
    fun onPlaylistClick(playlistWithSongs: PlaylistWithSongs, view: View)
}