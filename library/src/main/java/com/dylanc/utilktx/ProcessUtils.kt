@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission.KILL_BACKGROUND_PROCESSES
import android.Manifest.permission.PACKAGE_USAGE_STATS
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.ProcessUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns the foreground process name. This is equivalent to calling:
 * ```
 * ProcessUtils.getForegroundProcessName()
 * ```
 */
inline val foregroundProcessName: String
  @RequiresApi(Build.VERSION_CODES.M)
  @RequiresPermission(PACKAGE_USAGE_STATS)
  get() = ProcessUtils.getForegroundProcessName()

/**
 * Kills all background processes. This is equivalent to calling:
 * ```
 * ProcessUtils.killAllBackgroundProcesses()
 * ```
 */
@RequiresPermission(KILL_BACKGROUND_PROCESSES)
inline fun killAllBackgroundProcesses(): Set<String> = ProcessUtils.killAllBackgroundProcesses()

/**
 * Kills background processes. This is equivalent to calling:
 * ```
 * ProcessUtils.killBackgroundProcesses(packageName)
 * ```
 */
@RequiresPermission(KILL_BACKGROUND_PROCESSES)
inline fun killBackgroundProcesses(packageName: String): Boolean = ProcessUtils.killBackgroundProcesses(packageName)

/**
 * Returns whether app running in the main process. This is equivalent to calling:
 * ```
 * ProcessUtils.isMainProcess()
 * ```
 */
inline val isMainProcess: Boolean get() = ProcessUtils.isMainProcess()

/**
 * Returns the name of current process. This is equivalent to calling:
 * ```
 * ProcessUtils.getCurrentProcessName()
 * ```
 */
inline val currentProcessName: String get() = ProcessUtils.getCurrentProcessName()