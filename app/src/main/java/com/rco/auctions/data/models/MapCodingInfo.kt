package com.rco.auctions.data.models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class MapCodingInfo {
    // Auction specific fields
    @SerializedName("Auction Event Name")
    @Expose
    var auctionEventName: String = ""

    @SerializedName("Auction Event Description")
    @Expose
    var auctionEventDescription: String = ""

    @SerializedName("Auction Event Number")
    @Expose
    var auctionEventNumber: String = ""

    @SerializedName("Start Price")
    @Expose
    var startPrice: String = ""

    @SerializedName("End Price")
    @Expose
    var endPrice: String = ""

    @SerializedName("Minimum Bid")
    @Expose
    var minimumBid: String = ""

    @SerializedName("Bid Number")
    @Expose
    var bidNumber: String = ""

    @SerializedName("Max Bid")
    @Expose
    var maxBid: String = ""

    @SerializedName("Currency Code")
    @Expose
    var currencyCode: String = ""

    @SerializedName("Total Bids")
    @Expose
    var totalBids: String = ""

    @SerializedName("Status")
    @Expose
    var status: String = ""

    @SerializedName("Item Number")
    @Expose
    var itemNumber: String = ""

    @SerializedName("Item Name")
    @Expose
    var itemName: String = ""

    @SerializedName("Master Barcode")
    @Expose
    var masterBarcode: String = ""

    @SerializedName("Quantity")
    @Expose
    var quantity: String = ""

    @SerializedName("Latitude")
    @Expose
    var latitude: String = ""

    @SerializedName("Longitude")
    @Expose
    var longitude: String = ""

    @SerializedName("StartDateTime")
    @Expose
    var startDateTime: String = ""

    @SerializedName("EndDateTime")
    @Expose
    var endDateTime: String = ""

    @SerializedName("Description")
    @Expose
    var description: String = ""

    @SerializedName("RecordId")
    @Expose
    var recordId: String = ""
}

