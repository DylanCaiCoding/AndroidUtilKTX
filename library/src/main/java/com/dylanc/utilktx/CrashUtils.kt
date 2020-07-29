@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CrashUtils
import java.io.File

/**
 * @author Dylan Cai
 */

inline fun initCrashDir(
  crashDirPath: String = "",
  noinline listener: ((String, Throwable) -> Unit)? = null
) =
  CrashUtils.init(crashDirPath, listener)

inline fun initCrashDir(crashDir: File, noinline listener: ((String, Throwable) -> Unit)? = null) =
  CrashUtils.init(crashDir, listener)