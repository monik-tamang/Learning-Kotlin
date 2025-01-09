fun main() {
    // 9.0 is used instead of 9 because 9/5 = 1 as both number are integers
    val convertCelsiusToFahrenheit: (Double) -> Double = { (9.0/5) * it + 32 }
    val convertKelvinToCelsius: (Double) -> Double = { it - 273.15 }
    val convertFahrenheitToKelvin: (Double) -> Double = { (5.0/9) * (it - 32) + 273.15 }

    printFinalTemperature(27.0, "Celsius", "Fahrenheit", convertCelsiusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", convertKelvinToCelsius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", convertFahrenheitToKelvin)
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}