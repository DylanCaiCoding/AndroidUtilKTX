@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.MapUtils

/**
 * @author Dylan Cai
 */

inline fun <K, V> unmodifiableMapOf(vararg pairs: Pair<K, V>): Map<K, V> {
  val data = arrayOf<android.util.Pair<K, V>>()
  for (i in pairs.indices) {
    data[i] = android.util.Pair(pairs[i].first, pairs[i].second)
  }
  return MapUtils.newUnmodifiableMap(*data)
}

inline fun <K1, V1, K2, V2> Map<K1, V1>.transform(crossinline block: (K1, V1) -> Pair<K2, V2>): Map<K2, V2> =
  MapUtils.transform(this) { k, v ->
    val pair = block.invoke(k, v)
    android.util.Pair.create(pair.first, pair.second)
  }