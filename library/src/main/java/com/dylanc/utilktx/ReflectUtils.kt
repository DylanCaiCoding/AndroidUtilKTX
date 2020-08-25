@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ReflectUtils

/**
 * @author Dylan Cai
 */

/**
 * Reflect the class. This is equivalent to calling:
 * ```
 * ReflectUtils.reflect(clazz).apply(block).get()
 * ```
 */
inline fun <reified T> reflect(block: ReflectUtils.() -> Unit): T = ReflectUtils.reflect(T::class.java).apply(block).get()

/**
 * Reflect the class. This is equivalent to calling:
 * ```
 *  ReflectUtils.reflect(className).apply(block).get()
 * ```
 */
inline fun <T> reflect(className: String, block: ReflectUtils.() -> Unit): T = ReflectUtils.reflect(className).apply(block).get()

/**
 * Reflect the class. This is equivalent to calling:
 * ```
 * ReflectUtils.reflect(className, classLoader).apply(block).get()
 * ```
 */
inline fun <T> reflect(className: String, classLoader: ClassLoader, block: ReflectUtils.() -> Unit): T =
  ReflectUtils.reflect(className, classLoader).apply(block).get()

/**
 * Reflect the class. This is equivalent to calling:
 * ```
 * ReflectUtils.reflect(any).apply(block).get()
 * ```
 */
inline fun <T> reflect(any: Any, block: ReflectUtils.() -> Unit): T = ReflectUtils.reflect(any).apply(block).get()
