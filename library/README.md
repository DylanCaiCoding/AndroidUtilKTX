## Download

Gradle:
```groovy
implementation 'com.dylanc:utilktx:1.0.0'

// if u use AndroidX, use the following
implementation 'com.dylanc:utilktx-x:1.0.0'
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
app                                : 获取 Application 对象
registerAppStatusChangedListener   : 注册 App 前后台切换监听器
unregisterAppStatusChangedListener : 注销 App 前后台切换监听器
installApp                         : 安装 App（支持 8.0）
uninstallApp                       : 卸载 App
isAppInstalled                     : 判断 App 是否安装
isAppRoot                          : 判断 App 是否有 root 权限
isAppDebug                         : 判断 App 是否是 Debug 版本
isAppSystem                        : 判断 App 是否是系统应用
isAppForeground                    : 判断 App 是否处于前台
isAppRunning                       : 判断 App 是否运行
launchApp                          : 打开 App
relaunchApp                        : 重启 App
launchAppDetailsSettings           : 打开 App 具体设置
exitApp                            : 关闭应用
appIcon                            : 获取 App 图标
appPackageName                     : 获取 App 包名
appName                            : 获取 App 名称
appPath                            : 获取 App 路径
appVersionName                     : 获取 App 版本号
appVersionCode                     : 获取 App 版本码
appSignature                       : 获取 App 签名
appSignatureSHA1                   : 获取应用签名的的 SHA1 值
appSignatureSHA256                 : 获取应用签名的的 SHA256 值
appSignatureMD5                    : 获取应用签名的的 MD5 值
appInfo                            : 获取 App 信息
appsInfo                           : 获取所有已安装 App 信息
apkInfo                            : 获取 Apk 信息
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
getFileByPath             : 根据文件路径获取文件
isFileExists              : 判断文件是否存在
rename                    : 重命名文件
isDir                     : 判断是否是目录
isFile                    : 判断是否是文件
createOrExistsDir         : 判断目录是否存在，不存在则判断是否创建成功
createOrExistsFile        : 判断文件是否存在，不存在则判断是否创建成功
createFileByDeleteOldFile : 判断文件是否存在，存在则在创建之前删除
copy                      : 复制文件或目录
move                      : 移动文件或目录
delete                    : 删除文件或目录
deleteAllInDir            : 删除目录下所有内容
deleteFilesInDir          : 删除目录下所有文件
deleteFilesInDirWithFilter: 删除目录下所有过滤的文件
listFilesInDir            : 获取目录下所有文件
listFilesInDirWithFilter  : 获取目录下所有过滤的文件
getFileLastModified       : 获取文件最后修改的毫秒时间戳
getFileCharsetSimple      : 简单获取文件编码格式
getFileLines              : 获取文件行数
getSize                   : 获取文件或目录大小
getLength                 : 获取文件或目录长度
getFileMD5                : 获取文件的 MD5 校验码
getFileMD5ToString        : 获取文件的 MD5 校验码
getDirName                : 根据全路径获取最长目录
getFileName               : 根据全路径获取文件名
getFileNameNoExtension    : 根据全路径获取文件名不带拓展名
getFileExtension          : 根据全路径获取文件拓展名
notifySystemToScan        : 通知系统扫描文件
getFsTotalSize            : 获取文件系统总大小
getFsAvailableSize        : 获取文件系统可用大小
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

* ### 日志相关 -> [LogUtils.kt][log.kt] -> [Demo][log.demo]
```
logConfig                : 获取 log 配置
Config.setLogSwitch      : 设置 log 总开关
Config.setConsoleSwitch  : 设置 log 控制台开关
Config.setGlobalTag      : 设置 log 全局 tag
Config.setLogHeadSwitch  : 设置 log 头部信息开关
Config.setLog2FileSwitch : 设置 log 文件开关
Config.setDir            : 设置 log 文件存储目录
Config.setFilePrefix     : 设置 log 文件前缀
Config.setBorderSwitch   : 设置 log 边框开关
Config.setSingleTagSwitch: 设置 log 单一 tag 开关（为美化 AS 3.1 的 Logcat）
Config.setConsoleFilter  : 设置 log 控制台过滤器
Config.setFileFilter     : 设置 log 文件过滤器
Config.setStackDeep      : 设置 log 栈深度
Config.setStackOffset    : 设置 log 栈偏移
Config.setSaveDays       : 设置 log 可保留天数
Config.addFormatter      : 新增 log 格式化器
log                      : 自定义 tag 的 type 日志
v                        : tag 为类名的 Verbose 日志
vTag                     : 自定义 tag 的 Verbose 日志
d                        : tag 为类名的 Debug 日志
dTag                     : 自定义 tag 的 Debug 日志
i                        : tag 为类名的 Info 日志
iTag                     : 自定义 tag 的 Info 日志
w                        : tag 为类名的 Warn 日志
wTag                     : 自定义 tag 的 Warn 日志
e                        : tag 为类名的 Error 日志
eTag                     : 自定义 tag 的 Error 日志
a                        : tag 为类名的 Assert 日志
aTag                     : 自定义 tag 的 Assert 日志
file                     : log 到文件
json                     : log 字符串之 json
xml                      : log 字符串之 xml
```

* ### Map 相关 -> [MapUtils.kt][map.kt] -> [Test][map.test]
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
String.isMobileSimple                     : 简单验证手机号
String.isMobileExact                      : 精确验证手机号
String.isTelephone                        : 验证电话号码
String.isIDCard15                         : 验证身份证号码 15 位
String.isIDCard18                         : 简单验证身份证号码 18 位
String.isIDCard18Exact                    : 精确验证身份证号码 18 位
String.isEmail                            : 验证邮箱
String.isURL                              : 验证 URL
String.isZh                               : 验证汉字
String.isUsername                         : 验证用户名
String.isDate                             : 验证 yyyy-MM-dd 格式的日期校验，已考虑平闰年
String.isIP                               : 验证 IP 地址
String.isMatch                            : 判断是否匹配正则
String.matches                            : 获取正则匹配的部分
String.split                              : 获取正则匹配分组
String.replaceFirst                       : 替换正则匹配的第一部分
String.replaceAll                         : 替换所有正则匹配的部分
RegexConstants.REGEX_DOUBLE_BYTE_CHAR     : 双字节
RegexConstants.REGEX_BLANK_LINE           : 空行
RegexConstants.REGEX_QQ_NUM               : QQ 号
RegexConstants.REGEX_CHINA_POSTAL_CODE    : 邮编
RegexConstants.REGEX_INTEGER              : 整数
RegexConstants.REGEX_POSITIVE_INTEGER     : 正整数
RegexConstants.REGEX_NEGATIVE_INTEGER     : 负整数
RegexConstants.REGEX_NOT_NEGATIVE_INTEGER : 非负整数
RegexConstants.REGEX_NOT_POSITIVE_INTEGER : 非正整数
RegexConstants.REGEX_FLOAT                : 浮点数
RegexConstants.REGEX_POSITIVE_FLOAT       : 正浮点数
RegexConstants.REGEX_NEGATIVE_FLOAT       : 负浮点数
RegexConstants.REGEX_NOT_NEGATIVE_FLOAT   : 非负浮点数
RegexConstants.REGEX_NOT_POSITIVE_FLOAT   : 非正浮点数
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

* ### Snackbar 相关 -> [SnackbarUtils.kt][snackbar.kt] -> [Demo][snackbar.demo]
```
with           : 设置 snackbar 依赖 view
setMessage     : 设置消息
setMessageColor: 设置消息颜色
setBgColor     : 设置背景色
setBgResource  : 设置背景资源
setDuration    : 设置显示时长
setAction      : 设置行为
setBottomMargin: 设置底边距
show           : 显示 snackbar
showSuccess    : 显示预设成功的 snackbar
showWarning    : 显示预设警告的 snackbar
showError      : 显示预设错误的 snackbar
dismiss        : 消失 snackbar
getView        : 获取 snackbar 视图
addView        : 添加 snackbar 视图
```

* ### SpannableString 相关 -> [SpanUtils.kt][span.kt] -> [Demo][span.demo]
```
with              : 设置控件
setFlag           : 设置标识
setForegroundColor: 设置前景色
setBackgroundColor: 设置背景色
setLineHeight     : 设置行高
setQuoteColor     : 设置引用线的颜色
setLeadingMargin  : 设置缩进
setBullet         : 设置列表标记
setFontSize       : 设置字体尺寸
setFontProportion : 设置字体比例
setFontXProportion: 设置字体横向比例
setStrikethrough  : 设置删除线
setUnderline      : 设置下划线
setSuperscript    : 设置上标
setSubscript      : 设置下标
setBold           : 设置粗体
setItalic         : 设置斜体
setBoldItalic     : 设置粗斜体
setFontFamily     : 设置字体系列
setTypeface       : 设置字体
setAlign          : 设置对齐
setClickSpan      : 设置点击事件
setUrl            : 设置超链接
setBlur           : 设置模糊
setShader         : 设置着色器
setShadow         : 设置阴影
setSpans          : 设置样式
append            : 追加样式字符串
appendLine        : 追加一行样式字符串
appendImage       : 追加图片
appendSpace       : 追加空白
create            : 创建样式字符串
```

* ### SP 相关 -> [SPStaticUtils.kt][spStatic.kt] -> [Demo][spStatic.demo]
```
setDefaultSPUtils: 设置默认 SP 实例
put              : SP 中写入数据
getString        : SP 中读取 String
getInt           : SP 中读取 int
getLong          : SP 中读取 long
getFloat         : SP 中读取 float
getBoolean       : SP 中读取 boolean
getAll           : SP 中获取所有键值对
contains         : SP 中是否存在该 key
remove           : SP 中移除该 key
clear            : SP 中清除所有数据
```

* ### SP 相关 -> [SPUtils.kt][sp.kt]
```
getInstance        : 获取 SP 实例
Instance.put       : SP 中写入数据
Instance.getString : SP 中读取 String
Instance.getInt    : SP 中读取 int
Instance.getLong   : SP 中读取 long
Instance.getFloat  : SP 中读取 float
Instance.getBoolean: SP 中读取 boolean
Instance.getAll    : SP 中获取所有键值对
Instance.contains  : SP 中是否存在该 key
Instance.remove    : SP 中移除该 key
Instance.clear     : SP 中清除所有数据
```

* ### 字符串相关 -> [StringUtils.kt][string.kt] -> [Test][string.test]
```
isEmpty         : 判断字符串是否为 null 或长度为 0
isTrimEmpty     : 判断字符串是否为 null 或全为空格
isSpace         : 判断字符串是否为 null 或全为空白字符
equals          : 判断两字符串是否相等
equalsIgnoreCase: 判断两字符串忽略大小写是否相等
null2Length0    : null 转为长度为 0 的字符串
length          : 返回字符串长度
upperFirstLetter: 首字母大写
lowerFirstLetter: 首字母小写
reverse         : 反转字符串
toDBC           : 转化为半角字符
toSBC           : 转化为全角字符
getString       : 获取字符资源
getStringArray  : 获取字符数组资源
```

* ### 线程相关 -> [ThreadUtils.kt][thread.kt] -> [Test][thread.test]
```
isMainThread            : 判断当前是否主线程
getMainHandler          : 获取主线程 Handler
runOnUiThread           : 运行在主线程
runOnUiThreadDelayed    : 延时运行在主线程
getFixedPool            : 获取固定线程池
getSinglePool           : 获取单线程池
getCachedPool           : 获取缓冲线程池
getIoPool               : 获取 IO 线程池
getCpuPool              : 获取 CPU 线程池
executeByFixed          : 在固定线程池执行任务
executeByFixedWithDelay : 在固定线程池延时执行任务
executeByFixedAtFixRate : 在固定线程池按固定频率执行任务
executeBySingle         : 在单线程池执行任务
executeBySingleWithDelay: 在单线程池延时执行任务
executeBySingleAtFixRate: 在单线程池按固定频率执行任务
executeByCached         : 在缓冲线程池执行任务
executeByCachedWithDelay: 在缓冲线程池延时执行任务
executeByCachedAtFixRate: 在缓冲线程池按固定频率执行任务
executeByIo             : 在 IO 线程池执行任务
executeByIoWithDelay    : 在 IO 线程池延时执行任务
executeByIoAtFixRate    : 在 IO 线程池按固定频率执行任务
executeByCpu            : 在 CPU 线程池执行任务
executeByCpuWithDelay   : 在 CPU 线程池延时执行任务
executeByCpuAtFixRate   : 在 CPU 线程池按固定频率执行任务
executeByCustom         : 在自定义线程池执行任务
executeByCustomWithDelay: 在自定义线程池延时执行任务
executeByCustomAtFixRate: 在自定义线程池按固定频率执行任务
cancel                  : 取消任务的执行
setDeliver              : 设置任务结束后交付的线程
```

* ### 时间相关 -> [TimeUtils.kt][time.kt] -> [Test][time.test]
```
getSafeDateFormat       : 获取安全的日期格式
millis2String           : 将时间戳转为时间字符串
string2Millis           : 将时间字符串转为时间戳
string2Date             : 将时间字符串转为 Date 类型
date2String             : 将 Date 类型转为时间字符串
date2Millis             : 将 Date 类型转为时间戳
millis2Date             : 将时间戳转为 Date 类型
getTimeSpan             : 获取两个时间差（单位：unit）
getFitTimeSpan          : 获取合适型两个时间差
getNowMills             : 获取当前毫秒时间戳
getNowString            : 获取当前时间字符串
getNowDate              : 获取当前 Date
getTimeSpanByNow        : 获取与当前时间的差（单位：unit）
getFitTimeSpanByNow     : 获取合适型与当前时间的差
getFriendlyTimeSpanByNow: 获取友好型与当前时间的差
getMillis               : 获取与给定时间等于时间差的时间戳
getString               : 获取与给定时间等于时间差的时间字符串
getDate                 : 获取与给定时间等于时间差的 Date
getMillisByNow          : 获取与当前时间等于时间差的时间戳
getStringByNow          : 获取与当前时间等于时间差的时间字符串
getDateByNow            : 获取与当前时间等于时间差的 Date
isToday                 : 判断是否今天
isLeapYear              : 判断是否闰年
getChineseWeek          : 获取中式星期
getUSWeek               : 获取美式式星期
isAm                    : 判断是否上午
isPm                    : 判断是否下午
getValueByCalendarField : 根据日历字段获取值
getChineseZodiac        : 获取生肖
getZodiac               : 获取星座
```

* ### 吐司相关 -> [ToastUtils.kt][toast.kt] -> [Demo][toast.demo]
```
setGravity     : 设置吐司位置
setBgColor     : 设置背景颜色
setBgResource  : 设置背景资源
setMsgColor    : 设置消息颜色
setMsgTextSize : 设置消息字体大小
showShort      : 显示短时吐司
showLong       : 显示长时吐司
showCustomShort: 显示短时自定义吐司
showCustomLong : 显示长时自定义吐司
cancel         : 取消吐司显示
```

* ### 触摸相关 -> [TouchUtils.kt][touch.kt]
```
setOnTouchListener: 设置触摸事件
```

* ### UI 消息相关 -> [UiMessageUtils.kt][uiMessage.kt] -> [Demo][uiMessage.demo]
```
send          : 发送消息
addListener   : 新增消息监听器
removeListener: 移除消息监听器
```

* ### URI 相关 -> [UriUtils.kt][uri.kt]
```
res2Uri  : res 转 uri
file2Uri : file 转 uri
uri2File : uri 转 file
uri2Bytes: uri 转 bytes
```

* ### UtilsTransActivity -> [UtilsTransActivity.kt][trans.kt]
```
start: 启动随当前线程的透明 Activity
```

* ### UtilsTransActivity4MainProcess -> [UtilsTransActivity4MainProcess.kt][trans4Main.kt]
```
start: 启动主线程的透明 Activity
```

* ### 震动相关 -> [VibrateUtils.kt][vibrate.kt] -> [Demo][vibrate.demo]
```
vibrate: 震动
cancel : 取消
```

* ### 视图相关 -> [ViewUtils.kt][view.kt]
```
setViewEnabled      : 设置视图是否可用
runOnUiThread       : 在 UI 线程运行
runOnUiThreadDelayed: 在 UI 线程延迟运行
isLayoutRtl         : 布局是否从右到左
fixScrollViewTopping: 修复 ScrollView 置顶问题
```

* ### 压缩相关 -> [ZipUtils.kt][zip.kt] -> [Test][zip.test]
```
zipFiles          : 批量压缩文件
zipFile           : 压缩文件
unzipFile         : 解压文件
unzipFileByKeyword: 解压带有关键字的文件
getFilesPath      : 获取压缩文件中的文件路径链表
getComments       : 获取压缩文件中的注释链表
```


## 打个小广告

欢迎加入我的知识星球「**[基你太美](https://t.zsxq.com/FmeqfYF)**」，我会在星球中分享 [AucFrame](https://blankj.com/2019/07/22/auc-frame/) 框架、大厂面经、[AndroidUtilCode](https://github.com/Blankj/AndroidUtilCode) 更详尽的说明...一切我所了解的知识，你可以通过支付进入我的星球「**[基你太美](https://t.zsxq.com/FmeqfYF)**」进行体验，加入后优先观看星球中精华的部分，如果觉得星球的内容对自身没有收益，你可以自行申请退款退出星球，也没必要加我好友；**如果你已确定要留在我的星球，可以通过扫描如下二维码（备注：基你太美）加我个人微信，发送给我你的星球 ID，方便我后续拉你进群(PS：进得越早价格越便宜)。**

![我的二维码](https://raw.githubusercontent.com/Blankj/AndroidUtilCode/master/art/wechat.png)



[activity.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ActivityUtils.java
[activity.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/activity/ActivityActivity.kt

[adaptScreen.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/AdaptScreenUtils.java
[adaptScreen.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/adaptScreen/AdaptScreenActivity.kt

[api.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ApiUtils.java
[api.readme]: https://github.com/Blankj/AndroidUtilCode/blob/master/plugin/api-gradle-plugin

[app.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/AppUtils.java
[app.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/app/AppActivity.kt

[array.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ArrayUtils.java
[array.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ArrayUtilsTest.java

[bar.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/BarUtils.java
[bar.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/bar/BarActivity.kt

[brightness.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/BrightnessUtils.java
[brightness.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/brightness/BrightnessActivity.kt

[bus.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/BusUtils.java
[bus.readme]: https://github.com/Blankj/AndroidUtilCode/blob/master/plugin/bus-gradle-plugin

[cacheDiskStatic.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheDiskStaticUtils.java
[cacheDiskStatic.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheDiskStaticUtilsTest.java

[cacheDisk.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheDiskUtils.java
[cacheDisk.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheDiskUtilsTest.java

[cacheDoubleStatic.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheDoubleStaticUtils.java
[cacheDoubleStatic.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheDoubleStaticUtilsTest.java

[cacheDouble.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheDoubleUtils.java
[cacheDouble.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheDoubleUtilsTest.java

[cacheMemoryStatic.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheMemoryStaticUtils.java
[cacheMemoryStatic.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheMemoryStaticUtilsTest.java

[cacheMemory.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CacheMemoryUtils.java
[cacheMemory.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CacheMemoryUtilsTest.java

[clean.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CleanUtils.java
[clean.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/clean/CleanActivity.kt

[click.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ClickUtils.java
[click.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/click/ClickActivity.kt

[clone.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CloneUtils.java
[clone.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CloneUtilsTest.java

[close.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CloseUtils.java

[collection.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CollectionUtils.java
[collection.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/CollectionUtilsTest.java

[color.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ColorUtils.java
[color.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ColorUtilsTest.java

[convert.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ConvertUtils.java
[convert.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ConvertUtilsTest.java

[crash.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/CrashUtils.java

[device.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/DeviceUtils.java
[device.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/device/DeviceActivity.kt

[empty.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/EmptyUtils.java
[empty.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/EmptyUtilsTest.java

[encode.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/EncodeUtils.java
[encode.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/EncodeUtilsTest.java

[encrypt.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/EncryptUtils.java
[encrypt.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/EncryptUtilsTest.java

[fileIo.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/FileIOUtils.java
[fileIo.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/FileIOUtilsTest.java

[file.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/FileUtils.java
[file.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/FileUtilsTest.java

[flashlight.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/FlashlightUtils.java
[flashlight.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/flashlight/FlashlightActivity.kt

[fragment.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/FragmentUtils.java
[fragment.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/fragment/FragmentActivity.kt

[gson.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/GsonUtils.java
[gson.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/GsonUtilsTest.java

[image.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ImageUtils.java
[image.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/image/ImageActivity.kt

[intent.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/IntentUtils.java

[keyboard.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/KeyboardUtils.java
[keyboard.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/keyboard/KeyboardActivity.kt

[language.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/LanguageUtils.java
[language.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/language/LanguageActivity.kt

[log.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/LogUtils.java
[log.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/log/LogActivity.kt

[map.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/MapUtils.java
[map.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/MapUtilsTest.java

[metaData.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/MetaDataUtils.java
[metaData.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/metaData/MetaDataActivity.kt

[network.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/NetworkUtils.java
[network.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/network/NetworkActivity.kt

[notification.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/NotificationUtils.java
[notification.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/notification/NotificationActivity.kt

[number.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/NumberUtils.java
[number.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/NumberUtilsTest.java

[object.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ObjectUtils.java
[object.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ObjectUtilsTest.java

[path.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/PathUtils.java
[path.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/path/PathActivity.kt

[permission.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/PermissionUtils.java
[permission.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/permission/PermissionActivity.kt

[phone.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/PhoneUtils.java
[phone.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/phone/PhoneActivity.kt

[process.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ProcessUtils.java
[process.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/process/ProcessActivity.kt

[reflect.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ReflectUtils.java
[reflect.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/reflect/ReflectUtilsTest.java

[regex.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/RegexUtils.java
[regex.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/RegexUtilsTest.java

[resource.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ResourceUtils.java
[resource.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/resource/ResourceActivity.kt

[rom.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/RomUtils.java
[rom.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/rom/RomActivity.kt

[screen.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ScreenUtils.java
[screen.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/screen/ScreenActivity.kt

[sdcard.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SDCardUtils.java
[sdcard.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/sdcard/SDCardActivity.kt

[service.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ServiceUtils.java

[shadow.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ShadowUtils.java
[shadow.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/shadow/ShadowActivity.kt

[shell.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ShellUtils.java

[size.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SizeUtils.java

[snackbar.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SnackbarUtils.java
[snackbar.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/snackbar/SnackbarActivity.kt

[span.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SpanUtils.java
[span.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/span/SpanActivity.kt

[spStatic.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SPStaticUtils.java
[spStatic.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/spStatic/SPStaticActivity.kt

[sp.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/SPUtils.java

[string.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/StringUtils.java
[string.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/StringUtilsTest.java

[thread.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ThreadUtils.java
[thread.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ThreadUtilsTest.java

[time.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/TimeUtils.java
[time.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/TimeUtilsTest.java

[toast.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ToastUtils.java
[toast.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/toast/ToastActivity.kt

[touch.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/TouchUtils.java

[uiMessage.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/UiMessageUtils.java
[uiMessage.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/uiMessage/UiMessageActivity.kt

[uri.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/UriUtils.java

[trans.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/UtilsTransActivity.java

[trans4Main.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/UtilsTransActivity4MainProcess.java

[vibrate.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/VibrateUtils.java
[vibrate.demo]: https://github.com/Blankj/AndroidUtilCode/blob/master/feature/utilcode/pkg/src/main/java/com/blankj/utilcode/pkg/feature/vibrate/VibrateActivity.kt

[view.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ViewUtils.java

[zip.kt]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/main/java/com/blankj/utilcode/util/ZipUtils.java
[zip.test]: https://github.com/Blankj/AndroidUtilCode/blob/master/lib/utilcode/src/test/java/com/blankj/utilcode/util/ZipUtilsTest.java
