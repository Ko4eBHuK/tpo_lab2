import kotlin.math.*
import trigonometric.*
import logarithmic.*


fun main(args: Array<String>) {
    println("~~~~SINE~~~~")
    val sine = Sine(0.000001)
    println("Mine X=0.7: ${sine.calculate(0.7)}")
    println("Dflt X=0.7: ${sin(0.7)}")
    println("accuracy  : ${sine.accuracy}")
    println()

    println("~~~COSINE~~~")
    val cosine = Cosine(0.0001)
    println("Mine X=0.7: ${cosine.calculate(0.7)}")
    println("Dflt X=0.7: ${cos(0.7)}")
    println("accuracy  : ${cosine.accuracy}")
    println()

    println("~~~SECANT~~~")
    val secant = Secant(0.0001)
    println("Mine X=0.7: ${secant.calculate(0.7)}")
    println("Dflt X=0.7: ${1 / cos(0.7)}")
    println("accuracy  : ${secant.accuracy}")
    println()

    println("~~COSECANT~~")
    val cosecant = Cosecant(0.0001)
    println("Mine X=0.7: ${cosecant.calculate(0.7)}")
    println("Dflt X=0.7: ${1 / sin(0.7)}")
    println("accuracy  : ${cosecant.accuracy}")
    println()

    println("~~~~~LN~~~~~")
    val natLog = NaturalLogarithm(0.0000001)
    println("Mine X=e: ${natLog.calculate(E)}")
    println("Dflt X=e: ${ln(E)}")
    println("accuracy  : ${natLog.accuracy}")
    println()

    println("~~~~Log2~~~~")
    val logBaseTwo = LogarithmToBaseTwo(0.0001)
    println("Mine X=0.25: ${logBaseTwo.calculate(0.25)}")
    println("Dflt X=0.25: ${log(0.25, 2.0)}")
    println("accuracy  : ${logBaseTwo.accuracy}")
    println()

    println("~~~~Log3~~~~")
    val logBaseThree = LogarithmToBaseThree(0.00001)
    println("Mine X=3.0: ${logBaseThree.calculate(3.0)}")
    println("Dflt X=3.0: ${log(3.0, 3.0)}")
    println("accuracy  : ${logBaseThree.accuracy}")
    println()

    println("~~~~Log5~~~~")
    val logBaseFive = LogarithmToBaseFive(0.00000000001)
    println("Mine X=0.2: ${logBaseFive.calculate(0.2)}")
    println("Dflt X=0.2: ${log(0.2, 5.0)}")
    println("accuracy  : ${logBaseFive.accuracy}")
    println()
}
