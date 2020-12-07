package io.github.approsoft.music.model.smartplaylist

import io.github.approsoft.music.App
import io.github.approsoft.music.R
import io.github.approsoft.music.model.Song
import kotlinx.android.parcel.Parcelize

@Parcelize
class ShuffleAllPlaylist : AbsSmartPlaylist(
    name = App.getContext().getString(R.string.action_shuffle_all),
    iconRes = R.drawable.ic_shuffle
) {
    override fun songs(): List<Song> {
        return songRepository.songs()
    }
}