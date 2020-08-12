@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.FlashlightUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether the device supports flashlight. This is equivalent to calling:
 * ```
 * FlashlightUtils.isFlashlightEnable()
 * ```
 */
inline val isSupportFlashlight: Boolean get() = FlashlightUtils.isFlashlightEnable()

/**
 * Returns whether the flashlight is working or turns on/off the flashlight. This is equivalent to calling:
 * ```
 * FlashlightUtils.isFlashlightOn()
 * ```
 * or
 * ```
 * FlashlightUtils.setFlashlightStatus(value)
 * ```
 */
inline var isFlashlightOn: Boolean
  get() = FlashlightUtils.isFlashlightOn()
  set(value) = FlashlightUtils.setFlashlightStatus(value)

/**
 * Destroy the flashlight. This is equivalent to calling:
 * ```
 * FlashlightUtils.destroy()
 * ```
 */
inline fun destroyFlashlight() = FlashlightUtils.destroy()