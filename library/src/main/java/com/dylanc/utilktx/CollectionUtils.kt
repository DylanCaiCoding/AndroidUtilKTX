@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CollectionUtils
import java.util.*

/**
 * @author Dylan Cai
 */

inline fun <T> synchronizedCollectionOf(collection: Collection<T>): Collection<T> =
  Collections.synchronizedCollection(collection)

inline fun <T> unmodifiableCollectionOf(collection: Collection<T>): Collection<T> =
  Collections.unmodifiableCollection(collection)

inline fun <T> Collection<T>.union(collection: Collection<T>): Collection<*> =
  CollectionUtils.union(this, collection)

// TODO: 2020/7/27