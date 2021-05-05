package logarithmic

class LogarithmToBaseFive {
    fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm()
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(5.0)
    }
}