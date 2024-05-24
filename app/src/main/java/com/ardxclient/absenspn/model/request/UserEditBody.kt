package com.ardxclient.absenspn.model.request

import com.google.gson.annotations.SerializedName

data class UserEditBody(
    @SerializedName("nama") var nama: String,
    @SerializedName("nim") var nim: Int,
    @SerializedName("kelas") var kelas: String,
    @SerializedName("tahun_masuk") var tahunMasuk: Int,
    @SerializedName("wali_kelas") var waliKelas: String,
    @SerializedName("tanggal_lahir") var tanggalLahir : String,
    @SerializedName("tempat_lahir") var tempatLahir: String,
    @SerializedName("nomor_telp") var nomorTelp: String
)
