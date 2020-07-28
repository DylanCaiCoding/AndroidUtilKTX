@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.RegexUtils

/**
 * @author Dylan Cai
 */

inline fun CharSequence.isMobileSimple(): Boolean =
  RegexUtils.isMobileSimple(this)

inline fun CharSequence.isMobileExact(): Boolean =
  RegexUtils.isMobileExact(this)

inline fun CharSequence.isTelephone(): Boolean =
  RegexUtils.isTel(this)

inline fun CharSequence.isIDCard15(): Boolean =
  RegexUtils.isIDCard15(this)

inline fun CharSequence.isIDCard18(): Boolean =
  RegexUtils.isIDCard18(this)

inline fun CharSequence.isIDCard18Exact(): Boolean =
  RegexUtils.isIDCard18Exact(this)

inline fun CharSequence.isEmail(): Boolean =
  RegexUtils.isEmail(this)

inline fun CharSequence.isURL(): Boolean =
  RegexUtils.isURL(this)

inline fun CharSequence.isZh(): Boolean =
  RegexUtils.isZh(this)

inline fun CharSequence.isUsername(): Boolean =
  RegexUtils.isUsername(this)

inline fun CharSequence.isDate(): Boolean =
  RegexUtils.isDate(this)

inline fun CharSequence.isIP(): Boolean =
  RegexUtils.isIP(this)

inline fun CharSequence.isMatches(regex: String): Boolean =
  RegexUtils.isMatch(regex, this)

inline fun CharSequence.matches(regex: String): List<String> =
  RegexUtils.getMatches(regex, this)

inline fun String.split(regex: String): Array<String> =
  RegexUtils.getSplits(regex, this)

inline fun String.replaceFirst(regex: String, replacement: String): String =
  RegexUtils.getReplaceFirst(this, regex, replacement)

inline fun String.replaceAll(regex: String, replacement: String): String =
  RegexUtils.getReplaceAll(this, regex, replacement)