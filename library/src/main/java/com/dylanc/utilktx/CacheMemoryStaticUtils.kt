@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheDiskUtils
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import com.blankj.utilcode.util.CacheMemoryUtils
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 */

/**
 * Sets the default instance of [CacheMemoryUtils]. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.setDefaultCacheMemoryUtils(cacheMemoryUtils)
 * ```
 */
inline var defaultCacheMemoryUtils: CacheMemoryUtils
  @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
  get() = throw noGetter()
  set(value) = CacheMemoryStaticUtils.setDefaultCacheMemoryUtils(value)

/**
 * Returns the single [CacheMemoryUtils] instance. This is equivalent to calling:
 * ```
 * CacheMemoryUtils.getInstance(cacheKey, maxCount)
 * ```
 */
inline fun cacheMemoryUtilsOf(maxCount: Int = 256, cacheKey: String = maxCount.toString()): CacheMemoryUtils =
  CacheMemoryUtils.getInstance(cacheKey, maxCount)

/**
 * Puts the bytes in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the string value in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: String, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONObject] in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the [JSONArray] in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the bitmap in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the drawable in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the parcelable in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Puts the serializable in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.put(key, value, saveTime)
 * ```
 */
inline fun putMemoryCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

/**
 * Returns the value in the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.get(key, defaultValue)
 * ```
 */
inline fun <T> memoryCacheValueOf(key: String, defaultValue: T? = null): T? =
  CacheMemoryStaticUtils.get(key, defaultValue)

/**
 * Returns the count of the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.getCacheCount()
 * ```
 */
inline val memoryCacheCount: Int get() = CacheMemoryStaticUtils.getCacheCount()

/**
 * Removes the memory cache by key. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.remove(key)
 * ```
 */
inline fun removeMemoryCache(key: String): Any = CacheMemoryStaticUtils.remove(key)

/**
 * Clear all of the memory cache. This is equivalent to calling:
 * ```
 * CacheMemoryStaticUtils.clear()
 * ```
 */
inline fun clearMemoryCache() = CacheMemoryStaticUtils.clear()
