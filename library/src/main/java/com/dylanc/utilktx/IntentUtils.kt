@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import android.Manifest.permission.REQUEST_DELETE_PACKAGES
import android.Manifest.permission.REQUEST_INSTALL_PACKAGES
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Binder
import android.os.Build
import android.os.Bundle
import android.os.Parcelable
import android.util.Size
import android.util.SizeF
import androidx.annotation.RequiresApi
import androidx.annotation.RequiresPermission
import com.blankj.utilcode.util.IntentUtils
import java.io.File
import java.io.Serializable
import java.util.*

/**
 * @author Dylan Cai
 */

/**
 * Returns whether the intent is available. This is equivalent to calling:
 * ```
 * IntentUtils.isIntentAvailable(this)
 * ```
 */
inline val Intent.isAvailable: Boolean get() = IntentUtils.isIntentAvailable(this)

/**
 * Returns the intent of install app. This is equivalent to calling:
 * ```
 * IntentUtils.getInstallAppIntent(file)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installAppIntentOf(file: File): Intent = IntentUtils.getInstallAppIntent(file)

/**
 * Returns the intent of install app. This is equivalent to calling:
 * ```
 * IntentUtils.getInstallAppIntent(filePath)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.M)
@RequiresPermission(REQUEST_INSTALL_PACKAGES)
inline fun installAppIntentOf(filePath: String): Intent = IntentUtils.getInstallAppIntent(filePath)

/**
 * Returns the intent of uninstall app. This is equivalent to calling:
 * ```
 * IntentUtils.getUninstallAppIntent(pkgName)
 * ```
 */
@RequiresApi(Build.VERSION_CODES.O)
@RequiresPermission(REQUEST_DELETE_PACKAGES)
inline fun uninstallAppIntentOf(pkgName: String): Intent = IntentUtils.getUninstallAppIntent(pkgName)

/**
 * Returns the intent of launch app. This is equivalent to calling:
 * ```
 * IntentUtils.getLaunchAppIntent(pkgName)
 * ```
 */
inline fun launchAppIntentOf(pkgName: String): Intent = IntentUtils.getLaunchAppIntent(pkgName)

/**
 * Returns the intent of launch app details settings. This is equivalent to calling:
 * ```
 * IntentUtils.getLaunchAppDetailsSettingsIntent(pkgName)
 * ```
 */
inline fun launchAppDetailsSettingsIntentOf(pkgName: String): Intent = IntentUtils.getLaunchAppDetailsSettingsIntent(pkgName)

/**
 * Returns the intent of share text. This is equivalent to calling:
 * ```
 * IntentUtils.getShareTextIntent(content)
 * ```
 */
inline fun shareTextIntentOf(content: String): Intent = IntentUtils.getShareTextIntent(content)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, image)
 * ```
 */
inline fun shareImageIntentOf(content: String, image: File): Intent = IntentUtils.getShareImageIntent(content, image)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, imagePath)
 * ```
 */
inline fun shareImageIntentOf(content: String, imagePath: String): Intent = IntentUtils.getShareImageIntent(content, imagePath)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, uri)
 * ```
 */
inline fun shareImageIntentOf(content: String, uri: Uri): Intent = IntentUtils.getShareImageIntent(content, uri)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, imagePaths)
 * ```
 */
inline fun shareImageIntentOf(content: String, imagePaths: LinkedList<String>): Intent =
  IntentUtils.getShareImageIntent(content, imagePaths)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, images)
 * ```
 */
inline fun shareImageIntentOf(content: String, images: List<File>): Intent =
  IntentUtils.getShareImageIntent(content, images)

/**
 * Returns the intent of share image. This is equivalent to calling:
 * ```
 * IntentUtils.getShareImageIntent(content, uris)
 * ```
 */
inline fun shareImageIntentOf(content: String, uris: ArrayList<Uri>): Intent =
  IntentUtils.getShareImageIntent(content, uris)

/**
 * Returns the intent of component. This is equivalent to calling:
 * ```
 * IntentUtils.getComponentIntent(pkgName, className, bundle, isNewTask)
 * ```
 */
inline fun componentIntentOf(pkgName: String, className: String, bundle: Bundle? = null, isNewTask: Boolean = false): Intent =
  IntentUtils.getComponentIntent(pkgName, className, bundle, isNewTask)

/**
 * Returns the intent of shutdown. Requires root permission or hold android:sharedUserId="android.uid.system",
 * <uses-permission android:name="android.permission.SHUTDOWN" /> in manifest
 * This is equivalent to calling:
 * ```
 * IntentUtils.getShutdownIntent()
 * ```
 */
inline fun shutdownIntentOf(): Intent = IntentUtils.getShutdownIntent()

/**
 * Returns the intent of dial. This is equivalent to calling:
 * ```
 * IntentUtils.getDialIntent(phoneNumber)
 * ```
 */
inline fun dialIntentOf(phoneNumber: String): Intent = IntentUtils.getDialIntent(phoneNumber)

/**
 * Returns the intent of call. This is equivalent to calling:
 * ```
 * IntentUtils.getCallIntent(phoneNumber)
 * ```
 */
@RequiresPermission(permission.CALL_PHONE)
inline fun callIntentOf(phoneNumber: String): Intent = IntentUtils.getCallIntent(phoneNumber)

/**
 * Returns the intent of send SMS. This is equivalent to calling:
 * ```
 * IntentUtils.getSendSmsIntent(phoneNumber, content)
 * ```
 */
inline fun sendSmsIntentOf(phoneNumber: String, content: String): Intent = IntentUtils.getSendSmsIntent(phoneNumber, content)

/**
 * Returns the intent of capture. This is equivalent to calling:
 * ```
 * IntentUtils.getCaptureIntent(outUri)
 * ```
 */
inline fun captureIntentOf(outUri: Uri): Intent = IntentUtils.getCaptureIntent(outUri)

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

inline fun Activity.intentBooleanExtra(name: String, defaultValue: Boolean) = lazy { intent.getBooleanExtra(name, defaultValue) }
inline fun Activity.intentByteExtra(name: String, defaultValue: Byte) = lazy { intent.getByteExtra(name, defaultValue) }
inline fun Activity.intentCharExtra(name: String, defaultValue: Char) = lazy { intent.getCharExtra(name, defaultValue) }
inline fun Activity.intentDoubleExtra(name: String, defaultValue: Double) = lazy { intent.getDoubleExtra(name, defaultValue) }
inline fun Activity.intentFloatExtra(name: String, defaultValue: Float) = lazy { intent.getFloatExtra(name, defaultValue) }
inline fun Activity.intentIntExtra(name: String, defaultValue: Int) = lazy { intent.getIntExtra(name, defaultValue) }
inline fun Activity.intentLongExtra(name: String, defaultValue: Long) = lazy { intent.getLongExtra(name, defaultValue) }
inline fun Activity.intentShortExtra(name: String, defaultValue: Short) = lazy { intent.getShortExtra(name, defaultValue) }
inline fun Activity.intentStringExtra(name: String) = lazy { intent.getStringExtra(name) }
inline fun Activity.intentCharSequenceExtra(name: String) = lazy { intent.getCharSequenceExtra(name) }
inline fun <T : Parcelable> Activity.intentParcelableExtra(name: String) = lazy { intent.getParcelableExtra<T?>(name) }
@Suppress("UNCHECKED_CAST")
inline fun <T : Serializable> Activity.intentSerializableExtra(name: String) = lazy { intent.getSerializableExtra(name) as T? }
inline fun Activity.intentBooleanArrayExtra(name: String) = lazy { intent.getBooleanArrayExtra(name) }
inline fun Activity.intentByteArrayExtra(name: String) = lazy { intent.getByteArrayExtra(name) }
inline fun Activity.intentCharArrayExtra(name: String) = lazy { intent.getCharArrayExtra(name) }
inline fun Activity.intentDoubleArrayExtra(name: String) = lazy { intent.getDoubleArrayExtra(name) }
inline fun Activity.intentFloatArrayExtra(name: String) = lazy { intent.getFloatArrayExtra(name) }
inline fun Activity.intentIntArrayExtra(name: String) = lazy { intent.getIntArrayExtra(name) }
inline fun Activity.intentLongArrayExtra(name: String) = lazy { intent.getLongArrayExtra(name) }
inline fun Activity.intentShortArrayExtra(name: String) = lazy { intent.getShortArrayExtra(name) }
inline fun Activity.intentStringArrayExtra(name: String) = lazy { intent.getStringArrayExtra(name) }
inline fun Activity.intentCharSequenceArrayExtra(name: String) = lazy { intent.getCharSequenceArrayExtra(name) }
inline fun Activity.intentParcelableArrayExtra(name: String) = lazy { intent.getParcelableArrayExtra(name) }
inline fun Activity.intentBundleExtra(name: String) = lazy { intent.getBundleExtra(name) }
