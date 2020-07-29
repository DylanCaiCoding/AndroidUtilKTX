@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.ProcessUtils

/**
 * @author Dylan Cai
 */

inline val foregroundProcessName: String
  get() = ProcessUtils.getForegroundProcessName()

@RequiresPermission(permission.KILL_BACKGROUND_PROCESSES)
inline fun killAllBackgroundProcesses(): Set<String> =
  ProcessUtils.killAllBackgroundProcesses()

@RequiresPermission(permission.KILL_BACKGROUND_PROCESSES)
inline fun killBackgroundProcesses(packageName: String): Boolean =
  ProcessUtils.killBackgroundProcesses(packageName)

inline val isMainProcess: Boolean
  get() = ProcessUtils.isMainProcess()

inline val currentProcessName: String
  get() = ProcessUtils.getCurrentProcessName()