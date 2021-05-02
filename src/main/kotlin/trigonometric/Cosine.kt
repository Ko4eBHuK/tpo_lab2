package trigonometric

import kotlin.math.*

class Cosine {
    fun calculate(x: Double) : Double{
        val sine = Sine()
        return sqrt(1 - sine.calculate(x).pow(2))
    }
}