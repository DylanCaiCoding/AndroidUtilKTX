@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.ArrayUtils

/**
 * @author Dylan Cai
 */

/**
 * Returns whether the two arrays are the same length. This is equivalent to calling:
 * ```
 * ArrayUtils.isSameLength(array1, array2)
 * ```
 */
inline fun Array<*>.lengthEquals(array: Array<*>) = ArrayUtils.isSameLength(this, array)

/**
 * Reverses the order of the given array. There is no special handling for multi-dimensional arrays.
 * This method does nothing for a null input array. This is equivalent to calling:
 * ```
 * ArrayUtils.reverse(array)
 * ```
 */
inline fun Array<*>.reverse() = ArrayUtils.reverse(this)

/**
 * Copies the specified array and handling null.The objects in the array are not cloned,
 * thus there is no special handling for multi-dimensional arrays.This method returns null
 * for a null input array. This is equivalent to calling:
 * ```
 * ArrayUtils.copy(array)
 * ```
 */
inline fun <T> Array<T>.copy(): Array<T> = ArrayUtils.copy(this)

/**
 * Subtract the elements of the array. This is equivalent to calling:
 * ```
 * ArrayUtils.removeElement(array, index)
 * ```
 */
inline fun <T> Array<T>.subtract(startIndexInclusive: Int, endIndexExclusive: Int): Array<T> =
  ArrayUtils.subArray(this, startIndexInclusive, endIndexExclusive)

/**
 * Returns the first index of the element. This is equivalent to calling:
 * ```
 * ArrayUtils.indexOf(array, element)
 * ```
 */
inline fun <T> Array<T>.indexOfFirst(element: T): Int = ArrayUtils.indexOf(this, element)

/**
 * Returns the last index of the element. This is equivalent to calling:
 * ```
 * ArrayUtils.lastIndexOf(array, element)
 * ```
 */
inline fun <T> Array<T>.indexOfLast(element: T): Int = ArrayUtils.lastIndexOf(this, element)

/**
 * Returns whether the array contains elements. This is equivalent to calling:
 * ```
 * ArrayUtils.contains(array, element)
 * ```
 */
inline fun <T> Array<T>.contains(element: T): Boolean = ArrayUtils.contains(this, element)

/**
 * Sorts the array. This is equivalent to calling:
 * ```
 * ArrayUtils.sort(array, comparator)
 * ```
 */
inline fun <T> Array<T>.sort(noinline comparator: (T, T) -> Int) = ArrayUtils.sort(this, comparator)