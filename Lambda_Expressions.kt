// Lambda Expression -> {} these are functions but without only curly braces or brackets
// that can be used to pass directly to the variable parameters etc.
// when a function returns a function or takes a function as an argument it is known as higher order function
// shorthand expression -> writing expressions using lesser amount of code
// repeat() -> higher order function / for-loop with function.

// lambda expression are generally used to create a function that will only execute once like bool value etc.
fun main() {
    // will run the function -> trick() and pass the value to the trickFunction1
    val trickFunction1 = trick2
    // will pass the value to variable but does not run the function
    // ::trick1 will be counted as a variable, so if you create a trick variable error will occur
    // val trickFunction2 = ::trick1
    // variables will be treated as functions if you use lambda expression
    trick2()
    trickFunction1()
    treat1()

    // here the function is not called as it has lambda expression as its parameter
    val treatFunction = trickOrTreat(false)
    val trickFunction = trickOrTreat(true)

    // you have to call it to run it unlike normal functions
    treatFunction()
    trickFunction()

    // pass function as a parameter

    // variable variable_name: (parameter type int) -> returns string = {int_variable -> string returned }
    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    // returns the same string for whatever the int value may be as it is not assigned
    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction2 = trickOrTreat2(false, coins)
    // does not run the code as isTrick = true
    val trickFunction2 = trickOrTreat2(true, cupcake)

    treatFunction2()
    trickFunction2()

    // Nullable function types
    val treatFunction3 = trickOrTreat3(false, coins)
    // passing null function as a parameter (very helpful when you don't need to use the function (extraTreat))
    val trickFunction3 = trickOrTreat3(true, null)

    treatFunction3()
    trickFunction3()

    // Shorthand syntax
    // use 'it' instead of using variable -> "$variable"
    val coins2: (Int) -> String = {
        "$it cash"
    }

    val treatFunction4 = trickOrTreat3(false) {"$it candies"}
    val treatFunction5 = trickOrTreat3(false, coins2)

    treatFunction4()


    // repeat()
    repeat(4) {
        treatFunction5()
    }

}

//fun trick() {
//    println("No treats!");
//}

// lambda expression stored on a value trick2
val trick2 = {
   println("1 treat")
}

// () -> Unit: Unit is a return type that indicates no return value, (): parameters
var treat1: () -> Unit = {
    println("Have a treat!")
}


// Function as a return type
fun trickOrTreat(isTrick: Boolean): () -> Unit {
    return if (isTrick) {
        trick
    } else {
        treat
    }
}

val trick = {
    println("No treats!")
}

val treat = {
    println("Have a treat!")
}


// pass a function to another function as an argument

// val function_name = {parameter1, parameter2 -> function_body}

// fun function_name(variable_name: type, function_name: (parameter_type) -> return_type) : returns function
// with no parameter and no return type (i.e. trick and treat) -> both have no parameter and return type
fun trickOrTreat2(isTrick: Boolean, extraTreat: (Int) -> String): () -> Unit {
    return if (isTrick) {
         trick
    } else {
        println(extraTreat(5))
        treat
    }
}


// Nullable function types
// ((Int) -> String))? indicates that the function can take null values
fun trickOrTreat3(isTrick:Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
    }
    return treat
}


