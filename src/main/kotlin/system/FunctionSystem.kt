package system

import logarithmic.*
import trigonometric.*
import Function
import kotlin.math.*

class FunctionSystem(override var accuracy: Double) : Function(accuracy) {

    override fun calculate(x: Double): Double {

        val result : Double = if(x <= 0){
            val secant = Secant(accuracy)
            val cosine = Cosine(accuracy)
            val cosecant = Cosecant(accuracy)

            ((secant.calculate(x) - cosine.calculate(x)) - cosecant.calculate(x))
        }else{
            val logBaseTwo = LogarithmToBaseTwo(accuracy)
            val logBaseThree = LogarithmToBaseThree(accuracy)
            val logBaseFive = LogarithmToBaseFive(accuracy)

            ( ( ( logBaseFive.calculate(x) + logBaseThree.calculate(x) ) + logBaseFive.calculate(x) ).pow(3).pow(2)
                    + ( logBaseTwo.calculate(x) - ( logBaseFive.calculate(x) * logBaseThree.calculate(x) ) ) )
        }

        return result
    }
}