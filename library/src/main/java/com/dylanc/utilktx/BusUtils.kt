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
inline fun registerEventBus(bus: Any) = BusUtils.register(bus)

/**
 * Unregisters the event bus by [BusUtils]. This is equivalent to calling:
 * ```
 * BusUtils.unregister(bus)
 * ```
 */
inline fun unregisterEventBus(bus: Any) = BusUtils.unregister(bus)

/**
 * Posts the event of tag. This is equivalent to calling:
 * ```
 * BusUtils.post(tag)
 * ```
 */
inline fun postEvent(tag: String) = BusUtils.post(tag)

/**
 * Posts the event of tag. This is equivalent to calling:
 * ```
 * BusUtils.post(tag, arg)
 * ```
 */
inline fun postEvent(tag: String, arg: Any) = BusUtils.post(tag, arg)

/**
 * Posts the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag)
 * ```
 */
inline fun postStickyEvent(tag: String) = BusUtils.postSticky(tag)

/**
 * Posts the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag, arg)
 * ```
 */
inline fun postStickyEvent(tag: String, arg: Any) = BusUtils.postSticky(tag, arg)

/**
 * Removes the sticky event of tag. This is equivalent to calling:
 * ```
 * BusUtils.postSticky(tag, arg)
 * ```
 */
inline fun removeStickyEvent(tag: String) = BusUtils.removeSticky(tag)

/**
* Returns the string of [BusUtils]. This is equivalent to calling:
* ```
* BusUtils.toString_()
* ```
*/
inline val eventBusInfo: String get() = BusUtils.toString_()

inline fun observeEventBus(owner: LifecycleOwner) =
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
