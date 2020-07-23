@file:Suppress("unused")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheDiskStaticUtils
import com.blankj.utilcode.util.CacheDiskUtils
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import com.blankj.utilcode.util.CacheMemoryUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */

var defaultCacheDiskUtils: CacheDiskUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDiskStaticUtils.setDefaultCacheDiskUtils(value)

fun putCacheDisk(key: String, value: ByteArray) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: String) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: JSONObject) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: JSONArray) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: Bitmap) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: Drawable) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: Parcelable) =
  CacheDiskStaticUtils.put(key, value)

fun putCacheDisk(key: String, value: Serializable) =
  CacheDiskStaticUtils.put(key, value)

fun cacheDiskBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDiskStaticUtils.getBytes(key, defaultValue)

fun cacheDiskStringOf(key: String, defaultValue: String? = null): String? =
  CacheDiskStaticUtils.getString(key, defaultValue)

fun cacheDiskJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDiskStaticUtils.getJSONObject(key, defaultValue)

fun cacheDiskBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDiskStaticUtils.getBitmap(key, defaultValue)

fun cacheDiskDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDiskStaticUtils.getDrawable(key, defaultValue)

fun <T> cacheDiskParcelableOf(
  key: String,
  creator: Parcelable.Creator<T>,
  defaultValue: T? = null
): T =
  CacheDiskStaticUtils.getParcelable(key, creator, defaultValue)

@Suppress("UNCHECKED_CAST")
fun <T> cacheDiskSerializableOf(
  key: String,
  defaultValue: T? = null
): T =
  CacheDiskStaticUtils.getSerializable(key, defaultValue) as T

val cacheDiskSize: Long
  get() = CacheDiskStaticUtils.getCacheSize()

val cacheDiskCount: Int
  get() = CacheDiskStaticUtils.getCacheCount()

fun removeCacheDisk(key: String) =
  CacheDiskStaticUtils.remove(key)

fun clearCacheDisk() =
  CacheDiskStaticUtils.clear()