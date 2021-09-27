fun main()
{
    println("Enter 3 numbers")
    var num1= readLine()?.toInt()
    var num2= readLine()?.toInt()
    var num3= readLine()?.toInt()
    if(num1!! > num2!!)
    {
        if(num1!! > num3!!)
        {
            println("Number one is the greatest")
        }
    }
    else if(num2!! > num3!!)
    {
        println("Number two is the greatest")
    }
    else
    {
        println("Number three is the greatest")
    }

    println("part 2")

    println("************************")
    val number1= 74
    val number2= 36
    var sum= number1 + number2
    println(sum)



}




