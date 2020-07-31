@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Binder
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.IntentUtils
import java.io.File
import java.io.Serializable
import java.util.*

/**
 * @author Dylan Cai
 */

inline val Intent.isAvailable: Boolean
  get() = IntentUtils.isIntentAvailable(this)

inline fun installAppIntentOf(file: File): Intent =
  IntentUtils.getInstallAppIntent(file)

inline fun installAppIntentOf(filePath: String): Intent =
  IntentUtils.getInstallAppIntent(filePath)

inline fun uninstallAppIntentOf(pkgName: String): Intent =
  IntentUtils.getUninstallAppIntent(pkgName)

inline fun launchAppIntentOf(pkgName: String): Intent =
  IntentUtils.getLaunchAppIntent(pkgName)

inline fun launchAppDetailsSettingsIntentOf(pkgName: String): Intent =
  IntentUtils.getLaunchAppDetailsSettingsIntent(pkgName)

inline fun shareTextIntentOf(content: String): Intent =
  IntentUtils.getShareTextIntent(content)

inline fun shareImageIntentOf(content: String, imagePath: String): Intent =
  IntentUtils.getShareImageIntent(content, imagePath)

inline fun shareImageIntentOf(content: String, image: File): Intent =
  IntentUtils.getShareImageIntent(content, image)

inline fun shareImageIntentOf(content: String, uri: Uri): Intent =
  IntentUtils.getShareImageIntent(content, uri)

inline fun shareImageIntentOf(content: String, imagePaths: LinkedList<String>): Intent =
  IntentUtils.getShareImageIntent(content, imagePaths)

inline fun shareImageIntentOf(content: String, images: List<File>): Intent =
  IntentUtils.getShareImageIntent(content, images)

inline fun shareImageIntentOf(content: String, uris: ArrayList<Uri>): Intent =
  IntentUtils.getShareImageIntent(content, uris)

inline fun componentIntentOf(
  pkgName: String, className: String, bundle: Bundle? = null, isNewTask: Boolean = false
): Intent =
  IntentUtils.getComponentIntent(pkgName, className, bundle, isNewTask)

inline fun shutdownIntentOf(): Intent =
  IntentUtils.getShutdownIntent()

inline fun dialIntentOf(phoneNumber: String): Intent =
  IntentUtils.getDialIntent(phoneNumber)

@RequiresPermission(permission.CALL_PHONE)
inline fun callIntentOf(phoneNumber: String): Intent =
  IntentUtils.getCallIntent(phoneNumber)

inline fun sendSmsIntentOf(phoneNumber: String, content: String): Intent =
  IntentUtils.getSendSmsIntent(phoneNumber, content)

inline fun captureIntentOf(outUri: Uri): Intent =
  IntentUtils.getCaptureIntent(outUri)

inline fun <reified T : Any> Context.intentOf(bundle: Bundle) =
  Intent(this, T::class.java).apply { putExtras(bundle) }

inline fun <reified T : Any> Context.intentOf(vararg pairs: Pair<String, *>) =
  Intent(this, T::class.java).apply { putExtras(bundleOf(*pairs)) }

inline fun Intent.clearTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) }

inline fun Intent.clearTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) }

inline fun Intent.newDocument(): Intent =
  apply {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      addFlags(Intent.FLAG_ACTIVITY_NEW_DOCUMENT)
    } else {
      @Suppress("DEPRECATION")
      addFlags(Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET)
    }
  }

inline fun Intent.excludeFromRecents(): Intent =
  apply { addFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS) }

inline fun Intent.multipleTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK) }

inline fun Intent.newTask(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) }

inline fun Intent.noAnimation(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION) }

inline fun Intent.noHistory(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY) }

inline fun Intent.singleTop(): Intent = apply { addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP) }

fun bundleOf(vararg pairs: Pair<String, Any?>) = Bundle(pairs.size).apply {
  for ((key, value) in pairs) {
    when (value) {
      null -> putString(key, null)

      // Scalars
      is Boolean -> putBoolean(key, value)
      is Byte -> putByte(key, value)
      is Char -> putChar(key, value)
      is Double -> putDouble(key, value)
      is Float -> putFloat(key, value)
      is Int -> putInt(key, value)
      is Long -> putLong(key, value)
      is Short -> putShort(key, value)

      // References
      is Bundle -> putBundle(key, value)
      is CharSequence -> putCharSequence(key, value)
      is Parcelable -> putParcelable(key, value)

      // Scalar arrays
      is BooleanArray -> putBooleanArray(key, value)
      is ByteArray -> putByteArray(key, value)
      is CharArray -> putCharArray(key, value)
      is DoubleArray -> putDoubleArray(key, value)
      is FloatArray -> putFloatArray(key, value)
      is IntArray -> putIntArray(key, value)
      is LongArray -> putLongArray(key, value)
      is ShortArray -> putShortArray(key, value)

      // Reference arrays
      is Array<*> -> {
        val componentType = value::class.java.componentType!!
        @Suppress("UNCHECKED_CAST") // Checked by reflection.
        when {
          Parcelable::class.java.isAssignableFrom(componentType) -> {
            putParcelableArray(key, value as Array<Parcelable>)
          }
          String::class.java.isAssignableFrom(componentType) -> {
            putStringArray(key, value as Array<String>)
          }
          CharSequence::class.java.isAssignableFrom(componentType) -> {
            putCharSequenceArray(key, value as Array<CharSequence>)
          }
          Serializable::class.java.isAssignableFrom(componentType) -> {
            putSerializable(key, value)
          }
          else -> {
            val valueType = componentType.canonicalName
            throw IllegalArgumentException(
              "Illegal value array type $valueType for key \"$key\""
            )
          }
        }
      }

      is Serializable -> putSerializable(key, value)

      else -> {
        if (Build.VERSION.SDK_INT >= 18 && value is Binder) {
          putBinder(key, value)
        } else if (Build.VERSION.SDK_INT >= 21 && value is Size) {
          putSize(key, value)
        } else if (Build.VERSION.SDK_INT >= 21 && value is SizeF) {
          putSizeF(key, value)
        } else {
          val valueType = value.javaClass.canonicalName
          throw IllegalArgumentException("Illegal value type $valueType for key \"$key\"")
        }
      }
    }
  }
}