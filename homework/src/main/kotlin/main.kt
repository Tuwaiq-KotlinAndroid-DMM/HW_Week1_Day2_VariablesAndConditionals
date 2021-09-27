fun main(args: Array<String>) {
    // Part 1
    print("Enter first number: ")
    var first_number = Integer.valueOf(readLine())
    print("Enter second number: ")
    var second_number = Integer.valueOf(readLine())
    print("Enter third number:  ")
    var third_number = Integer.valueOf(readLine())
    if (first_number > second_number && first_number > third_number) {
        println("The greatest $first_number")

    } else if (second_number > third_number && second_number > first_number) {
        println("The greatest $second_number")

    } else if (third_number > first_number && third_number > second_number) {
        println("The greatest $third_number")

// if user put 2 number equal and greater than third number

    }else if (first_number == second_number && first_number > third_number) {
        println("The greatest $first_number")

    }else if (first_number == third_number && first_number > second_number) {
        println("The greatest $first_number")

    }else if (second_number == third_number && second_number > first_number) {
        println("The greatest $second_number")
     // if user put equal number
    } else if (first_number == second_number && second_number == third_number) {
        println("they are equal!")
    }
    //part 2
    var num1 = 74
    var num2 = 36
    var sum = num1 + num2
    println(sum)


}