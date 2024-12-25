// class, get() and set() methods, constructors(default, parameterized, primary and secondary)
fun main() {
    val smartTvDevice = SmartDevice()
    println("Device name is: ${smartTvDevice.name}")
    println("Device volume: ${smartTvDevice.speakerVolume}")
    smartTvDevice.speakerVolume = 120           // Range 0 - 100
    println("Update volume: ${smartTvDevice.speakerVolume}")        // Returns Default value: 50
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()

    val device = Device("Apple TV" , "Entertainment")
    println("Device name: ${device.name}")
    println("Category: ${device.category}")
    println("Status: ${device.deviceStatus}")

    val vehicle = Vehicle("Tesla", "X", 0)
    println("Vehicle: ${vehicle.name}")
    println("Category: ${vehicle.category}")
    println("Status: ${vehicle.status}")
}

/*
class SmartDevice {
    val name = "Android TV"
    val category = "Entertainment"
    var deviceStatus = "online"

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}
*/


// Get and Set Functions
class SmartDevice {
    val name = "Android TV"
    //val category = "Entertainment"
    //var deviceStatus = "online"
    var speakerVolume = 50           // Default value = 50
        //get() = field           // get() -> read the value
        set(value) {            // set() -> update the value
            if(value in 0..100) {           // set the value from 0-100
                field = value           // assign the "value" to the "field" variable
            } else {
                println("Invalid Value: $value. Speaker volume must be between 0 and 100")
            }
        }

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

// Default Constructor -> class Device() {}
// Parameterized Constructor
class Device(val name:String, val category: String) {
    var deviceStatus = "online"
}

// Primary and Secondary Constructor
// Primary constructor = default or parameterized without body. class has single primary constructor
// Secondary constructor = can have multiple secondary constructor, initialize primary constructor if available

class Vehicle(val name: String, val category: String) {
    var status = "Online"
    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        status = when (statusCode) {
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }
    }
}