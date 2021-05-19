package trigonometric

import Function
import kotlin.math.*

class Cosine(_sine: Sine) : Function(_sine.accuracy)  {
    private val sine = _sine


    override fun calculate(x: Double) : Double{
        var arg = x

        while(arg > 2 * PI)
            arg -= 2 * PI
        while(arg < 0)
            arg += 2 * PI

        return if(arg > PI / 2 && arg < 3 * PI / 2)
            -sqrt(1 - sine.calculate(arg).pow(2))
        else
            sqrt(1 - sine.calculate(arg).pow(2))
    }
}
