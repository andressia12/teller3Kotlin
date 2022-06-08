package teller3Kotlin

fun main(){
    var n: Int
    print("Hasta que numero deseas la sumatoria")
    n = readln()!!.toInt()
    var suma = 0
    var i = 1
    //Bucle determinado se sabe cuantas vueltas de bucle se va a hacer
    repeat(n){
        //suma = suma + i
        suma+=i
        println("Iteracion $i : $suma")
        i++
    }
}

