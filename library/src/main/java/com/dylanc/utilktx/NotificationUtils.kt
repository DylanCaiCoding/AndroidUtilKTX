@file:Suppress("unused")

package com.dylanc.utilktx

import androidx.core.app.NotificationCompat
import com.blankj.utilcode.util.NotificationUtils
import com.blankj.utilcode.util.NotificationUtils.ChannelConfig

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */
val defaultChannelConfig: ChannelConfig =
  channelConfigOf(packageName, packageName, NotificationUtils.IMPORTANCE_DEFAULT)

fun isNotificationsEnabled(): Boolean =
  NotificationUtils.areNotificationsEnabled()

fun notify(
  id: Int,
  tag: String? = null,
  channelConfig: ChannelConfig = defaultChannelConfig,
  block: NotificationCompat.Builder.() -> Unit
) =
  NotificationUtils.notify(tag, id, channelConfig, block)

fun cancelNotification(id: Int, tag: String? = null) =
  NotificationUtils.cancel(tag, id)

fun cancelAllNotification() =
  NotificationUtils.cancelAll()

fun channelConfigOf(
  id: String,
  name: CharSequence,
  importance: Int,
  block: (ChannelConfig.() -> Unit)?= null
) =
  ChannelConfig(id, name, importance).apply{ block?.invoke(this) }