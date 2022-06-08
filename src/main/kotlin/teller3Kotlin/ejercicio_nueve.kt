package teller3Kotlin

fun main (){
    var num:Int
    print("Ingrese el numero entero positivo")
    num = readLine()!!.toInt()
    for (i in 1..num){
        println("numero $i su ${factorial(i)}")
    }
}
fun factorial(num:Int):Int{
    var factorial: Int = 1
    for (i in 1..num){
        factorial*=i
    }
    return factorial
}