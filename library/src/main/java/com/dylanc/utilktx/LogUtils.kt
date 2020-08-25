@file:Suppress("NOTHING_TO_INLINE", "unused", "FunctionName")

package com.dylanc.utilktx

import com.blankj.utilcode.util.LogUtils
import android.util.Log.*

/**
 * @author Dylan Cai
 */

interface Logger {
  val loggerTag: String get() = TAG
}

inline fun Logger(tag: String): Logger = object : Logger {
  override val loggerTag: String get() = tag
}

/**
 * Returns the simple class name.
 */
inline val Any.TAG: String
  get() {
    val tag = javaClass.simpleName
    return if (tag.length <= 23) tag else tag.substring(0, 23)
  }

/**
 * Returns the config of [LogUtils]. This is equivalent to calling:
 * ```
 * LogUtils.getConfig()
 * ```
 */
inline val logConfig: LogUtils.Config get() = LogUtils.getConfig()

/**
 * Sends a [VERBOSE] log message. This is equivalent to calling:
 * ```
 * LogUtils.vTag(loggerTag, contents)
 * ```
 */
inline fun Logger.verbose(vararg contents: Any) = LogUtils.vTag(loggerTag, *contents)

/**
 * Sends a [DEBUG] log message. This is equivalent to calling:
 * ```
 * LogUtils.dTag(loggerTag, contents)
 * ```
 */
inline fun Logger.debug(vararg contents: Any) = LogUtils.dTag(loggerTag, contents)

/**
 * Sends a [INFO] log message. This is equivalent to calling:
 * ```
 * LogUtils.iTag(loggerTag, contents)
 * ```
 */
inline fun Logger.info(vararg contents: Any) = LogUtils.iTag(loggerTag, *contents)

/**
 * Sends a [WARN] log message. This is equivalent to calling:
 * ```
 * LogUtils.wTag(loggerTag, contents)
 * ```
 */
inline fun Logger.warn(vararg contents: Any) = LogUtils.wTag(loggerTag, *contents)

/**
 * Sends a [ERROR] log message. This is equivalent to calling:
 * ```
 * LogUtils.eTag(loggerTag, contents)
 * ```
 */
inline fun Logger.error(vararg contents: Any) = LogUtils.eTag(loggerTag, *contents)

/**
 * Sends a [ASSERT] log message. This is equivalent to calling:
 * ```
 * LogUtils.aTag(loggerTag, contents)
 * ```
 */
inline fun Logger.assert(vararg contents: Any) = LogUtils.aTag(loggerTag, *contents)

/**
 * Sends a json log message. This is equivalent to calling:
 * ```
 * LogUtils.json(loggerTag, content)
 * ```
 */
inline fun Logger.json(content: Any) = LogUtils.json(loggerTag, content)

/**
 * Sends a log message to file. This is equivalent to calling:
 * ```
 * LogUtils.file(loggerTag, content)
 * ```
 */
inline fun Logger.file(content: Any) = LogUtils.file(loggerTag, content)

/**
 * Sends a xml message. This is equivalent to calling:
 * ```
 * LogUtils.file(loggerTag, content)
 * ```
 */
inline fun Logger.xml(content: String) = LogUtils.xml(loggerTag, content)

/**
 * Sends a [VERBOSE] log message. This is equivalent to calling:
 * ```
 * LogUtils.vTag(contents)
 * ```
 */
inline fun logVerbose(vararg contents: Any) = LogUtils.v(*contents)

/**
 * Sends a [DEBUG] log message. This is equivalent to calling:
 * ```
 * LogUtils.dTag(contents)
 * ```
 */
inline fun logDebug(vararg contents: Any) = LogUtils.d(*contents)

/**
 * Sends a [INFO] log message. This is equivalent to calling:
 * ```
 * LogUtils.iTag(contents)
 * ```
 */
inline fun logInfo(vararg contents: Any) = LogUtils.i(*contents)

/**
 * Sends a [WARN] log message. This is equivalent to calling:
 * ```
 * LogUtils.wTag(contents)
 * ```
 */
inline fun logWarn(vararg contents: Any) = LogUtils.w(*contents)

/**
 * Sends a [ERROR] log message. This is equivalent to calling:
 * ```
 * LogUtils.eTag(contents)
 * ```
 */
inline fun logError(vararg contents: Any) = LogUtils.e(*contents)

/**
 * Sends a [ASSERT] log message. This is equivalent to calling:
 * ```
 * LogUtils.aTag(contents)
 * ```
 */
inline fun logAssert(vararg contents: Any) = LogUtils.a(*contents)

/**
 * Sends a json log message. This is equivalent to calling:
 * ```
 * LogUtils.json(content)
 * ```
 */
inline fun logJson(content: Any) = LogUtils.json(content)

/**
 * Sends a log message to file. This is equivalent to calling:
 * ```
 * LogUtils.file(content)
 * ```
 */
inline fun logFile(content: Any) = LogUtils.file(content)

/**
 * Sends a xml message. This is equivalent to calling:
 * ```
 * LogUtils.file(content)
 * ```
 */
inline fun logXml(content: String) = LogUtils.xml(content)

