package teller3Kotlin

fun main(){
    var precio: Double
    print("¿Cual es el precio del libro?")
    precio =  readLine()!!.toDouble()
    //Repetir una tarea
    //Bucle while repetir hasta que se cumpla una condición bucle indeterminado
    while (precio>0){
        println("El precio neto del libro es:  ${precio_neto(precio)}")
        println("¿Cual es el precio del libro: ?")
        precio = readLine()!!.toDouble()
    }
}
fun precio_neto(precio_libro:Double):Double =
    when{
        precio_libro < 100_000 -> precio_libro - precio_libro*0.12
        else-> precio_libro-precio_libro*0.18
    }