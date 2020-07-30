@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.os.Build
import androidx.annotation.RequiresApi
import com.blankj.utilcode.constant.PermissionConstants
import com.blankj.utilcode.util.PermissionUtils
import com.blankj.utilcode.util.UtilsTransActivity

/**
 * @author Dylan Cai
 */

inline val permissions: List<String>
  get() = PermissionUtils.getPermissions()

inline fun permissionsOf(packageName: String): List<String> =
  PermissionUtils.getPermissions(packageName)

inline fun isGrantedPermissions(vararg permissions: String) =
  PermissionUtils.isGranted(*permissions)

@RequiresApi(api = Build.VERSION_CODES.M)
inline fun isGrantedWriteSettingsPermission() =
  PermissionUtils.isGrantedWriteSettings()

@RequiresApi(api = Build.VERSION_CODES.M)
inline fun requestWriteSettingsPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestWriteSettings(callback)

@RequiresApi(api = Build.VERSION_CODES.M)
inline fun isGrantedDrawOverlaysPermission() =
  PermissionUtils.isGrantedDrawOverlays()

@RequiresApi(api = Build.VERSION_CODES.M)
inline fun requestDrawOverlaysPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestDrawOverlays(callback)

inline fun launchAppDetailsSettings() =
  PermissionUtils.launchAppDetailsSettings()

inline fun requestPermissions(
  @PermissionConstants.Permission vararg permissions: String,
  noinline rationale: ((UtilsTransActivity, PermissionUtils.OnRationaleListener.ShouldRequest) -> Unit)? = null,
  noinline theme: ((Activity) -> Unit)? = null,
  callback: PermissionUtils.SingleCallback
) {
  PermissionUtils.permission(*permissions)
    .rationale(rationale)
    .theme(theme)
    .callback(callback)
    .request()
}

fun requestPermissions(
  @PermissionConstants.Permission vararg permissions: String,
  rationale: ((UtilsTransActivity, PermissionUtils.OnRationaleListener.ShouldRequest) -> Unit)? = null,
  theme: ((Activity) -> Unit)? = null,
  callback: PermissionUtils.SimpleCallback
) {
  PermissionUtils.permission(*permissions)
    .rationale(rationale)
    .theme(theme)
    .callback(callback)
    .request()
}

fun requestPermissions(
  @PermissionConstants.Permission vararg permissions: String,
  rationale: ((UtilsTransActivity, PermissionUtils.OnRationaleListener.ShouldRequest) -> Unit)? = null,
  theme: ((Activity) -> Unit)? = null,
  callback: PermissionUtils.FullCallback
) {
  PermissionUtils.permission(*permissions)
    .rationale(rationale)
    .theme(theme)
    .callback(callback)
    .request()
}