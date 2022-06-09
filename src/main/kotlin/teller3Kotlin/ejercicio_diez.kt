package teller3Kotlin

/*
Función que recibe un numero entero y devuelve la sume de sus divisores inferiores

Entrada:
numero_entero_positivo -->Int-->num

Salida :
suma_de_divisores -->Int
 */
fun sumaDeDivisores(num:Int):Int{
    var cont:Int = 0
    repeat(num-1) {
        if (num % (it + 1) == 0) cont +=(it+1)
    }
    return cont
}

/*
Programa que recibe que recibe un numero entero positivo e imprime la suma de sus divisores inferiores
 */
fun main(){
    print("Ingrese un número entero positivo: ")
    val num = readLine()!!.toInt()
    println("La suma del numero los divores inferiores del numero:  $num  es de :  ${sumaDeDivisores(num)} ")
}