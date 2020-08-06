@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CloseUtils
import java.io.Closeable

/**
 * @author Dylan Cai
 */

/**
 * Close the io stream. This is equivalent to calling:
 * ```
 * CloseUtils.closeIO(closeable)
 * ```
 */
inline fun closeIO(vararg closeable: Closeable) = CloseUtils.closeIO(*closeable)

/**
 * Close the io stream quietly. This is equivalent to calling:
 * ```
 * CloseUtils.closeIOQuietly(closeable)
 * ```
 */
inline fun closeIOQuietly(vararg closeable: Closeable) = CloseUtils.closeIOQuietly(*closeable)