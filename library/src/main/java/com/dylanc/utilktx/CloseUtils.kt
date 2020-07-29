@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import com.blankj.utilcode.util.CloseUtils
import java.io.Closeable

/**
 * @author Dylan Cai
 */

inline fun closeIO(vararg closeable: Closeable) = CloseUtils.closeIO(*closeable)

inline fun closeIOQuietly(vararg closeable: Closeable) = CloseUtils.closeIOQuietly(*closeable)