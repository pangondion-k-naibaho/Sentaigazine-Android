package com.zephyr.sentaigazine.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Sentai(
    var name: String,
    var detailStory: String,
    var totalMember: Int,
    var productionYear: String,
    var rating: Double,
    var sentaiPhoto: Int,
    var urlMerchandise: String?= null
): Parcelable