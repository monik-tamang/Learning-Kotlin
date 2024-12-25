// by keyword to use delegate (class that handles setter and getter which makes the code cleaner and reusable)

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// override(function and variable), open(class and function), super
// public private and protected for variables, functions, classes and constructors
open class SmartDevice protected constructor (val name: String, val category: String) {        //open -> to extend the class
    var deviceStatus = "online"         // can only be accessed within the class
        protected set
    open val deviceType = "unknown"

    open fun turnOn() {         // open -> override the function as subclass can use the function too
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }

}


class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(intialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(intialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increase to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println("$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber.") // + is used so can we can write on the next line
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off.")
    }
}


class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {
    override val deviceType = "Smart Light"
    private var brightnessLevel by RangeRegulator(intialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {         // override -> same function exists on sub and super class
        super.turnOn()          // super to call the function of superclass
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off.")
    }
}


class SmartHome (
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice,
) {
    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

class RangeRegulator(
    intialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = intialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Andriod Tv", "Entertainment")
    smartDevice.turnOn()
    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}
