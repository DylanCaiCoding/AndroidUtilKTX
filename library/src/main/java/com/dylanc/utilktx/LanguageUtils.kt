@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import com.blankj.utilcode.util.LanguageUtils
import java.util.*
import kotlin.reflect.KClass

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun applySystemLanguage() =
  LanguageUtils.applySystemLanguage()

fun applySystemLanguage(activityClz: KClass<out Activity>) =
  LanguageUtils.applySystemLanguage(activityClz.java)

fun applySystemLanguage(activityClassName: String) =
  LanguageUtils.applySystemLanguage(activityClassName)

fun applyLanguage(locale: Locale) =
  LanguageUtils.applyLanguage(locale)

fun applyLanguage(locale: Locale, activityClz: KClass<out Activity>) =
  LanguageUtils.applyLanguage(locale, activityClz.java)

fun applyLanguage(locale: Locale, activityClassName: String) =
  LanguageUtils.applyLanguage(locale, activityClassName)

fun isAppliedSystemLanguage(): Boolean =
  LanguageUtils.isAppliedSystemLanguage()

val isAppliedLanguage: Boolean =
  LanguageUtils.isAppliedLanguage()

fun isAppliedLanguage(locale: Locale): Boolean =
  LanguageUtils.isAppliedLanguage(locale)

val currentLocale: Locale =
  LanguageUtils.getCurrentLocale()