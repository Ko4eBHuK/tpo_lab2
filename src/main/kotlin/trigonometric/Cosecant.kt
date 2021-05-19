package trigonometric

import Function

class Cosecant(_sine: Sine) : Function(_sine.accuracy)  {
    private val sine = _sine

    override fun calculate(x: Double) : Double{
        return 1 / sine.calculate(x)
    }
}
