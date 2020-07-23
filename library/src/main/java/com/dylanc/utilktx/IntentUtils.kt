@file:Suppress("unused")

package com.dylanc.utilktx

import android.Manifest.permission
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.IntentUtils
import java.io.File
import java.util.*

/**
 * @author Dylan Cai
 * @since 2020/1/16
 */
fun Intent.isAvailable(): Boolean =
  IntentUtils.isIntentAvailable(this)

fun installAppIntentOf(file: File): Intent =
  IntentUtils.getInstallAppIntent(file)

fun installAppIntentOf(filePath: String): Intent =
  IntentUtils.getInstallAppIntent(filePath)

fun uninstallAppIntentOf(pkgName: String): Intent =
  IntentUtils.getUninstallAppIntent(pkgName)

fun launchAppIntentOf(pkgName: String): Intent =
  IntentUtils.getLaunchAppIntent(pkgName)

fun launchAppDetailsSettingsIntentOf(pkgName: String): Intent =
  IntentUtils.getLaunchAppDetailsSettingsIntent(pkgName)

fun shareTextIntentOf(content: String): Intent =
  IntentUtils.getShareTextIntent(content)

fun shareImageIntentOf(content: String, imagePath: String): Intent =
  IntentUtils.getShareImageIntent(content, imagePath)

fun shareImageIntentOf(content: String, image: File): Intent =
  IntentUtils.getShareImageIntent(content, image)

fun shareImageIntentOf(content: String, uri: Uri): Intent =
  IntentUtils.getShareImageIntent(content, uri)

fun shareImageIntentOf(content: String, imagePaths: LinkedList<String>): Intent =
  IntentUtils.getShareImageIntent(content, imagePaths)

fun shareImageIntentOf(content: String, images: List<File>): Intent =
  IntentUtils.getShareImageIntent(content, images)

fun shareImageIntentOf(content: String, uris: ArrayList<Uri>): Intent =
  IntentUtils.getShareImageIntent(content, uris)

fun componentIntentOf(
  pkgName: String, className: String, bundle: Bundle? = null, isNewTask: Boolean = false
): Intent =
  IntentUtils.getComponentIntent(pkgName, className, bundle, isNewTask)

fun shutdownIntentOf(): Intent =
  IntentUtils.getShutdownIntent()

fun dialIntentOf(phoneNumber: String): Intent =
  IntentUtils.getDialIntent(phoneNumber)

@RequiresPermission(permission.CALL_PHONE)
fun callIntentOf(phoneNumber: String): Intent =
  IntentUtils.getCallIntent(phoneNumber)

fun sendSmsIntentOf(phoneNumber: String,content: String): Intent =
  IntentUtils.getSendSmsIntent(phoneNumber,content)

fun captureIntentOf(outUri: Uri): Intent =
  IntentUtils.getCaptureIntent(outUri)

inline fun <reified T : Any> Context.intentOf(bundle: Bundle) =
  Intent(this, T::class.java).apply { putExtras(bundle) }

inline fun <reified T : Any> Context.intentOf(vararg pairs: Pair<String, *>) =
  Intent(this, T::class.java).apply { putExtras(bundleOf(*pairs)) }

fun Intent.clearTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) }

fun Intent.clearTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }

fun Intent.newDocument(): Intent = apply {
  if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
    addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
  } else {
    @Suppress("DEPRECATION")
    addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)
  }
}

fun Intent.excludeFromRecents(): Intent =
  apply { addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS) }

fun Intent.multipleTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK) }

fun Intent.newTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) }

fun Intent.noAnimation(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION) }

fun Intent.noHistory(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY) }

fun Intent.singleTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP) }