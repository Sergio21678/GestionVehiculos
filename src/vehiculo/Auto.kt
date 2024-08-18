package vehiculo

class Auto(
    override val marca: String,
    override val modelo: String,
    override val velocidadMaxima: Int
) : Vehiculo(), AccionVehiculo {

    override fun mostrarInfo() {
        println("Auto: $marca $modelo, Velocidad Máxima: $velocidadMaxima km/h")
    }

    override fun arrancar() {
        println("El auto $marca $modelo está arrancando.")
    }

    override fun detener() {
        println("El auto $marca $modelo se ha detenido.")
    }
}