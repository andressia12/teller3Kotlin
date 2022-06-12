package teller3Kotlin

fun main(){
    var ven: Double
    print("¿Cual es el valor de la venta del vendedor?  ")
    ven = readLine()!!.toDouble()
    while (ven>0){
        println("El valor de la comision es: ${ventas(ven)}")
        println("¿Cual es el valor de la venta del vendedor?  ")
        ven = readLine()!!.toDouble()
    }
}

fun ventas (venta:Double):Double =
    when{
        venta < 50_000 -> venta*0.07
        venta >= 50_000 && venta < 100_000 -> venta*0.09 + 5_000
        venta >= 100_000 && venta < 200_000 -> venta*0.11 + 10_000
        venta >= 200_000 && venta < 500_000 -> venta*0.13 + 20_000
        else-> venta*0.15 + 40_000
    }
