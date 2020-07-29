@file:Suppress("unused")

package com.dylanc.utilktx

import com.blankj.utilcode.util.RomUtils

/**
 * @author Dylan Cai
 */

inline val isHuaweiRom
  get() = RomUtils.isHuawei()

inline val isVivoRom
  get() = RomUtils.isVivo()

inline val isXiaomiRom
  get() = RomUtils.isXiaomi()

inline val isOppoRom
  get() = RomUtils.isOppo()

inline val isLeecoRom
  get() = RomUtils.isLeeco()

inline val is360Rom
  get() = RomUtils.is360()

inline val isZteRom
  get() = RomUtils.isZte()

inline val isOneplusRom
  get() = RomUtils.isOneplus()

inline val isNubiaRom
  get() = RomUtils.isNubia()

inline val isCoolpadRom
  get() = RomUtils.isCoolpad()

inline val isLgRom
  get() = RomUtils.isLg()

inline val isGoogleRom
  get() = RomUtils.isGoogle()

inline val isSamsungRom
  get() = RomUtils.isSamsung()

inline val isMeizuRom
  get() = RomUtils.isMeizu()

inline val isLenovoRom
  get() = RomUtils.isLenovo()

inline val isSmartisanRom
  get() = RomUtils.isSmartisan()

inline val isHtcRom
  get() = RomUtils.isHtc()

inline val isSonyRom
  get() = RomUtils.isSony()

inline val isGioneeRom
  get() = RomUtils.isGionee()

inline val isMotorolaRom
  get() = RomUtils.isMotorola()

inline val romInfo
  get() = RomUtils.getRomInfo()