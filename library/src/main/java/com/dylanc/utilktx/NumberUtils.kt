package com.dylanc.utilktx

import com.blankj.utilcode.util.NumberUtils

/**
 * @author Dylan Cai
 */

/**
 * Format the number.
 *
 * @param isGrouping       True to set grouping will be used in this format, false otherwise.
 * @param minIntegerDigits The minimum number of digits allowed in the integer portion of value.
 * @param fractionDigits   The number of digits allowed in the fraction portion of value.
 * @param isHalfUp         True to rounded towards the nearest neighbor.
 * @return the format value
 */
fun Float.format(
  fractionDigits: Int,
  isGrouping: Boolean = false,
  minIntegerDigits: Int = 1,
  isHalfUp: Boolean = true
): String =
  NumberUtils.format(this, isGrouping, minIntegerDigits, fractionDigits, isHalfUp)

/**
 * Format the number.
 *
 * @param isGrouping       True to set grouping will be used in this format, false otherwise.
 * @param minIntegerDigits The minimum number of digits allowed in the integer portion of value.
 * @param fractionDigits   The number of digits allowed in the fraction portion of value.
 * @param isHalfUp         True to rounded towards the nearest neighbor.
 * @return the format value
 */
fun Double.format(
  fractionDigits: Int,
  isGrouping: Boolean = false,
  minIntegerDigits: Int = 1,
  isHalfUp: Boolean = true
): String =
  NumberUtils.format(this, isGrouping, minIntegerDigits, fractionDigits, isHalfUp)

fun Float.toPrice(
  isInteger: Boolean = false,
  isGrouping: Boolean = false
) =
  format(if (isInteger) 0 else 2, isGrouping = isGrouping)

fun Double.toPrice(
  isInteger: Boolean = false,
  isGrouping: Boolean = false
) =
  format(if (isInteger) 0 else 2, isGrouping = isGrouping)