@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.os.Parcelable
import com.blankj.utilcode.util.CacheMemoryStaticUtils
import com.blankj.utilcode.util.CacheMemoryUtils
import org.json.JSONArray
import org.json.JSONObject
import java.io.Serializable

/**
 * @author Dylan Cai
 */

inline var defaultCacheMemoryUtils: CacheMemoryUtils
  @Deprecated("Property does not have a getter", level = DeprecationLevel.ERROR)
  get() = throw NotImplementedError()
  set(value) = CacheMemoryStaticUtils.setDefaultCacheMemoryUtils(value)

inline fun putMemoryCache(key: String, value: ByteArray, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: String, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: JSONObject, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: JSONArray, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: Bitmap, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: Drawable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: Parcelable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun putMemoryCache(key: String, value: Serializable, saveTime: Int = -1) =
  CacheMemoryStaticUtils.put(key, value, saveTime)

inline fun <T> memoryCacheOf(key: String, defaultValue: T? = null): T? =
  CacheMemoryStaticUtils.get(key, defaultValue)

inline val memoryCacheCount: Int
  get() = CacheMemoryStaticUtils.getCacheCount()

inline fun removeMemoryCache(key: String): Any =
  CacheMemoryStaticUtils.remove(key)

inline fun clearMemoryCache() =
  CacheMemoryStaticUtils.clear()
