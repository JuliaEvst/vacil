package ru.yarsu

import java.time.DayOfWeek
import java.time.LocalTime

data class ScheduleInfo(
    val courses: List<Course>,
    val scheduleItems: List<ScheduleItem>,
)

fun formSchedule(): ScheduleInfo {
    val physicsCourse = Course(
        "physics-course",
        "Физика",
        "Иванов И. И.",
        "Курс про устройство мира, если на него смотреть с помощью современного аппарата"
    )
    val webCourse = Course(
        "web-course",
        "Разработка веб-приложений",
        "Васильев А. М.",
        "Курс про разработку приложений для обслуживания людей с помощью браузера и интернета"
    )
    val courses = listOf(
        physicsCourse,
        webCourse
    )
    val schedule = listOf(
        ScheduleItem(
            physicsCourse.id,
            203,
            DayOfWeek.MONDAY,
            LocalTime.of(9, 0)
        ),
        ScheduleItem(
            physicsCourse.id,
            301,
            DayOfWeek.MONDAY,
            LocalTime.of(13, 30)
        ),
        ScheduleItem(
            webCourse.id,
            223,
            DayOfWeek.WEDNESDAY,
            LocalTime.of(13, 30)
        ),
        ScheduleItem(
            webCourse.id,
            220,
            DayOfWeek.WEDNESDAY,
            LocalTime.of(16, 30)
        )
    )
    return ScheduleInfo(
        courses,
        schedule
    )
}
