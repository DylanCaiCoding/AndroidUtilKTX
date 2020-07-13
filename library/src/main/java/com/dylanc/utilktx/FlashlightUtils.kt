package com.dylanc.utilktx

import com.blankj.utilcode.util.FlashlightUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */

val isFlashlightEnable: Boolean
  get() = FlashlightUtils.isFlashlightEnable()

val isFlashlightOn: Boolean
  get() = FlashlightUtils.isFlashlightOn()

fun setFlashlightStatus(isOn: Boolean) =
  FlashlightUtils.setFlashlightStatus(isOn)

fun destroyFlashlight() =
  FlashlightUtils.destroy()