## APIs

* ### Activity 相关 -> [ActivityUtils.kt][activity.kt]
```
Activity.startActivityForResult : 启动 Activity 并处理返回结果
```

* ### 意图相关 -> [IntentUtils.kt][intent.kt]
```
Context.intentOf
bundleOf
Activity.intentBooleanExtra
Activity.intentByteExtra
Activity.intentCharExtra
Activity.intentDoubleExtra
Activity.intentFloatExtra
Activity.intentIntExtra
Activity.intentLongExtra
Activity.intentShortExtra
Activity.intentBundleExtra
Activity.intentCharSequenceExtra
Activity.intentParcelableExtra
Activity.intentSerializableExtra
Activity.intentBooleanArrayExtra
Activity.intentByteArrayExtra
Activity.intentCharArrayExtra
Activity.intentDoubleArrayExtra
Activity.intentFloatArrayExtra
Activity.intentIntArrayExtra
Activity.intentLongArrayExtra
Activity.intentShortArrayExtra
Activity.intentParcelableArrayExtra
Activity.intentStringArrayExtra
Activity.intentCharSequenceArrayExtra
```

* ### 数字相关 -> [NumberUtils.kt][number.kt] 
```
Float/Double.toPrice  : 数字转价格格式
```

* ### 视图相关 -> [ViewUtils.kt][view.kt]
```
View.isVisible     : 判断/设置视图是否可见
View.isGone        : 判断/设置视图是否消失
View.isInvisible   : 判断/设置视图是否不可见
ViewGroup.inflate  : 加载布局
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
