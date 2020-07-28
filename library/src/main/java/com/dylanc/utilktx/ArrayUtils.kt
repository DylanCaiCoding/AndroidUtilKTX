@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ArrayUtils

/**
 * @author Dylan Cai
 */

inline fun Array<*>.lengthEquals(array: Array<*>) =
  ArrayUtils.isSameLength(this, array)

inline fun Array<*>.reverse() =
  ArrayUtils.reverse(this)

inline fun <T> Array<T>.copy(): Array<T> =
  ArrayUtils.copy(this)

inline fun <T> Array<T>.subArray(startIndexInclusive: Int, endIndexExclusive: Int): Array<T> =
  ArrayUtils.subArray(this, startIndexInclusive, endIndexExclusive)

inline fun <T> Array<T>.add(element: T): Array<T> =
  ArrayUtils.add(this, element)

inline fun Array<out Any>.remove(element: Any): Array<out Any> =
  ArrayUtils.removeElement(this, element)

inline fun Array<out Any>.remove(index: Int): Array<out Any> =
  ArrayUtils.remove(this, index)

inline fun <T> Array<T>.indexOf(element: T): Int =
  ArrayUtils.indexOf(this, element)

inline fun <T> Array<T>.lastIndexOf(element: T): Int =
  ArrayUtils.lastIndexOf(this, element)

inline fun <T> Array<T>.contains(element: T): Boolean =
  ArrayUtils.contains(this, element)

inline fun <T> Array<T>.sort(noinline comparator: (T, T) -> Int) =
  ArrayUtils.sort(this, comparator)

inline fun <T> Array<T>.forAllDo(noinline closure: (Int, T) -> Unit) =
  ArrayUtils.forAllDo(this, closure)
