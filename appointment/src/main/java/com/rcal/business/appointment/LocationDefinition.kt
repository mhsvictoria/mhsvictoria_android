package com.rcal.business.appointment


data class Address(val street1: String, val street2: String, val city: String, val countryCode: String, val postalCode: String)
data class GeoLocation(val lat: Float, val lon: Float)

open class LocationDefinition(address: Address?, geoLocation: GeoLocation?) {

    var address: Address? = null
    var geoLocation: GeoLocation? = null

    constructor (address: Address) : this(address, null) {
        this.address = address
    }

    constructor(geoLocation: GeoLocation) : this(null, geoLocation) {
        this.geoLocation = geoLocation
    }


}