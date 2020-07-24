package com.dylanc.utilktx

import com.blankj.utilcode.util.RegexUtils

/**
 * @author Dylan Cai
 */

fun CharSequence.isMobileSimple(): Boolean =
  RegexUtils.isMobileSimple(this)

fun CharSequence.isMobileExact(): Boolean =
  RegexUtils.isMobileExact(this)

fun CharSequence.isTelephone(): Boolean =
  RegexUtils.isTel(this)

fun CharSequence.isIDCard15(): Boolean =
  RegexUtils.isIDCard15(this)

fun CharSequence.isIDCard18(): Boolean =
  RegexUtils.isIDCard18(this)

fun CharSequence.isIDCard18Exact(): Boolean =
  RegexUtils.isIDCard18Exact(this)

fun CharSequence.isEmail(): Boolean =
  RegexUtils.isEmail(this)

fun CharSequence.isURL(): Boolean =
  RegexUtils.isURL(this)

fun CharSequence.isZh(): Boolean =
  RegexUtils.isZh(this)

fun CharSequence.isUsername(): Boolean =
  RegexUtils.isUsername(this)

fun CharSequence.isDate(): Boolean =
  RegexUtils.isDate(this)

fun CharSequence.isIP(): Boolean =
  RegexUtils.isIP(this)

fun CharSequence.isMatchRegex(regex: String): Boolean =
  RegexUtils.isMatch(regex, this)

fun CharSequence.matchRegex(regex: String): List<String> =
  RegexUtils.getMatches(regex, this)

fun String.splitRegex(regex: String): Array<String> =
  RegexUtils.getSplits(regex, this)

fun String.replaceFirstRegex(regex: String, replacement: String): String =
  RegexUtils.getReplaceFirst(this, regex, replacement)

fun String.replaceAllRegex(regex: String, replacement: String): String =
  RegexUtils.getReplaceAll(this, regex, replacement)