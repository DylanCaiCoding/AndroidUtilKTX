@file:Suppress("unused")

package com.dylanc.utilktx

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.blankj.utilcode.util.BusUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
private val NULL: Any = "nULl"

fun registerEventBus(bus: Any) =
  BusUtils.register(bus)

fun unregisterEventBus(bus: Any) =
  BusUtils.unregister(bus)

fun observeEventBus(owner: LifecycleOwner) =
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

fun postEvent(tag: String, arg: Any = NULL) =
  BusUtils.post(tag, arg)

fun postStickyEvent(tag: String, arg: Any = NULL) =
  BusUtils.postSticky(tag, arg)

fun removeStickyEvent(tag: String) =
  BusUtils.removeSticky(tag)

val eventBusInfo: String
  get() = BusUtils.toString_()
