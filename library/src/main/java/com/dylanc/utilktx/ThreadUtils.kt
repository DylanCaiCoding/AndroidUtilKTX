package com.dylanc.utilktx

import android.os.Handler
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ThreadUtils
import java.util.concurrent.ExecutorService

/**
 * @author Dylan Cai
 * @since 2020/5/15
 */

fun isMainThread() =
  ThreadUtils.isMainThread()

val mainHandler: Handler
  get() = ThreadUtils.getMainHandler()

fun runOnUiThread(runnable: () -> Unit) =
  ThreadUtils.runOnUiThread(runnable)

fun runOnUiThreadDelayed(delayMillis: Long, runnable: () -> Unit) =
  ThreadUtils.runOnUiThreadDelayed(runnable, delayMillis)

fun fixedPoolOf(
  @IntRange(from = 1) size: Int,
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getFixedPool(size, priority)

fun singlePoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getSinglePool(priority)

fun cachePoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getCachedPool(priority)