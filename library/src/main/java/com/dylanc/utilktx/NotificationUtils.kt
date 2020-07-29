@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import androidx.core.app.NotificationCompat
import com.blankj.utilcode.util.NotificationUtils
import com.blankj.utilcode.util.NotificationUtils.ChannelConfig

/**
 * @author Dylan Cai
 */

val defaultChannelConfig: ChannelConfig =
  channelConfigOf(packageName, packageName, NotificationUtils.IMPORTANCE_DEFAULT)

inline val areNotificationsEnabled: Boolean
  get() = NotificationUtils.areNotificationsEnabled()

inline fun notify(
  id: Int,
  tag: String? = null,
  channelConfig: ChannelConfig = defaultChannelConfig,
  noinline block: NotificationCompat.Builder.() -> Unit
) =
  NotificationUtils.notify(tag, id, channelConfig, block)

inline fun cancelNotification(id: Int, tag: String? = null) =
  NotificationUtils.cancel(tag, id)

inline fun cancelAllNotification() =
  NotificationUtils.cancelAll()

inline fun channelConfigOf(
  id: String,
  name: CharSequence,
  importance: Int,
  noinline block: (ChannelConfig.() -> Unit)?= null
) =
  ChannelConfig(id, name, importance).apply{ block?.invoke(this) }