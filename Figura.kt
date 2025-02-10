abstract class Figura(
    val color:String
) {
    abstract var claseFig: String

    fun mostrarInfo(){
        println("Su figura es de tipo $claseFig y es de color $color")
        println("AREA: ${area()} PERIMETRO:${perimetro()}")
        println("******************************************************")
    }

    abstract fun area(): Double

    abstract fun perimetro(): Double

}