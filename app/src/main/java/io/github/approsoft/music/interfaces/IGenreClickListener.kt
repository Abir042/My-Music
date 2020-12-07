package io.github.approsoft.music.interfaces

import android.view.View
import io.github.approsoft.music.model.Genre

interface IGenreClickListener {
    fun onClickGenre(genre: Genre, view: View)
}