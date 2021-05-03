import kotlin.math.*
import trigonometric.*


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
}