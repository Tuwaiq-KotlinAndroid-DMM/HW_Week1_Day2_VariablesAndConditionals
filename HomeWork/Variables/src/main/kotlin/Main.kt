fun main(args: Array<String>) {
    // print what programming doing
    println("The program sum two numbers entered by the user")

    // Print massege for user to enter Frist number
    println("Enter Frist number: ")

    // Declare Frist variable and the user enter the value
    var fristNumber : Int = readLine()!!.toInt()

    // Print massege for user to enter Second number
    println("Enter Second number: ")

    // Declare Second variable and the user enter the value
    var secondNumber : Int = readLine()!!.toInt()

    // variable for save calculate the sum
    var calculate : Int
    // calculate the sum first number and second number
    calculate = fristNumber + secondNumber

    // Print the sum of calculate
    println("The sum is: $calculate")

}