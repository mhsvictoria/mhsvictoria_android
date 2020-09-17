package com.rcal.business.appointment

import androidx.annotation.NonNull
import java.util.*

interface Appointment {

    fun create(@NonNull appointmentDefinition: AppointmentDefinition)
    fun create(@NonNull id: String, startDate: Date, duration: Long) : AppointmentDefinition
    fun read(@NonNull id: String)
    fun update(@NonNull appointmentDefinition: AppointmentDefinition)
    fun delete(@NonNull id: String)
}