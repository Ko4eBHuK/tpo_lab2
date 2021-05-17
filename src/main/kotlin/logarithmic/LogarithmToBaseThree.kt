package logarithmic

import Function

class LogarithmToBaseThree(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm(accuracy)
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(3.0)
    }
}
