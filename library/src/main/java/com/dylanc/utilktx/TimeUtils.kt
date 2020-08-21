@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.constant.TimeConstants
import com.blankj.utilcode.util.TimeUtils
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author Dylan Cai
 */

const val PATTERN_DATE_HOUR_MINUTE_SECOND = "yyyy-MM-dd HH:mm:ss"
const val PATTERN_DATE_HOUR_MINUTE = "yyyy-MM-dd HH:mm"
const val PATTERN_MONTH_DAY_HOUR_MINUTE = "MM-dd HH:mm"
const val PATTERN_DATE = "yyyy-MM-dd"
const val PATTERN_MONTH_DAY = "MM-dd"
const val PATTERN_HOUR_MINUTE_SECOND = "HH:mm:ss"
const val PATTERN_HOUR_MINUTE = "HH:mm"

inline val defaultFormat: SimpleDateFormat get() = PATTERN_DATE_HOUR_MINUTE_SECOND.toSafeDateFormat()

inline fun String.toSafeDateFormat(): SimpleDateFormat = TimeUtils.getSafeDateFormat(this)

/**
 * Formatted time string to the milliseconds. This is equivalent to calling:
 * ```
 * TimeUtils.string2Millis(this, pattern)
 * ```
 */
inline fun String.toMillis(pattern: String): Long = TimeUtils.string2Millis(this, pattern)

/**
 * Formatted time string to the milliseconds. This is equivalent to calling:
 * ```
 * TimeUtils.string2Millis(this, format)
 * ```
 */
inline fun String.toMillis(format: DateFormat = defaultFormat): Long = TimeUtils.string2Millis(this, format)

/**
 * Milliseconds to the formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.millis2String(this, pattern)
 * ```
 */
inline fun Long.toTimeString(pattern: String): String = TimeUtils.millis2String(this, pattern)

/**
 * Milliseconds to the formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.millis2String(this, format)
 * ```
 */
inline fun Long.toTimeString(format: DateFormat = defaultFormat): String = TimeUtils.millis2String(this, format)

/**
 * Formatted time string to the date. This is equivalent to calling:
 * ```
 * TimeUtils.string2Date(this, pattern)
 * ```
 */
inline fun String.toDate(pattern: String): Date = TimeUtils.string2Date(this, pattern)

/**
 * Formatted time string to the date. This is equivalent to calling:
 * ```
 * TimeUtils.string2Date(this, format)
 * ```
 */
inline fun String.toDate(format: DateFormat = defaultFormat): Date = TimeUtils.string2Date(this, format)

/**
 * Date to the formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.date2String(this, pattern)
 * ```
 */
inline fun Date.toTimeString(pattern: String): String = TimeUtils.date2String(this, pattern)

/**
 * Date to the formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.date2String(this, format)
 * ```
 */
inline fun Date.toTimeString(format: DateFormat = defaultFormat): String = TimeUtils.date2String(this, format)

/**
 * Date to the milliseconds. This is equivalent to calling:
 * ```
 * TimeUtils.date2Millis(this)
 * ```
 */
inline fun Date.toMillis(): Long = TimeUtils.date2Millis(this)

/**
 * Milliseconds to the date. This is equivalent to calling:
 * ```
 * TimeUtils.millis2Date(this)
 * ```
 */
inline fun Long.toDate(): Date = TimeUtils.millis2Date(this)

/**
 * Returns the time span, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpan(time1, time2, pattern.toSafeDateFormat(), unit)
 * ```
 */
inline fun timeSpanOf(time1: String, time2: String, @TimeConstants.Unit unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpan(time1, time2, pattern.toSafeDateFormat(), unit)

/**
 * Returns the time span, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpan(time1, time2, format, unit)
 * ```
 */
inline fun timeSpanOf(time1: String, time2: String, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpan(time1, time2, format, unit)

/**
 * Returns the time span, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpan(date1, date2, unit)
 * ```
 */
inline fun timeSpanOf(date1: Date, date2: Date, @TimeConstants.Unit unit: Int): Long = TimeUtils.getTimeSpan(date1, date2, unit)

/**
 * Returns the time span, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpan(millis1, millis2, unit)
 * ```
 */
inline fun timeSpanOf(millis1: Long, millis2: Long, @TimeConstants.Unit unit: Int): Long = TimeUtils.getTimeSpan(millis1, millis2, unit)

/**
 * Returns the fit time span. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpan(time1, time2, pattern.toSafeDateFormat(), precision)
 * ```
 */
inline fun fitTimeSpanOf(time1: String, time2: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpan(time1, time2, pattern.toSafeDateFormat(), precision)

/**
 * Returns the fit time span. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpan(time1, time2, format, precision)
 * ```
 */
inline fun fitTimeSpanOf(time1: String, time2: String, precision: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getFitTimeSpan(time1, time2, format, precision)

/**
 * Returns the fit time span. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpan(date1, date2, precision)
 * ```
 */
inline fun fitTimeSpanOf(date1: Date, date2: Date, precision: Int): String =
  TimeUtils.getFitTimeSpan(date1, date2, precision)

/**
 * Returns the fit time span. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpan(millis1, millis2, precision)
 * ```
 */
inline fun fitTimeSpanOf(millis1: Long, millis2: Long, precision: Int): String =
  TimeUtils.getFitTimeSpan(millis1, millis2, precision)

/**
 * Returns the current time in milliseconds. This is equivalent to calling:
 * ```
 * TimeUtils.getNowMills()
 * ```
 */
val nowMillis: Long = TimeUtils.getNowMills()

/**
 * Returns the current formatted time string. The pattern is yyyy-MM-dd HH:mm:ss. This is equivalent to calling:
 * ```
 * TimeUtils.getNowString()
 * ```
 */
val nowTimeString: String = TimeUtils.getNowString()

/**
 * Returns the current formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.getNowString(pattern.toSafeDateFormat())
 * ```
 */
inline fun nowTimeStringOf(pattern: String): String = TimeUtils.getNowString(pattern.toSafeDateFormat())

/**
 * Returns the current formatted time string. This is equivalent to calling:
 * ```
 * TimeUtils.getNowString(format)
 * ```
 */
inline fun nowTimeStringOf(format: DateFormat): String = TimeUtils.getNowString(format)

/**
 * Returns the current date. This is equivalent to calling:
 * ```
 * TimeUtils.getNowDate()
 * ```
 */
val nowDate: Date = TimeUtils.getNowDate()

/**
 * Returns the time span by now, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpanByNow(time, pattern.toSafeDateFormat(), unit)
 * ```
 */
inline fun timeSpanByNowOf(time: String, @TimeConstants.Unit unit: Int, pattern: String): Long =
  TimeUtils.getTimeSpanByNow(time, pattern.toSafeDateFormat(), unit)

/**
 * Returns the time span by now, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpanByNow(time, format, unit)
 * ```
 */
inline fun timeSpanByNowOf(time: String, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getTimeSpanByNow(time, format, unit)

/**
 * Returns the time span by now, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpanByNow(date, unit)
 * ```
 */
inline fun timeSpanByNowOf(date: Date, @TimeConstants.Unit unit: Int): Long = TimeUtils.getTimeSpanByNow(date, unit)

/**
 * Returns the time span by now, in unit. This is equivalent to calling:
 * ```
 * TimeUtils.getTimeSpanByNow(millis, unit)
 * ```
 */
inline fun timeSpanByNowOf(millis: Long, @TimeConstants.Unit unit: Int): Long = TimeUtils.getTimeSpanByNow(millis, unit)

/**
 * Returns the fit time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpanByNow(time, pattern.toSafeDateFormat(), precision)
 * ```
 */
inline fun fitTimeSpanByNowOf(time: String, precision: Int, pattern: String): String =
  TimeUtils.getFitTimeSpanByNow(time, pattern.toSafeDateFormat(), precision)

/**
 * Returns the fit time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpanByNow(time, format, precision)
 * ```
 */
inline fun fitTimeSpanByNowOf(time: String, precision: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getFitTimeSpanByNow(time, format, precision)

/**
 * Returns the fit time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpanByNow(date, precision)
 * ```
 */
inline fun fitTimeSpanByNowOf(date: Date, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(date, precision)

/**
 * Returns the fit time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFitTimeSpanByNow(millis, precision)
 * ```
 */
inline fun fitTimeSpanByNowOf(millis: Long, precision: Int): String =
  TimeUtils.getFitTimeSpanByNow(millis, precision)

/**
 * Returns the friendly time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFriendlyTimeSpanByNow(time, pattern.toSafeDateFormat())
 * ```
 *
 * @return the friendly time span by now
 * - 如果小于 1 秒钟内，显示刚刚
 * - 如果在 1 分钟内，显示 XXX秒前
 * - 如果在 1 小时内，显示 XXX分钟前
 * - 如果在 1 小时外的今天内，显示今天15:32
 * - 如果是昨天的，显示昨天15:32
 * - 其余显示，2016-10-15
 * - 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
 */
inline fun friendlyTimeSpanByNowOf(time: String, pattern: String): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, pattern.toSafeDateFormat())

/**
 * Returns the friendly time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFriendlyTimeSpanByNow(time, format)
 * ```
 *
 * @return the friendly time span by now
 * - 如果小于 1 秒钟内，显示刚刚
 * - 如果在 1 分钟内，显示 XXX秒前
 * - 如果在 1 小时内，显示 XXX分钟前
 * - 如果在 1 小时外的今天内，显示今天15:32
 * - 如果是昨天的，显示昨天15:32
 * - 其余显示，2016-10-15
 * - 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
 */
inline fun friendlyTimeSpanByNowOf(time: String, format: DateFormat = defaultFormat): String =
  TimeUtils.getFriendlyTimeSpanByNow(time, format)

/**
 * Returns the friendly time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFriendlyTimeSpanByNow(date)
 * ```
 *
 * @return the friendly time span by now
 * - 如果小于 1 秒钟内，显示刚刚
 * - 如果在 1 分钟内，显示 XXX秒前
 * - 如果在 1 小时内，显示 XXX分钟前
 * - 如果在 1 小时外的今天内，显示今天15:32
 * - 如果是昨天的，显示昨天15:32
 * - 其余显示，2016-10-15
 * - 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
 */
inline fun friendlyTimeSpanByNowOf(date: Date): String = TimeUtils.getFriendlyTimeSpanByNow(date)

/**
 * Returns the friendly time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getFriendlyTimeSpanByNow(millis)
 * ```
 *
 * @return the friendly time span by now
 * - 如果小于 1 秒钟内，显示刚刚
 * - 如果在 1 分钟内，显示 XXX秒前
 * - 如果在 1 小时内，显示 XXX分钟前
 * - 如果在 1 小时外的今天内，显示今天15:32
 * - 如果是昨天的，显示昨天15:32
 * - 其余显示，2016-10-15
 * - 时间不合法的情况全部日期和时间信息，如星期六 十月 27 14:21:20 CST 2007
 */
inline fun friendlyTimeSpanByNowOf(millis: Long): String = TimeUtils.getFriendlyTimeSpanByNow(millis)

/**
 * Returns the milliseconds differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getMillis(time, pattern.toSafeDateFormat(), timeSpan, unit)
 * ```
 */
inline fun millisOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): Long =
  TimeUtils.getMillis(time, pattern.toSafeDateFormat(), timeSpan, unit)

/**
 * Returns the milliseconds differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getMillis(time, format, timeSpan, unit)
 * ```
 */
inline fun millisOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): Long =
  TimeUtils.getMillis(time, format, timeSpan, unit)

/**
 * Returns the milliseconds differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getMillis(date, timeSpan, unit)
 * ```
 */
inline fun millisOf(date: Date, timeSpan: Long, @TimeConstants.Unit unit: Int): Long = TimeUtils.getMillis(date, timeSpan, unit)

/**
 * Returns the milliseconds differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getMillis(millis, timeSpan, unit)
 * ```
 */
inline fun millisOf(millis: Long, timeSpan: Long, @TimeConstants.Unit unit: Int): Long = TimeUtils.getMillis(millis, timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(time, pattern.toSafeDateFormat(), timeSpan, unit)
 * ```
 */
inline fun timeStringOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): String =
  TimeUtils.getString(time, pattern.toSafeDateFormat(), timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(time, format, timeSpan, unit)
 * ```
 */
inline fun timeStringOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getString(time, format, timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(date, pattern.toSafeDateFormat(), timeSpan, unit)
 * ```
 */
inline fun timeStringOf(date: Date, timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): String =
  TimeUtils.getString(date, pattern.toSafeDateFormat(), timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(date, format, timeSpan, unit)
 * ```
 */
inline fun timeStringOf(date: Date, timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getString(date, format, timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(millis, pattern.toSafeDateFormat(), timeSpan, unit)
 * ```
 */
inline fun timeStringOf(millis: Long, timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): String =
  TimeUtils.getString(millis, pattern.toSafeDateFormat(), timeSpan, unit)

/**
 * Returns the formatted time string differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getString(millis, format, timeSpan, unit)
 * ```
 */
inline fun timeStringOf(millis: Long, timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getString(millis, format, timeSpan, unit)

/**
 * Returns the date differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getDate(time, pattern.toSafeDateFormat(), timeSpan, unit)
 * ```
 */
inline fun dateOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): Date =
  TimeUtils.getDate(time, pattern.toSafeDateFormat(), timeSpan, unit)

/**
 * Returns the date differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getDate(time, format, timeSpan, unit)
 * ```
 */
inline fun dateOf(time: String, timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): Date =
  TimeUtils.getDate(time, format, timeSpan, unit)

/**
 * Returns the date differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getDate(date, timeSpan, unit)
 * ```
 */
inline fun dateOf(date: Date, timeSpan: Long, @TimeConstants.Unit unit: Int): Date = TimeUtils.getDate(date, timeSpan, unit)

/**
 * Returns the date differ time span. This is equivalent to calling:
 * ```
 * TimeUtils.getDate(millis, timeSpan, unit)
 * ```
 */
inline fun dateOf(millis: Long, timeSpan: Long, @TimeConstants.Unit unit: Int): Date = TimeUtils.getDate(millis, timeSpan, unit)

/**
 * Returns the milliseconds differ time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getMillisByNow(timeSpan, unit)
 * ```
 */
inline fun millisByNowOf(timeSpan: Long, @TimeConstants.Unit unit: Int): Long = TimeUtils.getMillisByNow(timeSpan, unit)

/**
 * Returns the formatted time string differ time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getStringByNow(timeSpan, pattern.toSafeDateFormat(), unit)
 * ```
 */
inline fun timeStringByNowOf(timeSpan: Long, @TimeConstants.Unit unit: Int, pattern: String): String =
  TimeUtils.getStringByNow(timeSpan, pattern.toSafeDateFormat(), unit)

/**
 * Returns the formatted time string differ time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getStringByNow(timeSpan, format, unit)
 * ```
 */
inline fun timeStringByNowOf(timeSpan: Long, @TimeConstants.Unit unit: Int, format: DateFormat = defaultFormat): String =
  TimeUtils.getStringByNow(timeSpan, format, unit)

/**
 * Returns the date differ time span by now. This is equivalent to calling:
 * ```
 * TimeUtils.getDateByNow(timeSpan, unit)
 * ```
 */
inline fun dateByNowOf(timeSpan: Long, @TimeConstants.Unit unit: Int): Date =
  TimeUtils.getDateByNow(timeSpan, unit)

/**
 * Returns whether it is today. This is equivalent to calling:
 * ```
 * TimeUtils.isToday(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun isToday(time: String, pattern: String): Boolean = TimeUtils.isToday(time, pattern.toSafeDateFormat())

/**
 * Returns whether it is today. This is equivalent to calling:
 * ```
 * TimeUtils.isToday(time, format)
 * ```
 */
inline fun isToday(time: String, format: DateFormat = defaultFormat): Boolean = TimeUtils.isToday(time, format)

/**
 * Returns whether it is today. This is equivalent to calling:
 * ```
 * TimeUtils.isToday(date)
 * ```
 */
inline fun isToday(date: Date): Boolean = TimeUtils.isToday(date)

/**
 * Returns whether it is today. This is equivalent to calling:
 * ```
 * TimeUtils.isToday(millis)
 * ```
 */
inline fun isToday(millis: Long): Boolean = TimeUtils.isToday(millis)

/**
 * Returns whether it is leap year. This is equivalent to calling:
 * ```
 * TimeUtils.isLeapYear(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun isLeapYear(time: String, pattern: String): Boolean = TimeUtils.isLeapYear(time, pattern.toSafeDateFormat())

/**
 * Returns whether it is leap year. This is equivalent to calling:
 * ```
 * TimeUtils.isLeapYear(time, format)
 * ```
 */
inline fun isLeapYear(time: String, format: DateFormat = defaultFormat): Boolean = TimeUtils.isLeapYear(time, format)

/**
 * Returns whether it is leap year. This is equivalent to calling:
 * ```
 * TimeUtils.isLeapYear(date)
 * ```
 */
inline fun isLeapYear(date: Date): Boolean = TimeUtils.isLeapYear(date)

/**
 * Returns whether it is leap year. This is equivalent to calling:
 * ```
 * TimeUtils.isLeapYear(millis)
 * ```
 */
inline fun isLeapYear(millis: Long): Boolean = TimeUtils.isLeapYear(millis)

/**
 * Returns whether it is leap year. This is equivalent to calling:
 * ```
 * TimeUtils.isLeapYear(year)
 * ```
 */
inline fun isLeapYear(year: Int): Boolean = TimeUtils.isLeapYear(year)

/**
 * Returns the day of week in Chinese. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseWeek(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun chineseWeekOf(time: String, pattern: String): String = TimeUtils.getChineseWeek(time, pattern.toSafeDateFormat())

/**
 * Returns the day of week in Chinese. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseWeek(time, format)
 * ```
 */
inline fun chineseWeekOf(time: String, format: DateFormat = defaultFormat): String = TimeUtils.getChineseWeek(time, format)

/**
 * Returns the day of week in Chinese. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseWeek(date)
 * ```
 */
inline fun chineseWeekOf(date: Date): String = TimeUtils.getChineseWeek(date)

/**
 * Returns the day of week in Chinese. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseWeek(millis)
 * ```
 */
inline fun chineseWeekOf(millis: Long): String = TimeUtils.getChineseWeek(millis)

/**
 * Returns the day of week in US. This is equivalent to calling:
 * ```
 * TimeUtils.getUSWeek(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun usWeekOf(time: String, pattern: String): String = TimeUtils.getUSWeek(time, pattern.toSafeDateFormat())

/**
 * Returns the day of week in US. This is equivalent to calling:
 * ```
 * TimeUtils.getUSWeek(time, format)
 * ```
 */
inline fun usWeekOf(time: String, format: DateFormat = defaultFormat): String = TimeUtils.getUSWeek(time, format)

/**
 * Returns the day of week in US. This is equivalent to calling:
 * ```
 * TimeUtils.getUSWeek(date)
 * ```
 */
inline fun usWeekOf(date: Date): String = TimeUtils.getUSWeek(date)

/**
 * Returns the day of week in US. This is equivalent to calling:
 * ```
 * TimeUtils.getUSWeek(millis)
 * ```
 */
inline fun usWeekOf(millis: Long): String = TimeUtils.getUSWeek(millis)

/**
 * Returns whether it is am. This is equivalent to calling:
 * ```
 * TimeUtils.isAm()
 * ```
 */
inline fun isAm(): Boolean = TimeUtils.isAm()

/**
 * Returns whether it is am. This is equivalent to calling:
 * ```
 * TimeUtils.isAm(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun isAm(time: String, pattern: String): Boolean = TimeUtils.isAm(time, pattern.toSafeDateFormat())

/**
 * Returns whether it is am. This is equivalent to calling:
 * ```
 * TimeUtils.isAm(time, format)
 * ```
 */
inline fun isAm(time: String, format: DateFormat = defaultFormat): Boolean = TimeUtils.isAm(time, format)

/**
 * Returns whether it is am. This is equivalent to calling:
 * ```
 * TimeUtils.isAm(date)
 * ```
 */
inline fun isAm(date: Date): Boolean = TimeUtils.isAm(date)

/**
 * Returns whether it is am. This is equivalent to calling:
 * ```
 * TimeUtils.isAm(millis)
 * ```
 */
inline fun isAm(millis: Long): Boolean = TimeUtils.isAm(millis)

/**
 * Returns whether it is pm. This is equivalent to calling:
 * ```
 * TimeUtils.isPm()
 * ```
 */
inline fun isPm(): Boolean = TimeUtils.isPm()

/**
 * Returns whether it is pm. This is equivalent to calling:
 * ```
 * TimeUtils.isPm(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun isPm(time: String, pattern: String): Boolean = TimeUtils.isPm(time, pattern.toSafeDateFormat())

/**
 * Returns whether it is pm. This is equivalent to calling:
 * ```
 * TimeUtils.isPm(time, format)
 * ```
 */
inline fun isPm(time: String, format: DateFormat = defaultFormat): Boolean = TimeUtils.isPm(time, format)

/**
 * Returns whether it is pm. This is equivalent to calling:
 * ```
 * TimeUtils.isPm(date)
 * ```
 */
inline fun isPm(date: Date): Boolean = TimeUtils.isPm(date)

/**
 * Returns whether it is pm. This is equivalent to calling:
 * ```
 * TimeUtils.isPm(millis)
 * ```
 */
inline fun isPm(millis: Long): Boolean = TimeUtils.isPm(millis)

/**
 * Returns the value of the given calendar field. This is equivalent to calling:
 * ```
 * TimeUtils.getValueByCalendarField(field)
 * ```
 */
inline fun calendarFieldOf(field: Int): Int = TimeUtils.getValueByCalendarField(field)

/**
 * Returns the value of the given calendar field. This is equivalent to calling:
 * ```
 * TimeUtils.getValueByCalendarField(time, pattern.toSafeDateFormat(), field)
 * ```
 */
inline fun calendarFieldOf(time: String, field: Int, pattern: String): Int =
  TimeUtils.getValueByCalendarField(time, pattern.toSafeDateFormat(), field)

/**
 * Returns the value of the given calendar field. This is equivalent to calling:
 * ```
 * TimeUtils.getValueByCalendarField(time, format, field)
 * ```
 */
inline fun calendarFieldOf(time: String, field: Int, format: DateFormat = defaultFormat): Int =
  TimeUtils.getValueByCalendarField(time, format, field)

/**
 * Returns the value of the given calendar field. This is equivalent to calling:
 * ```
 * TimeUtils.getValueByCalendarField(date, field)
 * ```
 */
inline fun calendarFieldOf(date: Date, field: Int): Int = TimeUtils.getValueByCalendarField(date, field)

/**
 * Returns the value of the given calendar field. This is equivalent to calling:
 * ```
 * TimeUtils.getValueByCalendarField(millis, field)
 * ```
 */
inline fun calendarFieldOf(millis: Long, field: Int): Int = TimeUtils.getValueByCalendarField(millis, field)

/**
 * Returns the Chinese zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseZodiac(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun chineseZodiacOf(time: String, pattern: String): String = TimeUtils.getChineseZodiac(time, pattern.toSafeDateFormat())

/**
 * Returns the Chinese zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseZodiac(time, format)
 * ```
 */
inline fun chineseZodiacOf(time: String, format: DateFormat = defaultFormat): String = TimeUtils.getChineseZodiac(time, format)

/**
 * Returns the Chinese zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseZodiac(date)
 * ```
 */
inline fun chineseZodiacOf(date: Date): String = TimeUtils.getChineseZodiac(date)

/**
 * Returns the Chinese zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseZodiac(millis)
 * ```
 */
inline fun chineseZodiacOf(millis: Long): String = TimeUtils.getChineseZodiac(millis)

/**
 * Returns the Chinese zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getChineseZodiac(year)
 * ```
 */
inline fun chineseZodiacOf(year: Int): String = TimeUtils.getChineseZodiac(year)

/**
 * Returns the zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getZodiac(time, pattern.toSafeDateFormat())
 * ```
 */
inline fun zodiacOf(time: String, pattern: String): String = TimeUtils.getZodiac(time, pattern.toSafeDateFormat())

/**
 * Returns the zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getZodiac(time, format)
 * ```
 */
inline fun zodiacOf(time: String, format: DateFormat = defaultFormat): String = TimeUtils.getZodiac(time, format)

/**
 * Returns the zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getZodiac(date)
 * ```
 */
inline fun zodiacOf(date: Date): String = TimeUtils.getZodiac(date)

/**
 * Returns the zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getZodiac(millis)
 * ```
 */
inline fun zodiacOf(millis: Long): String = TimeUtils.getZodiac(millis)

/**
 * Returns the zodiac. This is equivalent to calling:
 * ```
 * TimeUtils.getZodiac(month, day)
 * ```
 */
inline fun zodiacOf(month: Int, day: Int): String = TimeUtils.getZodiac(month, day)