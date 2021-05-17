package logarithmic

import Function

class LogarithmToBaseFive(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm(accuracy)
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(5.0)
    }
}
