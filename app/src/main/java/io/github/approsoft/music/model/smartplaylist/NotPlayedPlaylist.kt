package io.github.approsoft.music.model.smartplaylist

import io.github.approsoft.music.App
import io.github.approsoft.music.R
import io.github.approsoft.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class NotPlayedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.not_recently_played),
    iconRes = R.drawable.ic_watch_later
) {
    override fun songs(): List<Song> {
        return topPlayedRepository.notRecentlyPlayedTracks()
    }
}