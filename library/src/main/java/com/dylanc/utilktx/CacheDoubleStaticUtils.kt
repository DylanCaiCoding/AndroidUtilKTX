@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.*
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 */

/**
 * Sets the default instance of [CacheDoubleUtils]. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.setDefaultCacheDoubleUtils(cacheDoubleUtils)
 * ```
 */
inline var defaultCacheDoubleUtils: CacheDoubleUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheDoubleStaticUtils.setDefaultCacheDoubleUtils(value)

/**
 * Returns the single [CacheDoubleUtils] instance. This is equivalent to calling:
 * ```
 * CacheDoubleUtils.getInstance(cacheMemoryUtils, cacheDiskUtils)
 * ```
 */
inline fun cacheDoubleUtilsOf(
  cacheMemoryUtils: CacheMemoryUtils = cacheMemoryUtilsOf(),
  cacheDiskUtils: CacheDiskUtils = cacheDiskUtilsOf()
): CacheDoubleUtils =
  CacheDoubleUtils.getInstance(cacheMemoryUtils, cacheDiskUtils)

/**
 * Puts the bytes in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the string value in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: String, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONObject] in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONArray] in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the bitmap in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the drawable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the parcelable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Puts the serializable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putDoubleCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheDoubleStaticUtils.put(key, value, saveTime)

/**
 * Returns the bytes in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getBytes(key, defaultValue)
 * ```
 */
inline fun doubleCacheBytesOf(key: String, defaultValue: ByteArray? = null): ByteArray? =
  CacheDoubleStaticUtils.getBytes(key, defaultValue)

/**
 * Returns the string value in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getString(key, defaultValue)
 * ```
 */
inline fun doubleCacheStringOf(key: String, defaultValue: String? = null): String? =
  CacheDoubleStaticUtils.getString(key, defaultValue)

/**
 * Returns the [JSONObject] in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getJSONObject(key, defaultValue)
 * ```
 */
inline fun doubleCacheJSONObjectOf(key: String, defaultValue: JSONObject? = null): JSONObject? =
  CacheDoubleStaticUtils.getJSONObject(key, defaultValue)

/**
 * Returns the [JSONArray] in the disk cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getJSONArray(key, defaultValue)
 * ```
 */
inline fun doubleCacheJSONArrayOf(key: String, defaultValue: JSONArray? = null): JSONArray? =
  CacheDoubleStaticUtils.getJSONArray(key, defaultValue)
/**
 * Returns the bitmap in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getBitmap(key, defaultValue)
 * ```
 */
inline fun doubleCacheBitmapOf(key: String, defaultValue: Bitmap? = null): Bitmap? =
  CacheDoubleStaticUtils.getBitmap(key, defaultValue)

/**
 * Returns the drawable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getDrawable(key, defaultValue)
 * ```
 */
inline fun doubleCacheDrawableOf(key: String, defaultValue: Drawable? = null): Drawable? =
  CacheDoubleStaticUtils.getDrawable(key, defaultValue)

/**
 * Returns the parcelable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getParcelable(key, defaultValue)
 * ```
 */
inline fun <T> doubleCacheParcelableOf(key: String, creator: Parcelable.Creator<T>, defaultValue: T? = null): T =
  CacheDoubleStaticUtils.getParcelable(key, creator, defaultValue)

/**
 * Returns the serializable in the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getSerializable(key, defaultValue)
 * ```
 */
@Suppress("UNCHECKED_CAST")
inline fun <T> doubleCacheSerializableOf(key: String, defaultValue: T? = null): T =
  CacheDoubleStaticUtils.getSerializable(key, defaultValue) as T

/**
 * Returns the size of the double cache, in bytes. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.getCacheSize()
 * ```
 */
inline val doubleCacheSize: Long get() = CacheDoubleStaticUtils.getCacheDiskSize()

/**
 * Removes the double cache by key. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.remove(key)
 * ```
 */
inline fun removeDoubleCache(key: String) = CacheDoubleStaticUtils.remove(key)

/**
 * Clear all of the double cache. This is equivalent to calling:
 * ```
 * CacheDoubleStaticUtils.clear()
 * ```
 */
inline fun clearDoubleCache() = CacheDoubleStaticUtils.clear()