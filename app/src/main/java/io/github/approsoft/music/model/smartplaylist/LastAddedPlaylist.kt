package io.github.approsoft.music.model.smartplaylist

import io.github.approsoft.music.App
import io.github.approsoft.music.R
import io.github.approsoft.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class LastAddedPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.last_added),
    iconRes = R.drawable.ic_library_add
) {
    override fun songs(): List<Song> {
        return lastAddedRepository.recentSongs()
    }
}