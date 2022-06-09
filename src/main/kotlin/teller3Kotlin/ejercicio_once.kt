package teller3Kotlin


/*
Funcion que indica si el numero que recibe es perfecto o no
 */

fun esNumeroPerfecto(num:Int):Boolean{
    return sumaDeDivisores(num)==num

}

fun main(){
    var cnp=0
    print("Escriba un numero Entero Positivo: ")
    val num = readLine()!!.toInt()
    repeat(num){
        if (esNumeroPerfecto(it+1)){
            println("${it+1} Es un numero perfecto")
            cnp += 1
        }
    }
    print("Entre 1 y $num hay $cnp números perfectos ")
}