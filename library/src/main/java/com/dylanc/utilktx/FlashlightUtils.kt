@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FlashlightUtils

/**
 * @author Dylan Cai
 */

inline val isFlashlightEnable: Boolean
  get() = FlashlightUtils.isFlashlightEnable()

inline var isFlashlightOn: Boolean
  get() = FlashlightUtils.isFlashlightOn()
  set(value) = FlashlightUtils.setFlashlightStatus(value)

inline fun destroyFlashlight() =
  FlashlightUtils.destroy()