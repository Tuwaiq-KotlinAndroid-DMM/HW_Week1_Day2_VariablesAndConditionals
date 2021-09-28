fun main(args: Array<String>) {

       print("Insert First Number ")
    val number1: String? = readLine()

     print("Insert Second Number ")
     val number2 : String? = readLine()

     print("Insert Third Number ")
     val number3 : String? = readLine()

if(!(!(number1!! >= number2.toString()) || !(number1 >= number3.toString()))) {
    println("$number1 is the Greatest!")
} else if (number2 != null) {
    if (!(number2 >= number1 || number2 >= number3.toString())) {
        println("$number2 is the Greatest!")
    } else {
        println("$number3 is the Greatest!")
    }
}
    val x: Int = 4
    val y: Int = 6

    val sum = x + y

    println("The sum is: $sum")




}