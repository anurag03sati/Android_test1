package com.example.test1

object DriverClass{
    @JvmStatic
    fun main(args: Array<String>){
        val abc=1
        println(abc)
        println("hello world")

        var emp1:Employee = Employee()
        Employee.PI = 81.0
        emp1.operation1()
        emp1.operation2()
    }
}