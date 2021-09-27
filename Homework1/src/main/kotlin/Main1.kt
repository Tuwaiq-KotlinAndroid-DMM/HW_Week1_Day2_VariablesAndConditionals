fun main(args: Array<String>) {
 println("input 1st number")
 var num1 = readLine()!!.toInt()
 println("input 2nd number")
 var num2 = readLine()!!.toInt()
 println("input 3rd number")
 var num3 = readLine()!!.toInt()


if (num1 >= num2){
 if (num1 >= num3){
  println(" the greatest number is $num1 ")

 } } else if (num2 >= num3) {
   println(" the greatest number is $num2 ")
   } else
 println(" the greatest number is $num3 ")
}