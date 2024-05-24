package com.ardxclient.absenspn.model.response

import com.google.gson.annotations.SerializedName

data class KelasResponse(
    @SerializedName("id") var id : Int,
    @SerializedName("kelas") var kelas : String,
) {
    override fun toString(): String {
        return kelas
    }
}
