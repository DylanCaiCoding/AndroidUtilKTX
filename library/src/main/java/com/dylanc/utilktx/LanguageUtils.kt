@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import com.blankj.utilcode.util.LanguageUtils
import java.util.*
import kotlin.reflect.KClass

/**
 * @author Dylan Cai
 */

inline fun applyAppSystemLanguage() =
  LanguageUtils.applySystemLanguage()

inline fun <reified T : Activity> applySystemLanguageTo() =
  LanguageUtils.applySystemLanguage(T::class.java)

inline fun applySystemLanguageTo(activityClassName: String) =
  LanguageUtils.applySystemLanguage(activityClassName)

inline fun applyLanguage(locale: Locale) =
  LanguageUtils.applyLanguage(locale)

inline fun <reified T : Activity> applyLanguageTo(locale: Locale) =
  LanguageUtils.applyLanguage(locale, T::class.java)

inline fun applyLanguageTo(locale: Locale, activityClassName: String) =
  LanguageUtils.applyLanguage(locale, activityClassName)

inline val isAppliedSystemLanguage: Boolean
  get() = LanguageUtils.isAppliedSystemLanguage()

inline val isAppliedLanguage: Boolean
  get() = LanguageUtils.isAppliedLanguage()

inline fun isAppliedLanguage(locale: Locale): Boolean =
  LanguageUtils.isAppliedLanguage(locale)

inline val currentLocale: Locale
  get() = LanguageUtils.getCurrentLocale()