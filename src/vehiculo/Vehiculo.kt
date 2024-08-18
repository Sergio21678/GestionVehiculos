package vehiculo

abstract class Vehiculo {
    abstract val marca: String
    abstract val modelo: String
    abstract val velocidadMaxima: Int

    abstract fun mostrarInfo()
}
