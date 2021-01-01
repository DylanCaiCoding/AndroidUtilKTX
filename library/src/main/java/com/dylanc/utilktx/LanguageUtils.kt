@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import com.blankj.utilcode.util.LanguageUtils
import java.util.*
import kotlin.reflect.KClass

/**
 * @author Dylan Cai
 */

/**
 * Applies the system language. It will not restart Activity. You can put it in your [Activity.onCreate].
 * This is equivalent to calling:
 * ```
 * LanguageUtils.applySystemLanguage()
 * ```
 */
inline fun applySystemLanguage(isRelaunchApp: Boolean = false) =
  LanguageUtils.applySystemLanguage(isRelaunchApp)

///**
// * Applies the system language, and then starts the activity.  This is equivalent to calling:
// * ```
// * LanguageUtils.applySystemLanguage(activityClazz)
// * ```
// */
//inline fun <reified T : Activity> applySystemLanguageTo() =
//  LanguageUtils.applySystemLanguage(T::class.java)
//
///**
// * Applies the system language, and then starts the activity.  This is equivalent to calling:
// * ```
// * LanguageUtils.applySystemLanguage(activityClazzName)
// * ```
// */
//inline fun applySystemLanguageTo(activityClassName: String) =
//  LanguageUtils.applySystemLanguage(activityClassName)

/**
 * Applies the system language. It will not restart Activity. You can put it in your [Activity.onCreate].
 * This is equivalent to calling:
 * ```
 * LanguageUtils.applyLanguage(locale)
 * ```
 */
inline fun applyLanguage(locale: Locale) = LanguageUtils.applyLanguage(locale)

///**
// * Applies the language, and then starts the activity.  This is equivalent to calling:
// * ```
// * LanguageUtils.applyLanguage(locale, activityClazz)
// * ```
// */
//inline fun <reified T : Activity> applyLanguageTo(locale: Locale) =
//  LanguageUtils.applyLanguage(locale, T::class.java)
//
///**
// * Applies the language, and then starts the activity.  This is equivalent to calling:
// * ```
// * LanguageUtils.applyLanguage(locale, activityClazzName)
// * ```
// */
//inline fun applyLanguageTo(locale: Locale, activityClassName: String) =
//  LanguageUtils.applyLanguage(locale, activityClassName)

///**
// * Returns whether applied the system language by [LanguageUtils]. This is equivalent to calling:
// * ```
// * LanguageUtils.isAppliedSystemLanguage()
// * ```
// */
//inline val isAppliedSystemLanguage: Boolean get() = LanguageUtils.isAppliedSystemLanguage()

/**
 * Returns whether applied the language by [LanguageUtils]. This is equivalent to calling:
 * ```
 * LanguageUtils.isAppliedLanguage(locale)
 * ```
 */
inline val isAppliedLanguage: Boolean get() = LanguageUtils.isAppliedLanguage()

/**
 * Returns whether applied the language by [LanguageUtils]. This is equivalent to calling:
 * ```
 * LanguageUtils.isAppliedLanguage(locale)
 * ```
 */
inline fun isAppliedLanguage(locale: Locale): Boolean = LanguageUtils.isAppliedLanguage(locale)

///**
// * Returns the current locale. This is equivalent to calling:
// * ```
// * LanguageUtils.getCurrentLocale()
// * ```
// */
//inline val currentLocale: Locale get() = LanguageUtils.getCurrentLocale()