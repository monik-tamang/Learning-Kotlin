fun main() {
    val number = 5

    when (number) {
        // only one of the condition will be chosen like if else condition
        !in 10..20 -> println("The number is not between 10 to 20.") // number not in between
        12, 7, 14 -> println("The number is $number.") // if one of the number is true
        in 1..10 -> println("The number is between 1 to 10.") // number is in between
        else -> println("The number is $number.") // if neither of the condition is true
    }

    // we can also write like this for multiple statements
    // we can also assign value for the condition
    val text = when (number) {
        !in 10..20 -> {
            "The number is not between 10 to 20."
        } // number not in between
        12, 7, 14 -> {
            "The number is $number."
        } // if one of the number is true
        in 1..10 -> {
            "The number is between 1 to 10."
        } // number is in between
        else -> {
            "The number is $number."
        } // if neither of the condition is true
    }
    println("Text: $text")

    // For using less or greater than
    when {
        number < 4 -> println("The number is greater than 4.")
        number == 5 -> println("The number is equal to 5")
        else -> println("The number is $number.") // if neither of the condition is true
    }
}