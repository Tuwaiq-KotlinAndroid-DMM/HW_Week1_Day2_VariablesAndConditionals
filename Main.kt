fun main(args: Array<String>) {
    /*
    Part I - Conditionals.
    Take three numbers from the user and print the greatest number.
    */
    println("Please enter the first value :\n")
    var f = readLine()!!.toInt()
        println("Please enter the secound value :\n")
    var s =  readLine()!!.toInt()
        println("Please enter the third value :\n")
    var t =  readLine()!!.toInt()

    if(f > s && f > t){
        println("the greatest is $f\n\n\n")
    }else if(s > f && s > t){
        println("the greatest is $s\n\n\n")
    }else if(t > f && t > s){
        println("the greatest is $t\n\n\n")
    }else if(t == f && t == s){
        println("All same number \n\n\n")
    }
    /*
    Part II - Variables.
    Write a Kotlin program to print the sum of two numbers.
    */
    var num1 = 74
    var num2 = 36
    val equal = num1 + num2

    println("The value of $num1 + $num2 = $equal")
}