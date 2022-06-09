package teller3Kotlin

/*
Función que recibe un numero entero y devuelve el numero de divisores

Entrada:
numero_entero_positivo -->Int-->num

Salida :
numero_de_divisores -->Int
 */
fun numeroDeDivisores(num:Int):Int{
    var cont= 0
    repeat(num) {
        if (num % (it + 1) == 0) cont += 1
    }
    return cont
}

/*
Programa que imprime la cantidad de divisores que tiene un número entero
 */
fun main() {
    print("Ingrese un número entero positivo")
    val num = readLine()!!.toInt()
    println("El numero $num Tiene ${numeroDeDivisores(num)} divisores ")
}