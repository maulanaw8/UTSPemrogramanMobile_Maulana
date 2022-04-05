package com.example.maulana_uts.model

import androidx.annotation.DrawableRes

class Iphone (
    @DrawableRes val imageResourceId: Int,
    val iphoneName: String,
    val tahun : String,
    val ukuranLayar: String,
    val kapasitasMemori : String,
    val warna: String,
    val harga: String
)