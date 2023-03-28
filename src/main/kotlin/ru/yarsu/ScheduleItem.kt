package ru.yarsu

import java.time.DayOfWeek
import java.time.LocalTime

data class ScheduleItem(
    val courseId: String,
    val auditoriumNumber: Int,
    val dayOfWeek: DayOfWeek,
    val startTime: LocalTime,
)
