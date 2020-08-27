@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.dylanc.utilktx

import android.net.Uri
import com.blankj.utilcode.util.UriUtils
import java.io.File

/**
 * @author Dylan Cai
 */

/**
 * Resource to uri.
 *
 * uriOf(res_type/res_name) -> uriOf(drawable/icon), uriOf(raw/icon)
 *
 * uriOf(resource_id) -> uriOf(R.drawable.icon).
 *
 * This is equivalent to calling:
 * ```
 * UriUtils.res2Uri(resPath)
 * ```
 */
inline fun uriOf(resPath: String): Uri = UriUtils.res2Uri(resPath)

/**
 * Converts the file to the uri. This is equivalent to calling:
 * ```
 * UriUtils.file2Uri(file)
 * ```
 */
inline fun File.toUri(): Uri = UriUtils.file2Uri(this)

/**
 * Converts the url to the file. This is equivalent to calling:
 * ```
 * UriUtils.uri2File(uri)
 * ```
 */
inline fun Uri.toFile(): File? = UriUtils.uri2File(this)

/**
 * Converts the url to the path. This is equivalent to calling:
 * ```
 * UriUtils.uri2File(uri).path
 * ```
 */
inline fun Uri.toPath(): String? = toFile()?.path

/**
 * Converts the url to the bytes. This is equivalent to calling:
 * ```
 * UriUtils.uri2Bytes(uri)
 * ```
 */
inline fun Uri.toBytes(): ByteArray? = UriUtils.uri2Bytes(this)
