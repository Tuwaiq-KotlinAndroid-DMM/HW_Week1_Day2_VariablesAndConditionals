//finding the largest number from user input

fun main(args: Array<String>) {
    //1
    var firstNo: Int
    var secondNo: Int
    var thirdNo: Int

    //2
    print("Enter the first number : ")
    firstNo = readLine()?.toInt() ?: -1

    print("Enter the second number : ")
    secondNo = readLine()?.toInt() ?: -1

    print("Enter the third number : ")
    thirdNo = readLine()?.toInt() ?: -1

    if (firstNo >= secondNo && firstNo >= thirdNo)
        println("$firstNo is the largest number.")
    else if (secondNo >= firstNo && secondNo >= thirdNo)
        println("$secondNo is the largest number.")
    else
        println("the greatest :$thirdNo ")
}
