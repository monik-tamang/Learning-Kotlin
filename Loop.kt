fun main() {
    // for loop
    // using .. <= 10  1,2,3,4,5,6,7,8,9,10
    for (i in 1..10) {
        println("i = $i")
    }
    // using until < 10   1,2,3,4,5,6,7,8,9
    for (j in 1 until 10) {
        println("j = $j")
    }
    // using downTo 10,9,8,7,6,5,4,3,2,1
    for (k in 10 downTo 1) {
        println("k = $k")
    }
    // using step 2 means 1,3,5,7,9
    for (l in 1 until 10 step 2) {
        println("l = $l")
    }

    // while loop
    var number = 1
    while (number < 10) println(number++)

    // do-while loop
    var num = 1
    do {
        println(num++)
    } while (num < 10)

    var newNumber = 0
    while (newNumber < 10) {
        newNumber++
        if (newNumber > 2 && newNumber < 7) {
            continue  // when the condition is correct then continue the loop skip the below code.
        }
        if (newNumber in 3..7){
            break // end the loop
        }
        println("New number = $newNumber")
    }

    // nested while loop with outer loop break
    // by default only the inner loop will be break but, we can choose the break the outer loop as well
    var n = 0
    outer@ while (n < 5) {
        n++
        println("Outer Loop: $n")

        var num = 0
        while (num < 5) {
            if(num == 0 ) break@outer
            num ++
            println("Inner Loop: $num")
        }
    }
}