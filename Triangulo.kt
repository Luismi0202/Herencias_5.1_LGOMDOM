class Triangulo(
    color:String,
    var base: Double,
    var altura: Double
):Figura(color) {
    override var claseFig: String = "Triangulo"

    override fun area(): Double {
        return (base * altura)/2
    }

    override fun perimetro(): Double {
        return base + (altura*2)
    }
}