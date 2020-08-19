@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.TimeUtils
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Dylan Cai
 */

// TODO: 2020/8/19
const val PATTERN_DATE_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss"
const val PATTERN_DATE_HOUR_MINUTE = "yyyy-MM-dd HH:mm"
const val PATTERN_MONTH_DAY_HOUR_MINUTE = "MM-dd HH:mm"
const val PATTERN_DATE = "yyyy-MM-dd"
const val PATTERN_MONTH_DAY = "MM-dd"
const val PATTERN_HOUR_MINUTE_SECOND = "HH:mm:ss"
const val PATTERN_HOUR_MINUTE = "HH:mm"

inline val defaultFormat: SimpleDateFormat
  get() = PATTERN_DATE_HOUR_MINUTE_SECOND.toSafeDateFormat()

inline fun String.toSafeDateFormat(): SimpleDateFormat =
  TimeUtils.getSafeDateFormat(this)

inline fun String.toMillis(pattern: String): Long =
  TimeUtils.string2Millis(this, pattern)

inline fun String.toMillis(format: DateFormat = defaultFormat): Long =
  TimeUtils.string2Millis(this, format)

inline fun Long.toTimeString(pattern: String): String =
  TimeUtils.millis2String(this, pattern)

inline fun Long.toTimeString(format: DateFormat = defaultFormat): String =
  TimeUtils.millis2String(this, format)

inline fun String.toDate(pattern: String): Date =
  TimeUtils.string2Date(this, pattern)

inline fun String.toDate(format: DateFormat = defaultFormat): Date =
  TimeUtils.string2Date(this, format)

inline fun Date.toTimeString(pattern: String): String =
  TimeUtils.date2String(this, pattern)

inline fun Date.toTimeString(format: DateFormat = defaultFormat): String =
  TimeUtils.date2String(this, format)

inline fun Date.toMillis(): Long =
  TimeUtils.date2Millis(this)

inline fun Long.toDate(): Date =
  TimeUtils.millis2Date(this)

inline fun timeSpanOf(time1: String, time2: String, unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpan(time1, time2, pattern.toSafeDateFormat(), unit)

inline fun timeSpanOf(time1: String, time2: String, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpan(time1, time2, format, unit)

inline fun timeSpanOf(date1: Date, date2: Date, unit: Int): Long =
  TimeUtils.getTimeSpan(date1, date2, unit)

inline fun timeSpanOf(millis1: Long, millis2: Long, unit: Int): Long =
  TimeUtils.getTimeSpan(millis1, millis2, unit)

inline fun fitTimeSpanOf(time1: String, time2: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpan(time1, time2, pattern.toSafeDateFormat(), precision)

inline fun fitTimeSpanOf(
  time1: String, time2: String, precision: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getFitTimeSpan(time1, time2, format, precision)

inline fun fitTimeSpanOf(date1: Date, date2: Date, precision: Int): String =
  TimeUtils.getFitTimeSpan(date1, date2, precision)

inline fun fitTimeSpanOf(millis1: Long, millis2: Long, precision: Int): String =
  TimeUtils.getFitTimeSpan(millis1, millis2, precision)

val nowMillis: Long =
  TimeUtils.getNowMills()

val nowTimeString: String =
  TimeUtils.getNowString()

inline fun nowTimeStringOf(pattern: String): String =
  TimeUtils.getNowString(pattern.toSafeDateFormat())

inline fun nowTimeStringOf(format: DateFormat): String =
  TimeUtils.getNowString(format)

val nowDate: Date =
  TimeUtils.getNowDate()

inline fun timeSpanByNowOf(time: String, unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpanByNow(time, pattern.toSafeDateFormat(), unit)

inline fun timeSpanByNowOf(time: String, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpanByNow(time, format, unit)

inline fun timeSpanByNowOf(date: Date, unit: Int): Long =
  TimeUtils.getTimeSpanByNow(date, unit)

inline fun timeSpanByNowOf(millis: Long, unit: Int): Long =
  TimeUtils.getTimeSpanByNow(millis, unit)

inline fun fitTimeSpanByNowOf(time: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpanByNow(time, pattern.toSafeDateFormat(), precision)

inline fun fitTimeSpanByNowOf(time: String, precision: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getFitTimeSpanByNow(time, format, precision)

inline fun fitTimeSpanByNowOf(date: Date, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(date, precision)

inline fun fitTimeSpanByNowOf(millis: Long, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(millis, precision)

inline fun friendlyTimeSpanByNowOf(time: String, pattern: String): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, pattern.toSafeDateFormat())

inline fun friendlyTimeSpanByNowOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, format)

inline fun friendlyTimeSpanByNowOf(date: Date): String =
  TimeUtils.getFriendlyTimeSpanByNow(date)

inline fun friendlyTimeSpanByNowOf(millis: Long): String =
  TimeUtils.getFriendlyTimeSpanByNow(millis)

inline fun millisOf(time: String, timeSpan: Long, unit: Int, pattern: String): Long =
  TimeUtils.getMillis(time, pattern.toSafeDateFormat(), timeSpan, unit)

inline fun millisOf(time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getMillis(time, format, timeSpan, unit)

inline fun millisOf(date: Date, timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillis(date, timeSpan, unit)

inline fun millisOf(millis: Long, timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillis(millis, timeSpan, unit)

inline fun timeStringOf(time: String, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(time, pattern.toSafeDateFormat(), timeSpan, unit)

inline fun timeStringOf(
  time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(time, format, timeSpan, unit)

inline fun timeStringOf(date: Date, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(date, pattern.toSafeDateFormat(), timeSpan, unit)

inline fun timeStringOf(
  date: Date, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(date, format, timeSpan, unit)

inline fun timeStringOf(millis: Long, timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getString(millis, pattern.toSafeDateFormat(), timeSpan, unit)

inline fun timeStringOf(
  millis: Long, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat
): String =
  TimeUtils.getString(millis, format, timeSpan, unit)

inline fun dateOf(time: String, timeSpan: Long, unit: Int, pattern: String): Date =
  TimeUtils.getDate(time, pattern.toSafeDateFormat(), timeSpan, unit)

inline fun dateOf(time: String, timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): Date =
  TimeUtils.getDate(time, format, timeSpan, unit)

inline fun dateOf(date: Date, timeSpan: Long, unit: Int): Date =
  TimeUtils.getDate(date, timeSpan, unit)

inline fun dateOf(millis: Long, timeSpan: Long, unit: Int): Date =
  TimeUtils.getDate(millis, timeSpan, unit)

inline fun millisByNowOf(timeSpan: Long, unit: Int): Long =
  TimeUtils.getMillisByNow(timeSpan, unit)

inline fun timeStringByNowOf(timeSpan: Long, unit: Int, pattern: String): String =
  TimeUtils.getStringByNow(timeSpan, pattern.toSafeDateFormat(), unit)

inline fun timeStringByNowOf(timeSpan: Long, unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getStringByNow(timeSpan, format, unit)

inline fun dateByNowOf(timeSpan: Long, unit: Int): Date =
  TimeUtils.getDateByNow(timeSpan, unit)

inline fun isToday(time: String, pattern: String): Boolean =
  TimeUtils.isToday(time, pattern.toSafeDateFormat())

inline fun isToday(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isToday(time, format)

inline fun isToday(date: Date): Boolean =
  TimeUtils.isToday(date)

inline fun isToday(millis: Long): Boolean =
  TimeUtils.isToday(millis)

inline fun isLeapYear(time: String, pattern: String): Boolean =
  TimeUtils.isLeapYear(time, pattern.toSafeDateFormat())

inline fun isLeapYear(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isLeapYear(time, format)

inline fun isLeapYear(date: Date): Boolean =
  TimeUtils.isLeapYear(date)

inline fun isLeapYear(millis: Long): Boolean =
  TimeUtils.isLeapYear(millis)

inline fun isLeapYear(year: Int): Boolean =
  TimeUtils.isLeapYear(year)

inline fun chineseWeekOf(time: String, pattern: String): String =
  TimeUtils.getChineseWeek(time, pattern.toSafeDateFormat())

inline fun chineseWeekOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getChineseWeek(time, format)

inline fun chineseWeekOf(date: Date): String =
  TimeUtils.getChineseWeek(date)

inline fun chineseWeekOf(millis: Long): String =
  TimeUtils.getChineseWeek(millis)

inline fun usWeekOf(time: String, pattern: String): String =
  TimeUtils.getUSWeek(time, pattern.toSafeDateFormat())

inline fun usWeekOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getUSWeek(time, format)

inline fun usWeekOf(date: Date): String =
  TimeUtils.getUSWeek(date)

inline fun usWeekOf(millis: Long): String =
  TimeUtils.getUSWeek(millis)

inline fun isAm(): Boolean =
  TimeUtils.isAm()

inline fun isAm(time: String, pattern: String): Boolean =
  TimeUtils.isAm(time, pattern.toSafeDateFormat())

inline fun isAm(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isAm(time, format)

inline fun isAm(date: Date): Boolean =
  TimeUtils.isAm(date)

inline fun isAm(millis: Long): Boolean =
  TimeUtils.isAm(millis)

inline fun isPm(): Boolean =
  TimeUtils.isPm()

inline fun isPm(time: String, pattern: String): Boolean =
  TimeUtils.isPm(time, pattern.toSafeDateFormat())

inline fun isPm(time: String, format: DateFormat = defaultFormat): Boolean =
  TimeUtils.isPm(time, format)

inline fun isPm(date: Date): Boolean =
  TimeUtils.isPm(date)

inline fun isPm(millis: Long): Boolean =
  TimeUtils.isPm(millis)

inline fun calendarFieldOf(field: Int): Int =
  TimeUtils.getValueByCalendarField(field)

inline fun calendarFieldOf(time: String, field: Int, pattern: String): Int =
  TimeUtils.getValueByCalendarField(time, pattern.toSafeDateFormat(), field)

inline fun calendarFieldOf(time: String, field: Int, format: DateFormat = defaultFormat): Int =
  TimeUtils.getValueByCalendarField(time, format, field)

inline fun calendarFieldOf(date: Date, field: Int): Int =
  TimeUtils.getValueByCalendarField(date, field)

inline fun calendarFieldOf(millis: Long, field: Int): Int =
  TimeUtils.getValueByCalendarField(millis, field)

inline fun chineseZodiacOf(time: String, pattern: String): String =
  TimeUtils.getChineseZodiac(time, pattern.toSafeDateFormat())

inline fun chineseZodiacOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getChineseZodiac(time, format)

inline fun chineseZodiacOf(date: Date): String =
  TimeUtils.getChineseZodiac(date)

inline fun chineseZodiacOf(millis: Long): String =
  TimeUtils.getChineseZodiac(millis)

inline fun chineseZodiacOf(year: Int): String =
  TimeUtils.getChineseZodiac(year)

inline fun zodiacOf(time: String, pattern: String): String =
  TimeUtils.getZodiac(time, pattern.toSafeDateFormat())

inline fun zodiacOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getZodiac(time, format)

inline fun zodiacOf(date: Date): String =
  TimeUtils.getZodiac(date)

inline fun zodiacOf(millis: Long): String =
  TimeUtils.getZodiac(millis)

inline fun zodiacOf(month: Int, day: Int): String =
  TimeUtils.getZodiac(month, day)