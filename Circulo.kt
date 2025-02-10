import kotlin.math.PI

class Circulo(
    color:String,
    var radio:Double
):Figura(color) {
    override var claseFig: String = "Circulo"
    override fun area(): Double {
        var area = PI * (radio*radio)
        return area
    }

    override fun perimetro(): Double {
        return PI * 2 * radio
    }
}