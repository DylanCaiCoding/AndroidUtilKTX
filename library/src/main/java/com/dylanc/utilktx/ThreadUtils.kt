@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.os.Handler
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ThreadUtils
import com.dylanc.utilktx.Internals.NO_GETTER
import com.dylanc.utilktx.Internals.noGetter
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.TimeUnit

/**
 * @author Dylan Cai
 */

/**
 * Return whether the thread is the main thread. This is equivalent to calling:
 * ```
 * ThreadUtils.isMainThread()
 * ```
 */
inline val isMainThread: Boolean get() = ThreadUtils.isMainThread()

/**
 * Return the handler of the main thread. This is equivalent to calling:
 * ```
 * ThreadUtils.getMainHandler()
 * ```
 */
inline val mainHandler: Handler get() = ThreadUtils.getMainHandler()

/**
 * Run on the main thread. This is equivalent to calling:
 * ```
 * ThreadUtils.runOnUiThread(runnable)
 * ```
 */
inline fun runOnUiThread(noinline runnable: () -> Unit) = ThreadUtils.runOnUiThread(runnable)

/**
 * Run on the main thread delayed. This is equivalent to calling:
 * ```
 * ThreadUtils.runOnUiThreadDelayed(runnable, delayMillis)
 * ```
 */
inline fun runOnUiThreadDelayed(delayMillis: Long, noinline runnable: () -> Unit) =
  ThreadUtils.runOnUiThreadDelayed(runnable, delayMillis)

/**
 * Return a thread pool that reuses a fixed number of threads operating off a shared unbounded queue,
 * using the provided ThreadFactory to create new threads when needed. This is equivalent to calling:
 * ```
 *  ExecutorService = ThreadUtils.getFixedPool(size)
 * ```
 */
inline fun fixedThreadPoolOf(@IntRange(from = 1) size: Int): ExecutorService = ThreadUtils.getFixedPool(size)

/**
 * Return a thread pool that reuses a fixed number of threads operating off a shared unbounded queue,
 * using the provided ThreadFactory to create new threads when needed. This is equivalent to calling:
 * ```
 *  ExecutorService = ThreadUtils.getFixedPool(size, priority)
 * ```
 */
inline fun fixedThreadPoolOf(@IntRange(from = 1) size: Int, @IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getFixedPool(size, priority)

/**
 * Return a thread pool that uses a single worker thread operating off an unbounded queue,
 * and uses the provided ThreadFactory to create a new thread when needed. This is equivalent to calling:
 * ```
 * ThreadUtils.getSinglePool()
 * ```
 */
inline fun singleThreadPoolOf(): ExecutorService = ThreadUtils.getSinglePool()

/**
 * Return a thread pool that uses a single worker thread operating off an unbounded queue,
 * and uses the provided ThreadFactory to create a new thread when needed. This is equivalent to calling:
 * ```
 * ThreadUtils.getSinglePool(priority)
 * ```
 */
inline fun singleThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getSinglePool(priority)

/**
 * Return a thread pool that creates new threads as needed, but will reuse previously constructed threads
 * when they are available. This is equivalent to calling:
 * ```
 * ThreadUtils.getCachedPool()
 * ```
 */
inline fun cacheThreadPoolOf(): ExecutorService = ThreadUtils.getCachedPool()

/**
 * Return a thread pool that creates new threads as needed, but will reuse previously constructed threads
 * when they are available. This is equivalent to calling:
 * ```
 * ThreadUtils.getCachedPool(priority)
 * ```
 */
inline fun cacheThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getCachedPool(priority)

/**
 * Return a thread pool that creates (2 * CPU_COUNT + 1) threads operating off a queue which size is 128. This is equivalent to calling:
 * ```
 * ThreadUtils.getIoPool()
 * ```
 */
inline fun ioThreadPoolOf(): ExecutorService = ThreadUtils.getIoPool()

/**
 * Return a thread pool that creates (2 * CPU_COUNT + 1) threads operating off a queue which size is 128. This is equivalent to calling:
 * ```
 * ThreadUtils.getIoPool(priority)
 * ```
 */
inline fun ioThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getIoPool(priority)

/**
 * Return a thread pool that creates (CPU_COUNT + 1) threads operating off a queue which size is 128 and
 * the maximum number of threads equals (2 * CPU_COUNT + 1). This is equivalent to calling:
 * ```
 * ThreadUtils.getCpuPool()
 * ```
 */
inline fun cpuThreadPoolOf(): ExecutorService = ThreadUtils.getCpuPool()

/**
 * Return a thread pool that creates (CPU_COUNT + 1) threads operating off a queue which size is 128 and
 * the maximum number of threads equals (2 * CPU_COUNT + 1). This is equivalent to calling:
 * ```
 * ThreadUtils.getCpuPool(priority)
 * ```
 */
inline fun cpuThreadPoolOf(@IntRange(from = 1, to = 10) priority: Int): ExecutorService =
  ThreadUtils.getCpuPool(priority)

/**
 * Executes the given task in a fixed thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByFixed(size, task)
 * ```
 */
inline fun <T> executeByFixedThread(@IntRange(from = 1) size: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixed(size, task)

/**
 * Executes the given task in a fixed thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByFixed(size, task, priority)
 * ```
 */
inline fun <T> executeByFixedThread(@IntRange(from = 1) size: Int, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixed(size, task, priority)

/**
 * Executes the given task in a fixed thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByFixedWithDelay(size, task, delay, unit)
 * ```
 */
inline fun <T> executeByFixedThreadWithDelay(@IntRange(from = 1) size: Int, delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit)

/**
 * Executes the given task in a fixed thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByFixedWithDelay(size, task, delay, unit, priority)
 * ```
 */
inline fun <T> executeByFixedThreadWithDelay(
  @IntRange(from = 1) size: Int, delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit, priority)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, period, unit)
 * ```
 */
inline fun <T> executeByFixedThreadAtFixRate(@IntRange(from = 1) size: Int, task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByFixedAtFixRate(size, task, period, unit)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, period, unit, priority)
 * ```
 */
inline fun <T> executeByFixedThreadAtFixRate(
  @IntRange(from = 1) size: Int, @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedAtFixRate(size, task, period, unit, priority)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, initialDelay, period, unit, priority)
 * ```
 */
inline fun <T> executeByFixedThreadAtFixRate(
  @IntRange(from = 1) size: Int,
  @IntRange(from = 1, to = 10) priority: Int,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedAtFixRate(size, task, initialDelay, period, unit, priority)

/**
 * Executes the given task in a single thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingle(task)
 * ```
 */
inline fun <T> executeBySingleThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeBySingle(task)

/**
 * Executes the given task in a single thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingle(task, priority)
 * ```
 */
inline fun <T> executeBySingleThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeBySingle(task, priority)

/**
 * Executes the given task in a single thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleWithDelay(task, delay, unit)
 * ```
 */
inline fun <T> executeBySingleThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit)

/**
 * Executes the given task in a single thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleWithDelay(task, delay, unit, priority)
 * ```
 */
inline fun <T> executeBySingleThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit, priority)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, period, unit)
 * ```
 */
inline fun <T> executeBySingleThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, period, unit, priority)
 * ```
 */
inline fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit, priority)

/**
 * Executes the given task in a single thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeBySingleAtFixRate(task, initialDelay, period, unit, priority)
 * ```
 */
inline fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, initialDelay, period, unit, priority)

/**
 * Executes the given task in a cached thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCached(task)
 * ```
 */
inline fun <T> executeByCachedThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByCached(task)

/**
 * Executes the given task in a cached thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCached(task, priority)
 * ```
 */
inline fun <T> executeByCachedThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCached(task, priority)

/**
 * Executes the given task in a cached thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCachedWithDelay(task, delay, unit)
 * ```
 */
inline fun <T> executeByCachedThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit)

/**
 * Executes the given task in a cached thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCachedWithDelay(task, delay, unit, priority)
 * ```
 */
inline fun <T> executeByCachedThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit, priority)

/**
 * Executes the given task in a cached thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCachedAtFixRate(task, period, unit)
 * ```
 */
inline fun <T> executeByCachedThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit)

/**
 * Executes the given task in a cached thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCachedAtFixRate(task, period, unit, priority)
 * ```
 */
inline fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit, priority)

/**
 * Executes the given task in a cached thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCachedAtFixRate(task, initialDelay, period, unit, priority)
 * ```
 */
inline fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, initialDelay, period, unit, priority)

/**
 * Executes the given task in an IO thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIo(task)
 * ```
 */
inline fun <T> executeByIoThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByIo(task)

/**
 * Executes the given task in an IO thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIo(task, priority)
 * ```
 */
inline fun <T> executeByIoThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByIo(task, priority)

/**
 * Executes the given task in an IO thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIoWithDelay(task, delay, unit)
 * ```
 */
inline fun <T> executeByIoThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit)

/**
 * Executes the given task in an IO thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIoWithDelay(task, delay, unit, priority)
 * ```
 */
inline fun <T> executeByIoThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit, priority)

/**
 * Executes the given task in an IO thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIoAtFixRate(task, period, unit)
 * ```
 */
inline fun <T> executeByIoThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit)

/**
 * Executes the given task in an IO thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIoAtFixRate(task, period, unit, priority)
 * ```
 */
inline fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit, priority)

/**
 * Executes the given task in an IO thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByIoAtFixRate(task, initialDelay, period, unit, priority)
 * ```
 */
inline fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, initialDelay, period, unit, priority)

/**
 * Executes the given task in a cpu thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpu(task)
 * ```
 */
inline fun <T> executeByCpuThread(task: ThreadUtils.Task<T>) = ThreadUtils.executeByCpu(task)

/**
 * Executes the given task in a cpu thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpu(task, priority)
 * ```
 */
inline fun <T> executeByCpuThread(@IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCpu(task, priority)

/**
 * Executes the given task in a cpu thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpuWithDelay(task, delay, unit)
 * ```
 */
inline fun <T> executeByCpuThreadWithDelay(delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit)

/**
 * Executes the given task in a cpu thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpuWithDelay(task, delay, unit, priority)
 * ```
 */
inline fun <T> executeByCpuThreadWithDelay(
  delay: Long, unit: TimeUnit, @IntRange(from = 1, to = 10) priority: Int, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit, priority)

/**
 * Executes the given task in a cpu thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpuAtFixRate(task, period, unit)
 * ```
 */
inline fun <T> executeByCpuThreadAtFixRate(task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit)

/**
 * Executes the given task in a cpu thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpuAtFixRate(task, period, unit, priority)
 * ```
 */
inline fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit, priority)

/**
 * Executes the given task in a cpu thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCpuAtFixRate(task, initialDelay, period, unit, priority)
 * ```
 */
inline fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, initialDelay, period, unit, priority)

/**
 * Executes the given task in a custom thread pool. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCustom(pool, task)
 * ```
 */
inline fun <T> executeByCustomThread(pool: ExecutorService, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCustom(pool, task)

/**
 * Executes the given task in a custom thread pool after the given delay. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCustomWithDelay(pool, task, delay, unit)
 * ```
 */
inline fun <T> executeByCustomThreadWithDelay(pool: ExecutorService, delay: Long, unit: TimeUnit, task: ThreadUtils.Task<T>) =
  ThreadUtils.executeByCustomWithDelay(pool, task, delay, unit)

/**
 * Executes the given task in a custom thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCustomAtFixRate(pool, task, period, unit)
 * ```
 */
inline fun <T> executeByCustomThreadAtFixRate(pool: ExecutorService, task: ThreadUtils.Task<T>, period: Long, unit: TimeUnit) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, period, unit)

/**
 * Executes the given task in a custom thread pool at fix rate. This is equivalent to calling:
 * ```
 * ThreadUtils.executeByCustomAtFixRate(pool, task, initialDelay, period, unit)
 * ```
 */
inline fun <T> executeByCustomThreadAtFixRate(
  pool: ExecutorService, initialDelay: Long, period: Long, unit: TimeUnit, task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, initialDelay, period, unit)

/**
 * Cancels the thread by [ThreadUtils]. This is equivalent to calling:
 * ```
 * ThreadUtils.cancel(executorService)
 * ```
 */
inline fun ExecutorService.cancel() = ThreadUtils.cancel(this)

/**
 * Sets the deliver of [ThreadUtils]. This is equivalent to calling:
 * ```
 * ThreadUtils.setDeliver(deliver)
 * ```
 */
var deliveredThread: Executor
  @Deprecated(NO_GETTER, level = DeprecationLevel.ERROR)
  get() = throw noGetter()
  set(value) = ThreadUtils.setDeliver(value)