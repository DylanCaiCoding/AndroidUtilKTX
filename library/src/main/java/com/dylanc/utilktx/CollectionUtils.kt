@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CollectionUtils
import java.util.*

/**
 * @author Dylan Cai
 */

/**
 * Returns a synchronized (thread-safe) collection backed by the specified collection. In order to guarantee serial access,
 * it is critical that all access to the backing collection is accomplished through the returned collection..
 * This is equivalent to calling:
 * ```
 * Collections.synchronizedCollection(collection)
 * ```
 */
inline fun <T> synchronizedCollectionOf(vararg elements: T): Collection<T> =
  Collections.synchronizedCollection(listOf(*elements))

/**
 * Returns a Collection containing the exclusive disjunction (symmetric difference) of the given Collections.
 *
 * The cardinality of each element e in the returned Collection will be equal to max(cardinality(e,a),cardinality(e,b))
 * - min(cardinality(e,a),cardinality(e,b)).
 *
 * This is equivalent to subtract(union(a,b),intersection(a,b)) or union(subtract(a,b),subtract(b,a)).
 *
 * This is equivalent to calling:
 * ```
 * CollectionUtils.disjunction(a, b)
 * ```
 */
inline fun Collection<*>.disjunction(elements: Collection<*>): Collection<*> =
  CollectionUtils.disjunction(this, elements)

/**
 * Returns a Map mapping each unique element in the given Collection to an Integer representing the number of occurrences of
 * that element in the Collection.Only those elements present in the collection will appear as keys in the map.
 * This is equivalent to calling:
 * ```
 * CollectionUtils.getCardinalityMap(collection)
 * ```
 */
inline val Collection<*>.cardinalityMap: MutableMap<Any, Int> get() = CollectionUtils.getCardinalityMap(this)

/**
 * Returns true iff a is a sub-collection of b, that is, iff the cardinality of e in a is less than or
 * equal to the cardinality of e in b, for each element e in a. This is equivalent to calling:
 * ```
 * CollectionUtils.isSubCollection(a, b)
 * ```
 */
inline fun Collection<*>.isSubCollection(elements: Collection<*>): Boolean = CollectionUtils.isSubCollection(this, elements)

/**
 * Returns true iff a is a proper sub-collection of b, that is, iff the cardinality of e in a is less than or equal to the cardinality
 * of e in b, for each element e in a, and there is at least one element f such that the cardinality of f in b is strictly greater than
 * the cardinality of f in a.
 *
 * The implementation assumes
 * - a.size() and b.size() represent the total cardinality of a and b, resp.
 * - a.size() < Integer.MAXVALUE.
 *
 * This is equivalent to calling:
 * ```
 * CollectionUtils.isProperSubCollection(a, b)
 * ```
 */
inline fun Collection<*>.isProperSubCollection(elements: Collection<*>): Boolean =
  CollectionUtils.isProperSubCollection(this, elements)

/**
 * Returns true iff the given collections contain exactly the same elements with exactly the same cardinalities.
 * That is, iff the cardinality of e in a is equal to the cardinality of e in b, for each element e in a or b.
 * This is equivalent to calling:
 * ```
 * CollectionUtils.isEqualCollection(a, b)
 * ```
 */
inline fun <E> Collection<E>.equalCollection(elements: Collection<E>): Boolean =
  CollectionUtils.isEqualCollection(this, elements)

/**
 * Returns the number of occurrences of element in collection. This is equivalent to calling:
 * ```
 * CollectionUtils.cardinality(element, collection)
 * ```
 */
inline fun Collection<*>.cardinality(element: Any): Int = CollectionUtils.cardinality(element, this)

/**
 * Selects all elements from input collection which match the given predicate into an output collection.
 * A null predicate matches no elements. This is equivalent to calling:
 * ```
 * CollectionUtils.select(inputCollection, predicate)
 * ```
 */
inline fun <E> Collection<E>.select(noinline predicate: (E) -> Boolean): Collection<E> =
  CollectionUtils.select(this, predicate)

/**
 * Selects all elements from inputCollection which don't match the given predicate into an output collection.
 * If the input predicate is null, the result is an empty list. This is equivalent to calling:
 * ```
 * CollectionUtils.selectRejected(inputCollection, predicate)
 * ```
 */
inline fun <E> Collection<E>.selectRejected(noinline predicate: (E) -> Boolean): Collection<E> =
  CollectionUtils.selectRejected(this, predicate)

/**
 * Transform the collection by applying a Transformer to each element.
 *
 * If the input collection or transformer is null, there is no change made.
 *
 * This routine is best for Lists, for which set() is used to do the transformations "in place."
 * For other collections, clear() and addAll() are used to replace elements.
 *
 * If the input collection controls its input, such as a Set, and the Transformer creates duplicates (or are otherwise invalid),
 * the collection may reduce in size due to calling this method.
 *
 * This is equivalent to calling:
 * ```
 * CollectionUtils.transform(collection, transformer)
 * ```
 */
inline fun <E1, E2> Collection<E1>.transform(noinline transformer: (E1) -> E2): Unit =
  CollectionUtils.transform(this, transformer)

/**
 * Returns a new Collection consisting of the elements of inputCollection transformed by the given transformer.
 * If the input transformer is null, the result is an empty list. This is equivalent to calling:
 * ```
 * CollectionUtils.collect(inputCollection, transformer)
 * ```
 */
inline fun <E1, E2> Collection<E1>.collect(noinline transformer: (E1) -> E2): Collection<E2> =
  CollectionUtils.collect(this, transformer)

/**
 * Counts the number of elements in the input collection that match the predicate.
 * A null collection or predicate matches no elements. This is equivalent to calling:
 * ```
 * CollectionUtils.countMatches(collection, predicate)
 * ```
 */
inline fun <E> Collection<E>.matchesCount(noinline predicate: (E) -> Boolean): Int =
  CollectionUtils.countMatches(this, predicate)

/**
 * Answers true if a predicate is true for at least one element of a collection.
 * A null collection or predicate returns false. This is equivalent to calling:
 * ```
 * CollectionUtils.exists(collection, predicate)
 * ```
 */
inline fun <E> Collection<E>.exists(noinline predicate: (E) -> Boolean): Boolean =
  CollectionUtils.exists(this, predicate)

/**
 * Adds an element to the collection unless the element is null. This is equivalent to calling:
 * ```
 * CollectionUtils.addIgnoreNull(collection, element)
 * ```
 */
inline fun <E> Collection<E>.addIgnoreNull(element: E?): Boolean =
  CollectionUtils.addIgnoreNull(this, element)

/**
 * Adds all elements in the enumeration to the given collection. This is equivalent to calling:
 * ```
 * CollectionUtils.addAll(collection, enumeration)
 * ```
 */
inline fun <E> Collection<E>.addAll(enumeration: Enumeration<E>) =
  CollectionUtils.addAll(this, enumeration)

/**
 * Returns a collection containing all the elements in collection that are also in retain. The cardinality of an element e
 * in the returned collection is the same as the cardinality of e in collection unless retain does not contain e, in which case
 * the cardinality is zero. This method is useful if you do not wish to modify the collection c and thus cannot call c.retainAll(retain).
 * This is equivalent to calling:
 * ```
 * CollectionUtils.retainAll(collection, elements)
 * ```
 */
inline fun <E> Collection<E>.retainAll(elements: Collection<E>): Collection<E> =
  CollectionUtils.retainAll(this, elements)

/**
 * Removes the elements in remove from collection. That is, this method returns a collection containing all the elements in
 * c that are not in remove. The cardinality of an element e in the returned collection is the same as the cardinality of e
 * in collection unless remove contains e, in which case the cardinality is zero. This method is useful if you do not wish to
 * modify the collection c and thus cannot call collection.removeAll(remove). This is equivalent to calling:
 * ```
 * CollectionUtils.removeAll(collection, elements)
 * ```
 */
inline fun <E> Collection<E>.removeAll(elements: Collection<E>): Collection<E> =
  CollectionUtils.removeAll(this, elements)
