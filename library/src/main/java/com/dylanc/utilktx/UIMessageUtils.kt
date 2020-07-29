@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import com.blankj.utilcode.util.UiMessageUtils

/**
 * @author Dylan Cai
 */

inline fun sendUIMessage(id: Int) =
  UiMessageUtils.getInstance().send(id)

inline fun sendUIMessage(id: Int, obj: Any) =
  UiMessageUtils.getInstance().send(id, obj)

inline fun addUIMessageListener(noinline listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().addListener(listener)

inline fun addUIMessageListener(id: Int, noinline listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().addListener(id, listener)

inline fun removeUIMessageListener(noinline listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().removeListener(listener)

inline fun removeUIMessageListener(id: Int, noinline listener: (UiMessageUtils.UiMessage) -> Unit) =
  UiMessageUtils.getInstance().removeListener(id, listener)

inline fun removeUIMessageListeners(id: Int) =
  UiMessageUtils.getInstance().removeListeners(id)

inline fun observeUIMessage(owner: LifecycleOwner, noinline listener: (UiMessageUtils.UiMessage) -> Unit) {
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

inline fun observeUIMessage(id: Int, owner: LifecycleOwner, noinline listener: (UiMessageUtils.UiMessage) -> Unit) {
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