package logarithmic

import Function

class LogarithmToBaseFive(_naturalLog: NaturalLogarithm) : Function(_naturalLog.accuracy) {
    private val naturalLogarithm = _naturalLog

    override fun calculate(x: Double) : Double{
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(5.0)
    }
}
