package com.nickdferrara.meditationapp.models

import androidx.annotation.DrawableRes

data class MenuItem(
    val title: String,
    @DrawableRes val iconId: Int,
)
