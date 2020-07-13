package com.dylanc.utilktx

import com.blankj.utilcode.util.CrashUtils
import java.io.File

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun observeCrash(crashDir: File, listener: (String, Throwable) -> Unit) =
  CrashUtils.init(crashDir,listener)

fun observeCrash(crashDirPath: String = "", listener: (String, Throwable) -> Unit) =
  CrashUtils.init(crashDirPath, listener)
