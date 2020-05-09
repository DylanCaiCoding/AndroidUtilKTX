@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.BusUtils

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun Any.registerEventBus() =
  BusUtils.register(this)

fun Any.unregisterEventBus() =
  BusUtils.unregister(this)

fun postEvent(tag: String) =
  BusUtils.post(tag)

fun postEvent(tag: String, arg: Any) =
  BusUtils.post(tag, arg)

fun postStickyEvent(tag: String) =
  BusUtils.postSticky(tag)

fun postStickyEvent(tag: String, arg: Any) =
  BusUtils.postSticky(tag, arg)

fun removeStickyEvent(tag: String) =
  BusUtils.removeSticky(tag)

val eventBusInfo: String
  get() = BusUtils.toString_()
