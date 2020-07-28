@file:Suppress("unused", "NOTHING_TO_INLINE")

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
 */

inline var defaultCacheDiskUtils: CacheDiskUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDiskStaticUtils.setDefaultCacheDiskUtils(value)

inline fun putDiskCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: String, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun putDiskCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheDiskStaticUtils.put(key, value, saveTime)

inline fun diskCacheBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDiskStaticUtils.getBytes(key, defaultValue)

inline fun diskCacheStringOf(key: String, defaultValue: String? = null): String? =
  CacheDiskStaticUtils.getString(key, defaultValue)

inline fun diskCacheJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDiskStaticUtils.getJSONObject(key, defaultValue)

inline fun diskCacheBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDiskStaticUtils.getBitmap(key, defaultValue)

inline fun diskCacheDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDiskStaticUtils.getDrawable(key, defaultValue)

inline fun <T> diskCacheParcelableOf(
  key: String,
  creator: Parcelable.Creator<T>,
  defaultValue: T? = null
): T =
  CacheDiskStaticUtils.getParcelable(key, creator, defaultValue)

@Suppress("UNCHECKED_CAST")
inline fun <T> diskCacheSerializableOf(
  key: String,
  defaultValue: T? = null
): T =
  CacheDiskStaticUtils.getSerializable(key, defaultValue) as T

inline val diskCacheSize: Long
  get() = CacheDiskStaticUtils.getCacheSize()

inline val diskCacheCount: Int
  get() = CacheDiskStaticUtils.getCacheCount()

inline fun removeDiskCache(key: String) =
  CacheDiskStaticUtils.remove(key)

inline fun clearDiskCache() =
  CacheDiskStaticUtils.clear()