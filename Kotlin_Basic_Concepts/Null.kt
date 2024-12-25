fun main() {

    var text: String? = null //String? can be used to assign null value
    if (text != null) {
        println(text.length)
    } else {
        println("The variable is null.")
    }
    // You can also use this code that is equivalent to the if condition
    println(text?.length) // if null print 'null' else print 'length'
    //println(text!!.length) // if null 'NullPointerException' else print the length

    text = "The variable is not null."
    // ?: is used to check null and if null print else assign value to text2
    val text2 = text ?: "The variable is null"
    println(text2)

    // longer way to check the null value using if else condition
    var text3: String? = null
    if (text3 == null) {
        text3 = text
    } else {
        text3 = "Null variable"
    }
    println(text3)
}