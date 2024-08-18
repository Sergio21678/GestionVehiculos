package vehiculo

class Moto(
    override val marca: String,
    override val modelo: String,
    override val velocidadMaxima: Int
) : Vehiculo(), AccionVehiculo {

    override fun mostrarInfo() {
        println("Moto: $marca $modelo, Velocidad Máxima: $velocidadMaxima km/h")
    }

    override fun arrancar() {
        println("La moto $marca $modelo está arrancando.")
    }

    override fun detener() {
        println("La moto $marca $modelo se ha detenido.")
    }
}