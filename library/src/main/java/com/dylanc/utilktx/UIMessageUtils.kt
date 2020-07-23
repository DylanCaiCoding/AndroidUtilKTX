package com.dylanc.utilktx

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.blankj.utilcode.util.UiMessageUtils

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
fun sendUIMessage(id: Int) =
  UiMessageUtils.getInstance().send(id)

fun sendUIMessage(id: Int, obj: Any) =
  UiMessageUtils.getInstance().send(id, obj)

fun addUIMessageListener(listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().addListener(listener)

fun addUIMessageListener(id: Int, listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().addListener(id, listener)

fun removeUIMessageListener(listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().removeListener(listener)

fun removeUIMessageListener(id: Int, listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().removeListener(id, listener)

fun removeUIMessageListeners(id: Int) =
  UiMessageUtils.getInstance().removeListeners(id)

fun observeUIMessage(owner: LifecycleOwner, listener: (UiMessageUtils.UiMessage) -> Unit) {
  owner.lifecycle.addObserver(object : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
      addUIMessageListener(listener)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
      removeUIMessageListener(listener)
    }
  })
}

fun observeUIMessage(id: Int, owner: LifecycleOwner, listener: (UiMessageUtils.UiMessage) -> Unit) {
  owner.lifecycle.addObserver(object : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
      addUIMessageListener(id, listener)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
      removeUIMessageListener(id, listener)
    }
  })
}