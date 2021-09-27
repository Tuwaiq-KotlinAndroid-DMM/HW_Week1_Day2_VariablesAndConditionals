fun main(args: Array<String>) {
    println("Enter the first number")
    var n1 = readLine()!!.toInt()
    println("Enter the second number")
    var n2 = readLine()!!.toInt()
    println("Enter the third number")
    var n3 = readLine()!!.toInt()
    if (n1 > n2 && n1 > n3) {
        println("the  greatest number is: $n1")
    } else if(n2 > n1 && n2 > n3) {
        println("the  greatest number is: $n2")

    }
    else if (n3 > n1 && n3 > n2) {
        println("the  greatest number is: $n3")


    }
    var exam1 = 4
    var exam2 = 6
    println( exam1 + exam2)
}