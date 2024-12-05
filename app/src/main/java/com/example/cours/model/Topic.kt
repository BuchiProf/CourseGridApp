package com.example.cours.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val classNumber: Int,
    @DrawableRes val classImageId: Int
)
