package trigonometric

class Secant {
    fun calculate(x: Double) : Double{
        val cosine = Cosine()
        return 1 / cosine.calculate(x)
    }
}