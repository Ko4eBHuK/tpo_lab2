package trigonometric

import Function
import kotlin.math.*

class Cosine(_sine: Sine) : Function(_sine.accuracy)  {
    private val sine = _sine


    override fun calculate(x: Double) : Double{
        return sqrt(1 - sine.calculate(x).pow(2))
    }
}
