package logarithmic

import Function

class LogarithmToBaseTwo(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm(accuracy)
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(2.0)
    }

}
