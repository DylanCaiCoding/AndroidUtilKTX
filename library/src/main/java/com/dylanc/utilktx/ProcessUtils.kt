@file:Suppress("unused")

package com.dylanc.utilktx

import android.Manifest.permission
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.ProcessUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
val foregroundProcessName: String
  get() = ProcessUtils.getForegroundProcessName()

@RequiresPermission(permission.KILL_BACKGROUND_PROCESSES)
fun killAllBackgroundProcesses(): Set<String> =
  ProcessUtils.killAllBackgroundProcesses()

@RequiresPermission(permission.KILL_BACKGROUND_PROCESSES)
fun killBackgroundProcesses(packageName: String): Boolean =
  ProcessUtils.killBackgroundProcesses(packageName)

fun isMainProcess(): Boolean =
  ProcessUtils.isMainProcess()

val currentProcessName: String
  get() = ProcessUtils.getCurrentProcessName()