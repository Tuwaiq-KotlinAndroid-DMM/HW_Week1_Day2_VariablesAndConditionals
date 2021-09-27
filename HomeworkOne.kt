import javafx.scene.effect.Blend

fun main(){
/*Part I - Conditionals.

    Take three numbers from the user and print the greatest number.

    Test Data:
    Input the 1st number: 25
    Input the 2nd number: 78
    Input the 3rd number: 87
    */
    //solutions:
    //

    while(true) {
        println("Enter the three number you want to compare ")
        print("First number:")
        var input1 = readLine()!!.toInt()
        print("Second number:")
        var input2 = readLine()!!.toInt()
        print("third number:")
        var input3 = readLine()!!.toInt()


        if (input1 >= input2 && input1 >= input3) {
            println("The largest number is $input1")
        } else if (input2 >= input1 && input2 >= input3) {
            println("The largest number is $input2")
        } else {
            println("The Largest number is $input3")
        }

            println("Have Nice day")
        break

    }

    /*
    Take three numbers from the user and print the greatest number.

Test Data:

Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87


     */
        println("Enter the two numbers you want to add")
        print("First number:")
        val number1:Int = readLine()!!.toInt()
        print("Second number:")
        val number2:Int = readLine()!!.toInt()
        val sum = number1+number2

        print("$number1 + $number2 = $sum ")




}
