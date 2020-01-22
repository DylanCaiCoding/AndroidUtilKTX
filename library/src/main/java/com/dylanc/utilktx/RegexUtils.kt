package com.dylanc.utilktx

import com.blankj.utilcode.util.RegexUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val CharSequence.isMobileSimple
  get() = RegexUtils.isMobileSimple(this)

val CharSequence.isMobileExact
  get() = RegexUtils.isMobileExact(this)

val CharSequence.isTel
  get() = RegexUtils.isTel(this)

val CharSequence.isIDCard15
  get() = RegexUtils.isIDCard15(this)

val CharSequence.isIDCard18
  get() = RegexUtils.isIDCard18(this)

val CharSequence.isIDCard18Exact
  get() = RegexUtils.isIDCard18Exact(this)

val CharSequence.isEmail
  get() = RegexUtils.isEmail(this)

val CharSequence.isURL
  get() = RegexUtils.isURL(this)

val CharSequence.isZh
  get() = RegexUtils.isZh(this)

val CharSequence.isUsername
  get() = RegexUtils.isUsername(this)

val CharSequence.isDate
  get() = RegexUtils.isDate(this)

val CharSequence.isIP
  get() = RegexUtils.isIP(this)

fun CharSequence.isMatchRegex(regex: String) = RegexUtils.isMatch(regex, this)

fun CharSequence.getRegexMatches(regex: String) = RegexUtils.getMatches(regex, this)

fun String.getRegexSplits(regex: String) = RegexUtils.getSplits(regex, this)

fun String.replaceFirstRegex(regex: String, replacement: String) =
  RegexUtils.getReplaceFirst(this, regex, replacement)

fun String.replaceAllRegex(regex: String, replacement: String) =
  RegexUtils.getReplaceAll(this, regex, replacement)