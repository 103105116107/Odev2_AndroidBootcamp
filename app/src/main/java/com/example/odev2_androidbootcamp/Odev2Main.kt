package com.example.odev2_androidbootcamp

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Celsius dereceyi girin: ")
    val celsius = scanner.nextDouble()
    println("Fahrenheit: ${celsiustoFahrenheit(celsius)}")

    print("Uzun kenari girin: ")
    val longE = scanner.nextInt()
    print("Kisa kenari girin: ")
    val shortE = scanner.nextInt()
    println("Dikdortgenin cevresi: ${rectanglePerimeter(longE, shortE)}")

    print("Faktoriyelini almak istediginiz sayiyi girin: ")
    val number = scanner.nextInt()
    println("Faktoriyel: ${factorial(number)}")

    print("Bir kelime girin: ")
    val word = readLine() ?: ""
    println("'a' harfi sayisi: ${amountA(word)}")
    print("Cokgenin kenar sayisini girin: ")
    val sides = scanner.nextInt()
    println("İc acilar toplami: ${internalAngleSum(sides)}")

    print("Calisilan gün sayisini girin: ")
    val daysWorked = scanner.nextInt()
    println("Maas: ${calculateSalary(daysWorked)} ₺")

    print("kullandiginiz internet kotasini (GB) girin: ")
    val quotaUsed = scanner.nextInt()
    println("Internet faturasi: ${InternetBill(quotaUsed)} ₺")

}