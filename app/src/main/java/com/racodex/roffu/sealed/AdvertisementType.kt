package com.racodex.roffu.sealed

sealed class AdvertisementType{
    object Store: AdvertisementType()
    object Product: AdvertisementType()
}