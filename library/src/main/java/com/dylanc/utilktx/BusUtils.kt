@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.blankj.utilcode.util.BusUtils

/**
 * @author Dylan Cai
 */

/**
 * Registers the event bus by [BusUtils]. This is equivalent to calling:
 * ```
 * BusUtils.register(bus)
 * ```
 */
inline fun registerBus(bus: Any) = BusUtils.register(bus)

/**
 * Unregisters the event bus by [BusUtils]. This is equivalent to calling:
 * ```
 * BusUtils.unregister(bus)
 * ```
 */
inline fun unregisterBus(bus: Any) = BusUtils.unregister(bus)

/**
 * Posts the event of tag. This is equivalent to calling:
 * ```
 * BusUtils.post(tag)
 * ```
 */
inline fun postBus(tag: String) = BusUtils.post(tag)

/**
 * Posts the event of tag. This is equivalent to calling:
 * ```
 * BusUtils.post(tag, arg)
 * ```
 */
inline fun postBus(tag: String, arg: Any) = BusUtils.post(tag, arg)

/**
 * Posts the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag)
 * ```
 */
inline fun postStickyBus(tag: String) = BusUtils.postSticky(tag)

/**
 * Posts the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag, arg)
 * ```
 */
inline fun postStickyBus(tag: String, arg: Any) = BusUtils.postSticky(tag, arg)

/**
 * Removes the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag, arg)
 * ```
 */
inline fun removeStickyBus(tag: String) = BusUtils.removeSticky(tag)

/**
* Returns the string of [BusUtils]. This is equivalent to calling:
* ```
* BusUtils.toString_()
* ```
*/
inline val busInfo: String get() = BusUtils.toString_()

inline fun observeBus(owner: LifecycleOwner) =
  owner.lifecycle.addObserver(object : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun onStart() {
      BusUtils.register(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
      BusUtils.unregister(this)
    }
  })
