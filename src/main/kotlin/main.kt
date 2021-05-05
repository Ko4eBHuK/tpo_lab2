import kotlin.math.*
import trigonometric.*
import logarithmic.*


fun main(args: Array<String>) {
    println("~~~~SINE~~~~")
    val sine = Sine()
    println("Mine X=0.7: ${sine.calculate(0.7)}")
    println("Dflt X=0.7: ${sin(0.7)}")
    println()

    println("~~~COSINE~~~")
    val cosine = Cosine()
    println("Mine X=0.7: ${cosine.calculate(0.7)}")
    println("Dflt X=0.7: ${cos(0.7)}")
    println()

    println("~~~SECANT~~~")
    val secant = Secant()
    println("Mine X=0.7: ${secant.calculate(0.7)}")
    println("Dflt X=0.7: ${1 / cos(0.7)}")
    println()

    println("~~COSECANT~~")
    val cosecant = Cosecant()
    println("Mine X=0.7: ${cosecant.calculate(0.7)}")
    println("Dflt X=0.7: ${1 / sin(0.7)}")
    println()

    println("~~~~~LN~~~~~")
    val natLog = NaturalLogarithm()
    println("Mine X=e: ${natLog.calculate(E)}")
    println("Dflt X=e: ${ln(E)}")
    println()

    println("~~~~Log2~~~~")
    val logBaseTwo = LogarithmToBaseTwo()
    println("Mine X=0.25: ${logBaseTwo.calculate(0.25)}")
    println("Dflt X=0.25: ${log(0.25, 2.0)}")
    println()

    println("~~~~Log3~~~~")
    val logBaseThree = LogarithmToBaseThree()
    println("Mine X=3.0: ${logBaseThree.calculate(3.0)}")
    println("Dflt X=3.0: ${log(3.0, 3.0)}")
    println()

    println("~~~~Log5~~~~")
    val logBaseFive = LogarithmToBaseFive()
    println("Mine X=0.2: ${logBaseFive.calculate(0.2)}")
    println("Dflt X=0.2: ${log(0.2, 5.0)}")
    println()
}