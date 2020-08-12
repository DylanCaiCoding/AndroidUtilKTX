@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.MapUtils

/**
 * @author Dylan Cai
 */

/**
 * Transform the map by applying a Transformer to each element. This is equivalent to calling:
 * ```
 * MapUtils.transform(this, transformer)
 * ```
 */
inline fun <K1, V1, K2, V2> Map<K1, V1>.transform(crossinline block: (K1, V1) -> Pair<K2, V2>): Map<K2, V2> =
  MapUtils.transform(this) { k, v ->
    val pair = block.invoke(k, v)
    android.util.Pair.create(pair.first, pair.second)
  }