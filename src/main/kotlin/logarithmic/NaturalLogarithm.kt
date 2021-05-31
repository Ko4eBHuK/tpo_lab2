package logarithmic

import Function
import kotlin.math.*

class NaturalLogarithm(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double) : Double{
        var result = 0.0

        if(x < 0.0)
            throw IllegalArgumentException("logarithm error: argument below zero")

        if(x == 0.0)
            result = Double.NEGATIVE_INFINITY

        if(x > 1.0)
            return -calculate(1/x)

        if(x == 1.0)
            return 0.0

        val termsNumber = 80
        var sign = -1
        var prevResult: Double

        for(i in 1..termsNumber){
            prevResult = result
            sign *= -1
            result += sign * (x - 1).pow(i) / i
            if(abs(prevResult - result) <= accuracy)
                break
        }

        return result
    }

}
