package io.github.approsoft.music.model.smartplaylist

import androidx.annotation.DrawableRes
import io.github.approsoft.music.R
import io.github.approsoft.music.model.AbsCustomPlaylist

abstract class AbsSmartPlaylist(
    name: String,
    @DrawableRes val iconRes: Int = R.drawable.ic_queue_music
) : AbsCustomPlaylist(
    id = PlaylistIdGenerator(name, iconRes),
    name = name
)