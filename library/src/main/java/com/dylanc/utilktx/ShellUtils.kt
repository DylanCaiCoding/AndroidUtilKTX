@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ShellUtils

/**
 * @author Dylan Cai
 */

/**
 * Execute the command. This is equivalent to calling:
 * ```
 * ShellUtils.execCmd(command, isRooted, isNeedResultMsg)
 * ```
 */
inline fun execCmd(command: String, isRooted: Boolean, isNeedResultMsg: Boolean = true): ShellUtils.CommandResult =
  ShellUtils.execCmd(command, isRooted, isNeedResultMsg)

/**
 * Execute the commands. This is equivalent to calling:
 * ```
 * ShellUtils.execCmd(commands, isRooted, isNeedResultMsg)
 * ```
 */
inline fun execCmd(commands: List<String>, isRooted: Boolean, isNeedResultMsg: Boolean = true): ShellUtils.CommandResult =
  ShellUtils.execCmd(commands, isRooted, isNeedResultMsg)

/**
 * Execute the commands. This is equivalent to calling:
 * ```
 * ShellUtils.execCmd(commands, isRooted, isNeedResultMsg)
 * ```
 */
inline fun execCmd(commands: Array<String>, isRooted: Boolean, isNeedResultMsg: Boolean = true): ShellUtils.CommandResult =
  ShellUtils.execCmd(commands, isRooted, isNeedResultMsg)