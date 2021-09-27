fun main(args: Array<String>) {


    println("Enter First Number")
    var firstNumber = readLine()!!.toInt()

    println("Enter Second Number")
    var secondNumber = readLine()!!.toInt()

    println("Enter Third Number")
    var thirdNumber = readLine()!!.toInt()

    var greatestNumber = firstNumber

    if (greatestNumber <= secondNumber) {
        greatestNumber = secondNumber
    }
    if (greatestNumber <= thirdNumber) {
        greatestNumber = thirdNumber
    }
    println("The greatest: " + greatestNumber)
}