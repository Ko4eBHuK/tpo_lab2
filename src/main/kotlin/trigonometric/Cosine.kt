package trigonometric

import Function
import kotlin.math.*

class Cosine(override var accuracy: Double) : Function(accuracy)  {

    override fun calculate(x: Double) : Double{
        val sine = Sine(accuracy)
        return sqrt(1 - sine.calculate(x).pow(2))
    }
}
