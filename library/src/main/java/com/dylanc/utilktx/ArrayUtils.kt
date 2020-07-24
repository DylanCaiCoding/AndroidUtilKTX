@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ArrayUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
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

// TODO: 2020/7/24

//inline fun <T : Any> Array<out T>.remove(index: Int): Array<out T> =
//  ArrayUtils.remove(this, index)
//
//inline fun <T : Any> Array<out T>.remove(element: T): Array<out T> =
//  ArrayUtils.removeElement(this, element)
