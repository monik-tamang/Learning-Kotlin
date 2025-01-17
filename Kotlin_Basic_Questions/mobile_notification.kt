fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
    printNotificationSummary(null)
}

fun printNotificationSummary(numberOfMessage: (Int)?) {
    if (numberOfMessage != null) {
        if (numberOfMessage < 100) {
            println("You have $numberOfMessage notifications.")
        } else {
            println ("Your phone is blowing up! You have 99+ notifications.")
        }
    } else {
        println("You have no notifications.")
    }
}

