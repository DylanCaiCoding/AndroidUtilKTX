package com.dylanc.utilktx

import com.blankj.utilcode.util.RegexUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
fun CharSequence.isMobileSimple() = RegexUtils.isMobileSimple(this)

fun CharSequence.isMobileExact() = RegexUtils.isMobileExact(this)

fun CharSequence.isTel() = RegexUtils.isTel(this)

fun CharSequence.isIDCard15() = RegexUtils.isIDCard15(this)

fun CharSequence.isIDCard18() = RegexUtils.isIDCard18(this)

fun CharSequence.isIDCard18Exact() = RegexUtils.isIDCard18Exact(this)

fun CharSequence.isEmail() = RegexUtils.isEmail(this)

fun CharSequence.isURL() = RegexUtils.isURL(this)

fun CharSequence.isZh() = RegexUtils.isZh(this)

fun CharSequence.isUsername() = RegexUtils.isUsername(this)

fun CharSequence.isDate() = RegexUtils.isDate(this)

fun CharSequence.isIP() = RegexUtils.isIP(this)

fun CharSequence.isMatchRegex(regex: String) = RegexUtils.isMatch(regex, this)

fun CharSequence.getRegexMatches(regex: String): List<String> = RegexUtils.getMatches(regex, this)

fun String.getRegexSplits(regex: String): Array<String> = RegexUtils.getSplits(regex, this)

fun String.replaceFirstRegex(regex: String, replacement: String): String =
  RegexUtils.getReplaceFirst(this, regex, replacement)

fun String.replaceAllRegex(regex: String, replacement: String): String =
  RegexUtils.getReplaceAll(this, regex, replacement)

//todo