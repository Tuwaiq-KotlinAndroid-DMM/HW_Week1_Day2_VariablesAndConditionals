fun main() {
    var D = 74
    var E = 36
    var F = (D+E)
    println("PART 1, 74 + 36 The answer is $F")
    print("PART 2, A:")
    var A = readLine()!!.toInt()
    print("B:")
    var B = readLine()!!.toInt()
    print("C:")
    var C = readLine()!!.toInt()

if (A>=B && A>=C)
    {println("The greatest number is $A")}
    else if (B>=A && B>=C)
    {println("The greatest number is $B")}
   else if (C>=B && C>=A)
    { println("The greatest number is $C")}

}