package com.ardxclient.absenspn.model.response

import com.google.gson.annotations.SerializedName

data class HistoryResponse(
    @SerializedName("user_id") var userId: Int,
    @SerializedName("kelas") var kelas: String,
    @SerializedName("mapel") var mapel: String,
    @SerializedName("tgl_absen") var tglAbsen: String,
    @SerializedName("periode") var periode: String,
    @SerializedName("jam_absen_in") var jamAbsenIn: String,
    @SerializedName("jam_absen_out") var jamAbsenOut: String
)
