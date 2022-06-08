package teller3Kotlin

fun main(){
    print("Digite el numero entero positivo")
    var n = readLine()!!.toInt()
    var i = 1
    println("La tabla de multiplicar de : $n")
    repeat(10){
        println("$n x $i = ${n*i}")
        i++
    }
}