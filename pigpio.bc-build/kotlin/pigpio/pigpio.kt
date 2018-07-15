@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package pigpio

import konan.SymbolName
import kotlinx.cinterop.*
import platform.posix.int32_t
import platform.posix.pthread_tVar
import platform.posix.size_t
import platform.posix.size_tVar
import platform.posix.uint16_t
import platform.posix.uint16_tVar
import platform.posix.uint32_t
import platform.posix.uint32_tVar
import platform.posix.uint64_t
import platform.posix.uint8_tVar

// NOTE THIS FILE IS AUTO-GENERATED

fun gpioInitialise(): Int {
    return kniBridge0()
}

fun gpioTerminate(): Unit {
    return kniBridge1()
}

fun gpioSetMode(gpio: Int, mode: Int): Int {
    return kniBridge2(gpio, mode)
}

fun gpioGetMode(gpio: Int): Int {
    return kniBridge3(gpio)
}

fun gpioSetPullUpDown(gpio: Int, pud: Int): Int {
    return kniBridge4(gpio, pud)
}

fun gpioRead(gpio: Int): Int {
    return kniBridge5(gpio)
}

fun gpioWrite(gpio: Int, level: Int): Int {
    return kniBridge6(gpio, level)
}

fun gpioPWM(user_gpio: Int, dutycycle: Int): Int {
    return kniBridge7(user_gpio, dutycycle)
}

fun gpioGetPWMdutycycle(user_gpio: Int): Int {
    return kniBridge8(user_gpio)
}

fun gpioSetPWMrange(user_gpio: Int, range: Int): Int {
    return kniBridge9(user_gpio, range)
}

fun gpioGetPWMrange(user_gpio: Int): Int {
    return kniBridge10(user_gpio)
}

fun gpioGetPWMrealRange(user_gpio: Int): Int {
    return kniBridge11(user_gpio)
}

fun gpioSetPWMfrequency(user_gpio: Int, frequency: Int): Int {
    return kniBridge12(user_gpio, frequency)
}

fun gpioGetPWMfrequency(user_gpio: Int): Int {
    return kniBridge13(user_gpio)
}

fun gpioServo(user_gpio: Int, pulsewidth: Int): Int {
    return kniBridge14(user_gpio, pulsewidth)
}

fun gpioGetServoPulsewidth(user_gpio: Int): Int {
    return kniBridge15(user_gpio)
}

fun gpioSetAlertFunc(user_gpio: Int, f: gpioAlertFunc_t?): Int {
    return kniBridge16(user_gpio, f.rawValue)
}

fun gpioSetAlertFuncEx(user_gpio: Int, f: gpioAlertFuncEx_t?, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge17(user_gpio, f.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun gpioSetISRFunc(gpio: Int, edge: Int, timeout: Int, f: gpioISRFunc_t?): Int {
    return kniBridge18(gpio, edge, timeout, f.rawValue)
}

fun gpioSetISRFuncEx(gpio: Int, edge: Int, timeout: Int, f: gpioISRFuncEx_t?, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge19(gpio, edge, timeout, f.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun gpioNotifyOpen(): Int {
    return kniBridge20()
}

fun gpioNotifyOpenWithSize(bufSize: Int): Int {
    return kniBridge21(bufSize)
}

fun gpioNotifyBegin(handle: Int, bits: uint32_t): Int {
    return kniBridge22(handle, bits)
}

fun gpioNotifyPause(handle: Int): Int {
    return kniBridge23(handle)
}

fun gpioNotifyClose(handle: Int): Int {
    return kniBridge24(handle)
}

fun gpioWaveClear(): Int {
    return kniBridge25()
}

fun gpioWaveAddNew(): Int {
    return kniBridge26()
}

fun gpioWaveAddGeneric(numPulses: Int, pulses: CValuesRef<gpioPulse_t>?): Int {
    memScoped {
        return kniBridge27(numPulses, pulses?.getPointer(memScope).rawValue)
    }
}

fun gpioWaveAddSerial(user_gpio: Int, baud: Int, data_bits: Int, stop_bits: Int, offset: Int, numBytes: Int, str: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge28(user_gpio, baud, data_bits, stop_bits, offset, numBytes, str?.getPointer(memScope).rawValue)
    }
}

fun gpioWaveCreate(): Int {
    return kniBridge29()
}

fun gpioWaveDelete(wave_id: Int): Int {
    return kniBridge30(wave_id)
}

fun gpioWaveTxSend(wave_id: Int, wave_mode: Int): Int {
    return kniBridge31(wave_id, wave_mode)
}

fun gpioWaveChain(buf: CValuesRef<ByteVar>?, bufSize: Int): Int {
    memScoped {
        return kniBridge32(buf?.getPointer(memScope).rawValue, bufSize)
    }
}

fun gpioWaveTxAt(): Int {
    return kniBridge33()
}

fun gpioWaveTxBusy(): Int {
    return kniBridge34()
}

fun gpioWaveTxStop(): Int {
    return kniBridge35()
}

fun gpioWaveGetMicros(): Int {
    return kniBridge36()
}

fun gpioWaveGetHighMicros(): Int {
    return kniBridge37()
}

fun gpioWaveGetMaxMicros(): Int {
    return kniBridge38()
}

fun gpioWaveGetPulses(): Int {
    return kniBridge39()
}

fun gpioWaveGetHighPulses(): Int {
    return kniBridge40()
}

fun gpioWaveGetMaxPulses(): Int {
    return kniBridge41()
}

fun gpioWaveGetCbs(): Int {
    return kniBridge42()
}

fun gpioWaveGetHighCbs(): Int {
    return kniBridge43()
}

fun gpioWaveGetMaxCbs(): Int {
    return kniBridge44()
}

fun gpioSerialReadOpen(user_gpio: Int, baud: Int, data_bits: Int): Int {
    return kniBridge45(user_gpio, baud, data_bits)
}

fun gpioSerialReadInvert(user_gpio: Int, invert: Int): Int {
    return kniBridge46(user_gpio, invert)
}

fun gpioSerialRead(user_gpio: Int, buf: CValuesRef<*>?, bufSize: size_t): Int {
    memScoped {
        return kniBridge47(user_gpio, buf?.getPointer(memScope).rawValue, bufSize)
    }
}

fun gpioSerialReadClose(user_gpio: Int): Int {
    return kniBridge48(user_gpio)
}

fun i2cOpen(i2cBus: Int, i2cAddr: Int, i2cFlags: Int): Int {
    return kniBridge49(i2cBus, i2cAddr, i2cFlags)
}

fun i2cClose(handle: Int): Int {
    return kniBridge50(handle)
}

fun i2cWriteQuick(handle: Int, bit: Int): Int {
    return kniBridge51(handle, bit)
}

fun i2cWriteByte(handle: Int, bVal: Int): Int {
    return kniBridge52(handle, bVal)
}

fun i2cReadByte(handle: Int): Int {
    return kniBridge53(handle)
}

fun i2cWriteByteData(handle: Int, i2cReg: Int, bVal: Int): Int {
    return kniBridge54(handle, i2cReg, bVal)
}

fun i2cWriteWordData(handle: Int, i2cReg: Int, wVal: Int): Int {
    return kniBridge55(handle, i2cReg, wVal)
}

fun i2cReadByteData(handle: Int, i2cReg: Int): Int {
    return kniBridge56(handle, i2cReg)
}

fun i2cReadWordData(handle: Int, i2cReg: Int): Int {
    return kniBridge57(handle, i2cReg)
}

fun i2cProcessCall(handle: Int, i2cReg: Int, wVal: Int): Int {
    return kniBridge58(handle, i2cReg, wVal)
}

fun i2cWriteBlockData(handle: Int, i2cReg: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge59(handle, i2cReg, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cReadBlockData(handle: Int, i2cReg: Int, buf: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge60(handle, i2cReg, buf?.getPointer(memScope).rawValue)
    }
}

fun i2cBlockProcessCall(handle: Int, i2cReg: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge61(handle, i2cReg, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cReadI2CBlockData(handle: Int, i2cReg: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge62(handle, i2cReg, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cWriteI2CBlockData(handle: Int, i2cReg: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge63(handle, i2cReg, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cReadDevice(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge64(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cWriteDevice(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge65(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun i2cSwitchCombined(setting: Int): Unit {
    return kniBridge66(setting)
}

fun i2cSegments(handle: Int, segs: CValuesRef<pi_i2c_msg_t>?, numSegs: Int): Int {
    memScoped {
        return kniBridge67(handle, segs?.getPointer(memScope).rawValue, numSegs)
    }
}

fun i2cZip(handle: Int, inBuf: CValuesRef<ByteVar>?, inLen: Int, outBuf: CValuesRef<ByteVar>?, outLen: Int): Int {
    memScoped {
        return kniBridge68(handle, inBuf?.getPointer(memScope).rawValue, inLen, outBuf?.getPointer(memScope).rawValue, outLen)
    }
}

fun bbI2COpen(SDA: Int, SCL: Int, baud: Int): Int {
    return kniBridge69(SDA, SCL, baud)
}

fun bbI2CClose(SDA: Int): Int {
    return kniBridge70(SDA)
}

fun bbI2CZip(SDA: Int, inBuf: CValuesRef<ByteVar>?, inLen: Int, outBuf: CValuesRef<ByteVar>?, outLen: Int): Int {
    memScoped {
        return kniBridge71(SDA, inBuf?.getPointer(memScope).rawValue, inLen, outBuf?.getPointer(memScope).rawValue, outLen)
    }
}

fun bscXfer(bsc_xfer: CValuesRef<bsc_xfer_t>?): Int {
    memScoped {
        return kniBridge72(bsc_xfer?.getPointer(memScope).rawValue)
    }
}

fun bbSPIOpen(CS: Int, MISO: Int, MOSI: Int, SCLK: Int, baud: Int, spiFlags: Int): Int {
    return kniBridge73(CS, MISO, MOSI, SCLK, baud, spiFlags)
}

fun bbSPIClose(CS: Int): Int {
    return kniBridge74(CS)
}

fun bbSPIXfer(CS: Int, inBuf: CValuesRef<ByteVar>?, outBuf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge75(CS, inBuf?.getPointer(memScope).rawValue, outBuf?.getPointer(memScope).rawValue, count)
    }
}

fun spiOpen(spiChan: Int, baud: Int, spiFlags: Int): Int {
    return kniBridge76(spiChan, baud, spiFlags)
}

fun spiClose(handle: Int): Int {
    return kniBridge77(handle)
}

fun spiRead(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge78(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun spiWrite(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge79(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun spiXfer(handle: Int, txBuf: CValuesRef<ByteVar>?, rxBuf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge80(handle, txBuf?.getPointer(memScope).rawValue, rxBuf?.getPointer(memScope).rawValue, count)
    }
}

fun serOpen(sertty: CValuesRef<ByteVar>?, baud: Int, serFlags: Int): Int {
    memScoped {
        return kniBridge81(sertty?.getPointer(memScope).rawValue, baud, serFlags)
    }
}

fun serClose(handle: Int): Int {
    return kniBridge82(handle)
}

fun serWriteByte(handle: Int, bVal: Int): Int {
    return kniBridge83(handle, bVal)
}

fun serReadByte(handle: Int): Int {
    return kniBridge84(handle)
}

fun serWrite(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge85(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun serRead(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge86(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun serDataAvailable(handle: Int): Int {
    return kniBridge87(handle)
}

fun gpioTrigger(user_gpio: Int, pulseLen: Int, level: Int): Int {
    return kniBridge88(user_gpio, pulseLen, level)
}

fun gpioSetWatchdog(user_gpio: Int, timeout: Int): Int {
    return kniBridge89(user_gpio, timeout)
}

fun gpioNoiseFilter(user_gpio: Int, steady: Int, active: Int): Int {
    return kniBridge90(user_gpio, steady, active)
}

fun gpioGlitchFilter(user_gpio: Int, steady: Int): Int {
    return kniBridge91(user_gpio, steady)
}

fun gpioSetGetSamplesFunc(f: gpioGetSamplesFunc_t?, bits: uint32_t): Int {
    return kniBridge92(f.rawValue, bits)
}

fun gpioSetGetSamplesFuncEx(f: gpioGetSamplesFuncEx_t?, bits: uint32_t, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge93(f.rawValue, bits, userdata?.getPointer(memScope).rawValue)
    }
}

fun gpioSetTimerFunc(timer: Int, millis: Int, f: gpioTimerFunc_t?): Int {
    return kniBridge94(timer, millis, f.rawValue)
}

fun gpioSetTimerFuncEx(timer: Int, millis: Int, f: gpioTimerFuncEx_t?, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge95(timer, millis, f.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun gpioStopThread(pth: CValuesRef<pthread_tVar>?): Unit {
    memScoped {
        return kniBridge96(pth?.getPointer(memScope).rawValue)
    }
}

fun gpioStoreScript(script: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge97(script?.getPointer(memScope).rawValue)
    }
}

fun gpioRunScript(script_id: Int, numPar: Int, param: CValuesRef<uint32_tVar>?): Int {
    memScoped {
        return kniBridge98(script_id, numPar, param?.getPointer(memScope).rawValue)
    }
}

fun gpioUpdateScript(script_id: Int, numPar: Int, param: CValuesRef<uint32_tVar>?): Int {
    memScoped {
        return kniBridge99(script_id, numPar, param?.getPointer(memScope).rawValue)
    }
}

fun gpioScriptStatus(script_id: Int, param: CValuesRef<uint32_tVar>?): Int {
    memScoped {
        return kniBridge100(script_id, param?.getPointer(memScope).rawValue)
    }
}

fun gpioStopScript(script_id: Int): Int {
    return kniBridge101(script_id)
}

fun gpioDeleteScript(script_id: Int): Int {
    return kniBridge102(script_id)
}

fun gpioSetSignalFunc(signum: Int, f: gpioSignalFunc_t?): Int {
    return kniBridge103(signum, f.rawValue)
}

fun gpioSetSignalFuncEx(signum: Int, f: gpioSignalFuncEx_t?, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge104(signum, f.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun gpioRead_Bits_0_31(): uint32_t {
    return kniBridge105()
}

fun gpioRead_Bits_32_53(): uint32_t {
    return kniBridge106()
}

fun gpioWrite_Bits_0_31_Clear(bits: uint32_t): Int {
    return kniBridge107(bits)
}

fun gpioWrite_Bits_32_53_Clear(bits: uint32_t): Int {
    return kniBridge108(bits)
}

fun gpioWrite_Bits_0_31_Set(bits: uint32_t): Int {
    return kniBridge109(bits)
}

fun gpioWrite_Bits_32_53_Set(bits: uint32_t): Int {
    return kniBridge110(bits)
}

fun gpioHardwareClock(gpio: Int, clkfreq: Int): Int {
    return kniBridge111(gpio, clkfreq)
}

fun gpioHardwarePWM(gpio: Int, PWMfreq: Int, PWMduty: Int): Int {
    return kniBridge112(gpio, PWMfreq, PWMduty)
}

fun gpioTime(timetype: Int, seconds: CValuesRef<IntVar>?, micros: CValuesRef<IntVar>?): Int {
    memScoped {
        return kniBridge113(timetype, seconds?.getPointer(memScope).rawValue, micros?.getPointer(memScope).rawValue)
    }
}

fun gpioSleep(timetype: Int, seconds: Int, micros: Int): Int {
    return kniBridge114(timetype, seconds, micros)
}

fun gpioDelay(micros: uint32_t): uint32_t {
    return kniBridge115(micros)
}

fun gpioTick(): uint32_t {
    return kniBridge116()
}

fun gpioHardwareRevision(): Int {
    return kniBridge117()
}

fun gpioVersion(): Int {
    return kniBridge118()
}

fun gpioGetPad(pad: Int): Int {
    return kniBridge119(pad)
}

fun gpioSetPad(pad: Int, padStrength: Int): Int {
    return kniBridge120(pad, padStrength)
}

fun eventMonitor(handle: Int, bits: uint32_t): Int {
    return kniBridge121(handle, bits)
}

fun eventSetFunc(event: Int, f: eventFunc_t?): Int {
    return kniBridge122(event, f.rawValue)
}

fun eventSetFuncEx(event: Int, f: eventFuncEx_t?, userdata: CValuesRef<*>?): Int {
    memScoped {
        return kniBridge123(event, f.rawValue, userdata?.getPointer(memScope).rawValue)
    }
}

fun eventTrigger(event: Int): Int {
    return kniBridge124(event)
}

fun shell(scriptName: CValuesRef<ByteVar>?, scriptString: CValuesRef<ByteVar>?): Int {
    memScoped {
        return kniBridge125(scriptName?.getPointer(memScope).rawValue, scriptString?.getPointer(memScope).rawValue)
    }
}

fun fileOpen(file: CValuesRef<ByteVar>?, mode: Int): Int {
    memScoped {
        return kniBridge126(file?.getPointer(memScope).rawValue, mode)
    }
}

fun fileClose(handle: Int): Int {
    return kniBridge127(handle)
}

fun fileWrite(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge128(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun fileRead(handle: Int, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge129(handle, buf?.getPointer(memScope).rawValue, count)
    }
}

fun fileSeek(handle: Int, seekOffset: int32_t, seekFrom: Int): Int {
    return kniBridge130(handle, seekOffset, seekFrom)
}

fun fileList(fpat: CValuesRef<ByteVar>?, buf: CValuesRef<ByteVar>?, count: Int): Int {
    memScoped {
        return kniBridge131(fpat?.getPointer(memScope).rawValue, buf?.getPointer(memScope).rawValue, count)
    }
}

fun gpioCfgBufferSize(cfgMillis: Int): Int {
    return kniBridge132(cfgMillis)
}

fun gpioCfgClock(cfgMicros: Int, cfgPeripheral: Int, cfgSource: Int): Int {
    return kniBridge133(cfgMicros, cfgPeripheral, cfgSource)
}

fun gpioCfgDMAchannel(DMAchannel: Int): Int {
    return kniBridge134(DMAchannel)
}

fun gpioCfgDMAchannels(primaryChannel: Int, secondaryChannel: Int): Int {
    return kniBridge135(primaryChannel, secondaryChannel)
}

fun gpioCfgPermissions(updateMask: uint64_t): Int {
    return kniBridge136(updateMask)
}

fun gpioCfgSocketPort(port: Int): Int {
    return kniBridge137(port)
}

fun gpioCfgInterfaces(ifFlags: Int): Int {
    return kniBridge138(ifFlags)
}

fun gpioCfgMemAlloc(memAllocMode: Int): Int {
    return kniBridge139(memAllocMode)
}

fun gpioCfgNetAddr(numSockAddr: Int, sockAddr: CValuesRef<uint32_tVar>?): Int {
    memScoped {
        return kniBridge140(numSockAddr, sockAddr?.getPointer(memScope).rawValue)
    }
}

fun gpioCfgInternals(cfgWhat: Int, cfgVal: Int): Int {
    return kniBridge141(cfgWhat, cfgVal)
}

fun gpioCfgGetInternals(): uint32_t {
    return kniBridge142()
}

fun gpioCfgSetInternals(cfgVal: uint32_t): Int {
    return kniBridge143(cfgVal)
}

fun gpioCustom1(arg1: Int, arg2: Int, argx: CValuesRef<ByteVar>?, argc: Int): Int {
    memScoped {
        return kniBridge144(arg1, arg2, argx?.getPointer(memScope).rawValue, argc)
    }
}

fun gpioCustom2(arg1: Int, argx: CValuesRef<ByteVar>?, argc: Int, retBuf: CValuesRef<ByteVar>?, retMax: Int): Int {
    memScoped {
        return kniBridge145(arg1, argx?.getPointer(memScope).rawValue, argc, retBuf?.getPointer(memScope).rawValue, retMax)
    }
}

fun rawWaveAddSPI(spi: CValuesRef<rawSPI_t>?, offset: Int, spiSS: Int, buf: CValuesRef<ByteVar>?, spiTxBits: Int, spiBitFirst: Int, spiBitLast: Int, spiBits: Int): Int {
    memScoped {
        return kniBridge146(spi?.getPointer(memScope).rawValue, offset, spiSS, buf?.getPointer(memScope).rawValue, spiTxBits, spiBitFirst, spiBitLast, spiBits)
    }
}

fun rawWaveAddGeneric(numPulses: Int, pulses: CValuesRef<rawWave_t>?): Int {
    memScoped {
        return kniBridge147(numPulses, pulses?.getPointer(memScope).rawValue)
    }
}

fun rawWaveCB(): Int {
    return kniBridge148()
}

fun rawWaveCBAdr(cbNum: Int): CPointer<rawCbs_t>? {
    return interpretCPointer<rawCbs_t>(kniBridge149(cbNum))
}

fun rawWaveGetOOL(pos: Int): uint32_t {
    return kniBridge150(pos)
}

fun rawWaveSetOOL(pos: Int, lVal: uint32_t): Unit {
    return kniBridge151(pos, lVal)
}

fun rawWaveGetOut(pos: Int): uint32_t {
    return kniBridge152(pos)
}

fun rawWaveSetOut(pos: Int, lVal: uint32_t): Unit {
    return kniBridge153(pos, lVal)
}

fun rawWaveGetIn(pos: Int): uint32_t {
    return kniBridge154(pos)
}

fun rawWaveSetIn(pos: Int, lVal: uint32_t): Unit {
    return kniBridge155(pos, lVal)
}

fun rawWaveInfo(wave_id: Int): CValue<rawWaveInfo_t> {
    val kniRetVal = nativeHeap.alloc<rawWaveInfo_t>()
    try {
        kniBridge156(wave_id, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}

fun getBitInBytes(bitPos: Int, buf: CValuesRef<ByteVar>?, numBits: Int): Int {
    memScoped {
        return kniBridge157(bitPos, buf?.getPointer(memScope).rawValue, numBits)
    }
}

fun putBitInBytes(bitPos: Int, buf: CValuesRef<ByteVar>?, bit: Int): Unit {
    memScoped {
        return kniBridge158(bitPos, buf?.getPointer(memScope).rawValue, bit)
    }
}

fun time_time(): Double {
    return kniBridge159()
}

fun time_sleep(seconds: Double): Unit {
    return kniBridge160(seconds)
}

fun rawDumpWave(): Unit {
    return kniBridge161()
}

fun rawDumpScript(script_id: Int): Unit {
    return kniBridge162(script_id)
}

val PIGPIO_VERSION: Int get() = 67

val PI_INPFIFO: String get() = "\u002Fdev\u002Fpigpio"

val PI_OUTFIFO: String get() = "\u002Fdev\u002Fpigout"

val PI_ERRFIFO: String get() = "\u002Fdev\u002Fpigerr"

val PI_ENVPORT: String get() = "PIGPIO_PORT"

val PI_ENVADDR: String get() = "PIGPIO_ADDR"

val PI_LOCKFILE: String get() = "\u002Fvar\u002Frun\u002Fpigpio.pid"

val PI_I2C_COMBINED: String get() = "\u002Fsys\u002Fmodule\u002Fi2c_bcm2708\u002Fparameters\u002Fcombined"

val WAVE_FLAG_READ: Int get() = 1

val WAVE_FLAG_TICK: Int get() = 2

val BSC_FIFO_SIZE: Int get() = 512

val PI_MIN_GPIO: Int get() = 0

val PI_MAX_GPIO: Int get() = 53

val PI_MAX_USER_GPIO: Int get() = 31

val PI_OFF: Int get() = 0

val PI_ON: Int get() = 1

val PI_CLEAR: Int get() = 0

val PI_SET: Int get() = 1

val PI_LOW: Int get() = 0

val PI_HIGH: Int get() = 1

val PI_TIMEOUT: Int get() = 2

val PI_INPUT: Int get() = 0

val PI_OUTPUT: Int get() = 1

val PI_ALT0: Int get() = 4

val PI_ALT1: Int get() = 5

val PI_ALT2: Int get() = 6

val PI_ALT3: Int get() = 7

val PI_ALT4: Int get() = 3

val PI_ALT5: Int get() = 2

val PI_PUD_OFF: Int get() = 0

val PI_PUD_DOWN: Int get() = 1

val PI_PUD_UP: Int get() = 2

val PI_DEFAULT_DUTYCYCLE_RANGE: Int get() = 255

val PI_MIN_DUTYCYCLE_RANGE: Int get() = 25

val PI_MAX_DUTYCYCLE_RANGE: Int get() = 40000

val PI_SERVO_OFF: Int get() = 0

val PI_MIN_SERVO_PULSEWIDTH: Int get() = 500

val PI_MAX_SERVO_PULSEWIDTH: Int get() = 2500

val PI_HW_PWM_MIN_FREQ: Int get() = 1

val PI_HW_PWM_MAX_FREQ: Int get() = 125000000

val PI_HW_PWM_RANGE: Int get() = 1000000

val PI_HW_CLK_MIN_FREQ: Int get() = 4689

val PI_HW_CLK_MAX_FREQ: Int get() = 250000000

val PI_NOTIFY_SLOTS: Int get() = 32

val PI_NTFY_FLAGS_EVENT: Int get() = 128

val PI_NTFY_FLAGS_ALIVE: Int get() = 64

val PI_NTFY_FLAGS_WDOG: Int get() = 32

val PI_WAVE_BLOCKS: Int get() = 4

val PI_WAVE_MAX_PULSES: Int get() = 12000

val PI_WAVE_MAX_CHARS: Int get() = 1200

val PI_BB_I2C_MIN_BAUD: Int get() = 50

val PI_BB_I2C_MAX_BAUD: Int get() = 500000

val PI_BB_SPI_MIN_BAUD: Int get() = 50

val PI_BB_SPI_MAX_BAUD: Int get() = 250000

val PI_BB_SER_MIN_BAUD: Int get() = 50

val PI_BB_SER_MAX_BAUD: Int get() = 250000

val PI_BB_SER_NORMAL: Int get() = 0

val PI_BB_SER_INVERT: Int get() = 1

val PI_WAVE_MIN_BAUD: Int get() = 50

val PI_WAVE_MAX_BAUD: Int get() = 1000000

val PI_SPI_MIN_BAUD: Int get() = 32000

val PI_SPI_MAX_BAUD: Int get() = 125000000

val PI_MIN_WAVE_DATABITS: Int get() = 1

val PI_MAX_WAVE_DATABITS: Int get() = 32

val PI_MIN_WAVE_HALFSTOPBITS: Int get() = 2

val PI_MAX_WAVE_HALFSTOPBITS: Int get() = 8

val PI_WAVE_MAX_MICROS: Int get() = 1800000000

val PI_MAX_WAVES: Int get() = 250

val PI_MAX_WAVE_CYCLES: Int get() = 65535

val PI_MAX_WAVE_DELAY: Int get() = 65535

val PI_WAVE_COUNT_PAGES: Int get() = 10

val PI_WAVE_MODE_ONE_SHOT: Int get() = 0

val PI_WAVE_MODE_REPEAT: Int get() = 1

val PI_WAVE_MODE_ONE_SHOT_SYNC: Int get() = 2

val PI_WAVE_MODE_REPEAT_SYNC: Int get() = 3

val PI_WAVE_NOT_FOUND: Int get() = 9998

val PI_NO_TX_WAVE: Int get() = 9999

val PI_FILE_SLOTS: Int get() = 16

val PI_I2C_SLOTS: Int get() = 64

val PI_SPI_SLOTS: Int get() = 32

val PI_SER_SLOTS: Int get() = 16

val PI_MAX_I2C_ADDR: Int get() = 127

val PI_NUM_AUX_SPI_CHANNEL: Int get() = 3

val PI_NUM_STD_SPI_CHANNEL: Int get() = 2

val PI_MAX_I2C_DEVICE_COUNT: Int get() = 65536

val PI_MAX_SPI_DEVICE_COUNT: Int get() = 65536

val PI_I2C_RDRW_IOCTL_MAX_MSGS: Int get() = 42

val PI_I2C_M_WR: Int get() = 0

val PI_I2C_M_RD: Int get() = 1

val PI_I2C_M_TEN: Int get() = 16

val PI_I2C_M_RECV_LEN: Int get() = 1024

val PI_I2C_M_NO_RD_ACK: Int get() = 2048

val PI_I2C_M_IGNORE_NAK: Int get() = 4096

val PI_I2C_M_REV_DIR_ADDR: Int get() = 8192

val PI_I2C_M_NOSTART: Int get() = 16384

val PI_I2C_END: Int get() = 0

val PI_I2C_ESC: Int get() = 1

val PI_I2C_START: Int get() = 2

val PI_I2C_COMBINED_ON: Int get() = 2

val PI_I2C_STOP: Int get() = 3

val PI_I2C_COMBINED_OFF: Int get() = 3

val PI_I2C_ADDR: Int get() = 4

val PI_I2C_FLAGS: Int get() = 5

val PI_I2C_READ: Int get() = 6

val PI_I2C_WRITE: Int get() = 7

val BSC_DR: Int get() = 0

val BSC_RSR: Int get() = 1

val BSC_SLV: Int get() = 2

val BSC_CR: Int get() = 3

val BSC_FR: Int get() = 4

val BSC_IFLS: Int get() = 5

val BSC_IMSC: Int get() = 6

val BSC_RIS: Int get() = 7

val BSC_MIS: Int get() = 8

val BSC_ICR: Int get() = 9

val BSC_DMACR: Int get() = 10

val BSC_TDR: Int get() = 11

val BSC_GPUSTAT: Int get() = 12

val BSC_HCTRL: Int get() = 13

val BSC_DEBUG_I2C: Int get() = 14

val BSC_DEBUG_SPI: Int get() = 15

val BSC_CR_TESTFIFO: Int get() = 2048

val BSC_CR_RXE: Int get() = 512

val BSC_CR_TXE: Int get() = 256

val BSC_CR_BRK: Int get() = 128

val BSC_CR_CPOL: Int get() = 16

val BSC_CR_CPHA: Int get() = 8

val BSC_CR_I2C: Int get() = 4

val BSC_CR_SPI: Int get() = 2

val BSC_CR_EN: Int get() = 1

val BSC_FR_RXBUSY: Int get() = 32

val BSC_FR_TXFE: Int get() = 16

val BSC_FR_RXFF: Int get() = 8

val BSC_FR_TXFF: Int get() = 4

val BSC_FR_RXFE: Int get() = 2

val BSC_FR_TXBUSY: Int get() = 1

val BSC_SDA_MOSI: Int get() = 18

val BSC_SCL_SCLK: Int get() = 19

val BSC_MISO: Int get() = 20

val BSC_CE_N: Int get() = 21

val PI_MAX_BUSY_DELAY: Int get() = 100

val PI_MIN_WDOG_TIMEOUT: Int get() = 0

val PI_MAX_WDOG_TIMEOUT: Int get() = 60000

val PI_MIN_TIMER: Int get() = 0

val PI_MAX_TIMER: Int get() = 9

val PI_MIN_MS: Int get() = 10

val PI_MAX_MS: Int get() = 60000

val PI_MAX_SCRIPTS: Int get() = 32

val PI_MAX_SCRIPT_TAGS: Int get() = 50

val PI_MAX_SCRIPT_VARS: Int get() = 150

val PI_MAX_SCRIPT_PARAMS: Int get() = 10

val PI_SCRIPT_INITING: Int get() = 0

val PI_SCRIPT_HALTED: Int get() = 1

val PI_SCRIPT_RUNNING: Int get() = 2

val PI_SCRIPT_WAITING: Int get() = 3

val PI_SCRIPT_FAILED: Int get() = 4

val PI_MIN_SIGNUM: Int get() = 0

val PI_MAX_SIGNUM: Int get() = 63

val PI_TIME_RELATIVE: Int get() = 0

val PI_TIME_ABSOLUTE: Int get() = 1

val PI_MAX_MICS_DELAY: Int get() = 1000000

val PI_MAX_MILS_DELAY: Int get() = 60000

val PI_BUF_MILLIS_MIN: Int get() = 100

val PI_BUF_MILLIS_MAX: Int get() = 10000

val PI_CLOCK_PWM: Int get() = 0

val PI_CLOCK_PCM: Int get() = 1

val PI_MIN_DMA_CHANNEL: Int get() = 0

val PI_MAX_DMA_CHANNEL: Int get() = 14

val PI_MIN_SOCKET_PORT: Int get() = 1024

val PI_MAX_SOCKET_PORT: Int get() = 32000

val PI_DISABLE_FIFO_IF: Int get() = 1

val PI_DISABLE_SOCK_IF: Int get() = 2

val PI_LOCALHOST_SOCK_IF: Int get() = 4

val PI_DISABLE_ALERT: Int get() = 8

val PI_MEM_ALLOC_AUTO: Int get() = 0

val PI_MEM_ALLOC_PAGEMAP: Int get() = 1

val PI_MEM_ALLOC_MAILBOX: Int get() = 2

val PI_MAX_STEADY: Int get() = 300000

val PI_MAX_ACTIVE: Int get() = 1000000

val PI_CFG_DBG_LEVEL: Int get() = 0

val PI_CFG_ALERT_FREQ: Int get() = 4

val PI_CFG_RT_PRIORITY: Int get() = 256

val PI_CFG_STATS: Int get() = 512

val PI_CFG_NOSIGHANDLER: Int get() = 1024

val PI_CFG_ILLEGAL_VAL: Int get() = 2048

val RISING_EDGE: Int get() = 0

val FALLING_EDGE: Int get() = 1

val EITHER_EDGE: Int get() = 2

val PI_MAX_PAD: Int get() = 2

val PI_MIN_PAD_STRENGTH: Int get() = 1

val PI_MAX_PAD_STRENGTH: Int get() = 16

val PI_FILE_NONE: Int get() = 0

val PI_FILE_MIN: Int get() = 1

val PI_FILE_READ: Int get() = 1

val PI_FILE_WRITE: Int get() = 2

val PI_FILE_RW: Int get() = 3

val PI_FILE_APPEND: Int get() = 4

val PI_FILE_CREATE: Int get() = 8

val PI_FILE_TRUNC: Int get() = 16

val PI_FILE_MAX: Int get() = 31

val PI_FROM_START: Int get() = 0

val PI_FROM_CURRENT: Int get() = 1

val PI_FROM_END: Int get() = 2

val MAX_CONNECT_ADDRESSES: Int get() = 256

val PI_MAX_EVENT: Int get() = 31

val PI_EVENT_BSC: Int get() = 31

val PI_CMD_MODES: Int get() = 0

val PI_CMD_MODEG: Int get() = 1

val PI_CMD_PUD: Int get() = 2

val PI_CMD_READ: Int get() = 3

val PI_CMD_WRITE: Int get() = 4

val PI_CMD_PWM: Int get() = 5

val PI_CMD_PRS: Int get() = 6

val PI_CMD_PFS: Int get() = 7

val PI_CMD_SERVO: Int get() = 8

val PI_CMD_WDOG: Int get() = 9

val PI_CMD_BR1: Int get() = 10

val PI_CMD_BR2: Int get() = 11

val PI_CMD_BC1: Int get() = 12

val PI_CMD_BC2: Int get() = 13

val PI_CMD_BS1: Int get() = 14

val PI_CMD_BS2: Int get() = 15

val PI_CMD_TICK: Int get() = 16

val PI_CMD_HWVER: Int get() = 17

val PI_CMD_NO: Int get() = 18

val PI_CMD_NB: Int get() = 19

val PI_CMD_NP: Int get() = 20

val PI_CMD_NC: Int get() = 21

val PI_CMD_PRG: Int get() = 22

val PI_CMD_PFG: Int get() = 23

val PI_CMD_PRRG: Int get() = 24

val PI_CMD_HELP: Int get() = 25

val PI_CMD_PIGPV: Int get() = 26

val PI_CMD_WVCLR: Int get() = 27

val PI_CMD_WVAG: Int get() = 28

val PI_CMD_WVAS: Int get() = 29

val PI_CMD_WVGO: Int get() = 30

val PI_CMD_WVGOR: Int get() = 31

val PI_CMD_WVBSY: Int get() = 32

val PI_CMD_WVHLT: Int get() = 33

val PI_CMD_WVSM: Int get() = 34

val PI_CMD_WVSP: Int get() = 35

val PI_CMD_WVSC: Int get() = 36

val PI_CMD_TRIG: Int get() = 37

val PI_CMD_PROC: Int get() = 38

val PI_CMD_PROCD: Int get() = 39

val PI_CMD_PROCR: Int get() = 40

val PI_CMD_PROCS: Int get() = 41

val PI_CMD_SLRO: Int get() = 42

val PI_CMD_SLR: Int get() = 43

val PI_CMD_SLRC: Int get() = 44

val PI_CMD_PROCP: Int get() = 45

val PI_CMD_MICS: Int get() = 46

val PI_CMD_MILS: Int get() = 47

val PI_CMD_PARSE: Int get() = 48

val PI_CMD_WVCRE: Int get() = 49

val PI_CMD_WVDEL: Int get() = 50

val PI_CMD_WVTX: Int get() = 51

val PI_CMD_WVTXR: Int get() = 52

val PI_CMD_WVNEW: Int get() = 53

val PI_CMD_I2CO: Int get() = 54

val PI_CMD_I2CC: Int get() = 55

val PI_CMD_I2CRD: Int get() = 56

val PI_CMD_I2CWD: Int get() = 57

val PI_CMD_I2CWQ: Int get() = 58

val PI_CMD_I2CRS: Int get() = 59

val PI_CMD_I2CWS: Int get() = 60

val PI_CMD_I2CRB: Int get() = 61

val PI_CMD_I2CWB: Int get() = 62

val PI_CMD_I2CRW: Int get() = 63

val PI_CMD_I2CWW: Int get() = 64

val PI_CMD_I2CRK: Int get() = 65

val PI_CMD_I2CWK: Int get() = 66

val PI_CMD_I2CRI: Int get() = 67

val PI_CMD_I2CWI: Int get() = 68

val PI_CMD_I2CPC: Int get() = 69

val PI_CMD_I2CPK: Int get() = 70

val PI_CMD_SPIO: Int get() = 71

val PI_CMD_SPIC: Int get() = 72

val PI_CMD_SPIR: Int get() = 73

val PI_CMD_SPIW: Int get() = 74

val PI_CMD_SPIX: Int get() = 75

val PI_CMD_SERO: Int get() = 76

val PI_CMD_SERC: Int get() = 77

val PI_CMD_SERRB: Int get() = 78

val PI_CMD_SERWB: Int get() = 79

val PI_CMD_SERR: Int get() = 80

val PI_CMD_SERW: Int get() = 81

val PI_CMD_SERDA: Int get() = 82

val PI_CMD_GDC: Int get() = 83

val PI_CMD_GPW: Int get() = 84

val PI_CMD_HC: Int get() = 85

val PI_CMD_HP: Int get() = 86

val PI_CMD_CF1: Int get() = 87

val PI_CMD_CF2: Int get() = 88

val PI_CMD_BI2CC: Int get() = 89

val PI_CMD_BI2CO: Int get() = 90

val PI_CMD_BI2CZ: Int get() = 91

val PI_CMD_I2CZ: Int get() = 92

val PI_CMD_WVCHA: Int get() = 93

val PI_CMD_SLRI: Int get() = 94

val PI_CMD_CGI: Int get() = 95

val PI_CMD_CSI: Int get() = 96

val PI_CMD_FG: Int get() = 97

val PI_CMD_FN: Int get() = 98

val PI_CMD_NOIB: Int get() = 99

val PI_CMD_WVTXM: Int get() = 100

val PI_CMD_WVTAT: Int get() = 101

val PI_CMD_PADS: Int get() = 102

val PI_CMD_PADG: Int get() = 103

val PI_CMD_FO: Int get() = 104

val PI_CMD_FC: Int get() = 105

val PI_CMD_FR: Int get() = 106

val PI_CMD_FW: Int get() = 107

val PI_CMD_FS: Int get() = 108

val PI_CMD_FL: Int get() = 109

val PI_CMD_SHELL: Int get() = 110

val PI_CMD_BSPIC: Int get() = 111

val PI_CMD_BSPIO: Int get() = 112

val PI_CMD_BSPIX: Int get() = 113

val PI_CMD_BSCX: Int get() = 114

val PI_CMD_EVM: Int get() = 115

val PI_CMD_EVT: Int get() = 116

val PI_CMD_PROCU: Int get() = 117

val PI_CMD_SCRIPT: Int get() = 800

val PI_CMD_ADD: Int get() = 800

val PI_CMD_AND: Int get() = 801

val PI_CMD_CALL: Int get() = 802

val PI_CMD_CMDR: Int get() = 803

val PI_CMD_CMDW: Int get() = 804

val PI_CMD_CMP: Int get() = 805

val PI_CMD_DCR: Int get() = 806

val PI_CMD_DCRA: Int get() = 807

val PI_CMD_DIV: Int get() = 808

val PI_CMD_HALT: Int get() = 809

val PI_CMD_INR: Int get() = 810

val PI_CMD_INRA: Int get() = 811

val PI_CMD_JM: Int get() = 812

val PI_CMD_JMP: Int get() = 813

val PI_CMD_JNZ: Int get() = 814

val PI_CMD_JP: Int get() = 815

val PI_CMD_JZ: Int get() = 816

val PI_CMD_TAG: Int get() = 817

val PI_CMD_LD: Int get() = 818

val PI_CMD_LDA: Int get() = 819

val PI_CMD_LDAB: Int get() = 820

val PI_CMD_MLT: Int get() = 821

val PI_CMD_MOD: Int get() = 822

val PI_CMD_NOP: Int get() = 823

val PI_CMD_OR: Int get() = 824

val PI_CMD_POP: Int get() = 825

val PI_CMD_POPA: Int get() = 826

val PI_CMD_PUSH: Int get() = 827

val PI_CMD_PUSHA: Int get() = 828

val PI_CMD_RET: Int get() = 829

val PI_CMD_RL: Int get() = 830

val PI_CMD_RLA: Int get() = 831

val PI_CMD_RR: Int get() = 832

val PI_CMD_RRA: Int get() = 833

val PI_CMD_STA: Int get() = 834

val PI_CMD_STAB: Int get() = 835

val PI_CMD_SUB: Int get() = 836

val PI_CMD_SYS: Int get() = 837

val PI_CMD_WAIT: Int get() = 838

val PI_CMD_X: Int get() = 839

val PI_CMD_XA: Int get() = 840

val PI_CMD_XOR: Int get() = 841

val PI_CMD_EVTWT: Int get() = 842

val PI_INIT_FAILED: Int get() = -1

val PI_BAD_USER_GPIO: Int get() = -2

val PI_BAD_GPIO: Int get() = -3

val PI_BAD_MODE: Int get() = -4

val PI_BAD_LEVEL: Int get() = -5

val PI_BAD_PUD: Int get() = -6

val PI_BAD_PULSEWIDTH: Int get() = -7

val PI_BAD_DUTYCYCLE: Int get() = -8

val PI_BAD_TIMER: Int get() = -9

val PI_BAD_MS: Int get() = -10

val PI_BAD_TIMETYPE: Int get() = -11

val PI_BAD_SECONDS: Int get() = -12

val PI_BAD_MICROS: Int get() = -13

val PI_TIMER_FAILED: Int get() = -14

val PI_BAD_WDOG_TIMEOUT: Int get() = -15

val PI_NO_ALERT_FUNC: Int get() = -16

val PI_BAD_CLK_PERIPH: Int get() = -17

val PI_BAD_CLK_SOURCE: Int get() = -18

val PI_BAD_CLK_MICROS: Int get() = -19

val PI_BAD_BUF_MILLIS: Int get() = -20

val PI_BAD_DUTYRANGE: Int get() = -21

val PI_BAD_DUTY_RANGE: Int get() = -21

val PI_BAD_SIGNUM: Int get() = -22

val PI_BAD_PATHNAME: Int get() = -23

val PI_NO_HANDLE: Int get() = -24

val PI_BAD_HANDLE: Int get() = -25

val PI_BAD_IF_FLAGS: Int get() = -26

val PI_BAD_CHANNEL: Int get() = -27

val PI_BAD_PRIM_CHANNEL: Int get() = -27

val PI_BAD_SOCKET_PORT: Int get() = -28

val PI_BAD_FIFO_COMMAND: Int get() = -29

val PI_BAD_SECO_CHANNEL: Int get() = -30

val PI_NOT_INITIALISED: Int get() = -31

val PI_INITIALISED: Int get() = -32

val PI_BAD_WAVE_MODE: Int get() = -33

val PI_BAD_CFG_INTERNAL: Int get() = -34

val PI_BAD_WAVE_BAUD: Int get() = -35

val PI_TOO_MANY_PULSES: Int get() = -36

val PI_TOO_MANY_CHARS: Int get() = -37

val PI_NOT_SERIAL_GPIO: Int get() = -38

val PI_BAD_SERIAL_STRUC: Int get() = -39

val PI_BAD_SERIAL_BUF: Int get() = -40

val PI_NOT_PERMITTED: Int get() = -41

val PI_SOME_PERMITTED: Int get() = -42

val PI_BAD_WVSC_COMMND: Int get() = -43

val PI_BAD_WVSM_COMMND: Int get() = -44

val PI_BAD_WVSP_COMMND: Int get() = -45

val PI_BAD_PULSELEN: Int get() = -46

val PI_BAD_SCRIPT: Int get() = -47

val PI_BAD_SCRIPT_ID: Int get() = -48

val PI_BAD_SER_OFFSET: Int get() = -49

val PI_GPIO_IN_USE: Int get() = -50

val PI_BAD_SERIAL_COUNT: Int get() = -51

val PI_BAD_PARAM_NUM: Int get() = -52

val PI_DUP_TAG: Int get() = -53

val PI_TOO_MANY_TAGS: Int get() = -54

val PI_BAD_SCRIPT_CMD: Int get() = -55

val PI_BAD_VAR_NUM: Int get() = -56

val PI_NO_SCRIPT_ROOM: Int get() = -57

val PI_NO_MEMORY: Int get() = -58

val PI_SOCK_READ_FAILED: Int get() = -59

val PI_SOCK_WRIT_FAILED: Int get() = -60

val PI_TOO_MANY_PARAM: Int get() = -61

val PI_NOT_HALTED: Int get() = -62

val PI_SCRIPT_NOT_READY: Int get() = -62

val PI_BAD_TAG: Int get() = -63

val PI_BAD_MICS_DELAY: Int get() = -64

val PI_BAD_MILS_DELAY: Int get() = -65

val PI_BAD_WAVE_ID: Int get() = -66

val PI_TOO_MANY_CBS: Int get() = -67

val PI_TOO_MANY_OOL: Int get() = -68

val PI_EMPTY_WAVEFORM: Int get() = -69

val PI_NO_WAVEFORM_ID: Int get() = -70

val PI_I2C_OPEN_FAILED: Int get() = -71

val PI_SER_OPEN_FAILED: Int get() = -72

val PI_SPI_OPEN_FAILED: Int get() = -73

val PI_BAD_I2C_BUS: Int get() = -74

val PI_BAD_I2C_ADDR: Int get() = -75

val PI_BAD_SPI_CHANNEL: Int get() = -76

val PI_BAD_FLAGS: Int get() = -77

val PI_BAD_SPI_SPEED: Int get() = -78

val PI_BAD_SER_DEVICE: Int get() = -79

val PI_BAD_SER_SPEED: Int get() = -80

val PI_BAD_PARAM: Int get() = -81

val PI_I2C_WRITE_FAILED: Int get() = -82

val PI_I2C_READ_FAILED: Int get() = -83

val PI_BAD_SPI_COUNT: Int get() = -84

val PI_SER_WRITE_FAILED: Int get() = -85

val PI_SER_READ_FAILED: Int get() = -86

val PI_SER_READ_NO_DATA: Int get() = -87

val PI_UNKNOWN_COMMAND: Int get() = -88

val PI_SPI_XFER_FAILED: Int get() = -89

val PI_BAD_POINTER: Int get() = -90

val PI_NO_AUX_SPI: Int get() = -91

val PI_NOT_PWM_GPIO: Int get() = -92

val PI_NOT_SERVO_GPIO: Int get() = -93

val PI_NOT_HCLK_GPIO: Int get() = -94

val PI_NOT_HPWM_GPIO: Int get() = -95

val PI_BAD_HPWM_FREQ: Int get() = -96

val PI_BAD_HPWM_DUTY: Int get() = -97

val PI_BAD_HCLK_FREQ: Int get() = -98

val PI_BAD_HCLK_PASS: Int get() = -99

val PI_HPWM_ILLEGAL: Int get() = -100

val PI_BAD_DATABITS: Int get() = -101

val PI_BAD_STOPBITS: Int get() = -102

val PI_MSG_TOOBIG: Int get() = -103

val PI_BAD_MALLOC_MODE: Int get() = -104

val PI_TOO_MANY_SEGS: Int get() = -105

val PI_BAD_I2C_SEG: Int get() = -106

val PI_BAD_SMBUS_CMD: Int get() = -107

val PI_NOT_I2C_GPIO: Int get() = -108

val PI_BAD_I2C_WLEN: Int get() = -109

val PI_BAD_I2C_RLEN: Int get() = -110

val PI_BAD_I2C_CMD: Int get() = -111

val PI_BAD_I2C_BAUD: Int get() = -112

val PI_CHAIN_LOOP_CNT: Int get() = -113

val PI_BAD_CHAIN_LOOP: Int get() = -114

val PI_CHAIN_COUNTER: Int get() = -115

val PI_BAD_CHAIN_CMD: Int get() = -116

val PI_BAD_CHAIN_DELAY: Int get() = -117

val PI_CHAIN_NESTING: Int get() = -118

val PI_CHAIN_TOO_BIG: Int get() = -119

val PI_DEPRECATED: Int get() = -120

val PI_BAD_SER_INVERT: Int get() = -121

val PI_BAD_EDGE: Int get() = -122

val PI_BAD_ISR_INIT: Int get() = -123

val PI_BAD_FOREVER: Int get() = -124

val PI_BAD_FILTER: Int get() = -125

val PI_BAD_PAD: Int get() = -126

val PI_BAD_STRENGTH: Int get() = -127

val PI_FIL_OPEN_FAILED: Int get() = -128

val PI_BAD_FILE_MODE: Int get() = -129

val PI_BAD_FILE_FLAG: Int get() = -130

val PI_BAD_FILE_READ: Int get() = -131

val PI_BAD_FILE_WRITE: Int get() = -132

val PI_FILE_NOT_ROPEN: Int get() = -133

val PI_FILE_NOT_WOPEN: Int get() = -134

val PI_BAD_FILE_SEEK: Int get() = -135

val PI_NO_FILE_MATCH: Int get() = -136

val PI_NO_FILE_ACCESS: Int get() = -137

val PI_FILE_IS_A_DIR: Int get() = -138

val PI_BAD_SHELL_STATUS: Int get() = -139

val PI_BAD_SCRIPT_NAME: Int get() = -140

val PI_BAD_SPI_BAUD: Int get() = -141

val PI_NOT_SPI_GPIO: Int get() = -142

val PI_BAD_EVENT_ID: Int get() = -143

val PI_CMD_INTERRUPTED: Int get() = -144

val PI_PIGIF_ERR_0: Int get() = -2000

val PI_PIGIF_ERR_99: Int get() = -2099

val PI_CUSTOM_ERR_0: Int get() = -3000

val PI_CUSTOM_ERR_999: Int get() = -3999

val PI_DEFAULT_BUFFER_MILLIS: Int get() = 120

val PI_DEFAULT_CLK_MICROS: Int get() = 5

val PI_DEFAULT_CLK_PERIPHERAL: Int get() = 1

val PI_DEFAULT_IF_FLAGS: Int get() = 0

val PI_DEFAULT_FOREGROUND: Int get() = 0

val PI_DEFAULT_DMA_CHANNEL: Int get() = 14

val PI_DEFAULT_DMA_PRIMARY_CHANNEL: Int get() = 14

val PI_DEFAULT_DMA_SECONDARY_CHANNEL: Int get() = 6

val PI_DEFAULT_SOCKET_PORT: Int get() = 8888

val PI_DEFAULT_SOCKET_PORT_STR: String get() = "8888"

val PI_DEFAULT_SOCKET_ADDR_STR: String get() = "127.0.0.1"

val PI_DEFAULT_UPDATE_MASK_UNKNOWN: Long get() = 268435452

val PI_DEFAULT_UPDATE_MASK_B1: Int get() = 65523603

val PI_DEFAULT_UPDATE_MASK_A_B2: Int get() = -70791268

val PI_DEFAULT_UPDATE_MASK_APLUS_BPLUS: Long get() = 141046994436092

val PI_DEFAULT_UPDATE_MASK_ZERO: Long get() = 140737756790780

val PI_DEFAULT_UPDATE_MASK_PI2B: Long get() = 141046994436092

val PI_DEFAULT_UPDATE_MASK_PI3B: Long get() = 268435452

val PI_DEFAULT_UPDATE_MASK_COMPUTE: Long get() = 281474976710655

val PI_DEFAULT_MEM_ALLOC_MODE: Int get() = 0

val PI_DEFAULT_CFG_INTERNALS: Int get() = 0

class gpioHeader_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(4, 2)
    
    var func: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var size: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
}

class gpioExtent_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var size: size_t
        get() = memberAt<size_tVar>(0).value
        set(value) { memberAt<size_tVar>(0).value = value }
    
    var ptr: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(4).value
        set(value) { memberAt<COpaquePointerVar>(4).value = value }
    
    var data: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
}

class gpioSample_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var tick: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var level: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
}

class gpioReport_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var seqno: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var flags: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var tick: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var level: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
}

class gpioPulse_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var gpioOn: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var gpioOff: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var usDelay: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
}

class rawWave_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 4)
    
    var gpioOn: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var gpioOff: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var usDelay: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
    var flags: uint32_t
        get() = memberAt<uint32_tVar>(12).value
        set(value) { memberAt<uint32_tVar>(12).value = value }
    
}

class rawWaveInfo_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 2)
    
    var botCB: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var topCB: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var botOOL: uint16_t
        get() = memberAt<uint16_tVar>(4).value
        set(value) { memberAt<uint16_tVar>(4).value = value }
    
    var topOOL: uint16_t
        get() = memberAt<uint16_tVar>(6).value
        set(value) { memberAt<uint16_tVar>(6).value = value }
    
    var deleted: uint16_t
        get() = memberAt<uint16_tVar>(8).value
        set(value) { memberAt<uint16_tVar>(8).value = value }
    
    var numCB: uint16_t
        get() = memberAt<uint16_tVar>(10).value
        set(value) { memberAt<uint16_tVar>(10).value = value }
    
    var numBOOL: uint16_t
        get() = memberAt<uint16_tVar>(12).value
        set(value) { memberAt<uint16_tVar>(12).value = value }
    
    var numTOOL: uint16_t
        get() = memberAt<uint16_tVar>(14).value
        set(value) { memberAt<uint16_tVar>(14).value = value }
    
}

class rawSPI_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var clk: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var mosi: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var miso: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var ss_pol: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    var ss_us: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var clk_pol: Int
        get() = memberAt<IntVar>(20).value
        set(value) { memberAt<IntVar>(20).value = value }
    
    var clk_pha: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var clk_us: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
}

class rawCbs_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var info: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var src: uint32_t
        get() = memberAt<uint32_tVar>(4).value
        set(value) { memberAt<uint32_tVar>(4).value = value }
    
    var dst: uint32_t
        get() = memberAt<uint32_tVar>(8).value
        set(value) { memberAt<uint32_tVar>(8).value = value }
    
    var length: uint32_t
        get() = memberAt<uint32_tVar>(12).value
        set(value) { memberAt<uint32_tVar>(12).value = value }
    
    var stride: uint32_t
        get() = memberAt<uint32_tVar>(16).value
        set(value) { memberAt<uint32_tVar>(16).value = value }
    
    var next: uint32_t
        get() = memberAt<uint32_tVar>(20).value
        set(value) { memberAt<uint32_tVar>(20).value = value }
    
    val pad: CArrayPointer<uint32_tVar>
        get() = arrayMemberAt(24)
    
}

class pi_i2c_msg_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(12, 4)
    
    var addr: uint16_t
        get() = memberAt<uint16_tVar>(0).value
        set(value) { memberAt<uint16_tVar>(0).value = value }
    
    var flags: uint16_t
        get() = memberAt<uint16_tVar>(2).value
        set(value) { memberAt<uint16_tVar>(2).value = value }
    
    var len: uint16_t
        get() = memberAt<uint16_tVar>(4).value
        set(value) { memberAt<uint16_tVar>(4).value = value }
    
    var buf: CPointer<uint8_tVar>?
        get() = memberAt<CPointerVar<uint8_tVar>>(8).value
        set(value) { memberAt<CPointerVar<uint8_tVar>>(8).value = value }
    
}

class bsc_xfer_t(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(1036, 4)
    
    var control: uint32_t
        get() = memberAt<uint32_tVar>(0).value
        set(value) { memberAt<uint32_tVar>(0).value = value }
    
    var rxCnt: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    val rxBuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(8)
    
    var txCnt: Int
        get() = memberAt<IntVar>(520).value
        set(value) { memberAt<IntVar>(520).value = value }
    
    val txBuf: CArrayPointer<ByteVar>
        get() = arrayMemberAt(524)
    
}

typealias gpioAlertFunc_tVar = CPointerVarOf<gpioAlertFunc_t>
typealias gpioAlertFunc_t = CPointer<CFunction<(Int, Int, uint32_t) -> Unit>>

typealias gpioAlertFuncEx_tVar = CPointerVarOf<gpioAlertFuncEx_t>
typealias gpioAlertFuncEx_t = CPointer<CFunction<(Int, Int, uint32_t, COpaquePointer?) -> Unit>>

typealias eventFunc_tVar = CPointerVarOf<eventFunc_t>
typealias eventFunc_t = CPointer<CFunction<(Int, uint32_t) -> Unit>>

typealias eventFuncEx_tVar = CPointerVarOf<eventFuncEx_t>
typealias eventFuncEx_t = CPointer<CFunction<(Int, uint32_t, COpaquePointer?) -> Unit>>

typealias gpioISRFunc_tVar = CPointerVarOf<gpioISRFunc_t>
typealias gpioISRFunc_t = CPointer<CFunction<(Int, Int, uint32_t) -> Unit>>

typealias gpioISRFuncEx_tVar = CPointerVarOf<gpioISRFuncEx_t>
typealias gpioISRFuncEx_t = CPointer<CFunction<(Int, Int, uint32_t, COpaquePointer?) -> Unit>>

typealias gpioTimerFunc_tVar = CPointerVarOf<gpioTimerFunc_t>
typealias gpioTimerFunc_t = CPointer<CFunction<() -> Unit>>

typealias gpioTimerFuncEx_tVar = CPointerVarOf<gpioTimerFuncEx_t>
typealias gpioTimerFuncEx_t = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias gpioSignalFunc_tVar = CPointerVarOf<gpioSignalFunc_t>
typealias gpioSignalFunc_t = CPointer<CFunction<(Int) -> Unit>>

typealias gpioSignalFuncEx_tVar = CPointerVarOf<gpioSignalFuncEx_t>
typealias gpioSignalFuncEx_t = CPointer<CFunction<(Int, COpaquePointer?) -> Unit>>

typealias gpioGetSamplesFunc_tVar = CPointerVarOf<gpioGetSamplesFunc_t>
typealias gpioGetSamplesFunc_t = CPointer<CFunction<(CPointer<gpioSample_t>?, Int) -> Unit>>

typealias gpioGetSamplesFuncEx_tVar = CPointerVarOf<gpioGetSamplesFuncEx_t>
typealias gpioGetSamplesFuncEx_t = CPointer<CFunction<(CPointer<gpioSample_t>?, Int, COpaquePointer?) -> Unit>>

typealias gpioThreadFunc_t = CFunction<(COpaquePointer?) -> COpaquePointer?>

@SymbolName("pigpio_kniBridge0")
private external fun kniBridge0(): Int
@SymbolName("pigpio_kniBridge1")
private external fun kniBridge1(): Unit
@SymbolName("pigpio_kniBridge2")
private external fun kniBridge2(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge3")
private external fun kniBridge3(p0: Int): Int
@SymbolName("pigpio_kniBridge4")
private external fun kniBridge4(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge5")
private external fun kniBridge5(p0: Int): Int
@SymbolName("pigpio_kniBridge6")
private external fun kniBridge6(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge7")
private external fun kniBridge7(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge8")
private external fun kniBridge8(p0: Int): Int
@SymbolName("pigpio_kniBridge9")
private external fun kniBridge9(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge10")
private external fun kniBridge10(p0: Int): Int
@SymbolName("pigpio_kniBridge11")
private external fun kniBridge11(p0: Int): Int
@SymbolName("pigpio_kniBridge12")
private external fun kniBridge12(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge13")
private external fun kniBridge13(p0: Int): Int
@SymbolName("pigpio_kniBridge14")
private external fun kniBridge14(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge15")
private external fun kniBridge15(p0: Int): Int
@SymbolName("pigpio_kniBridge16")
private external fun kniBridge16(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge17")
private external fun kniBridge17(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge18")
private external fun kniBridge18(p0: Int, p1: Int, p2: Int, p3: NativePtr): Int
@SymbolName("pigpio_kniBridge19")
private external fun kniBridge19(p0: Int, p1: Int, p2: Int, p3: NativePtr, p4: NativePtr): Int
@SymbolName("pigpio_kniBridge20")
private external fun kniBridge20(): Int
@SymbolName("pigpio_kniBridge21")
private external fun kniBridge21(p0: Int): Int
@SymbolName("pigpio_kniBridge22")
private external fun kniBridge22(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge23")
private external fun kniBridge23(p0: Int): Int
@SymbolName("pigpio_kniBridge24")
private external fun kniBridge24(p0: Int): Int
@SymbolName("pigpio_kniBridge25")
private external fun kniBridge25(): Int
@SymbolName("pigpio_kniBridge26")
private external fun kniBridge26(): Int
@SymbolName("pigpio_kniBridge27")
private external fun kniBridge27(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge28")
private external fun kniBridge28(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int, p6: NativePtr): Int
@SymbolName("pigpio_kniBridge29")
private external fun kniBridge29(): Int
@SymbolName("pigpio_kniBridge30")
private external fun kniBridge30(p0: Int): Int
@SymbolName("pigpio_kniBridge31")
private external fun kniBridge31(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: Int): Int
@SymbolName("pigpio_kniBridge33")
private external fun kniBridge33(): Int
@SymbolName("pigpio_kniBridge34")
private external fun kniBridge34(): Int
@SymbolName("pigpio_kniBridge35")
private external fun kniBridge35(): Int
@SymbolName("pigpio_kniBridge36")
private external fun kniBridge36(): Int
@SymbolName("pigpio_kniBridge37")
private external fun kniBridge37(): Int
@SymbolName("pigpio_kniBridge38")
private external fun kniBridge38(): Int
@SymbolName("pigpio_kniBridge39")
private external fun kniBridge39(): Int
@SymbolName("pigpio_kniBridge40")
private external fun kniBridge40(): Int
@SymbolName("pigpio_kniBridge41")
private external fun kniBridge41(): Int
@SymbolName("pigpio_kniBridge42")
private external fun kniBridge42(): Int
@SymbolName("pigpio_kniBridge43")
private external fun kniBridge43(): Int
@SymbolName("pigpio_kniBridge44")
private external fun kniBridge44(): Int
@SymbolName("pigpio_kniBridge45")
private external fun kniBridge45(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge46")
private external fun kniBridge46(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge47")
private external fun kniBridge47(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge48")
private external fun kniBridge48(p0: Int): Int
@SymbolName("pigpio_kniBridge49")
private external fun kniBridge49(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge50")
private external fun kniBridge50(p0: Int): Int
@SymbolName("pigpio_kniBridge51")
private external fun kniBridge51(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge52")
private external fun kniBridge52(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge53")
private external fun kniBridge53(p0: Int): Int
@SymbolName("pigpio_kniBridge54")
private external fun kniBridge54(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge55")
private external fun kniBridge55(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge56")
private external fun kniBridge56(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge57")
private external fun kniBridge57(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge58")
private external fun kniBridge58(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge59")
private external fun kniBridge59(p0: Int, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge60")
private external fun kniBridge60(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge61")
private external fun kniBridge61(p0: Int, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge62")
private external fun kniBridge62(p0: Int, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge63")
private external fun kniBridge63(p0: Int, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge64")
private external fun kniBridge64(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge65")
private external fun kniBridge65(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge66")
private external fun kniBridge66(p0: Int): Unit
@SymbolName("pigpio_kniBridge67")
private external fun kniBridge67(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge68")
private external fun kniBridge68(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr, p4: Int): Int
@SymbolName("pigpio_kniBridge69")
private external fun kniBridge69(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge70")
private external fun kniBridge70(p0: Int): Int
@SymbolName("pigpio_kniBridge71")
private external fun kniBridge71(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr, p4: Int): Int
@SymbolName("pigpio_kniBridge72")
private external fun kniBridge72(p0: NativePtr): Int
@SymbolName("pigpio_kniBridge73")
private external fun kniBridge73(p0: Int, p1: Int, p2: Int, p3: Int, p4: Int, p5: Int): Int
@SymbolName("pigpio_kniBridge74")
private external fun kniBridge74(p0: Int): Int
@SymbolName("pigpio_kniBridge75")
private external fun kniBridge75(p0: Int, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge76")
private external fun kniBridge76(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge77")
private external fun kniBridge77(p0: Int): Int
@SymbolName("pigpio_kniBridge78")
private external fun kniBridge78(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge79")
private external fun kniBridge79(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge80")
private external fun kniBridge80(p0: Int, p1: NativePtr, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge82")
private external fun kniBridge82(p0: Int): Int
@SymbolName("pigpio_kniBridge83")
private external fun kniBridge83(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge84")
private external fun kniBridge84(p0: Int): Int
@SymbolName("pigpio_kniBridge85")
private external fun kniBridge85(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge86")
private external fun kniBridge86(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge87")
private external fun kniBridge87(p0: Int): Int
@SymbolName("pigpio_kniBridge88")
private external fun kniBridge88(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge89")
private external fun kniBridge89(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge90")
private external fun kniBridge90(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge91")
private external fun kniBridge91(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge92")
private external fun kniBridge92(p0: NativePtr, p1: Int): Int
@SymbolName("pigpio_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge94")
private external fun kniBridge94(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge95")
private external fun kniBridge95(p0: Int, p1: Int, p2: NativePtr, p3: NativePtr): Int
@SymbolName("pigpio_kniBridge96")
private external fun kniBridge96(p0: NativePtr): Unit
@SymbolName("pigpio_kniBridge97")
private external fun kniBridge97(p0: NativePtr): Int
@SymbolName("pigpio_kniBridge98")
private external fun kniBridge98(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge99")
private external fun kniBridge99(p0: Int, p1: Int, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge100")
private external fun kniBridge100(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge101")
private external fun kniBridge101(p0: Int): Int
@SymbolName("pigpio_kniBridge102")
private external fun kniBridge102(p0: Int): Int
@SymbolName("pigpio_kniBridge103")
private external fun kniBridge103(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge104")
private external fun kniBridge104(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge105")
private external fun kniBridge105(): Int
@SymbolName("pigpio_kniBridge106")
private external fun kniBridge106(): Int
@SymbolName("pigpio_kniBridge107")
private external fun kniBridge107(p0: Int): Int
@SymbolName("pigpio_kniBridge108")
private external fun kniBridge108(p0: Int): Int
@SymbolName("pigpio_kniBridge109")
private external fun kniBridge109(p0: Int): Int
@SymbolName("pigpio_kniBridge110")
private external fun kniBridge110(p0: Int): Int
@SymbolName("pigpio_kniBridge111")
private external fun kniBridge111(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge112")
private external fun kniBridge112(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge113")
private external fun kniBridge113(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge114")
private external fun kniBridge114(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge115")
private external fun kniBridge115(p0: Int): Int
@SymbolName("pigpio_kniBridge116")
private external fun kniBridge116(): Int
@SymbolName("pigpio_kniBridge117")
private external fun kniBridge117(): Int
@SymbolName("pigpio_kniBridge118")
private external fun kniBridge118(): Int
@SymbolName("pigpio_kniBridge119")
private external fun kniBridge119(p0: Int): Int
@SymbolName("pigpio_kniBridge120")
private external fun kniBridge120(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge121")
private external fun kniBridge121(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge122")
private external fun kniBridge122(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge123")
private external fun kniBridge123(p0: Int, p1: NativePtr, p2: NativePtr): Int
@SymbolName("pigpio_kniBridge124")
private external fun kniBridge124(p0: Int): Int
@SymbolName("pigpio_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge126")
private external fun kniBridge126(p0: NativePtr, p1: Int): Int
@SymbolName("pigpio_kniBridge127")
private external fun kniBridge127(p0: Int): Int
@SymbolName("pigpio_kniBridge128")
private external fun kniBridge128(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge129")
private external fun kniBridge129(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge130")
private external fun kniBridge130(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge132")
private external fun kniBridge132(p0: Int): Int
@SymbolName("pigpio_kniBridge133")
private external fun kniBridge133(p0: Int, p1: Int, p2: Int): Int
@SymbolName("pigpio_kniBridge134")
private external fun kniBridge134(p0: Int): Int
@SymbolName("pigpio_kniBridge135")
private external fun kniBridge135(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge136")
private external fun kniBridge136(p0: Long): Int
@SymbolName("pigpio_kniBridge137")
private external fun kniBridge137(p0: Int): Int
@SymbolName("pigpio_kniBridge138")
private external fun kniBridge138(p0: Int): Int
@SymbolName("pigpio_kniBridge139")
private external fun kniBridge139(p0: Int): Int
@SymbolName("pigpio_kniBridge140")
private external fun kniBridge140(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge141")
private external fun kniBridge141(p0: Int, p1: Int): Int
@SymbolName("pigpio_kniBridge142")
private external fun kniBridge142(): Int
@SymbolName("pigpio_kniBridge143")
private external fun kniBridge143(p0: Int): Int
@SymbolName("pigpio_kniBridge144")
private external fun kniBridge144(p0: Int, p1: Int, p2: NativePtr, p3: Int): Int
@SymbolName("pigpio_kniBridge145")
private external fun kniBridge145(p0: Int, p1: NativePtr, p2: Int, p3: NativePtr, p4: Int): Int
@SymbolName("pigpio_kniBridge146")
private external fun kniBridge146(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr, p4: Int, p5: Int, p6: Int, p7: Int): Int
@SymbolName("pigpio_kniBridge147")
private external fun kniBridge147(p0: Int, p1: NativePtr): Int
@SymbolName("pigpio_kniBridge148")
private external fun kniBridge148(): Int
@SymbolName("pigpio_kniBridge149")
private external fun kniBridge149(p0: Int): NativePtr
@SymbolName("pigpio_kniBridge150")
private external fun kniBridge150(p0: Int): Int
@SymbolName("pigpio_kniBridge151")
private external fun kniBridge151(p0: Int, p1: Int): Unit
@SymbolName("pigpio_kniBridge152")
private external fun kniBridge152(p0: Int): Int
@SymbolName("pigpio_kniBridge153")
private external fun kniBridge153(p0: Int, p1: Int): Unit
@SymbolName("pigpio_kniBridge154")
private external fun kniBridge154(p0: Int): Int
@SymbolName("pigpio_kniBridge155")
private external fun kniBridge155(p0: Int, p1: Int): Unit
@SymbolName("pigpio_kniBridge156")
private external fun kniBridge156(p0: Int, p1: NativePtr): Unit
@SymbolName("pigpio_kniBridge157")
private external fun kniBridge157(p0: Int, p1: NativePtr, p2: Int): Int
@SymbolName("pigpio_kniBridge158")
private external fun kniBridge158(p0: Int, p1: NativePtr, p2: Int): Unit
@SymbolName("pigpio_kniBridge159")
private external fun kniBridge159(): Double
@SymbolName("pigpio_kniBridge160")
private external fun kniBridge160(p0: Double): Unit
@SymbolName("pigpio_kniBridge161")
private external fun kniBridge161(): Unit
@SymbolName("pigpio_kniBridge162")
private external fun kniBridge162(p0: Int): Unit
