package teller3Kotlin

fun main(){

    var respuesta : Int
    print("¿Desea agregar un empleado? (1 para si 2 para no)")
    respuesta = readLine()!!.toInt()

    while (respuesta == 1){
        var salario : Double
        print("¿Cual es el salario del empleado?")
        salario = readLine()!!.toDouble()

        var ventas_realizadas: Double
        print("¿Cual fue el valor de las ventas realizadas del empleado?")
        ventas_realizadas = readLine()!!.toDouble()

        println("El valor de la comision por ventas del empleado es: ${ventas_empleado(ventas_realizadas)}")
        println("El salario neto (salario + comision) del empleado es ${salario + ventas_empleado(ventas_realizadas)}")
        print("¿Desea agregar otro empleado? (1 para si 2 para no)")
        respuesta = readLine()!!.toInt()

    }

}

fun ventas_empleado(ventas:Double):Double =
    when{
        ventas > 50_000 -> (ventas-50_000)*0.15
        else-> ventas * 0
    }