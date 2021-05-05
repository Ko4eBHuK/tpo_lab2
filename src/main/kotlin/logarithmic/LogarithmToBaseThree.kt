package logarithmic

class LogarithmToBaseThree {
    fun calculate(x: Double) : Double{
        val naturalLogarithm = NaturalLogarithm()
        return naturalLogarithm.calculate(x) / naturalLogarithm.calculate(3.0)
    }
}