fun main(args: Array<String>) {

  println("input the first number:")
    var n1 = readLine() !!.toInt()
    println("input the second number:")
    var n2 = readLine() !!.toInt()
    println("input the third number:")
    var n3 = readLine() !!.toInt()

    if (n1 >= n2 && n1 >= n3)
        println("$n1 is the largest number.")
    else if (n2 >= n1 && n2 >= n3)
        println("$n2 is the largest number.")
    else
        println("$n3 is the largest number.")
}



