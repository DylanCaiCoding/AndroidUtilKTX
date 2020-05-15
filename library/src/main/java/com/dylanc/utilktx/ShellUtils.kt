package com.dylanc.utilktx

import com.blankj.utilcode.util.ShellUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun execCmd(command: String, isRooted: Boolean): ShellUtils.CommandResult =
  ShellUtils.execCmd(command, isRooted)