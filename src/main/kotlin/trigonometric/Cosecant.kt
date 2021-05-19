package trigonometric

import Function

class Cosecant(_sine: Sine) : Function(_sine.accuracy)  {
    private val sine = _sine

    override fun calculate(x: Double) : Double{
        return if(sine.calculate(x) == 0.0)
            Double.POSITIVE_INFINITY
        else 1 / sine.calculate(x)
    }
}
