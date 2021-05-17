package trigonometric

import Function
import kotlin.math.*

class Sine(override var accuracy: Double) : Function(accuracy){

    override fun calculate(x: Double) : Double{
        var result = 0.0
        val termsNumber = 15
        var factorial: Int
        var sign = -1
        var prevRes: Double

        for (i in 1..termsNumber step 2){
            prevRes = result
            factorial = 1

            for (j in 2..i)
                factorial *= j

            sign *= -1
            result += sign * x.pow(i) / factorial

            if(abs(prevRes - result) <= accuracy)
                break
        }

        return result
    }
}
