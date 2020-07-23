package com.dylanc.utilktx

import android.Manifest.permission
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.VibrateUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
@RequiresPermission(permission.VIBRATE)
fun vibrate(milliseconds: Long) =
  VibrateUtils.vibrate(milliseconds)

@RequiresPermission(permission.VIBRATE)
fun vibrate(pattern: LongArray, repeat: Int) =
  VibrateUtils.vibrate(pattern, repeat)

@RequiresPermission(permission.VIBRATE)
fun cancelVibrate() =
  VibrateUtils.cancel()