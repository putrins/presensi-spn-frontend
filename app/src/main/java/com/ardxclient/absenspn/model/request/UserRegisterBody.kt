package com.ardxclient.absenspn.model.request

import com.google.gson.annotations.SerializedName

data class UserRegisterBody(
    @SerializedName("nama") var nama: String,
    @SerializedName("username") var username: String,
    @SerializedName("password") var password: String,
    @SerializedName("nrp") var nrp: Int,
    @SerializedName("jabatan") var jabatan: String,
    @SerializedName("pangkat") var pangkat: String,
)
