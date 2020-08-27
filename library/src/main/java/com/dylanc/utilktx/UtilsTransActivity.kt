@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.content.Intent
import com.blankj.utilcode.util.UtilsTransActivity
import com.blankj.utilcode.util.UtilsTransActivity4MainProcess

/**
 * @author Dylan Cai
 */

/**
 * Launches a transparent activity. This is equivalent to calling:
 * ```
 * UtilsTransActivity.start(consumer, delegate)
 * ```
 */
inline fun startTransActivity(noinline block: ((Intent) -> Unit)? = null, delegate: UtilsTransActivity.TransActivityDelegate) =
  UtilsTransActivity.start(block, delegate)

/**
 * Launches a transparent activity. This is equivalent to calling:
 * ```
 * UtilsTransActivity.start(activity, consumer, delegate)
 * ```
 */
inline fun Activity.startTransActivity(noinline block: ((Intent) -> Unit)? = null, delegate: UtilsTransActivity.TransActivityDelegate) =
  UtilsTransActivity.start(this, block, delegate)

/**
 * Launches a transparent activity. This is equivalent to calling:
 * ```
 * UtilsTransActivity.start(consumer, delegate)
 * ```
 */
inline fun startTransActivityForMainProcess(
  noinline block: ((Intent) -> Unit)? = null,
  delegate: UtilsTransActivity.TransActivityDelegate
) =
  UtilsTransActivity4MainProcess.start(block, delegate)

/**
 * Launches a transparent activity. This is equivalent to calling:
 * ```
 * UtilsTransActivity.start(activity, consumer, delegate)
 * ```
 */
inline fun Activity.startTransActivityForMainProcess(
  noinline block: ((Intent) -> Unit)? = null,
  delegate: UtilsTransActivity.TransActivityDelegate
) =
  UtilsTransActivity4MainProcess.start(this, block, delegate)