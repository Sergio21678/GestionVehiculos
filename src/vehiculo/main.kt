package vehiculo

fun gestionarVehiculos() {
    val auto = Auto(marca = "Toyota", modelo = "Corolla", velocidadMaxima = 180)
    val moto = Moto(marca = "Honda", modelo = "CBR600", velocidadMaxima = 250)

    auto.mostrarInfo()
    auto.arrancar()
    auto.detener()

    println()

    moto.mostrarInfo()
    moto.arrancar()
    moto.detener()
}

fun main() {
    gestionarVehiculos()
}