package com.rco.auctions.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VendorModel {
    @SerializedName("Id")
    @Expose
    var id: String = ""

    @SerializedName("LobjectId")
    @Expose
    var lobjectId: Int = 0

    @SerializedName("objectType")
    @Expose
    var objectType: String = ""

    @SerializedName("mobileRecordId")
    @Expose
    var mobileRecordId: String = ""

    @SerializedName("mapCodingInfo")
    @Expose
    var mapCodingInfo: MapCodingInfo = MapCodingInfo()

    @SerializedName("arDetailRecordDataMapped")
    @Expose
    var arDetailRecordDataMapped: List<VendorModel> = ArrayList()
}

