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

    private var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

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
    private var brightnessLevel = 0
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

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

fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Andriod Tv", "Entertainment")
    smartDevice.turnOn()
    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}
