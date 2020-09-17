package com.rcal.business.appointment

import java.util.*

/*
val scheduler = Scheduler()
        val arrList = ArrayList<Schedule>()
        arrList.add(Schedule.MON)
        arrList.add(Schedule.WED)
        arrList.add(Schedule.FRI)
        scheduler.schedule(arrList)
        scheduler.until(Date())
 */
enum class SchedRepeat {
    MON,
    TUE,
    WED,
    THUR,
    FRI,
    SAT,
    SUN,
    DAILY,
    WEEKLY,
    FORTNIGHT,
    MONTHLY;
}

class Schedule(val startDate: Date, val endDate: Date) {

    var schedule: List<SchedRepeat>? = null
    var untilDate: Date? = null

    fun schedule(sched: List<SchedRepeat>) {
        this.schedule = sched
    }
    fun until(untilDate: Date) {
        this.untilDate = untilDate
    }
}