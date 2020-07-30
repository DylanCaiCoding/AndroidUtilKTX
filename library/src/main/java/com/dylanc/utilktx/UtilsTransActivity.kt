@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.app.Activity
import android.content.Intent
import com.blankj.utilcode.util.UtilsTransActivity

/**
 * @author Dylan Cai
 */

inline fun startTransActivity(
  noinline block: ((Intent) -> Unit)? = null,
  delegate: UtilsTransActivity.TransActivityDelegate
) =
  UtilsTransActivity.start(block, delegate)

inline fun Activity.startTransActivity(
  noinline block: ((Intent) -> Unit)? = null,
  delegate: UtilsTransActivity.TransActivityDelegate
) =
  UtilsTransActivity.start(this, block, delegate)