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

var flashlightStatus: Boolean
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = FlashlightUtils.setFlashlightStatus(value)

fun destroyFlashlight() =
  FlashlightUtils.destroy()