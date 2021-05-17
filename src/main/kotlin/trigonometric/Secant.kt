package trigonometric

import Function

class Secant(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double) : Double{
        val cosine = Cosine(accuracy)
        return 1 / cosine.calculate(x)
    }
}
