package com.example.odev2_androidbootcamp

fun celsiustoFahrenheit(celsius:Double): Double{
    return (celsius*1.8)+32
}
fun rectanglePerimeter(longE: Int, shortE: Int):Int{
    return 2*(longE+shortE)
    }
fun factorial(num:Int): Long{
    var result =1L
    for (i in 1..num){
        result*=i
    }
    return result
}
fun amountA(word:String): Int{
    var count=0
    for (char in word) {
        if (char == 'a' || char == 'A') {
            count++
        }
    }
    return count
}
fun internalAngleSum(sideCount: Int): Int {
    return (sideCount - 2) * 180
}
fun calculateSalary(dayCount: Int): Int {
    val workingHours = dayCount * 8
    return if (workingHours <= 160) {
        workingHours * 10
    } else {
        val overtimeHours = workingHours - 160
        (160 * 10) + (overtimeHours * 20)
    }
}
fun InternetBill(quota: Int): Int {
    return if (quota <= 50) {
        100
    } else {
        100 + (quota - 50) * 4
    }
}