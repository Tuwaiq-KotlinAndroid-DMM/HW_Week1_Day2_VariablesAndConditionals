fun main(args: Array<String>) {
//    Part 1 - Conditionals
    println("Input the 1st number: ")
    var num1 = readLine()!!.toInt()
    println("Input the 2nd number: ")
    var num2 = readLine()!!.toInt()
    println("Input the 3rd number: ")
    var num3 = readLine()!!.toInt()
    // Condition
    var max = num1
    if (max < num2 && num2 > num3) {
        max = num2
    } else if (max < num3) {
        max = num3
    }
    println("The greatest: $max")

//    Part 2 - Variables
    var number1 = 74
    var number2 = 36
    println(number1 + number2)
}