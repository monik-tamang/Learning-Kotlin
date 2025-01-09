open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false, var isPhoneFolded: Boolean = false) : Phone(isScreenLightOn) {


    fun fold() {
        isPhoneFolded = true
        println("The phone is now folded.")
    }

    fun unFold() {
        isPhoneFolded = false
        println("The phone is now unfolded.")
    }

    override fun switchOn() {
        if (!isPhoneFolded) {
            super.switchOn()
            println("The screen is now on.")
        } else {
            println("Cannot turn on the screen because the phone is folded.")
        }
    }
}

fun main() {
    val foldablePhone = FoldablePhone()

    foldablePhone.checkPhoneScreenLight()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.fold()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.switchOn()
    foldablePhone.unFold()
    foldablePhone.switchOff()
    foldablePhone.checkPhoneScreenLight()
}
