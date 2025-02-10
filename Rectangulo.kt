class Rectangulo(
    color:String,
    val base: Double,
    val altura: Double
):Figura(color) {
    override var claseFig: String = "Rectangulo"

    override fun area(): Double {
        return base * altura
    }

    override fun perimetro(): Double {
        return (base*2)+(altura*2)
    }
}