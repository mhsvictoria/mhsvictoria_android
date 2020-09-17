package com.rcal.business.appointment

import androidx.annotation.NonNull
import java.util.*

class AppointmentManager : Appointment {

    // This is all you need to do to create a singleton
    object AppointmentManager

    fun inviteOthers(@NonNull id: String, @NonNull emailList: List<String>) {


    }

    fun cancel(@NonNull id: String) {

    }

    override fun create(id: String, startDate: Date, duration: Long): AppointmentDefinition {
        TODO("Not yet implemented")
    }

    override fun create(appointmentDefinition: AppointmentDefinition) {
        TODO("Not yet implemented")
    }

    override fun read(id: String) {
        TODO("Not yet implemented")
    }

    override fun update(appointmentDefinition: AppointmentDefinition) {
        TODO("Not yet implemented")
    }

    override fun delete(id: String) {
        TODO("Not yet implemented")
    }
}