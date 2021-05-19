package trigonometric

import Function

class Secant(_cosine: Cosine) : Function(_cosine.accuracy) {
    private val cosine = _cosine

    override fun calculate(x: Double) : Double{
        return if( cosine.calculate(x) == 0.0)
            Double.POSITIVE_INFINITY
        else 1 / cosine.calculate(x)
    }
}
