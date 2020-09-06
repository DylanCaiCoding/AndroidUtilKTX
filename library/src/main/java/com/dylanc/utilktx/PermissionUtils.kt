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

/**
 * Returns the permissions used in application. This is equivalent to calling:
 * ```
 * PermissionUtils.getPermissions()
 * ```
 */
inline val permissions: List<String> get() = PermissionUtils.getPermissions()

/**
 * Returns the permissions used in application. This is equivalent to calling:
 * ```
 * PermissionUtils.getPermissions(packageName)
 * ```
 */
inline fun permissionsOf(packageName: String): List<String> = PermissionUtils.getPermissions(packageName)

/**
 * Returns whether you have been granted the permissions. This is equivalent to calling:
 * ```
 * PermissionUtils.isGranted(permissions)
 * ```
 */
inline fun isGrantedPermissions(vararg permissions: String): Boolean = PermissionUtils.isGranted(*permissions)

/**
 * Returns whether the app can modify system settings. This is equivalent to calling:
 * ```
 * PermissionUtils.isGrantedWriteSettings()
 * ```
 */
@RequiresApi(api = Build.VERSION_CODES.M)
inline fun isGrantedWriteSettingsPermission() = PermissionUtils.isGrantedWriteSettings()

/**
 * Returns whether the app can modify system settings. This is equivalent to calling:
 * ```
 * PermissionUtils.isGrantedWriteSettings(callback)
 * ```
 */
@RequiresApi(api = Build.VERSION_CODES.M)
inline fun requestWriteSettingsPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestWriteSettings(callback)

/**
 * Returns whether the app can draw on top of other apps. This is equivalent to calling:
 * ```
 * PermissionUtils.isGrantedDrawOverlays()
 * ```
 */
@RequiresApi(api = Build.VERSION_CODES.M)
inline fun isGrantedDrawOverlaysPermission() = PermissionUtils.isGrantedDrawOverlays()

/**
 * Requests the permission of draw overlays. This is equivalent to calling:
 * ```
 * PermissionUtils.requestDrawOverlays(callback)
 * ```
 */
@RequiresApi(api = Build.VERSION_CODES.M)
inline fun requestDrawOverlaysPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestDrawOverlays(callback)

/**
 * Launched the application's details settings. This is equivalent to calling:
 * ```
 * PermissionUtils.launchAppDetailsSettings()
 * ```
 */
inline fun launchAppDetailsSettings() = PermissionUtils.launchAppDetailsSettings()

/**
 * Requests permissions. This is equivalent to calling:
 * ```
 * PermissionUtils.permission(*permissions)
 *   .rationale(rationale)
 *   .theme(theme)
 *   .callback(callback)
 *   .request()
 * ```
 */
inline fun requestPermission(
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

/**
 * Requests permissions. This is equivalent to calling:
 * ```
 * PermissionUtils.permission(*permissions)
 *   .rationale(rationale)
 *   .theme(theme)
 *   .callback(callback)
 *   .request()
 * ```
 */
fun requestPermission(
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

/**
 * Requests permissions. This is equivalent to calling:
 * ```
 * PermissionUtils.permission(*permissions)
 *   .rationale(rationale)
 *   .theme(theme)
 *   .callback(callback)
 *   .request()
 * ```
 */
fun requestPermission(
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