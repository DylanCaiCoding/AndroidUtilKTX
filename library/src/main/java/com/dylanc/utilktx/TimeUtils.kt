package com.dylanc.utilktx

import com.blankj.utilcode.util.TimeUtils
import java.text.DateFormat
import java.util.*

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
const val FORMAT_DATE_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss"
const val FORMAT_DATE_HOUR_MINUTE = "yyyy-MM-dd HH:mm"
const val FORMAT_MONTH_DAY_HOUR_MINUTE = "MM-dd HH:mm"
const val FORMAT_DATE = "yyyy-MM-dd"
const val FORMAT_MONTH_DAY = "MM-dd"
const val FORMAT_HOUR_MINUTE_SECOND = "HH:mm:ss"
const val FORMAT_HOUR_MINUTE = "HH:mm"

fun String.toMillis(pattern: String = FORMAT_DATE_HOUR_MINUTE_SECOND) =
  TimeUtils.string2Millis(this, pattern)

fun String.toMillis(format: DateFormat) =
  TimeUtils.string2Millis(this, format)

fun Long.toTimeString(pattern: String = FORMAT_DATE_HOUR_MINUTE_SECOND): String =
  TimeUtils.millis2String(this, pattern)

fun Long.toTimeString(format: DateFormat) =
  TimeUtils.millis2String(this, format)

fun String.toDate(pattern: String = FORMAT_DATE_HOUR_MINUTE_SECOND) =
  TimeUtils.string2Date(this, pattern)

fun String.toDate(format: DateFormat) =
  TimeUtils.string2Date(this, format)

fun Date.toTimeString(pattern: String = FORMAT_DATE_HOUR_MINUTE_SECOND) =
  TimeUtils.date2String(this, pattern)

fun Date.toTimeString(format: DateFormat) =
  TimeUtils.date2String(this, format)

fun Date.toMillis() =
  TimeUtils.date2Millis(this)

fun Long.toDate() =
  TimeUtils.millis2Date(this)

fun timeSpanOf(time1: String, time2: String, unit: Int) =
  TimeUtils.getTimeSpan(time1, time2, unit)

fun timeSpanOf(time1: String, time2: String, format: DateFormat, unit: Int) =
  TimeUtils.getTimeSpan(time1, time2, format, unit)

fun timeSpanOf(date1: Date, date2: Date, unit: Int) =
  TimeUtils.getTimeSpan(date1, date2, unit)

fun timeSpanOf(millis1: Long, millis2: Long, unit: Int) =
  TimeUtils.getTimeSpan(millis1, millis2, unit)

fun fitTimeSpanOf(time1: String, time2: String, precision: Int) =
  TimeUtils.getFitTimeSpan(time1, time2, precision)

fun fitTimeSpanOf(time1: String, time2: String, format: DateFormat, precision: Int) =
  TimeUtils.getFitTimeSpan(time1, time2, format, precision)

fun fitTimeSpanOf(date1: Date, date2: Date, precision: Int) =
  TimeUtils.getFitTimeSpan(date1, date2, precision)

fun fitTimeSpanOf(millis1: Long, millis2: Long, precision: Int) =
  TimeUtils.getFitTimeSpan(millis1, millis2, precision)

val nowMillis = TimeUtils.getNowMills()

val nowTimeString = TimeUtils.getNowString()

fun nowTimeStringOf(format: DateFormat) = TimeUtils.getNowString(format)

val nowDate = TimeUtils.getNowDate()

fun timeSpanByNowOf(time: String, unit: Int) =
  TimeUtils.getTimeSpanByNow(time, unit)

fun timeSpanByNowOf(time: String, format: DateFormat, unit: Int) =
  TimeUtils.getTimeSpanByNow(time, format, unit)

fun timeSpanByNowOf(date: Date, unit: Int) =
  TimeUtils.getTimeSpanByNow(date, unit)

fun timeSpanByNowOf(millis: Long, unit: Int) =
  TimeUtils.getTimeSpanByNow(millis, unit)

fun fitTimeSpanByNowOf(time: String, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(time, precision)

fun fitTimeSpanByNowOf(time: String, format: DateFormat, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(time, format, precision)

fun fitTimeSpanByNowOf(date: Date, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(date, precision)

fun fitTimeSpanByNowOf(millis: Long, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(millis, precision)

fun friendlyTimeSpanByNowOf(time: String) =
  TimeUtils.getFriendlyTimeSpanByNow(time)

fun friendlyTimeSpanByNowOf(time: String, format: DateFormat, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(time, format, precision)

fun friendlyTimeSpanByNowOf(date: Date, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(date, precision)

fun friendlyTimeSpanByNowOf(millis: Long, precision: Int) =
  TimeUtils.getFitTimeSpanByNow(millis, precision)

fun millisOf(time: String, timeSpan: Long, unit: Int) =
  TimeUtils.getMillis(time, timeSpan, unit)

fun millisOf(time: String, format: DateFormat, timeSpan: Long, unit: Int) =
  TimeUtils.getMillis(time, format, timeSpan, unit)

fun millisOf(date: Date, timeSpan: Long, unit: Int) =
  TimeUtils.getMillis(date, timeSpan, unit)

fun millisOf(millis: Long, timeSpan: Long, unit: Int) =
  TimeUtils.getMillis(millis, timeSpan, unit)

fun timeStringOf(time: String, timeSpan: Long, unit: Int) =
  TimeUtils.getString(time, timeSpan, unit)

fun timeStringOf(time: String, format: DateFormat, timeSpan: Long, unit: Int) =
  TimeUtils.getString(time, format, timeSpan, unit)

fun timeStringOf(date: Date, timeSpan: Long, unit: Int) =
  TimeUtils.getString(date, timeSpan, unit)

fun timeStringOf(date: Date, format: DateFormat, timeSpan: Long, unit: Int) =
  TimeUtils.getString(date, format, timeSpan, unit)

fun timeStringOf(millis: Long, timeSpan: Long, unit: Int) =
  TimeUtils.getString(millis, timeSpan, unit)

fun timeStringOf(millis: Long, format: DateFormat, timeSpan: Long, unit: Int) =
  TimeUtils.getString(millis, format, timeSpan, unit)

fun dateOf(time: String, timeSpan: Long, unit: Int) =
  TimeUtils.getDate(time, timeSpan, unit)

fun dateOf(time: String, format: DateFormat, timeSpan: Long, unit: Int) =
  TimeUtils.getDate(time, format, timeSpan, unit)

fun dateOf(date: Date, timeSpan: Long, unit: Int) =
  TimeUtils.getDate(date, timeSpan, unit)

fun dateOf(millis: Long, timeSpan: Long, unit: Int) =
  TimeUtils.getDate(millis, timeSpan, unit)





val String.isToday get() = TimeUtils.isToday(this)

fun String.isToday(format: DateFormat) = TimeUtils.isToday(this, format)

val Date.isToday get() = TimeUtils.isToday(this)

val Long.isToday get() = TimeUtils.isToday(this)

val String.isLeapYear get() = TimeUtils.isLeapYear(this)

fun String.isLeapYear(format: DateFormat) = TimeUtils.isLeapYear(this, format)

val Date.isLeapYear get() = TimeUtils.isLeapYear(this)

val Long.isLeapYear get() = TimeUtils.isLeapYear(this)

val Int.isLeapYear get() = TimeUtils.isLeapYear(this)

val isAm = TimeUtils.isAm()

val String.isAm get() = TimeUtils.isAm(this)

fun String.isAm(format: DateFormat) = TimeUtils.isAm(this, format)

val Date.isAm get() = TimeUtils.isAm(this)

val Long.isAm get() = TimeUtils.isAm(this)

val isPm = TimeUtils.isPm()

val String.isPm get() = TimeUtils.isPm(this)

fun String.isPm(format: DateFormat) = TimeUtils.isPm(this, format)

val Date.isPm get() = TimeUtils.isPm(this)

val Long.isPm get() = TimeUtils.isPm(this)
