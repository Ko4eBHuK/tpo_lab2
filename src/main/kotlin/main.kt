import kotlin.math.*
import trigonometric.*


fun main(args: Array<String>) {
    println("~~~~SINE~~~~")
    val sine = Sine()
    println("Mine sine result of 0.5: ${sine.calculate(0.5)}")
    println("Comp sine result of 0.5: ${sin(0.5)}")
    println()

    println("~~~COSINE~~~")
    val cosine = Cosine()
    println("Mine cosine result of 0.0: ${cosine.calculate(0.0)}")
    println("Comp cosine result of 0.0: ${cos(0.0)}")
    println()
}