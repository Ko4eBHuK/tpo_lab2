package trigonometric

import Function

class Cosecant(override var accuracy: Double) : Function(accuracy)  {

    override fun calculate(x: Double) : Double{
        val sine = Sine(accuracy)
        return 1 / sine.calculate(x)
    }
}
