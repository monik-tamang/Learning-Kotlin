fun main() {
    sayHello("MK", 24)
    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some Data.")
    } else {
        showMessage()
    }

    val max = getMax(4, 7)
    println("Max Value: $max")

    // compiler automatically identifies which function to use
    val minDouble = getMin(4.9, 4.8)
    val minInt = getMin(2, 4)
    val minTriple = getMin(1, 5, 2)
    println("Min Value: $minDouble")
    println("Min Value: $minInt")
    println("Min Value: $minTriple")

    // default parameters
    sendMessage("Siri") // sending single value
    sendMessage("Alexa", "Hello!")
    sendMessage(message = "Google") // can assign value using the parameter name

    println("Sum: ${sum(2, 3, 4, 5)}")

    // when we don't know the total no of parameters we use 'vararg'
    println("Addition: ${addition(1,2,3,4,5,6,7,8,9,10)}")

    // .forEach{}
    displayNumbers(1,2,3,4,5)
}

// function datatypes must be assigned
fun sayHello(name: String, age: Int) {
    println("Hello, $name! Your age is $age.")
}

fun getData(data: String) {
    println("Data: $data")
}

fun showMessage() {
    println("No connection.")
}

// To return value using function you must declare the datatype that the function will return
fun getMax(number1: Int, number2: Int): Int {
    val max = if (number1 > number2) number1 else number2
    return max
    // return if(number1 > number2) number1 else number2
}

// Another way to write a function
// function-overloading
fun getMin(number1: Int, number2: Int) = if (number1 < number2) number1 else number2
fun getMin(number1: Double, number2: Double) = if (number1 < number2) number1 else number2
fun getMin(number1: Int, number2: Int, number3: Int): Int {
    return if (number1 <= number2 && number1 <= number3) {
        number1
    } else if (number2 <= number1 && number2 <= number3) {
        number2
    } else {
        number3
    }
}

// default value for the parameters if not needed
// default message = "Null" name = " Null"
// we can use function or variables in default value
fun sendMessage(name: String = "Null", message: String = defaultText()) {
    println("Name = $name and Message = $message")
}

fun defaultText() = "Default Text"

fun sum(a: Int, b: Int, c: Int, d: Int): Int {
    return a + b + c + d
}

// vararg = variable number of parameters,
// If we don't know how many parameters we are going to use
fun addition(vararg numbers: Int): Int {
    var result = 0
    // for loop until each number in the numbers are read
    for (number in numbers) {
        result += number
    }
    return result
}

fun displayNumbers(vararg numbers: Int) {
    numbers.forEach{ println(it) }
}
