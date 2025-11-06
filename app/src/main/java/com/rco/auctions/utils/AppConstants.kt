package com.rco.auctions.utils

import android.annotation.SuppressLint
import android.content.Context
import android.provider.Settings
import com.rco.auctions.data.models.VendorModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object AppConstants {

    const val DATE_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS"
    const val DATE_FORMAT_DISPLAY = "MMM dd, yyyy hh:mm a"

    @SuppressLint("HardwareIds")
    fun getDeviceId(context: Context): String {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }

    fun getMobileRecordId(objectType: String, deviceId: String, suffix: String): String {
        val timestamp = System.currentTimeMillis()
        return "${objectType}_${deviceId}_${suffix}_$timestamp"
    }

    fun getCurrentDateTime(): String {
        val dateFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
        return dateFormat.format(Date())
    }

    fun formatDate(dateString: String, outputFormat: String = DATE_FORMAT_DISPLAY): String {
        return try {
            val inputFormat = SimpleDateFormat(DATE_FORMAT, Locale.getDefault())
            val outputFormatter = SimpleDateFormat(outputFormat, Locale.getDefault())
            val date = inputFormat.parse(dateString)
            date?.let { outputFormatter.format(it) } ?: dateString
        } catch (e: Exception) {
            dateString
        }
    }

    fun getBidsItemData(
        vendorModels: List<VendorModel>,
        headerModel: VendorModel?
    ): Pair<Array<String>, List<Array<String>>> {
        // Header row
        val header = arrayOf(
            "ObjectType",
            "MobileRecordId",
            "Auction Event Number",
            "Item Number",
            "Bid Number",
            "Max Bid",
            "Quantity",
            "Currency Code"
        )

        // Data rows
        val data = vendorModels.map { model ->
            arrayOf(
                "Bid",
                model.mobileRecordId,
                headerModel?.mapCodingInfo?.auctionEventNumber ?: "",
                model.mapCodingInfo.itemNumber,
                model.mapCodingInfo.bidNumber,
                model.mapCodingInfo.maxBid,
                model.mapCodingInfo.quantity,
                model.mapCodingInfo.currencyCode
            )
        }

        return Pair(header, data)
    }
}

