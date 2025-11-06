package com.rco.auctions.data.repository

import com.rco.auctions.data.models.VendorModel
import com.rco.auctions.data.network.ApiService
import com.rco.auctions.utils.SessionManagement
import okhttp3.MultipartBody
import retrofit2.Response

class Repository(
    private val apiService: ApiService,
    private val sessionManagement: SessionManagement
) {

    private val userName: String
        get() = sessionManagement.userName

    private val password: String
        get() = sessionManagement.password

    suspend fun getAuctionHeaderList(): Response<List<VendorModel>> {
        return apiService.getAuctionHeaderList(userName, password)
    }

    suspend fun getAuctionDetailList(): Response<List<VendorModel>> {
        return apiService.getAuctionDetailList(userName, password)
    }

    suspend fun getMaxBidList(
        itemNumber: String,
        auctionEventNumber: String
    ): Response<List<VendorModel>> {
        return apiService.getMaxBidList(userName, password, itemNumber, auctionEventNumber)
    }

    suspend fun getAuctionSpecificDetailList(
        masterBarcode: String
    ): Response<List<VendorModel>> {
        return apiService.getAuctionSpecificDetailList(userName, password, masterBarcode)
    }

    suspend fun createBidItem(
        filePart: MultipartBody.Part
    ): Response<List<VendorModel>> {
        return apiService.createBidItem(userName, password, filePart)
    }
}

