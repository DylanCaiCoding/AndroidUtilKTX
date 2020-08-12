@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.VibrateUtils

/**
 * @author Dylan Cai
 */

/**
 * Vibrates constantly for the specified period of time. This is equivalent to calling:
 * ```
 * VibrateUtils.vibrate(milliseconds)
 * ```
 */
@RequiresPermission(permission.VIBRATE)
inline fun vibrate(milliseconds: Long) = VibrateUtils.vibrate(milliseconds)

/**
 * Vibrates with a given pattern. This is equivalent to calling:
 * ```
 * VibrateUtils.vibrate(pattern, repeat)
 * ```
 */
@RequiresPermission(permission.VIBRATE)
inline fun vibrate(pattern: LongArray, repeat: Int) = VibrateUtils.vibrate(pattern, repeat)

/**
 * Turns the vibrator off. This is equivalent to calling:
 * ```
 * VibrateUtils.cancel()
 * ```
 */
@RequiresPermission(permission.VIBRATE)
inline fun cancelVibrate() = VibrateUtils.cancel()