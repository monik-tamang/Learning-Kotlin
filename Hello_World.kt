// fun = function
// args: Array<String> is used to pass string arguments in the main function using the command line
fun main(args: Array<String>) {
    // val = if we don't change the variable
    // var = if we change the variable
    val userName: String = "Mist"

    var user: String = "Alex"
    user = "John" // here we change the value of the user form "Alex" to "John"

    var age: Int = 20
    age = 30

    val number: Int = 100
    val floatNumber: Float = 2.5f // 2.5 is considered as a double which can represent larger float values
    val doubleNumber: Double = 2.5
    val charValue: Char = 'M'
    val booleanValue: Boolean = false

    // Using without the datatypes
    val secondNumber = 100
    val secondFloatNumber = 2f
    val secondDoubleNumber = 2.5
    val string = "Hello, World!"
    val secondCharValue = 'M'
    val secondBooleanValue = false


    val maxIntegerValue: Int = Int.MAX_VALUE // max integer value
    val minIntegerValue: Int = Int.MIN_VALUE // min integer value

    val maxByteValue: Byte = Byte.MAX_VALUE // max byte value
    val minByteValue: Byte = Byte.MIN_VALUE // min byte value

    val maxShortValue: Short = Short.MAX_VALUE // max short value
    val minShortValue: Short = Short.MIN_VALUE // min short value

    val maxLongValue: Long = Long.MAX_VALUE // max long value
    val minLongValue: Long = Long.MIN_VALUE // min long value

    // $userName, $ = id we want to use the variable inside the println().
    println("Hello, $userName!")
    println("Hello, $user! your age is $age")
    println("Integer Maximum Value: $maxIntegerValue")
    println("Integer Minimum Value: $minIntegerValue")
    println("Byte Max Value: $maxByteValue")
    println("Byte Min Value: $minByteValue")
    println("Short Max Value: $maxShortValue")
    println("Short Min Value: $minShortValue")
    println("Long Min Value: $maxLongValue")
    println("Long Max Value: $minLongValue")
    println("Char Value: $charValue and Boolean Value: $booleanValue")

    //-------------------Operators-------------------
    val x = 6
    val y = 3
    val result = x + y
    println("Result: $result")
    println("$x + $y = ${x + y}")
    println("$x - $y = ${x - y}")
    println("$x / $y = ${x / y}")
    println("$x * $y = ${x * y}")
    println("$x % $y = ${x % y}")

    var z = 1
    println("${z++}") // print and add
    println("${++z}") // add then print

    /*
    -------------------If else else if-------------------
    There is a warning sign as myNumber is a constant and compiler knows that the comparison is unnecessary as it
    knows the condition is true or false at compile time.
    */
    val myNumber = 100
    if (myNumber > 100) {
        println("$myNumber is greater than 100.")
    } else if (myNumber < 100) {
        println("$myNumber is smaller than 100.")
    } else if (myNumber != 100) {
        println("$myNumber is not equals to 100.")
    } else {
        println("$myNumber is not a number.")
    }

    val isActive = true
    if (!isActive) {
        println("The condition is false.")
    } else {
        println("The condition is true.")
    }

    //-------------------Logical Operators-------------------
    val status = true
    val score = 80
    if (status && score > 80) {
        println("Next Level")
    } else if (status || score > 80) {
        println("Skip Level")
    } else {
        println("Restart Level")
    }
}
