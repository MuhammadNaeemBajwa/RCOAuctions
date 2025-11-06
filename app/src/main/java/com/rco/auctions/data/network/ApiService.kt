package com.rco.auctions.data.network

import com.rco.auctions.data.models.VendorModel
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiService {

    @GET("Image2000/rest/recordservice/getRecordsUpdatedXFiltered/{userName}/{password}/Auction+Header/+/+/+/+/+/+/+/+/+/+/+/+/+")
    suspend fun getAuctionHeaderList(
        @Path("userName") userName: String,
        @Path("password") password: String,
    ): Response<List<VendorModel>>

    @GET("Image2000/rest/recordservice/getRecordsUpdatedXFiltered/{userName}/{password}/Auction+Detail/+/+/+/+/+/+/+/+/+/+/+/+/+")
    suspend fun getAuctionDetailList(
        @Path("userName") userName: String,
        @Path("password") password: String,
    ): Response<List<VendorModel>>

    @GET("Image2000/rest/recordservice/getRecordsUpdatedXFiltered/{userName}/{password}/Bid/-10000/0/+/+/+/Item%20Number,Auction%20Event%20Number/,/{itemNumber},{auctionEventNumber}/,/+/+")
    suspend fun getMaxBidList(
        @Path("userName") userName: String,
        @Path("password") password: String,
        @Path("itemNumber") itemNumber: String,
        @Path("auctionEventNumber") auctionEventNumber: String,
    ): Response<List<VendorModel>>

    @GET("Image2000/rest/recordservice/getRecordsUpdatedXFiltered/{userName}/{password}/Auction+Detail/-10000/0/+/+/+/Master%20Barcode/,/{masterBarcode}/,/+/+")
    suspend fun getAuctionSpecificDetailList(
        @Path("userName") userName: String,
        @Path("password") password: String,
        @Path("masterBarcode") masterBarcode: String,
    ): Response<List<VendorModel>>

    @Multipart
    @POST("Image2000/rest/recordservice/setRecordCodingFields/{userName}/{password}")
    suspend fun createBidItem(
        @Path("userName") userName: String,
        @Path("password") password: String,
        @Part filePart: MultipartBody.Part
    ): Response<List<VendorModel>>
}

