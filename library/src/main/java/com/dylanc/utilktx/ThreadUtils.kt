@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.os.Handler
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ThreadUtils
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.TimeUnit

/**
 * @author Dylan Cai
 */
// TODO: 2020/8/19

inline val isMainThread: Boolean get() = ThreadUtils.isMainThread()

inline val mainHandler: Handler get() = ThreadUtils.getMainHandler()

inline fun runOnUiThread(noinline runnable: () -> Unit) =
  ThreadUtils.runOnUiThread(runnable)

inline fun runOnUiThreadDelayed(delayMillis: Long, noinline runnable: () -> Unit) =
  ThreadUtils.runOnUiThreadDelayed(runnable, delayMillis)

inline fun fixedThreadPoolOf(@IntRange(from = 1) size: Int): ExecutorService =
  ThreadUtils.getFixedPool(size)

inline fun fixedThreadPoolOf(@IntRange(from = 1) size: Int, @IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getFixedPool(size, priority)

inline fun singleThreadPoolOf(): ExecutorService = ThreadUtils.getSinglePool()

inline fun singleThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getSinglePool(priority)

inline fun cacheThreadPoolOf(): ExecutorService = ThreadUtils.getCachedPool()

inline fun cacheThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getCachedPool(priority)

inline fun ioThreadPoolOf(): ExecutorService = ThreadUtils.getIoPool()

inline fun ioThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getIoPool(priority)

inline fun cpuThreadPoolOf(): ExecutorService = ThreadUtils.getCpuPool()

inline fun cpuThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getCpuPool(priority)

inline fun <T> executeByFixedThread(@IntRange(from = 1) size: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixed(size, task)

inline fun <T> executeByFixedThread(@IntRange(from = 1) size: Int, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixed(size, task, priority)

inline fun <T> executeByFixedThreadWithDelay(@IntRange(from = 1) size: Int, delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit)

inline fun <T> executeByFixedThreadWithDelay(
  @IntRange(from = 1) size: Int, delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit, priority)

inline fun <T> executeBySingleThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeBySingle(task)

inline fun <T> executeBySingleThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeBySingle(task, priority)

inline fun <T> executeBySingleThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit)

inline fun <T> executeBySingleThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit, priority)

inline fun <T> executeBySingleThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit)

inline fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit, priority)

inline fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, initialDelay, period, unit, priority)

inline fun <T> executeByCachedThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByCached(task)

inline fun <T> executeByCachedThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCached(task, priority)

inline fun <T> executeByCachedThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit)

inline fun <T> executeByCachedThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit, priority)

inline fun <T> executeByCachedThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit)

inline fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit, priority)

inline fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, initialDelay, period, unit, priority)

inline fun <T> executeByIoThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByIo(task)

inline fun <T> executeByIoThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByIo(task, priority)

inline fun <T> executeByIoThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit)

inline fun <T> executeByIoThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit, priority)

inline fun <T> executeByIoThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit)

inline fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit, priority)

inline fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, initialDelay, period, unit, priority)

inline fun <T> executeByCpuThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByCpu(task)

inline fun <T> executeByCpuThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCpu(task, priority)

inline fun <T> executeByCpuThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit)

inline fun <T> executeByCpuThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit, priority)

inline fun <T> executeByCpuThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit)

inline fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit, priority)

inline fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, initialDelay, period, unit, priority)

inline fun <T> executeByCustomThread(pool: ExecutorService, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCustom(pool, task)

inline fun <T> executeByCustomThreadWithDelay(pool: ExecutorService, delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCustomWithDelay(pool, task, delay, unit)

inline fun <T> executeByCustomThreadAtFixRate(pool: ExecutorService, task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, period, unit)

inline fun <T> executeByCustomThreadAtFixRate(
  pool: ExecutorService, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, initialDelay, period, unit)

// TODO: 2020/7/30 Optimize usage
inline fun cancelThread(tasks: ThreadUtils.Task<*>) =
  ThreadUtils.cancel(tasks)

inline fun cancelThread(vararg tasks: ThreadUtils.Task<*>) =
  ThreadUtils.cancel(*tasks)

inline fun cancelThread(tasks: List<ThreadUtils.Task<*>>) =
  ThreadUtils.cancel(tasks)

inline fun cancelThread(executorService: ExecutorService) =
  ThreadUtils.cancel(executorService)

inline fun setDeliverThread(deliver: Executor) =
  ThreadUtils.setDeliver(deliver)

inline fun setDeliverThread(noinline deliver: (Runnable) -> Unit) =
  ThreadUtils.setDeliver(deliver)
