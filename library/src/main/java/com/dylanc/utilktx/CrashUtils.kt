@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CrashUtils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Initializes [CrashUtils]. This is equivalent to calling:
 * ```
 * CrashUtils.init(crashDirPath, listener)
 * ```
 */
inline fun initCrashDir(crashDirPath: String = "", noinline listener: ((String, Throwable) -> Unit)? = null) =
  CrashUtils.init(crashDirPath, listener)

/**
 * Initializes [CrashUtils]. This is equivalent to calling:
 * ```
 * CrashUtils.init(crashDir, listener)
 * ```
 */
inline fun initCrashDir(crashDir: File, noinline listener: ((String, Throwable) -> Unit)? = null) =
  CrashUtils.init(crashDir, listener)