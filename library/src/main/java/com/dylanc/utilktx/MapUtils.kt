@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.MapUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun <K, V> unmodifiableMapOf(vararg pairs: Pair<K, V>): Map<K, V> {
  val data = arrayOf<android.util.Pair<K, V>>()
  for (i in pairs.indices) {
    data[i] = android.util.Pair(pairs[i].first, pairs[i].second)
  }
  return MapUtils.newUnmodifiableMap(*data)
}

fun <K, V> Map<K, V>.forAllDo(block: (K, V) -> Unit) =
  MapUtils.forAllDo(this, block)

fun <K1, V1, K2, V2> Map<K1, V1>.transform(block: (K1, V1) -> Pair<K2, V2>): Map<K2, V2> =
  MapUtils.transform(this) { k, v ->
    val pair = block.invoke(k, v)
    android.util.Pair.create(pair.first, pair.second)
  }