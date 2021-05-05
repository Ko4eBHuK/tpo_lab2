package logarithmic

class LogarithmToBaseTwo {

    fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm()
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(2.0)
    }

}