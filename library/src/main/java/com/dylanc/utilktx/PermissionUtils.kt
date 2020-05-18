@file:Suppress("unused")

package com.dylanc.utilktx

import android.app.Activity
import com.blankj.utilcode.constant.PermissionConstants
import com.blankj.utilcode.util.PermissionUtils
import com.blankj.utilcode.util.UtilsTransActivity

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
val permissions: List<String>
  get() = PermissionUtils.getPermissions()

fun permissionsOf(packageName: String): List<String> =
  PermissionUtils.getPermissions(packageName)

fun isGrantedPermissions(vararg permissions: String) =
  PermissionUtils.isGranted(*permissions)

fun isGrantedWriteSettingsPermission() =
  PermissionUtils.isGrantedWriteSettings()

fun requestWriteSettingsPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestWriteSettings(callback)

fun isGrantedDrawOverlaysPermission() =
  PermissionUtils.isGrantedDrawOverlays()

fun requestDrawOverlaysPermission(callback: PermissionUtils.SimpleCallback) =
  PermissionUtils.requestDrawOverlays(callback)

fun launchAppDetailsSettings() =
  PermissionUtils.launchAppDetailsSettings()

fun requestPermissions(
  @PermissionConstants.Permission vararg permissions: String,
  block: PermissionBuilder.() -> Unit
) =
  PermissionUtils.permission(*permissions)
    .apply {
      val builder = PermissionBuilder(this).apply(block)
      callback(object : PermissionUtils.FullCallback {
        override fun onGranted(permissionsGranted: List<String>) {
          builder.onGranted?.invoke(permissionsGranted)
        }

        override fun onDenied(
          permissionsDeniedForever: List<String>,
          permissionsDenied: List<String>
        ) {
          builder.onDenied?.invoke(permissionsDeniedForever, permissionsDenied)
        }
      })
    }
    .request()

class PermissionBuilder(private val permissionUtils: PermissionUtils) {
  internal var onGranted: ((List<String>) -> Unit)? = null
  internal var onDenied: ((List<String>, List<String>) -> Unit)? = null

  fun onRationale(listener: (UtilsTransActivity, PermissionUtils.OnRationaleListener.ShouldRequest) -> Unit) {
    permissionUtils.rationale(listener)
  }

  fun onGranted(listener: (permissionsGranted: List<String>) -> Unit) {
    onGranted = listener
  }

  fun onDenied(listener: (permissionsDeniedForever: List<String>, permissionsDenied: List<String>) -> Unit) {
    onDenied = listener
  }

  fun onTransActivityCreate(callback: (Activity) -> Unit) {
    permissionUtils.theme(callback)
  }
}