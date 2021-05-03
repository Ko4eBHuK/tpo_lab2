package trigonometric

class Cosecant {
    fun calculate(x: Double) : Double{
        val sine = Sine()
        return 1 / sine.calculate(x)
    }
}