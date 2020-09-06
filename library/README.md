## Download

Gradle:
```groovy
implementation 'com.dylanc:utilktx:1.0.0-alpha'
```


## APIs

* ### Activity 相关 -> [ActivityUtils.kt][activity.kt]
```
Context.activity                         : 根据上下文获取 Activity
isActivityExists                         : 判断 Activity 是否存在
[Activity.]startActivity                 : 启动 Activity
[Activity.]startActivityForResult        : 启动 Activity 为返回结果
[Activity.]startActivities               : 启动多个 Activity
startHomeActivity                        : 回到桌面
activityList                             : 获取 Activity 栈链表
launchActivityName                       : 获取启动项 Activity
mainActivitiesNames                      : 获取主的 Activity 们
topActivity                              : 获取栈顶 Activity
Activity.isAlive/Context.isActivityAlive : 判断 Activity 是否存活
Activity.isExistsInStack                 : 判断 Activity 是否存在栈中
finishActivity/Avtivity.finish           : 结束 Activity
finishToActivity                         : 结束到指定 Activity
finishOtherActivities                    : 结束所有其他类型的 Activity
finishAllActivities                      : 结束所有 Activity
finishAllActivitiesExceptNewest          : 结束除最新之外的所有 Activity
```

* ### AdaptScreen 相关 -> [AdaptScreenUtils.kt][adaptScreen.kt]
```
Resources.adaptScreenWidth  : 适配宽度
Resources.adaptScreenHeight : 适配高度
Resources.closeAdaptScreen  : 关闭适配（pt 等同于 dp）
Float.pt                    : pt 转 px
Float.pxToPt                : px 转 pt
```

* ### App 相关 -> [AppUtils.kt][app.kt]
```
app                                      : 获取 Application 对象
registerAppStatusChangedListener         : 注册 App 前后台切换监听器
unregisterAppStatusChangedListener       : 注销 App 前后台切换监听器
installApp                               : 安装 App（支持 8.0）
uninstallApp                             : 卸载 App
isAppInstalled                           : 判断 App 是否安装
isAppRoot                                : 判断 App 是否有 root 权限
isAppDebug                               : 判断 App 是否是 Debug 版本
isAppSystem                              : 判断 App 是否是系统应用
isAppForeground                          : 判断 App 是否处于前台
isAppRunning                             : 判断 App 是否运行
launchApp                                : 打开 App
relaunchApp                              : 重启 App
launchAppDetailsSettings                 : 打开 App 具体设置
exitApp                                  : 关闭应用
appIcon, appIconOf                       : 获取 App 图标
appPackageName, appPackageNameOf         : 获取 App 包名
appName, appNameOf                       : 获取 App 名称
appPath, appPathOf                       : 获取 App 路径
appVersionName, appVersionNameOf         : 获取 App 版本号
appVersionCode, appVersionCodeOf         : 获取 App 版本码
appSignature, appSignatureOf             : 获取 App 签名
appSignatureSHA1, appSignatureSHA1Of     : 获取应用签名的的 SHA1 值
appSignatureSHA256, appSignatureSHA256Of : 获取应用签名的的 SHA256 值
appSignatureMD5, appSignatureMD5Of       : 获取应用签名的的 MD5 值
appInfo, appInfoOf                       : 获取 App 信息
appsInfo                                 : 获取所有已安装 App 信息
apkInfoOf                                : 获取 Apk 信息
```

* ### 数组相关 -> [ArrayUtils.kt][array.kt]
```
Array.lengthEquals  : 判断两数组长度是否相等
Array.reverse       : 逆序数组
Array.copy          : 拷贝数组
Array.subtract      : 截取数组
Array.indexOfFirst  : 查找第一个元素的索引
Array.indexOfLast   : 查找最后一个元素的索引
Array.contains      : 判断是否包含该元素
Array.sort          : 排序
```

* ### 栏相关 -> [BarUtils.kt][bar.kt]
```
statusBarHeight                            : 获取状态栏高度（px）
Activity/Window.isStatusBarVisible         : 判断/设置状态栏是否可见
Activity/Window.isStatusBarLightMode       : 判断/设置状态栏是否为浅色模式
View.addMarginTopEqualStatusBarHeight      : 为 view 增加 MarginTop 为状态栏高度
View.subtractMarginTopEqualStatusBarHeight : 为 view 减少 MarginTop 为状态栏高度
Activity/Window.statusBarColor             : 设置状态栏颜色
DrawerLayout.setStatusBarColor             : 为 DrawerLayout 设置状态栏颜色
Activity/Window.transparentStatusBar       : 透明状态栏
actionBarHeight                            : 获取 ActionBar 高度
isNotificationBarVisible                   : 设置通知栏是否可见
navBarHeight                               : 获取导航栏高度
isNavBarVisible                            : 判断/设置导航栏是否可见
Activity/Window.navBarColor                : 获取/设置导航栏颜色
isSupportNavBar                            : 判断是否支持导航栏
Activity/Window.isNavBarLightMode          : 判断/设置导航栏是否为浅色模式
```

* ### 亮度相关 -> [BrightnessUtils.kt][brightness.kt]
```
isAutoBrightnessEnabled : 判断/设置是否开启自动调节亮度
brightness              : 获取/设置屏幕亮度
Window.brightness       : 获取/设置窗口亮度
```

* ### Bus 相关 -> [BusUtils.kt][bus.kt]
```
registerBus     : 注册
unregisterBus   : 注销
postBus         : 发送
postStickyBus   : 发送粘性
removeStickyBus : 移除粘性
busInfo         : 查看插入的信息
```

* ### 磁盘缓存相关 -> [CacheDiskStaticUtils.kt][cacheDiskStatic.kt]
```
defaultCacheDiskUtils   : 设置默认磁盘缓存实例
cacheDiskUtilsOf        : 获取磁盘缓存实例
putDiskCache            : 缓存中写入数据
diskCacheBytesOf        : 缓存中读取字节数组
diskCacheStringOf       : 缓存中读取 String
diskCacheJSONObjectOf   : 缓存中读取 JSONObject
diskCacheJSONArrayOf    : 缓存中读取 JSONArray
diskCacheBitmapOf       : 缓存中读取 Bitmap
diskCacheDrawableOf     : 缓存中读取 Drawable
diskCacheParcelableOf   : 缓存中读取 Parcelable
diskCacheSerializableOf : 缓存中读取 Serializable
diskCacheSize           : 获取缓存大小
diskCacheCount          : 获取缓存个数
removeDiskCache         : 根据键值移除缓存
clearDiskCache          : 清除所有缓存
```

* ### 二级缓存相关 -> [CacheDoubleStaticUtils.kt][cacheDoubleStatic.kt]
```
defaultCacheDoubleUtils   : 设置默认二级缓存实例
cacheDoubleUtilsOf        : 获取二级缓存实例
putDoubleCache            : 缓存中写入数据
doubleCacheBytesOf        : 缓存中读取字节数组
doubleCacheStringOf       : 缓存中读取 String
doubleCacheJSONObjectOf   : 缓存中读取 JSONObject
doubleCacheJSONArrayOf    : 缓存中读取 JSONArray
doubleCacheBitmapOf       : 缓存中读取 Bitmap
doubleCacheDrawableOf     : 缓存中读取 Drawable
doubleCacheParcelableOf   : 缓存中读取 Parcelable
doubleCacheSerializableOf : 缓存中读取 Serializable
doubleCacheSize           : 获取磁盘缓存大小
removeDoubleCache         : 根据键值移除缓存
clearDoubleCache          : 清除所有缓存
```

* ### 内存缓存相关 -> [CacheMemoryStaticUtils.kt][cacheMemoryStatic.kt]
```
defaultCacheMemoryUtils : 设置默认内存缓存实例
cacheMemoryUtilsOf      : 获取内存缓存实例
putMemoryCache          : 缓存中写入数据
memoryCacheValueOf      : 缓存中读取字节数组
memoryCacheCount        : 获取缓存个数
removeMemoryCache       : 根据键值移除缓存
clearMemoryCache        : 清除所有缓存
```

* ### 清除相关 -> [CleanUtils.kt][clean.kt]
```
cleanInternalCache   : 清除内部缓存
cleanInternalFiles   : 清除内部文件
cleanInternalDbs     : 清除内部数据库
cleanInternalDb      : 根据名称清除数据库
cleanInternalSp      : 清除内部 SP
cleanExternalCache   : 清除外部缓存
cleanDir             : 清除目录下的文件
```

* ### 点击相关 -> [ClickUtils.kt][click.kt] -> [Demo][click.demo]
```
applyPressedViewScale               : 应用点击后对视图缩放
applyPressedViewAlpha               : 应用点击后对视图改变透明度
applyPressedBgAlpha                 : 应用点击后对背景改变透明度
applyPressedBgDark                  : 应用点击后对背景加深
applySingleDebouncing               : 对单视图应用防抖点击
applyGlobalDebouncing               : 对所有设置 GlobalDebouncing 的视图应用防抖点击
expandClickArea                     : 扩大点击区域
back2HomeFriendly                   : 友好地返回桌面
ClickUtils#OnDebouncingClickListener: 防抖点击监听器
ClickUtils#OnMultiClickListener     : 连续点击监听器
```

* ### 克隆相关 -> [CloneUtils.kt][clone.kt]
```
Any.deepClone : 深度克隆
```

* ### 关闭相关 -> [CloseUtils.kt][close.kt]
```
closeIO        : 关闭 IO
closeIOQuietly : 安静关闭 IO
```

* ### 集合相关 -> [CollectionUtils.kt][collection.kt]
```
Collection.exists        : 判断集合是否存在符合条件的元素
Collection.addIgnoreNull : 新增元素如果不为空
Collection.addAll        : 新增多个元素
Collection.retainAll     : 保留元素
Collection.removeAll     : 删除下来
```

* ### 颜色相关 -> [ColorUtils.kt][color.kt]
```
colorOf                   : 获取颜色
Int.convertAlpha          : 设置颜色透明度值
Int.convertAlpha          : 设置颜色红色值
Int.convertRed            : 设置颜色绿色值
Int.convertGreen          : 设置颜色蓝色值
Int.toRgbColorString      : 颜色值转 RGB 串
Int.toArgbColorString     : 颜色值转 ARGB 串
randomColor/randomColorOf : 获取随机色
```

* ### 转换相关 -> [ConvertUtils.kt][convert.kt]
```
Int.toHexString, String.toHexInt                       : int 与 hexString 互转
ByteArray.toBitsString, String.toBytes                 : bytes 与 bits 互转
ByteArray.toChars, CharArray.toBytes                   : bytes 与 chars 互转
ByteArray.toHexString, String.toHexBytes               : bytes 与 hexString 互转
ByteArray.toString, String.toBytes                     : bytes 与 string 互转
ByteArray.toJSONObject, JSONObject.toBytes             : bytes 与 JSONObject 互转
ByteArray.toJSONArray, JSONArray.toBytes               : bytes 与 JSONArray 互转
ByteArray.toParcelable, Parcelable.toBytes             : bytes 与 Parcelable 互转
ByteArray.toSerializable, Serializable.toBytes         : bytes 与 Object 互转
ByteArray.toBitmap, Bitmap.toBytes                     : bytes 与 Bitmap 互转
Long.memorySizeToByte, Long.byteToMemorySize           : 以 unit 为单位的内存大小与字节数互转
Long.byteToFitMemorySize                               : 字节数转合适内存大小
Long.timeSpanToMillis, Long.millisToTimeSpan           : 以 unit 为单位的时间长度与毫秒时间戳互转
Long.millisToFitTimeSpan                               : 毫秒时间戳转合适时间长度
InputStream.toOutputStream, OutputStream.toInputStream : inputStream 与 outputStream 互转
InputStream.toBytes, ByteArray.toInputStream           : inputStream 与 bytes 互转
OutputStream.toBytes, ByteArray.toOutputStream         : outputStream 与 bytes 互转
InputStream.toString, String.toInputStream             : inputStream 与 string 按编码互转
OutputStream.toString, String.toOutputStream   		   : outputStream 与 string 按编码互转
InputStream.toLines                                    : inputStream 转 文本行
Drawable.toBitmap, Bitmap.toDrawable                   : drawable 与 bitmap 互转
Drawable.toBytes, ByteArray.toDrawable                 : drawable 与 bytes 互转
View.toBitmap                                          : view 转 Bitmap
```

* ### 崩溃相关 -> [CrashUtils.kt][crash.kt]
```
initCrashDir : 初始化
```

* ### 设备相关 -> [DeviceUtils.kt][device.kt] 
```
isDeviceRooted   : 判断设备是否 rooted
isAdbEnabled     : 判断设备 ADB 是否可用
sdkVersionName   : 获取设备系统版本号
sdkVersionCode   : 获取设备系统版本码
deviceAndroidId  : 获取设备 AndroidID
macAddress       : 获取设备 MAC 地址
manufacturer     : 获取设备厂商
deviceModel      : 获取设备型号
deviceABIs       : 获取设备 ABIs
isTablet         : 判断是否是平板
isEmulator       : 判断是否是模拟器
uniqueDeviceId   : 获取唯一设备 ID
isSameDevice     : 判断是否同一设备
```

* ### 编码解码相关 -> [EncodeUtils.kt][encode.kt]
```
String.urlEncode              : URL 编码
String.urlDecode              : URL 解码
String/ByteArray.base64Encode : Base64 编码
String/ByteArray.base64Decode : Base64 解码
String.htmlEncode             : Html 编码
String.htmlDecode             : Html 解码
String.binaryEncode           : 二进制编码
String.binaryDecode           : 二进制解码
```

* ### 加密解密相关 -> [EncryptUtils.kt][encrypt.kt] 
```
ByteArray/String.encryptMD2                               : MD2 加密
ByteArray/String.encryptMD5, ByteArray.encryptMD5ToString : MD5 加密
File.encryptMD5,encryptMD5File                            : MD5 加密文件
ByteArray/String.encryptSHA1                              : SHA1 加密
ByteArray/String.encryptSHA224                            : SHA224 加密
ByteArray/String.encryptSHA256                            : SHA256 加密
ByteArray/String.encryptSHA384                            : SHA384 加密
ByteArray/String.encryptSHA512                            : SHA512 加密
ByteArray/String.encryptHmacMD5                           : HmacMD5 加密
ByteArray/String.encryptHmacSHA1                          : HmacSHA1 加密
ByteArray/String.encryptHmacSHA224                        : HmacSHA224 加密
ByteArray/String.encryptHmacSHA256                        : HmacSHA256 加密
ByteArray/String.encryptHmacSHA384                        : HmacSHA384 加密
ByteArray/String.encryptHmacSHA512                        : HmacSHA512 加密
ByteArray.encryptDES                                      : DES 加密
ByteArray.decryptDES                                      : DES 解密
ByteArray.encrypt3DES                                     : 3DES 加密
ByteArray.decrypt3DES                                     : 3DES 解密
ByteArray.encryptAES                                      : AES 加密
ByteArray.decryptAES                                      : AES 解密
ByteArray.encryptRSA                                      : RSA 加密
ByteArray.decryptRSA                                      : RSA 解密
ByteArray.rc4                                             : rc4 加解密
```

* ### 文件相关 -> [FileIOUtils.kt][fileIo.kt] 
```
InputStream.writeToFile                             : 将输入流写入文件
ByteArray.writeToFileByStream                       : 将字节数组写入文件
ByteArray.writeToFileByChannel                      : 将字节数组写入文件
ByteArray.writeToFileByMap                          : 将字节数组写入文件
String.writeToFile                                  : 将字符串写入文件
File.readToLines, readFileToLines                   : 读取文件到字符串链表中
File.readToString, readFileToString                 : 读取文件到字符串中
File.readToBytesByStream, readFileToBytesByStream   : 读取文件到字节数组中
File.readToBytesByChannel, readFileToBytesByChannel : 读取文件到字节数组中
File.readToBytesByMap, readFileToBytesByMap         : 读取文件到字节数组中
fileIOBufferSize                                    : 设置缓冲区尺寸
```

* ### 文件相关 -> [FileUtils.kt][file.kt] -> [Test][file.test]
```
fileOf                                          : 根据文件路径获取文件
File.isExists, isFileExists                     : 判断文件是否存在
File.rename, renameFile                         : 重命名文件
File.isDir, isDir                               : 判断是否是目录
File.isFile, isFile                             : 判断是否是文件
File.createDir, createDir                       : 判断目录是否存在，不存在则判断是否创建成功
File.createFile, createFile                     : 判断文件是否存在，不存在则判断是否创建成功
File.copy, copyFile                             : 复制文件或目录
File.move, moveFile                             : 移动文件或目录
File.delete, deleteFile                         : 删除文件或目录
File.deleteAllInDir, deleteAllInDir             : 删除目录下所有内容
File.deleteFilesInDir, deleteFilesInDir         : 删除目录下所有文件
File.filesInDirOf, filesInDirOf                 : 获取目录下所有文件
File.lastModifiedTime, fileLastModifiedTimeOf   : 获取文件最后修改的毫秒时间戳
File.charsetSimple, fileCharsetSimpleOf         : 简单获取文件编码格式
File.lines, fileLineOf                          : 获取文件行数
File.size, fileSizeOf                           : 获取文件或目录大小
File.length, fileLengthOf                       : 获取文件或目录长度
File.MD5, fileMD5Of                             : 获取文件的 MD5 校验码
File.dirName, dirNameOf                         : 根据全路径获取最长目录
File.fileName, fileNameOf                       : 根据全路径获取文件名
File.fileNameNoExtension, fileNameNoExtensionOf : 根据全路径获取文件名不带拓展名
File.fileExtension, fileExtensionOf             : 根据全路径获取文件拓展名
File.notifySystemToScan, notifySystemToScanFile : 通知系统扫描文件
fileSystemTotalSizeOf                           : 获取文件系统总大小
fileSystemAvailableSizeOf                       : 获取文件系统可用大小
```

* ### 闪光灯相关 -> [FlashlightUtils.kt][flashlight.kt] 
```
isSupportFlashlight : 判断设备是否支持闪光灯
isFlashlightOn      : 判断/设置闪光灯是否打开
destroyFlashlight   : 销毁
```

* ### Fragment 相关 -> [FragmentUtils.kt][fragment.kt] 
```
FragmentManager.add                        : 新增 fragment
FragmentManager/Fragment.show              : 显示 fragment
FragmentManager/Fragment.hide              : 隐藏 fragment
Fragment.show, showFragment                : 先显示后隐藏 fragment
Fragment.replace                           : 替换 fragment
FragmentManager.pop                        : 出栈 fragment
FragmentManager.popTo                      : 出栈到指定 fragment
FragmentManager.popAll                     : 出栈所有 fragment
Fragment.remove                            : 移除 fragment
Fragment.removeTo                          : 移除到指定 fragment
FragmentManager.removeAll                  : 移除所有 fragment
FragmentManager.topFragment                : 获取顶部 fragment
FragmentManager.topFragmentInStack         : 获取栈中顶部 fragment
FragmentManager.topShowFragment            : 获取顶部可见 fragment
FragmentManager.topShowFragmentInStack     : 获取栈中顶部可见 fragment
FragmentManager.fragmentsInStack           : 获取同级别栈中的 fragment
FragmentManager.allFragments               : 获取所有 fragment
FragmentManager.allFragmentsInStack        : 获取栈中所有 fragment
FragmentManager.findFragment               : 查找 fragment
FragmentManager/Fragment.dispatchBackPress : 处理 fragment 回退键
Fragment.backgroundColor                   : 设置背景色
Fragment.backgroundResource                : 设置背景资源
Fragment.backgroundDrawable                : 设置背景
```

* ### Gson 相关 -> [GsonUtils.kt][gson.kt] 
```
gsonDelegate      : 获取/设置默认的 Gson 代理对象
putGson           : 设置 Gson 对象
gsonOf            : 获取 Gson 对象
Any.toJson        : 对象转 Json 串
String.toInstance : Json 串转实例对象
String.toList     : Json 串转列表对象
String.toSet      : Json 串转集合对象
String.toMap      : Json 串转字典对象
String.toArray    : Json 串转数组对象
listTypeOf        : 获取链表类型
setTypeOf         : 获取集合类型
mapTypeOf         : 获取字典类型
arrayTypeOf       : 获取数组类型
typeOf            : 获取类型
```

* ### 图片相关 -> [ImageUtils.kt][image.kt] -> [Demo][image.demo]
```
bitmapOf                                : 获取 bitmap
Bitmap.createScaledBitmap               : 缩放图片
Bitmap.createClippedBitmap              : 裁剪图片
Bitmap.createSkewedBitmap               : 倾斜图片
Bitmap.createRotatedBitmap              : 旋转图片
File.imageRotateDegree                  : 获取图片旋转角度
Bitmap.createRoundBitmap                : 转为圆形图片
Bitmap.createRoundCornerBitmap          : 转为圆角图片
Bitmap.createCornerBorderBitmap         : 添加圆角边框
Bitmap.createCircleBorderBitmap         : 添加圆形边框
Bitmap.createReflectionBitmap           : 添加倒影
Bitmap.createTextWatermarkBitmap        : 添加文字水印
Bitmap.createImageWatermarkBitmap       : 添加图片水印
Bitmap.createAlphaBitmap                : 转为 alpha 位图
Bitmap.createGrayBitmap                 : 转为灰度图片
Bitmap.createFastBlurBitmap             : 快速模糊
Bitmap.createRenderScriptBlurBitmap     : renderScript 模糊图片
Bitmap.createStackBlurBitmap            : stack 模糊图片
Bitmap.save                             : 保存图片
File.isImage, isImage                   : 根据文件名判断文件是否为图片
File.imageType, imageTypeOf             : 获取图片类型
Bitmap.createCompressBitmapByScale      : 按缩放压缩
Bitmap.createCompressBitmapByQuality    : 按质量压缩
Bitmap.createCompressBitmapBySampleSize : 按采样大小压缩
File.imageSize, imageSizeOf             : 获取图片尺寸
```

* ### 意图相关 -> [IntentUtils.kt][intent.kt]
```
Intent.isAvailable               : 判断意图是否可用
installAppIntentOf               : 获取安装 App（支持 6.0）的意图
uninstallAppIntentOf             : 获取卸载 App 的意图
launchAppIntentOf                : 获取打开 App 的意图
launchAppDetailsSettingsIntentOf : 获取 App 具体设置的意图
shareTextIntentOf                : 获取分享文本的意图
shareImageIntentOf               : 获取分享图片的意图
componentIntentOf                : 获取其他应用组件的意图
shutdownIntentOf                 : 获取关机的意图
dialIntentOf                     : 获取拨号的意图
callIntentOf                     : 获取通话的意图
sendSmsIntentOf                  : 获取发短信的意图
captureIntentOf                  : 获取拍照的意图
```

* ### 键盘相关 -> [KeyboardUtils.kt][keyboard.kt] 
```
Activity/View.showKeyboard                        : 显示软键盘
Activity/View.hideKeyboard                        : 隐藏软键盘
toggleKeyboard                                    : 切换键盘显示与否状态
Activity.isKeyboardVisible                        : 判断软键盘是否可见
Activity/Window.registerKeyboardChangedListener   : 注册软键盘改变监听器
Activity/Window.unregisterKeyboardChangedListener : 注销软键盘改变监听器
Activity/Window.fixAndroidBug5497                 : 修复安卓 5497 BUG
Activity/Window.fixKeyboardLeaks                  : 修复软键盘内存泄漏
```

* ### 语言相关 -> [LanguageUtils.kt][language.kt] 
```
applySystemLanguage, applySystemLanguageTo : 应用系统语言
applyLanguage, applyLanguageTo             : 应用语言
isAppliedSystemLanguage                    : 判断是否使用系统语言
isAppliedLanguage                          : 判断是否使用某语言
currentLocale                              : 获取当前语言
```

* ### 日志相关 -> [LogUtils.kt][log.kt]
```
logConfig                 : 获取 log 配置
Config.setLogSwitch       : 设置 log 总开关
Config.setConsoleSwitch   : 设置 log 控制台开关
Config.setGlobalTag       : 设置 log 全局 tag
Config.setLogHeadSwitch   : 设置 log 头部信息开关
Config.setLog2FileSwitch  : 设置 log 文件开关
Config.setDir             : 设置 log 文件存储目录
Config.setFilePrefix      : 设置 log 文件前缀
Config.setBorderSwitch    : 设置 log 边框开关
Config.setSingleTagSwitch : 设置 log 单一 tag 开关（为美化 AS 3.1 的 Logcat）
Config.setConsoleFilter   : 设置 log 控制台过滤器
Config.setFileFilter      : 设置 log 文件过滤器
Config.setStackDeep       : 设置 log 栈深度
Config.setStackOffset     : 设置 log 栈偏移
Config.setSaveDays        : 设置 log 可保留天数
Config.addFormatter       : 新增 log 格式化器
logVerbose                : tag 为类名的 Verbose 日志
Logger.logVerbose         : 自定义 tag 的 Verbose 日志
logDebug                  : tag 为类名的 Debug 日志
Logger.logDebug           : 自定义 tag 的 Debug 日志
logInfo                   : tag 为类名的 Info 日志
Logger.logInfo            : 自定义 tag 的 Info 日志
logWarn                   : tag 为类名的 Warn 日志
Logger.logWarn            : 自定义 tag 的 Warn 日志
logError                  : tag 为类名的 Error 日志
Logger.logError           : 自定义 tag 的 Error 日志
logAssert                 : tag 为类名的 Assert 日志
Logger.logAssert          : 自定义 tag 的 Assert 日志
logFile                   : log 到文件
Logger.logFile            : log 自定义 tag 的内容到文件
logJson                   : json 字符串日志
Logger.logJson            : 自定义 tag 的 json 字符串日志
logXml                    : xml 字符串日志
Logger.logXml             : 自定义 tag 的 xml 字符串日志
```

* ### Map 相关 -> [MapUtils.kt][map.kt] 
```
Map.transform : 对 Map 做转变
```

* ### MetaData 相关 -> [MetaDataUtils.kt][metaData.kt] 
```
appMetaDataOf                                    : 获取 application 的 meta-data 值
Activity.metaDataOf, activityMetaDataOf          : 获取 activity 的 meta-data 值
Service.metaDataOf, serviceMetaDataOf            : 获取 service 的 meta-data 值
BroadcastReceiver.metaDataOf, receiverMetaDataOf : 获取 receiver 的 meta-data 值
```

* ### 网络相关 -> [NetworkUtils.kt][network.kt] 
```
openWirelessSettings                        : 打开网络设置界面
isNetworkConnected                          : 判断网络是否连接
isNetworkAvailable                          : 判断网络是否可用
isNetworkAvailableByPing                    : 用 ping 判断网络是否可用
isNetworkAvailableByDns                     : 用 DNS 判断网络是否可用
isMobileDataEnabled                         : 判断移动数据是否打开
isMobileDataNetwork                         : 判断网络是否是移动数据
is4G                                        : 判断网络是否是 4G
isWifiEnabled                               : 判断 wifi 是否打开/打开或关闭 wifi
isWifiConnected                             : 判断 wifi 是否连接状态
isWifiAvailable                             : 判断 wifi 数据是否可用
networkOperatorName                         : 获取移动网络运营商名称
networkType                                 : 获取当前网络类型
ipAddressOf                                 : 获取 IP 地址
domainAddressOf                             : 获取域名 IP 地址
ipAddressByWifi                             : 根据 WiFi 获取网络 IP 地址
gatewayByWifi                               : 根据 WiFi 获取网关 IP 地址
netMaskByWifi                               : 根据 WiFi 获取子网掩码 IP 地址
serverAddressByWifi                         : 根据 WiFi 获取服务端 IP 地址
registerNetworkStatusChangedListener        : 注册网络状态改变监听器
unregisterNetworkStatusChangedListener      : 注销网络状态改变监听器
OnNetworkStatusChangedListener.isRegistered : 判断网络状态改变监听器是否注册
```

* ### 通知相关 -> [NotificationUtils.kt][notification.kt] 
```
areNotificationsEnabled  : 判断通知是否可用
notify                   : 发送通知
cancelNotification       : 取消通知
cancelAllNotification    : 取消所有通知
```

* ### 数字相关 -> [NumberUtils.kt][number.kt] 
```
Float/Double.format  : 格式化
```

* ### 对象相关 -> [ObjectUtils.kt][object.kt] 
```
Any?.toNonNull  : 获取非空或默认对象
```

* ### 路径相关 -> [PathUtils.kt][path.kt] 
```
pathOf                       : 连接路径
rootPath                     : 获取根路径
dataPath                     : 获取数据路径
downloadCachePath            : 获取下载缓存路径
internalAppDataPath          : 获取内存应用数据路径
internalAppCodeCacheDir      : 获取内存应用代码缓存路径
internalAppCachePath         : 获取内存应用缓存路径
internalAppDbsPath           : 获取内存应用数据库路径
internalAppDbPathOf          : 获取内存应用数据库路径
internalAppFilesPath         : 获取内存应用文件路径
internalAppSpPath            : 获取内存应用 SP 路径
internalAppNoBackupFilesPath : 获取内存应用未备份文件路径
externalStoragePath          : 获取外存路径
externalMusicPath            : 获取外存音乐路径
externalPodcastsPath         : 获取外存播客路径
externalRingtonesPath        : 获取外存铃声路径
externalAlarmsPath           : 获取外存闹铃路径
externalNotificationsPath    : 获取外存通知路径
externalPicturesPath         : 获取外存图片路径
externalMoviesPath           : 获取外存影片路径
externalDownloadsPath        : 获取外存下载路径
externalDcimPath             : 获取外存数码相机图片路径
externalDocumentsPath        : 获取外存文档路径
externalAppDataPath          : 获取外存应用数据路径
externalAppCachePath         : 获取外存应用缓存路径
externalAppFilesPath         : 获取外存应用文件路径
externalAppMusicPath         : 获取外存应用音乐路径
externalAppPodcastsPath      : 获取外存应用播客路径
externalAppRingtonesPath     : 获取外存应用铃声路径
externalAppAlarmsPath        : 获取外存应用闹铃路径
externalAppNotificationsPath : 获取外存应用通知路径
externalAppPicturesPath      : 获取外存应用图片路径
externalAppMoviesPath        : 获取外存应用影片路径
externalAppDownloadPath      : 获取外存应用下载路径
externalAppDcimPath          : 获取外存应用数码相机图片路径
externalAppDocumentsPath     : 获取外存应用文档路径
externalAppObbPath           : 获取外存应用 OBB 路径
rootPathForExternalFirst     : 优先获取外部根路径
appDataPathForExternalFirst  : 优先获取外部数据路径
filesPathForExternalFirst    : 优先获取外部文件路径
cachePathForExternalFirst    : 优先获取外部缓存路径
```

* ### 权限相关 -> [PermissionUtils.kt][permission.kt] 
```
permissions                      : 获取应用权限
isGrantedPermissions             : 判断权限是否被授予
isGrantedWriteSettingsPermission : 判断修改系统权限是否被授予
requestWriteSettingsPermission   : 申请修改系统权限
isGrantedDrawOverlaysPermission  : 判断悬浮窗权限是否被授予
requestDrawOverlaysPermission    : 申请悬浮窗权限
launchAppDetailsSettings         : 打开应用具体设置
requestPermissions               : 设置请求权限
```

* ### 手机相关 -> [PhoneUtils.kt][phone.kt] 
```
isPhone          : 判断设备是否是手机
deviceId         : 获取设备码
serialNumber     : 获取序列号
phoneIMEI        : 获取 IMEI 码
phoneMEID        : 获取 MEID 码
getIMSI          : 获取 IMSI 码
getPhoneType     : 获取移动终端类型
isSimCardReady   : 判断 sim 卡是否准备好
simOperatorName  : 获取 Sim 卡运营商名称
simOperatorByMnc : 获取 Sim 卡运营商名称
dial             : 跳至拨号界面
call             : 拨打 phoneNumber
sendSms          : 跳至发送短信界面
```

* ### 进程相关 -> [ProcessUtils.kt][process.kt] 
```
foregroundProcessName      : 获取前台线程包名
killAllBackgroundProcesses : 杀死所有的后台服务进程
killBackgroundProcesses    : 杀死后台服务进程
isMainProcess              : 判断是否运行在主进程
currentProcessName         : 获取当前进程名称
```

* ### 反射相关 -> [ReflectUtils.kt][reflect.kt] 
```
reflect    : 设置要反射的类
```

* ### 正则相关 -> [RegexUtils.kt][regex.kt] 
```
String.isMobileSimple      : 简单验证手机号
String.isMobileExact       : 精确验证手机号
String.isTelephone         : 验证电话号码
String.isIDCard15          : 验证身份证号码 15 位
String.isIDCard18          : 简单验证身份证号码 18 位
String.isIDCard18Exact     : 精确验证身份证号码 18 位
String.isEmail             : 验证邮箱
String.isURL               : 验证 URL
String.isZh                : 验证汉字
String.isUsername          : 验证用户名
String.isDate              : 验证 yyyy-MM-dd 格式的日期校验，已考虑平闰年
String.isIP                : 验证 IP 地址
String.isMatch             : 判断是否匹配正则
String.matches             : 获取正则匹配的部分
String.split               : 获取正则匹配分组
String.replaceFirst        : 替换正则匹配的第一部分
String.replaceAll          : 替换所有正则匹配的部分
REGEX_DOUBLE_BYTE_CHAR     : 双字节
REGEX_BLANK_LINE           : 空行
REGEX_QQ_NUM               : QQ 号
REGEX_CHINA_POSTAL_CODE    : 邮编
REGEX_INTEGER              : 整数
REGEX_POSITIVE_INTEGER     : 正整数
REGEX_NEGATIVE_INTEGER     : 负整数
REGEX_NOT_NEGATIVE_INTEGER : 非负整数
REGEX_NOT_POSITIVE_INTEGER : 非正整数
REGEX_FLOAT                : 浮点数
REGEX_POSITIVE_FLOAT       : 正浮点数
REGEX_NEGATIVE_FLOAT       : 负浮点数
REGEX_NOT_NEGATIVE_FLOAT   : 非负浮点数
REGEX_NOT_POSITIVE_FLOAT   : 非正浮点数
```

* ### 资源相关 -> [ResourceUtils.kt][resource.kt] 
```
drawableOf         : 获取 Drawable
idOf               : 根据名字获取 ID
stringIdOf         : 根据名字获取 string ID
colorIdOf          : 根据名字获取 color ID
dimenIdOf          : 根据名字获取 dimen ID
drawableIdOf       : 根据名字获取 dimen ID
mipmapIdOf         : 根据名字获取 mipmap ID
layoutIdOf         : 根据名字获取 layout ID
styleIdOf          : 根据名字获取 style ID
animIdOf           : 根据名字获取 anim ID
menuIdOf           : 根据名字获取 menu ID
copyFileFromAssets : 从 assets 中拷贝文件
readAssetsToString : 从 assets 中读取字符串
readAssetsToLines  : 从 assets 中按行读取字符串
copyFileFromRaw    : 从 raw 中拷贝文件
readRawToString    : 从 raw 中读取字符串
readRawToLines     : 从 raw 中按行读取字符串
```

* ### Rom 相关 -> [RomUtils.kt][rom.kt] 
```
isHuaweiRom    : 是否华为
isVivoRom      : 是否 VIVO
isXiaomiRom    : 是否小米
isOppoRom      : 是否 OPPO
isLeecoRom     : 是否乐视
is360Rom       : 是否 360
isZteRom       : 是否中兴
isOneplusRom   : 是否一加
isNubiaRom     : 是否努比亚
isCoolpadRom   : 是否酷派
isLgRom        : 是否 LG
isGoogleRom    : 是否谷歌
isSamsungRom   : 是否三星
isMeizuRom     : 是否魅族
isLenovoRom    : 是否联想
isSmartisanRom : 是否锤子
isHtcRom       : 是否 HTC
isSonyRom      : 是否索尼
isGioneeRom    : 是否金立
isMotorolaRom  : 是否摩托罗拉
romInfo        : 获取 ROM 信息
```

* ### 屏幕相关 -> [ScreenUtils.kt][screen.kt] 
```
screenWidth                  : 获取屏幕的宽度（单位：px）
screenHeight                 : 获取屏幕的高度（单位：px）
appScreenWidth               : 获取应用屏幕的宽度（单位：px）
appScreenHeight              : 获取应用屏幕的高度（单位：px）
screenDensity                : 获取屏幕密度
screenDensityDpi             : 获取屏幕密度 DPI
Activity.isFullScreen        : 判断/设置屏幕为全屏
Activity.toggleFullScreen    : 切换屏幕为全屏与否状态
Activity.setLandscape        : 设置屏幕为横屏
Activity.setPortrait         : 设置屏幕为竖屏
isLandscape                  : 判断是否横屏
isPortrait                   : 判断是否竖屏
Activity.screenRotation      : 获取屏幕旋转角度
Activity.screenShot          : 截屏
Activity.isScreenLock        : 判断是否锁屏
Activity.screenSleepDuration : 获取/设置进入休眠时长
```

* ### SD 卡相关 -> [SDCardUtils.kt][sdcard.kt] 
```
isSDCardEnable          : 根据 Environment 判断 SD 卡是否可用
sdCardPath              : 根据 Environment 获取 SD 卡路径
sdCardInfo              : 获取 SD 卡信息
mountedSDCardPath       : 获取已挂载的 SD 卡路径
externalTotalSize       : 获取外置 SD 卡总大小
externalAvailableSize   : 获取外置 SD 卡可用大小
internalTotalSize       : 获取内置 SD 卡总大小
internalAvailableSize   : 获取内置 SD 卡可用大小
```

* ### 服务相关 -> [ServiceUtils.kt][service.kt]
```
allRunningServiceNames : 获取所有运行的服务
startService           : 启动服务
stopService            : 停止服务
bindService            : 绑定服务
unbindService          : 解绑服务
isServiceRunning       : 判断服务是否运行
```

* ### 阴影相关 -> [ShadowUtils.kt][shadow.kt] 
```
View.setShadow : 应用阴影
```

* ### Shell 相关 -> [ShellUtils.kt][shell.kt]
```
execCmd[Async]: 执行命令
```

* ### 尺寸相关 -> [SizeUtils.kt][size.kt]
```
Float/Int.dp, Float/Int.dpToPx : dp 与 px 转换
Float/Int.sp, Float/Int.spToPx : sp 与 px 转换
View.measure                   : 测量视图尺寸
View.measureWidth              : 获取测量视图宽度
View.measureHeight             : 获取测量视图高度
```

* ### Snackbar 相关 -> [SnackbarUtils.kt][snackbar.kt]
```
[Activity.]showSnackbar         : 显示 snackbar
[Activity.]showSuccessSnackbar  : 显示预设成功的 snackbar
[Activity.]showWarningSnackbar  : 显示预设警告的 snackbar
[Activity.]showErrorSnackbar    : 显示预设错误的 snackbar
dismissSnackbar                 : 消失 snackbar
snackbarView                    : 获取 snackbar 视图
addSnackbarView                 : 添加 snackbar 视图
```

* ### SpannableString 相关 -> [SpanUtils.kt][span.kt] 
```
TextView.setText                : 设置 Spannable 字符串
SpannableStringBuilder.text     : 插入文字
SpannableStringBuilder.textLine : 插入一行文字
SpannableStringBuilder.lineFeed : 换行
SpannableStringBuilder.image    : 插入图片
SpannableStringBuilder.space    : 插入空格
```

* ### SP 相关 -> [SPStaticUtils.kt][spStatic.kt]
```
defaultSpUtils  : 设置默认 SP 实例
putSpValue      : SP 中写入数据
spValueOf       : SP 中读取数据
allSpValues     : SP 中获取所有键值对
containSpValue  : SP 中是否存在该 key
removeSpValue   : SP 中移除该 key
clearSp         : SP 中清除所有数据
```

* ### 字符串相关 -> [StringUtils.kt][string.kt] 
```
String?.toNotNull       : null 转为长度为 0 的字符串
String.toUpperCaseFirst : 首字母大写
String.toLowerCaseFirst : 首字母小写
String.reverse          : 反转字符串
String.toDBC            : 转化为半角字符
String.toSBC            : 转化为全角字符
stringOf                : 获取字符资源
stringArrayOf           : 获取字符数组资源
```

* ### 线程相关 -> [ThreadUtils.kt][thread.kt]
```
isMainThread                   : 判断当前是否主线程
mainHandler                    : 获取主线程 Handler
runOnUiThread                  : 运行在主线程
runOnUiThreadDelayed           : 延时运行在主线程
fixedThreadPoolOf              : 获取固定线程池
singleThreadPoolOf             : 获取单线程池
cacheThreadPoolOf              : 获取缓冲线程池
ioThreadPoolOf                 : 获取 IO 线程池
cpuThreadPoolOf                : 获取 CPU 线程池
executeByFixedThread           : 在固定线程池执行任务
executeByFixedThreadWithDelay  : 在固定线程池延时执行任务
executeByFixedThreadAtFixRate  : 在固定线程池按固定频率执行任务
executeBySingleThread          : 在单线程池执行任务
executeBySingleThreadWithDelay : 在单线程池延时执行任务
executeBySingleThreadAtFixRate : 在单线程池按固定频率执行任务
executeByCachedThread          : 在缓冲线程池执行任务
executeByCachedThreadWithDelay : 在缓冲线程池延时执行任务
executeByCachedThreadAtFixRate : 在缓冲线程池按固定频率执行任务
executeByIoThread              : 在 IO 线程池执行任务
executeByIoThreadWithDelay     : 在 IO 线程池延时执行任务
executeByIoThreadAtFixRate     : 在 IO 线程池按固定频率执行任务
executeByCpuThread             : 在 CPU 线程池执行任务
executeByCpuThreadWithDelay    : 在 CPU 线程池延时执行任务
executeByCpuThreadAtFixRate    : 在 CPU 线程池按固定频率执行任务
executeByCustomThread          : 在自定义线程池执行任务
executeByCustomThreadWithDelay : 在自定义线程池延时执行任务
executeByCustomThreadAtFixRate : 在自定义线程池按固定频率执行任务
ExecutorService.cancel         : 取消任务的执行
deliveredThread                : 设置任务结束后交付的线程
```

* ### 时间相关 -> [TimeUtils.kt][time.kt] 
```
String.toSafeDateFormat                   : 获取安全的日期格式
Long.toTimeString                         : 将时间戳转为时间字符串
String.toMillis                           : 将时间字符串转为时间戳
String.toDate                             : 将时间字符串转为 Date 类型
Date.toTimeString                         : 将 Date 类型转为时间字符串
Date.toMillis                             : 将 Date 类型转为时间戳
Long.toDate                               : 将时间戳转为 Date 类型
timeSpanOf                                : 获取两个时间差（单位：unit）
fitTimeSpanOf                             : 获取合适型两个时间差
nowMillis                                 : 获取当前毫秒时间戳
nowTimeString, nowTimeStringOf            : 获取当前时间字符串
nowDate                                   : 获取当前 Date
timeSpanByNowOf                           : 获取与当前时间的差（单位：unit）
fitTimeSpanByNowOf                        : 获取合适型与当前时间的差
friendlyTimeSpanByNowOf                   : 获取友好型与当前时间的差
millisOf                                  : 获取与给定时间等于时间差的时间戳
timeStringOf                              : 获取与给定时间等于时间差的时间字符串
dateOf                                    : 获取与给定时间等于时间差的 Date
millisByNowOf                             : 获取与当前时间等于时间差的时间戳
timeStringByNowOf                         : 获取与当前时间等于时间差的时间字符串
dateByNowOf                               : 获取与当前时间等于时间差的 Date
Date/Long.isToday, isToday                : 判断是否今天
Date/Long/Int.isLeapYear, isLeapYear      : 判断是否闰年
Date/Long.chineseWeek, chineseWeekOf      : 获取中式星期
Date/Long.usWeek, usWeekOf                : 获取美式式星期
Date/Long.isAm, isAm                      : 判断是否上午
Date/Long.isPm, isPm                      : 判断是否下午
calendarValueOf                           : 根据日历字段获取值
Date/Long.chineseZodiac, chineseZodiacOf  : 获取生肖
Date/Long.zodiac, zodiacOf                : 获取星座
PATTERN_DATE_HOUR_MINUTE_SECOND           : yyyy-MM-dd HH:mm:ss
PATTERN_DATE_HOUR_MINUTE                  : yyyy-MM-dd HH:mm
PATTERN_MONTH_DAY_HOUR_MINUTE             : MM-dd HH:mm
PATTERN_DATE                              : yyyy-MM-dd
PATTERN_MONTH_DAY                         : MM-dd
PATTERN_HOUR_MINUTE_SECOND                : HH:mm:ss
PATTERN_HOUR_MINUTE                       : HH:mm
```

* ### 吐司相关 -> [ToastUtils.kt][toast.kt] 
```
setToastGravity   : 设置吐司位置
toastBgColor      : 设置背景颜色
toastBgResource   : 设置背景资源
toastMsgColor     : 设置消息颜色
toastMsgTextSize  : 设置消息字体大小
toast             : 显示短时吐司
longToast         : 显示长时吐司
cancelToast       : 取消吐司显示
```

* ### 触摸相关 -> [TouchUtils.kt][touch.kt]
```
View.doOnTouch : 设置触摸事件
```

* ### UI 消息相关 -> [UiMessageUtils.kt][uiMessage.kt] 
```
sendUIMessage           : 发送消息
addUIMessageListener    : 新增消息监听器
removeUIMessageListener : 移除消息监听器
observeUIMessage        : 观察消息监听器，绑定生命周期
```

* ### URI 相关 -> [UriUtils.kt][uri.kt]
```
uriOf       : 根据 res 路径获取 uri
File.toUri  : file 转 uri
Uri.toFile  : uri 转 file
Uri.toBytes : uri 转 bytes
```

* ### UtilsTransActivity -> [UtilsTransActivity.kt][trans.kt]
```
startTransActivity               : 启动随当前线程的透明 Activity
startTransActivityForMainProcess : 启动主线程的透明 Activity
```

* ### 震动相关 -> [VibrateUtils.kt][vibrate.kt] 
```
vibrate       : 震动
cancelVibrate : 取消震动
```

* ### 视图相关 -> [ViewUtils.kt][view.kt]
```
View.setEnabled            : 设置视图是否可用
isLayoutRtl                : 布局是否从右到左
View.fixScrollViewTopping  : 修复 ScrollView 置顶问题
```

* ### 压缩相关 -> [ZipUtils.kt][zip.kt] 
```
Collection<File>.zip, zipFiles          : 批量压缩文件
File.zip, zipFile                       : 压缩文件
File.unzip, unzipFile                   : 解压文件
File.zipFilesPath, zipFilesPathOf       : 获取压缩文件中的文件路径链表
File.zipFileComments, zipFileCommentsOf : 获取压缩文件中的注释链表
```



[activity.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ActivityUtils.kt

[adaptScreen.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/AdaptScreenUtils.kt

[api.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ApiUtils.kt

[app.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/AppUtils.kt

[array.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ArrayUtils.kt

[bar.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/BarUtils.kt

[brightness.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/BrightnessUtils.kt

[bus.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/BusUtils.kt

[cacheDiskStatic.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheDiskStaticUtils.kt

[cacheDisk.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheDiskUtils.kt

[cacheDoubleStatic.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheDoubleStaticUtils.kt

[cacheDouble.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheDoubleUtils.kt

[cacheMemoryStatic.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheMemoryStaticUtils.kt

[cacheMemory.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CacheMemoryUtils.kt

[clean.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CleanUtils.kt

[click.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ClickUtils.kt

[clone.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CloneUtils.kt

[close.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CloseUtils.kt

[collection.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CollectionUtils.kt

[color.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ColorUtils.kt

[convert.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ConvertUtils.kt

[crash.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/CrashUtils.kt

[device.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/DeviceUtils.kt

[empty.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/EmptyUtils.kt

[encode.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/EncodeUtils.kt

[encrypt.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/EncryptUtils.kt

[fileIo.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/FileIOUtils.kt

[file.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/FileUtils.kt

[flashlight.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/FlashlightUtils.kt

[fragment.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/FragmentUtils.kt

[gson.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/GsonUtils.kt

[image.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ImageUtils.kt

[intent.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/IntentUtils.kt

[keyboard.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/KeyboardUtils.kt

[language.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/LanguageUtils.kt

[log.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/LogUtils.kt

[map.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/MapUtils.kt

[metaData.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/MetaDataUtils.kt

[network.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/NetworkUtils.kt

[notification.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/NotificationUtils.kt

[number.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/NumberUtils.kt

[object.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ObjectUtils.kt

[path.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/PathUtils.kt

[permission.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/PermissionUtils.kt

[phone.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/PhoneUtils.kt

[process.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ProcessUtils.kt

[reflect.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ReflectUtils.kt

[regex.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/RegexUtils.kt

[resource.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ResourceUtils.kt

[rom.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/RomUtils.kt

[screen.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ScreenUtils.kt

[sdcard.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/SDCardUtils.kt

[service.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ServiceUtils.kt

[shadow.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ShadowUtils.kt

[shell.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ShellUtils.kt

[size.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/SizeUtils.kt

[snackbar.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/SnackbarUtils.kt

[span.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/SpanUtils.kt

[spStatic.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/SPStaticUtils.kt

[string.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/StringUtils.kt

[thread.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ThreadUtils.kt

[time.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/TimeUtils.kt

[toast.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ToastUtils.kt

[touch.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/TouchUtils.kt

[uiMessage.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/UiMessageUtils.kt

[uri.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/UriUtils.kt

[trans.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/UtilsTransActivity.kt

[vibrate.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/VibrateUtils.kt

[view.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ViewUtils.kt

[zip.kt]: https://github.com/DylanCaiCoding/AndroidUtilKTX/blob/master/library/src/main/java/com/dylanc/utilktx/ZipUtils.kt
