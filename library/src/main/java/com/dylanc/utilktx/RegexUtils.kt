@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.RegexUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether input matches regex of simple mobile. This is equivalent to calling:
 * ```
 * RegexUtils.isMobileSimple(input)
 * ```
 */
inline fun String.isMobileSimple(): Boolean = RegexUtils.isMobileSimple(this)

/**
 * Returns whether input matches regex of exact mobile. This is equivalent to calling:
 * ```
 * RegexUtils.isMobileExact(input)
 * ```
 */
inline fun String.isMobileExact(): Boolean = RegexUtils.isMobileExact(this)

/**
 * Returns whether input matches regex of telephone number. This is equivalent to calling:
 * ```
 * RegexUtils.isTel(input)
 * ```
 */
inline fun String.isTelephone(): Boolean = RegexUtils.isTel(this)

/**
 * Returns whether input matches regex of id card number which length is 15. This is equivalent to calling:
 * ```
 * RegexUtils.isIDCard15(input)
 * ```
 */
inline fun String.isIDCard15(): Boolean = RegexUtils.isIDCard15(this)

/**
 * Returns whether input matches regex of id card number which length is 18. This is equivalent to calling:
 * ```
 * RegexUtils.isIDCard15(input)
 * ```
 */
inline fun String.isIDCard18(): Boolean = RegexUtils.isIDCard18(this)

/**
 * Returns whether input matches regex of exact id card number which length is 18. This is equivalent to calling:
 * ```
 * RegexUtils.isIDCard18Exact(input)
 * ```
 */
inline fun String.isIDCard18Exact(): Boolean = RegexUtils.isIDCard18Exact(this)

/**
 * Returns whether input matches regex of email. This is equivalent to calling:
 * ```
 * RegexUtils.isEmail(input)
 * ```
 */
inline fun String.isEmail(): Boolean = RegexUtils.isEmail(this)

/**
 * Returns whether input matches regex of url. This is equivalent to calling:
 * ```
 * RegexUtils.isURL(input)
 * ```
 */
inline fun String.isURL(): Boolean = RegexUtils.isURL(this)

/**
 * Returns whether input matches regex of Chinese character. This is equivalent to calling:
 * ```
 * RegexUtils.isZh(input)
 * ```
 */
inline fun String.isZh(): Boolean = RegexUtils.isZh(this)

/**
 * Returns whether input matches regex of username.
 *
 * scope for "a-z", "A-Z", "0-9", "_", "Chinese character"
 *
 * can't end with "_"
 *
 * length is between 6 to 20
 *
 * This is equivalent to calling:
 * ```
 * RegexUtils.isUsername(input)
 * ```
 */
inline fun String.isUsername(): Boolean = RegexUtils.isUsername(this)

/**
 * Returns whether input matches regex of date which pattern is "yyyy-MM-dd". This is equivalent to calling:
 * ```
 * RegexUtils.isDate(input)
 * ```
 */
inline fun String.isDate(): Boolean = RegexUtils.isDate(this)

/**
 * Returns whether input matches regex of ip address. This is equivalent to calling:
 * ```
 * RegexUtils.isIP(input)
 * ```
 */
inline fun String.isIP(): Boolean = RegexUtils.isIP(this)

/**
 * Returns whether input matches the regex. This is equivalent to calling:
 * ```
 * RegexUtils.isMatch(regex, input)
 * ```
 */
inline fun String.isMatches(regex: String): Boolean = RegexUtils.isMatch(regex, this)

/**
 * Returns the list of input matches the regex. This is equivalent to calling:
 * ```
 * RegexUtils.getMatches(regex, input)
 * ```
 */
inline fun String.matches(regex: String): List<String> = RegexUtils.getMatches(regex, this)

/**
 * Splits input around matches of the regex. This is equivalent to calling:
 * ```
 * RegexUtils.getSplits(regex, input)
 * ```
 */
inline fun String.split(regex: String): Array<String> = RegexUtils.getSplits(regex, this)

/**
 * Replaces the first subsequence of the input sequence that matches the regex with the given replacement string.
 * This is equivalent to calling:
 * ```
 * RegexUtils.getReplaceFirst(input, regex, replacement)
 * ```
 */
inline fun String.replaceFirst(regex: String, replacement: String): String = RegexUtils.getReplaceFirst(this, regex, replacement)

/**
 * Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.
 * This is equivalent to calling:
 * ```
 * RegexUtils.getReplaceAll(input, regex, replacement)
 * ```
 */
inline fun String.replaceAll(regex: String, replacement: String): String = RegexUtils.getReplaceAll(this, regex, replacement)