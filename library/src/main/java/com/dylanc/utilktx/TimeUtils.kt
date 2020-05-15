@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.TimeUtils
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
const val PATTERN_DATE_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss"
const val PATTERN_DATE_HOUR_MINUTE = "yyyy-MM-dd HH:mm"
const val PATTERN_MONTH_DAY_HOUR_MINUTE = "MM-dd HH:mm"
const val PATTERN_DATE = "yyyy-MM-dd"
const val PATTERN_MONTH_DAY = "MM-dd"
const val PATTERN_HOUR_MINUTE_SECOND = "HH:mm:ss"
const val PATTERN_HOUR_MINUTE = "HH:mm"

private val defaultFormat: SimpleDateFormat
  get() = PATTERN_DATE_HOUR_MINUTE_SECOND.toSafeDateFormat()

fun String.toSafeDateFormat(): SimpleDateFormat =
  TimeUtils.getSafeDateFormat(this)

fun String.toMillis(pattern: String): Long =
  TimeUtils.string2Millis(this, pattern)

fun String.toMillis(format: DateFormat = defaultFormat): Long =
  TimeUtils.string2Millis(this, format)

fun Long.toTimeString(pattern: String): String =
  TimeUtils.millis2String(this, pattern)

fun Long.toTimeString(format: DateFormat = defaultFormat): String =
  TimeUtils.millis2String(this, format)

fun String.toDate(pattern: String): Date =
  TimeUtils.string2Date(this, pattern)

fun String.toDate(format: DateFormat = defaultFormat): Date =
  TimeUtils.string2Date(this, format)

fun Date.toTimeString(pattern: String): String =
  TimeUtils.date2String(this, pattern)

fun Date.toTimeString(format: DateFormat = defaultFormat): String =
  TimeUtils.date2String(this, format)

fun Date.toMillis(): Long =
  TimeUtils.date2Millis(this)

fun Long.toDate(): Date =
  TimeUtils.millis2Date(this)

fun timeSpanOf(time1: String, time2: String, unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpan(time1, time2, pattern.toSafeDateFormat(), unit)

fun timeSpanOf(time1: String, time2: String, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpan(time1, time2, format, unit)

fun timeSpanOf(date1: Date, date2: Date, unit: Int): Long =
  TimeUtils.getTimeSpan(date1, date2, unit)

fun timeSpanOf(millis1: Long, millis2: Long, unit: Int): Long =
  TimeUtils.getTimeSpan(millis1, millis2, unit)

fun fitTimeSpanOf(time1: String, time2: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpan(time1, time2, pattern.toSafeDateFormat(), precision)

fun fitTimeSpanOf(
  time1: String, time2: String, precision: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getFitTimeSpan(time1, time2, format, precision)

fun fitTimeSpanOf(date1: Date, date2: Date, precision: Int): String =
  TimeUtils.getFitTimeSpan(date1, date2, precision)

fun fitTimeSpanOf(millis1: Long, millis2: Long, precision: Int): String =
  TimeUtils.getFitTimeSpan(millis1, millis2, precision)

val nowMillis: Long =
  TimeUtils.getNowMills()

val nowTimeString: String =
  TimeUtils.getNowString()

fun nowTimeStringOf(pattern: String): String =
  TimeUtils.getNowString(pattern.toSafeDateFormat())

fun nowTimeStringOf(format: DateFormat): String =
  TimeUtils.getNowString(format)

val nowDate: Date =
  TimeUtils.getNowDate()

fun timeSpanByNowOf(time: String, unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpanByNow(time, pattern.toSafeDateFormat(), unit)

fun timeSpanByNowOf(time: String, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpanByNow(time, format, unit)

fun timeSpanByNowOf(date: Date, unit: Int): Long =
  TimeUtils.getTimeSpanByNow(date, unit)

fun timeSpanByNowOf(millis: Long, unit: Int): Long =
  TimeUtils.getTimeSpanByNow(millis, unit)

fun fitTimeSpanByNowOf(time: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpanByNow(time, pattern.toSafeDateFormat(), precision)

fun fitTimeSpanByNowOf(time: String, precision: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getFitTimeSpanByNow(time, format, precision)

fun fitTimeSpanByNowOf(date: Date, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(date, precision)

fun fitTimeSpanByNowOf(millis: Long, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(millis, precision)

fun friendlyTimeSpanByNowOf(time: String, pattern: String): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, pattern.toSafeDateFormat())

fun friendlyTimeSpanByNowOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, format)

fun friendlyTimeSpanByNowOf(date: Date): String =
  TimeUtils.getFriendlyTimeSpanByNow(date)

fun friendlyTimeSpanByNowOf(millis: Long): String =
  TimeUtils.getFriendlyTimeSpanByNow(millis)

fun millisOf(time: String, timeSpan: Long, unit: Int, pattern: String): Long =
  TimeUtils.getMillis(time, pattern.toSafeDateFormat(), timeSpan, unit)

fun millisOf(time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getMillis(time, format, timeSpan, unit)

fun millisOf(date: Date, timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillis(date, timeSpan, unit)

fun millisOf(millis: Long, timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillis(millis, timeSpan, unit)

fun timeStringOf(time: String, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(time, pattern.toSafeDateFormat(), timeSpan, unit)

fun timeStringOf(
  time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(time, format, timeSpan, unit)

fun timeStringOf(date: Date, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(date, pattern.toSafeDateFormat(), timeSpan, unit)

fun timeStringOf(
  date: Date, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(date, format, timeSpan, unit)

fun timeStringOf(millis: Long, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(millis, pattern.toSafeDateFormat(), timeSpan, unit)

fun timeStringOf(
  millis: Long, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(millis, format, timeSpan, unit)

fun dateOf(time: String, timeSpan: Long, unit: Int, pattern: String): Date =
  TimeUtils.getDate(time, pattern.toSafeDateFormat(), timeSpan, unit)

fun dateOf(time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): Date =
  TimeUtils.getDate(time, format, timeSpan, unit)

fun dateOf(date: Date, timeSpan: Long, unit: Int): Date =
  TimeUtils.getDate(date, timeSpan, unit)

fun dateOf(millis: Long, timeSpan: Long, unit: Int): Date =
  TimeUtils.getDate(millis, timeSpan, unit)

fun millisByNowOf(timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillisByNow(timeSpan, unit)

fun timeStringByNowOf(timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getStringByNow(timeSpan, pattern.toSafeDateFormat(), unit)

fun timeStringByNowOf(timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getStringByNow(timeSpan, format, unit)

fun dateByNowOf(timeSpan: Long, unit: Int): Date =
  TimeUtils.getDateByNow(timeSpan, unit)

fun isToday(time: String, pattern: String): Boolean =
  TimeUtils.isToday(time, pattern.toSafeDateFormat())

fun isToday(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isToday(time, format)

fun isToday(date: Date): Boolean =
  TimeUtils.isToday(date)

fun isToday(millis: Long): Boolean =
  TimeUtils.isToday(millis)

fun isLeapYear(time: String, pattern: String): Boolean =
  TimeUtils.isLeapYear(time, pattern.toSafeDateFormat())

fun isLeapYear(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isLeapYear(time, format)

fun isLeapYear(date: Date): Boolean =
  TimeUtils.isLeapYear(date)

fun isLeapYear(millis: Long): Boolean =
  TimeUtils.isLeapYear(millis)

fun isLeapYear(year: Int): Boolean =
  TimeUtils.isLeapYear(year)

fun chineseWeekOf(time: String, pattern: String): String =
  TimeUtils.getChineseWeek(time, pattern.toSafeDateFormat())

fun chineseWeekOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getChineseWeek(time, format)

fun chineseWeekOf(date: Date): String =
  TimeUtils.getChineseWeek(date)

fun chineseWeekOf(millis: Long): String =
  TimeUtils.getChineseWeek(millis)

fun usWeekOf(time: String, pattern: String): String =
  TimeUtils.getUSWeek(time, pattern.toSafeDateFormat())

fun usWeekOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getUSWeek(time, format)

fun usWeekOf(date: Date): String =
  TimeUtils.getUSWeek(date)

fun usWeekOf(millis: Long): String =
  TimeUtils.getUSWeek(millis)

fun isAm(): Boolean =
  TimeUtils.isAm()

fun isAm(time: String, pattern: String): Boolean =
  TimeUtils.isAm(time, pattern.toSafeDateFormat())

fun isAm(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isAm(time, format)

fun isAm(date: Date): Boolean =
  TimeUtils.isAm(date)

fun isAm(millis: Long): Boolean =
  TimeUtils.isAm(millis)

fun isPm(): Boolean =
  TimeUtils.isPm()

fun isPm(time: String, pattern: String): Boolean =
  TimeUtils.isPm(time, pattern.toSafeDateFormat())

fun isPm(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isPm(time, format)

fun isPm(date: Date): Boolean =
  TimeUtils.isPm(date)

fun isPm(millis: Long): Boolean =
  TimeUtils.isPm(millis)

fun calendarFieldOf(field: Int): Int =
  TimeUtils.getValueByCalendarField(field)

fun calendarFieldOf(time: String, field: Int, pattern: String): Int =
  TimeUtils.getValueByCalendarField(time, pattern.toSafeDateFormat(), field)

fun calendarFieldOf(time: String, field: Int, format: DateFormat = defaultFormat): Int =
  TimeUtils.getValueByCalendarField(time, format, field)

fun calendarFieldOf(date: Date, field: Int): Int =
  TimeUtils.getValueByCalendarField(date, field)

fun calendarFieldOf(millis: Long, field: Int): Int =
  TimeUtils.getValueByCalendarField(millis, field)

fun chineseZodiacOf(time: String, pattern: String): String =
  TimeUtils.getChineseZodiac(time, pattern.toSafeDateFormat())

fun chineseZodiacOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getChineseZodiac(time, format)

fun chineseZodiacOf(date: Date): String =
  TimeUtils.getChineseZodiac(date)

fun chineseZodiacOf(millis: Long): String =
  TimeUtils.getChineseZodiac(millis)

fun chineseZodiacOf(year: Int): String =
  TimeUtils.getChineseZodiac(year)

fun zodiacOf(time: String, pattern: String): String =
  TimeUtils.getZodiac(time, pattern.toSafeDateFormat())

fun zodiacOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getZodiac(time, format)

fun zodiacOf(date: Date): String =
  TimeUtils.getZodiac(date)

fun zodiacOf(millis: Long): String =
  TimeUtils.getZodiac(millis)

fun zodiacOf(month: Int, day: Int): String =
  TimeUtils.getZodiac(month, day)