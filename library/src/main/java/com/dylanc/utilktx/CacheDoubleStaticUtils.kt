@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheDoubleStaticUtils
import com.blankj.utilcode.util.CacheDoubleUtils
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import com.blankj.utilcode.util.CacheMemoryUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 */

inline var defaultCacheDoubleUtils: CacheDoubleUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDoubleStaticUtils.setDefaultCacheDoubleUtils(value)

inline fun putDoubleCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: String, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun putDoubleCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

inline fun doubleCacheBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDoubleStaticUtils.getBytes(key, defaultValue)

inline fun doubleCacheStringOf(key: String, defaultValue: String? = null): String? =
  CacheDoubleStaticUtils.getString(key, defaultValue)

inline fun doubleCacheJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDoubleStaticUtils.getJSONObject(key, defaultValue)

inline fun doubleCacheBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDoubleStaticUtils.getBitmap(key, defaultValue)

inline fun doubleCacheDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDoubleStaticUtils.getDrawable(key, defaultValue)

inline fun <T> doubleCacheParcelableOf(
  key: String,
  creator: Parcelable.Creator<T>,
  defaultValue: T? = null
): T =
  CacheDoubleStaticUtils.getParcelable(key, creator, defaultValue)

@Suppress("UNCHECKED_CAST")
inline fun <T> doubleCacheSerializableOf(
  key: String,
  defaultValue: T? = null
): T =
  CacheDoubleStaticUtils.getSerializable(key, defaultValue) as T

inline val doubleDoubleCacheSize: Long
  get() = CacheDoubleStaticUtils.getCacheDiskSize()

inline val doubleDoubleCacheCount: Int
  get() = CacheDoubleStaticUtils.getCacheDiskCount()

inline fun removeDoubleCache(key: String) =
  CacheDoubleStaticUtils.remove(key)

inline fun clearDoubleCache() =
  CacheDoubleStaticUtils.clear()