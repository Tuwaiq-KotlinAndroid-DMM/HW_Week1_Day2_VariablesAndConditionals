fun main(args: Array<String>) {
        println("Enter the first number")
        var n1 = readLine()!!.toInt()
        println("Enter the second number")
        var n2 = readLine()!!.toInt()
        println("Enter the third number")
        var n3 = readLine()!!.toInt()
        if (n1 >= n2)
            println("n1 is the greatest number")
        else if ( n2 >= n1 && n2 >= n3)
            println("n2 is the greatest number")
        else
            println("n3 is the greatest number")

        val a : Int = 74
        val b : Int = 36
        val sum = a + b
        println("The sum is: $sum")


    }