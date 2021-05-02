package trigonometric

import kotlin.math.*

class Sine {
    fun calculate(x: Double) : Double{
        var result = 0.0
        val termsNumber = 15
        var factorial: Int
        var sign = -1

        for (i in 1..termsNumber step 2){
            factorial = 1

            for (j in 2..i)
                factorial *= j

            sign *= -1
            result += sign * x.pow(i) / factorial
        }

        return result
    }
}