package logarithmic

import kotlin.math.*

class NaturalLogarithm {

    fun calculate(x: Double) : Double{
        var result = 0.0

        if(x < 0.0)
            throw IllegalArgumentException("logarithm error: argument below zero")

        if(x == 0.0)
            result = Double.NEGATIVE_INFINITY

        if(x > 1)
            return -calculate(1/x)

        val termsNumber = 80
        var sign = -1

        for(i in 1..termsNumber){
            sign *= -1
            result += sign * (x - 1).pow(i) / i
        }

        return result
    }

}