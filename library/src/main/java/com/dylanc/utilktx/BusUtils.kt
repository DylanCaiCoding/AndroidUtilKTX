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
 * . This is equivalent to calling:
 * ```
 * 
 * ```
 */
inline fun registerEventBus(bus: Any) = BusUtils.register(bus)

inline fun unregisterEventBus(bus: Any) = BusUtils.unregister(bus)

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

inline fun postEvent(tag: String) = BusUtils.post(tag)

inline fun postStickyEvent(tag: String) = BusUtils.postSticky(tag)

inline fun postEvent(tag: String, arg: Any) = BusUtils.post(tag, arg)

inline fun postStickyEvent(tag: String, arg: Any) = BusUtils.postSticky(tag, arg)

inline fun removeStickyEvent(tag: String) = BusUtils.removeSticky(tag)

inline val eventBusInfo: String get() = BusUtils.toString_()
