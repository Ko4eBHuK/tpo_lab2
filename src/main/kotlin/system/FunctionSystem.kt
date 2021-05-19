package system

import logarithmic.*
import trigonometric.*
import Function
import kotlin.math.*

class FunctionSystem(_cosine: Cosine, _secant: Secant, _cosecant: Cosecant,
                     _logBaseTwo: LogarithmToBaseTwo,
                     _logBaseThree: LogarithmToBaseThree,
                     _logBaseFive: LogarithmToBaseFive) : Function(_cosine.accuracy) {
    private val cosine = _cosine
    private val secant = _secant
    private val cosecant = _cosecant
    private val logBaseTwo = _logBaseTwo
    private val logBaseThree = _logBaseThree
    private val logBaseFive = _logBaseFive


    override fun calculate(x: Double): Double {

        val result : Double = if(x <= 0){
            ((secant.calculate(x) - cosine.calculate(x)) - cosecant.calculate(x))
        }else{
            ( ( ( logBaseFive.calculate(x) + logBaseThree.calculate(x) ) + logBaseFive.calculate(x) ).pow(3).pow(2)
                    + ( logBaseTwo.calculate(x) - ( logBaseFive.calculate(x) * logBaseThree.calculate(x) ) ) )
        }

        return result
    }
}