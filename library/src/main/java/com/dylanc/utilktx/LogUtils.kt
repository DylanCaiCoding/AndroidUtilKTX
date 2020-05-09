@file:Suppress("NOTHING_TO_INLINE", "unused", "FunctionName")

package com.dylanc.utilktx

import com.blankj.utilcode.util.LogUtils

/**
 * @author Dylan Cai
 * @since 2019/11/7
 */
val logConfig: LogUtils.Config
  get() = LogUtils.getConfig()

interface Logger {
  val loggerTag: String
    get() = TAG
}

fun Logger(tag: String) = object : Logger {
  override val loggerTag: String
    get() = tag
}

val Any.TAG: String
  get() {
    val tag = javaClass.simpleName
    return if (tag.length <= 23) tag else tag.substring(0, 23)
  }

inline fun Logger.verbose(vararg contents: Any) = LogUtils.vTag(loggerTag, *contents)

inline fun Logger.debug(vararg contents: Any) = LogUtils.dTag(loggerTag, contents)

inline fun Logger.info(vararg contents: Any) = LogUtils.iTag(loggerTag, *contents)

inline fun Logger.warn(vararg contents: Any) = LogUtils.wTag(loggerTag, *contents)

inline fun Logger.error(vararg contents: Any) = LogUtils.eTag(loggerTag, *contents)

inline fun Logger.assert(vararg contents: Any) = LogUtils.aTag(loggerTag, *contents)

inline fun Logger.json(content: Any) = LogUtils.json(loggerTag, content)

inline fun Logger.file(content: Any) = LogUtils.file(loggerTag, content)

inline fun Logger.xml(content: String) = LogUtils.xml(loggerTag, content)

inline fun logVerbose(vararg contents: Any) = LogUtils.v(*contents)

inline fun logDebug(vararg contents: Any) = LogUtils.d(*contents)

inline fun logInfo(vararg contents: Any) = LogUtils.i(*contents)

inline fun logWarn(vararg contents: Any) = LogUtils.w(*contents)

inline fun logError(vararg contents: Any) = LogUtils.e(*contents)

inline fun logAssert(vararg contents: Any) = LogUtils.a(*contents)

inline fun logJson(content: Any) = LogUtils.json(content)

inline fun logFile(content: Any) = LogUtils.file(content)

inline fun logXml(content: String) = LogUtils.xml(content)

