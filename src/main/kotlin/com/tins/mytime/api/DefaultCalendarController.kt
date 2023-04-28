package com.tins.mytime.api

import com.tins.mytime.controller.CalendarApi
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class DefaultCalendarController : CalendarApi {
    override fun getCalendar(week: String) = ResponseEntity.ok("Hola $week")
}
