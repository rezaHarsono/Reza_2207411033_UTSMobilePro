package com.example.uts

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Alumni(
    val nim : String,
    val nama : String,
    val tempatLahir : String,
    val tanggalLahir : String,
    val alamat : String,
    val agama : String,
    val tlp : String,
    val tahunMasuk : String,
    val tahunLulus : String,
    val pekerjaan : String,
    val jabatan : String,
    @PrimaryKey(autoGenerate = true)
    val id : Int? = 0
)
