package com.dylanc.utilktx

import com.blankj.utilcode.util.CloseUtils
import java.io.Closeable

/**
 * @author Dylan Cai
 * @since 2020/5/9
 */
fun closeIO(vararg closeable: Closeable) = CloseUtils.closeIO(*closeable)

fun closeIOQuietly(vararg closeable: Closeable) = CloseUtils.closeIOQuietly(*closeable)