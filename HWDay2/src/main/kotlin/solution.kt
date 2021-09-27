fun main(args: Array<String>) {
    println("Input the 1st number:")
    val num1: Int = readLine()!!.toInt()

    println("\nInput the 2nd number:")
    val num2: Int = readLine()!!.toInt()

    println("\nInput the 3rd number:")
    val num3: Int = readLine()!!.toInt()

    if (num1 > num2 && num1 > num3) {
        println("The greatest: $num1")
    } else if (num2 > num1 && num2 > num3) {
        println("The greatest: $num2")
    } else if (num3 > num1 && num3 > num2) {
        println("The greatest: $num3")
    } else {
        println("There is no single greatest")
    }
    var sum: Int = num1 + num2
    println("The sum of the first two numbers = $sum")

}