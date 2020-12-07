package io.github.approsoft.music.model.smartplaylist

import io.github.approsoft.music.App
import io.github.approsoft.music.R
import io.github.approsoft.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class TopTracksPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.my_top_tracks),
    iconRes = R.drawable.ic_trending_up
) {
    override fun songs(): List<Song> {
        return topPlayedRepository.topTracks()
    }
}