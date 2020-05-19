@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ProcessUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
val foregroundProcessName: String
  get() = ProcessUtils.getForegroundProcessName()

fun killAllBackgroundProcesses(): Set<String> =
  ProcessUtils.killAllBackgroundProcesses()

fun killBackgroundProcesses(packageName: String): Boolean =
  ProcessUtils.killBackgroundProcesses(packageName)

fun isMainProcess(): Boolean =
  ProcessUtils.isMainProcess()

val currentProcessName: String
  get() = ProcessUtils.getCurrentProcessName()