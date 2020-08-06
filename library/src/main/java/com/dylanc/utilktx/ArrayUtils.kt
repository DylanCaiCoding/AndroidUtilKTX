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
 * Copies the given array and adds the given element at the end of the new array.
 *
 * The new array contains the same elements of the input
 * array plus the given element in the last position. The component type of
 * the new array is the same as that of the input array.
 *
 * If the input array is <code>null</code>, a new one element array is returned
 * whose component type is the same as the element.
 *
 * ```
 * ArrayUtils.realAdd(null, null)      = [null]
 * ArrayUtils.realAdd(null, "a")       = ["a"]
 * ArrayUtils.realAdd(["a"], null)     = ["a", null]
 * ArrayUtils.realAdd(["a"], "b")      = ["a", "b"]
 * ArrayUtils.realAdd(["a", "b"], "c") = ["a", "b", "c"]
 * ```
 *
 * This is equivalent to calling:
 * ```
 * ArrayUtils.add(array, element)
 * ```
 */
inline fun <T> Array<T>.add(element: T): Array<T> = ArrayUtils.add(this, element)

/**
 *
 * Removes the first occurrence of the specified element from the
 * specified array. All subsequent elements are shifted to the left
 * (substracts one from their indices). If the array doesn't contains
 * such an element, no elements are removed from the array.
 *
 * This method returns a new array with the same elements of the input
 * array except the first occurrence of the specified element. The component
 * type of the returned array is always the same as that of the input
 * array.
 *
 * ```
 * ArrayUtils.removeElement(null, "a")            = null
 * ArrayUtils.removeElement([], "a")              = []
 * ArrayUtils.removeElement(["a"], "b")           = ["a"]
 * ArrayUtils.removeElement(["a", "b"], "a")      = ["b"]
 * ArrayUtils.removeElement(["a", "b", "a"], "a") = ["b", "a"]
 * ```
 *
 * This is equivalent to calling:
 * ```
 * ArrayUtils.removeElement(array, element)
 * ```
 */
inline fun Array<out Any>.remove(element: Any): Array<out Any> =
  ArrayUtils.removeElement(this, element)

/**
 * Removes the element at the specified position from the specified array.
 * All subsequent elements are shifted to the left (substracts one from
 * their indices).
 *
 * This method returns a new array with the same elements of the input
 * array except the element on the specified position. The component
 * type of the returned array is always the same as that of the input
 * array.
 *
 * If the input array is <code>null</code>, an IndexOutOfBoundsException
 * will be thrown, because in that case no valid index can be specified.
 *
 * ```
 * ArrayUtils.remove(["a"], 0)           = []
 * ArrayUtils.remove(["a", "b"], 0)      = ["b"]
 * ArrayUtils.remove(["a", "b"], 1)      = ["a"]
 * ArrayUtils.remove(["a", "b", "c"], 1) = ["a", "c"]
 * ```
 *
 * This is equivalent to calling:
 * ```
 * ArrayUtils.removeElement(array, index)
 * ```
 */
inline fun Array<out Any>.remove(index: Int): Array<out Any> = ArrayUtils.remove(this, index)

/**
 * Returns the first index of the element. This is equivalent to calling:
 * ```
 * ArrayUtils.indexOf(array, element)
 * ```
 */
inline fun <T> Array<T>.indexOf(element: T): Int = ArrayUtils.indexOf(this, element)

/**
* Returns the last index of the element. This is equivalent to calling:
* ```
* ArrayUtils.lastIndexOf(array, element)
* ```
*/
inline fun <T> Array<T>.lastIndexOf(element: T): Int = ArrayUtils.lastIndexOf(this, element)

/**
 * Returns whether the array contains elements. This is equivalent to calling:
 * ```
 * ArrayUtils.contains(array, element)
 * ```
 */
inline fun <T> Array<T>.contains(element: T): Boolean = ArrayUtils.contains(this, element)

/**
 * Sort the array. This is equivalent to calling:
 * ```
 * ArrayUtils.sort(array, comparator)
 * ```
 */
inline fun <T> Array<T>.sort(noinline comparator: (T, T) -> Int) = ArrayUtils.sort(this, comparator)