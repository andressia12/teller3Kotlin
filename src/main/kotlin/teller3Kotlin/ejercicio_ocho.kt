package teller3Kotlin


/*
Funcion que determina si un numero es primo o no
 */
fun esPrimo(num:Int):Boolean{
    return numeroDeDivisores(num) == 2
}
/*
Programa que recibe un numero entero positivo e Imprime los numeros primos que hay desde el 2 hasta el número
 */
fun main(){
    print("Ingrese el número entero positivo: ")
    val num = readLine()!!.toInt()

    for (i in 2 .. num) if (esPrimo(i)){
        println("El numero $i es primo")
    }

}