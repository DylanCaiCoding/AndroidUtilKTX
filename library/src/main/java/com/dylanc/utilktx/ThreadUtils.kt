package com.dylanc.utilktx

import android.os.Handler
import androidx.annotation.IntRange
import com.blankj.utilcode.util.ThreadUtils
import java.util.concurrent.Executor
import java.util.concurrent.ExecutorService
import java.util.concurrent.TimeUnit

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

fun fixedThreadPoolOf(
  @IntRange(from = 1) size: Int
): ExecutorService =
  ThreadUtils.getFixedPool(size)

fun fixedThreadPoolOf(
  @IntRange(from = 1) size: Int,
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getFixedPool(size, priority)

fun singleThreadPoolOf(): ExecutorService =
  ThreadUtils.getSinglePool()

fun singleThreadPoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getSinglePool(priority)

fun cacheThreadPoolOf(): ExecutorService =
  ThreadUtils.getCachedPool()

fun cacheThreadPoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getCachedPool(priority)

fun ioThreadPoolOf(): ExecutorService =
  ThreadUtils.getIoPool()

fun ioThreadPoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getIoPool(priority)

fun cpuThreadPoolOf(): ExecutorService =
  ThreadUtils.getCpuPool()

fun cpuThreadPoolOf(
  @IntRange(from = 1, to = 10) priority: Int
): ExecutorService =
  ThreadUtils.getCpuPool(priority)

fun <T> executeByFixedThread(
  @IntRange(from = 1) size: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixed(size, task)

fun <T> executeByFixedThread(
  @IntRange(from = 1) size: Int,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixed(size, task, priority)

fun <T> executeByFixedThreadWithDelay(
  @IntRange(from = 1) size: Int,
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit)

fun <T> executeByFixedThreadWithDelay(
  @IntRange(from = 1) size: Int,
  delay: Long,
  unit: TimeUnit,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByFixedWithDelay(size, task, delay, unit, priority)

fun <T> executeBySingleThread(
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingle(task)

fun <T> executeBySingleThread(
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingle(task, priority)

fun <T> executeBySingleThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit)

fun <T> executeBySingleThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleWithDelay(task, delay, unit, priority)

fun <T> executeBySingleThreadAtFixRate(
  task: ThreadUtils.Task<T>,
  period: Long,
  unit: TimeUnit
) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit)

fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, period, unit, priority)

fun <T> executeBySingleThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeBySingleAtFixRate(task, initialDelay, period, unit, priority)

fun <T> executeByCachedThread(
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCached(task)

fun <T> executeByCachedThread(
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCached(task, priority)

fun <T> executeByCachedThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit)

fun <T> executeByCachedThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedWithDelay(task, delay, unit, priority)

fun <T> executeByCachedThreadAtFixRate(
  task: ThreadUtils.Task<T>,
  period: Long,
  unit: TimeUnit
) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit)

fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, period, unit, priority)

fun <T> executeByCachedThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCachedAtFixRate(task, initialDelay, period, unit, priority)

fun <T> executeByIoThread(
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIo(task)

fun <T> executeByIoThread(
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIo(task, priority)

fun <T> executeByIoThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit)

fun <T> executeByIoThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoWithDelay(task, delay, unit, priority)

fun <T> executeByIoThreadAtFixRate(
  task: ThreadUtils.Task<T>,
  period: Long,
  unit: TimeUnit
) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit)

fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, period, unit, priority)

fun <T> executeByIoThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByIoAtFixRate(task, initialDelay, period, unit, priority)

fun <T> executeByCpuThread(
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpu(task)

fun <T> executeByCpuThread(
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpu(task, priority)

fun <T> executeByCpuThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit)

fun <T> executeByCpuThreadWithDelay(
  delay: Long,
  unit: TimeUnit,
  @IntRange(from = 1, to = 10) priority: Int,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuWithDelay(task, delay, unit, priority)

fun <T> executeByCpuThreadAtFixRate(
  task: ThreadUtils.Task<T>,
  period: Long,
  unit: TimeUnit
) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit)

fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, period, unit, priority)

fun <T> executeByCpuThreadAtFixRate(
  @IntRange(from = 1, to = 10) priority: Int,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCpuAtFixRate(task, initialDelay, period, unit, priority)

fun <T> executeByCustomThread(
  pool: ExecutorService,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCustom(pool, task)

fun <T> executeByCustomThreadWithDelay(
  pool: ExecutorService,
  delay: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCustomWithDelay(pool, task, delay, unit)

fun <T> executeByCustomThreadAtFixRate(
  pool: ExecutorService,
  task: ThreadUtils.Task<T>,
  period: Long,
  unit: TimeUnit
) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, period, unit)

fun <T> executeByCustomThreadAtFixRate(
  pool: ExecutorService,
  initialDelay: Long,
  period: Long,
  unit: TimeUnit,
  task: ThreadUtils.Task<T>
) =
  ThreadUtils.executeByCustomAtFixRate(pool, task, initialDelay, period, unit)

fun cancelThread(tasks: ThreadUtils.Task<*>) =
  ThreadUtils.cancel(tasks)

fun cancelThread(vararg tasks: ThreadUtils.Task<*>) =
  ThreadUtils.cancel(*tasks)

fun cancelThread(tasks: List<ThreadUtils.Task<*>>) =
  ThreadUtils.cancel(tasks)

fun cancelThread(executorService: ExecutorService) =
  ThreadUtils.cancel(executorService)

fun setDeliverThread(deliver: Executor) =
  ThreadUtils.setDeliver(deliver)

fun setDeliverThread(deliver: (Runnable) -> Unit) =
  ThreadUtils.setDeliver(deliver)
