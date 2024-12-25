fun main() {
    val names: Array<String> = arrayOf("John", "Stephen", " Megan")
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    val mix = arrayOf(1, 2, 3,"hello", "world")  // you can also create array of mixed datatypes integers and strings
    println("First Element: ${names[0]}")
    println("Size of array: ${names.size}")
    for (number in numbers) {
        println(number)
    }

    for (i in mix) {
        // check the type in the array and print the type only
        if (i is String) {
            println(i)
        }
    }

    var max: Int = findMax(arrayOf(1, 2, 3, 4, 5))
    var min: Int = findMin(arrayOf(1, 2, 3, 4, 5))

    println("Max value: $max")
    println("Min value: $min")

    max = findMaxAndMin(arrayOf(10, 11, 12, 13, 14, 15), true)
    min = findMaxAndMin(arrayOf(5, 6, 7, 8, 9), false)

    println("Max value: $max")
    println("Min value: $min")
}

// function to find the maximum value in an array
fun findMax(numbers: Array<Int>): Int  {
    var max = numbers[0]

    for (number in numbers) {
        if (number > max) {
            max = number
        }
    }

    return max
}

// function to find the minimum value in an array
fun findMin(numbers: Array<Int>): Int {
    var min = numbers[0]

    for (number in numbers) {
        if (number < min) {
            min = number
        }
    }

    return min
}

fun findMaxAndMin(numbers: Array<Int>, searchMax: Boolean): Int {
    var max = numbers[0]
    var min = max
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max
    } else {
        for (number in numbers) {
            if(number < min) {
                min = number
            }
        }
        return min
    }
}