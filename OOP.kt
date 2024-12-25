fun main() {
    val car1 = Car()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.color = "Red"
    car1. doors = 4

    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    println("\n")
    val cars1 = Cars("Ford", "Mustang", "Black", 2)
    println("Name = ${cars1.name}")
    println("Model = ${cars1.model}")
    println("Color = ${cars1.color}")
    println("Doors = ${cars1.doors}")

    // for User Class
    val user = User("Alex", "Dobinca", 23)
    val friend = User("John", "Smith", 40)

    println("Name: ${friend.name}")

    // for second user class
    val user2 = secondUser("Alex")
    val friend2 = secondUser("John", "Smith")

    println("\n")
    println("Name: ${user2.name}")
    println("LastName: ${user2.lastName}")
    println("Age: ${user2.age}")

    println("\n")
    println("Name: ${friend2.name}")
    println("LastName: ${friend2.lastName}")
    println("Age: ${friend2.age}")
}

// creating a class
class Car {
    var name = ""
    var model = ""
    var color = ""
    var doors = 0

    fun move() {
        println("The car is moving.")
    }

    fun stop() {
        println("The car has stopped.")
    }
}

class User(name: String, var lastName: String, var age: Int){
    var name: String
    // Initializer Blocks
    // It is used to check some specific conditions before saving the value to the parameters
    // You can use multiple initializer blocks
    init {
        if (name.lowercase().startsWith("a")) {
           // this is used to use the var name not the name on the class parameter
           this.name = name
        } else {
            this.name = "User"
            println("The name doesn't start with the letter 'a' or 'A'")
        }
    }

}

// using the secondary constructor
class secondUser(var name: String, var lastName: String, var age: Int) {
    // you can pass the value to the constructor and set default value for the parameters with no value
    constructor(name: String): this(name, "LastName", 0){
        println("Second Constructor:")
    }

    constructor(name: String, lastName: String): this(name, lastName, 0){
        println("Third Constructor:")
    }

}