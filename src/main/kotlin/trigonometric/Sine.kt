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
        var arg = x

        while(arg > PI)
            arg -= 2 * PI
        while(arg < -PI)
            arg += 2 * PI

        for (i in 1..termsNumber step 2){
            prevRes = result
            factorial = 1

            for (j in 2..i)
                factorial *= j

            sign *= -1
            result += sign * arg.pow(i) / factorial

            if(abs(prevRes - result) <= accuracy)
                break
        }

        return result
    }
}
