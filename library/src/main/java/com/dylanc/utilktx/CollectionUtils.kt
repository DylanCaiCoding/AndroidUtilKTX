@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CollectionUtils
import java.util.*

/**
 * @author Dylan Cai
 */

// TODO: 2020/8/19
inline fun <T> synchronizedCollectionOf(elements: Collection<T>): Collection<T> =
  Collections.synchronizedCollection(elements)

inline fun Collection<*>.disjunction(elements: Collection<*>): Collection<*> =
  CollectionUtils.disjunction(this, elements)

inline val Collection<*>.cardinalityMap: MutableMap<Any, Int>
  get() = CollectionUtils.getCardinalityMap(this)

inline fun Collection<*>.isSubCollection(elements: Collection<*>): Boolean =
  CollectionUtils.isSubCollection(this, elements)

inline fun Collection<*>.isProperSubCollection(elements: Collection<*>): Boolean =
  CollectionUtils.isProperSubCollection(this, elements)

inline fun <E> Collection<E>.equalCollection(elements: Collection<E>): Boolean =
  CollectionUtils.isEqualCollection(this, elements)

inline fun Collection<*>.cardinality(element: Any): Int =
  CollectionUtils.cardinality(element, this)

inline fun <E> Collection<E>.select(noinline predicate: (E) -> Boolean): Collection<E> =
  CollectionUtils.select(this, predicate)

inline fun <E> Collection<E>.selectRejected(noinline predicate: (E) -> Boolean): Collection<E> =
  CollectionUtils.selectRejected(this, predicate)

inline fun <E1, E2> Collection<E1>.transform(noinline transformer: (E1) -> E2): Unit =
  CollectionUtils.transform(this, transformer)

inline fun <E1, E2> Collection<E1>.collect(noinline transformer: (E1) -> E2): Collection<E2> =
  CollectionUtils.collect(this, transformer)

inline fun <E> Collection<E>.matchesCount(noinline predicate: (E) -> Boolean): Int =
  CollectionUtils.countMatches(this, predicate)

inline fun <E> Collection<E>.exists(noinline predicate: (E) -> Boolean): Boolean =
  CollectionUtils.exists(this, predicate)

inline fun <E> Collection<E>.addIgnoreNull(element: E?): Boolean =
  CollectionUtils.addIgnoreNull(this, element)

inline fun <E> Collection<E>.addAll(enumeration: Enumeration<E>) =
  CollectionUtils.addAll(this, enumeration)

inline fun <E> Collection<E>.retainAll(elements: Collection<E>): Collection<E> =
  CollectionUtils.retainAll(this, elements)

inline fun <E> Collection<E>.removeAll(elements: Collection<E>): Collection<E> =
  CollectionUtils.removeAll(this, elements)
