package trigonometric

import Function

class Secant(_cosine: Cosine) : Function(_cosine.accuracy) {
    private val cosine = _cosine

    override fun calculate(x: Double) : Double{
        return 1 / cosine.calculate(x)
    }
}
