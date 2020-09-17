package com.rcal.business.appointment

import android.location.Location
import java.util.*

enum class ReminderType {
    notification, email, sound, visual
}

data class Reminder(val startTime: Date, val type: ReminderType = ReminderType.notification, val repeatEvery: Long = 0)

class AppointmentDefinition(val id: String, val schedule: Schedule, val allDay: Boolean = false) {

    var url: String? = null

    constructor(id: String, schedule: Schedule, location: Location, allDay: Boolean = false) : this(id, schedule, allDay)
    constructor(id: String, schedule: Schedule, url: String, allDay: Boolean = false) : this(id, schedule, allDay) {
        this.url = url
    }

    var reminders: List<Schedule>? = null
}