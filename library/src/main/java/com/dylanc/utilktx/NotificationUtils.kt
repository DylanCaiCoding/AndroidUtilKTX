@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.Manifest.permission
import androidx.annotation.RequiresPermission
import androidx.core.app.NotificationCompat
import com.blankj.utilcode.util.NotificationUtils
import com.blankj.utilcode.util.NotificationUtils.ChannelConfig
import com.blankj.utilcode.util.NotificationUtils.ChannelConfig.DEFAULT_CHANNEL_CONFIG
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter

/**
 * @author Dylan Cai
 */

/**
 * Returns the [ChannelConfig]. This is equivalent to calling:
 * ```
 * ChannelConfig(id, name, importance)
 * ```
 */
inline fun channelConfigOf(
  id: String, name: CharSequence, importance: Int, noinline block: (ChannelConfig.() -> Unit)? = null
): ChannelConfig =
  ChannelConfig(id, name, importance).apply { block?.invoke(this) }

/**
 * Returns whether the notifications enabled. This is equivalent to calling:
 * ```
 * NotificationUtils.areNotificationsEnabled()
 * ```
 */
inline val areNotificationsEnabled: Boolean get() = NotificationUtils.areNotificationsEnabled()

/**
 * Posts a notification to be shown in the status bar. This is equivalent to calling:
 * ```
 * NotificationUtils.notify(tag, id, channelConfig, NotificationCompat.Builder())
 * ```
 */
inline fun notify(
  id: Int, tag: String? = null, channelConfig: ChannelConfig = DEFAULT_CHANNEL_CONFIG, noinline block: NotificationCompat.Builder.() -> Unit
) =
  NotificationUtils.notify(tag, id, channelConfig, block)

/**
 * Cancels the notification. This is equivalent to calling:
 * ```
 * NotificationUtils.cancel(tag, id)
 * ```
 */
inline fun cancelNotification(id: Int, tag: String? = null) = NotificationUtils.cancel(tag, id)

/**
 * Cancels all of the notifications. This is equivalent to calling:
 * ```
 * NotificationUtils.cancelAll()
 * ```
 */
inline fun cancelAllNotification() = NotificationUtils.cancelAll()
