package teller3Kotlin

fun main(){

    var no_empleados : Int
    print(" ¿Cuantos empleados tiene la empresa? ")
    no_empleados = readLine()!!.toInt()
    var empleado = 1
    repeat(no_empleados){
        var no_horas : Double
        println("¿ Cual es el numero de horas trabajadas a la semana del empleado $empleado ?")
        no_horas = readLine()!!.toDouble()
        println("El salario mensual del empleado $empleado es: ${salario_semanal(no_horas)}")
        empleado++
    }
}

fun salario_semanal (horas_trabajadas:Double):Double=

    when{
        horas_trabajadas <= 35.0 -> horas_trabajadas * 15_000
        horas_trabajadas > 35.0 && horas_trabajadas <= 60.0 -> horas_trabajadas * 18_000
        else -> horas_trabajadas * 25_000
    }

