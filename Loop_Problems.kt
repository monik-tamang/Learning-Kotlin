fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0
    while (number <= lastNumber) {
        number++

        if (!isEvenNumber(number)) {
            continue
        }
        evenNumberCounter++
        println(number)
    }
}

// even number function
fun isEvenNumber (number: Int): Boolean {
    if ((number % 2) == 0) {
        return true
    } else {
        return false
    }
}