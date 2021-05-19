import trigonometric.*
import logarithmic.*
import system.FunctionSystem
import kotlin.math.PI

fun main(args: Array<String>) {
    val sine = Sine(0.000001)
    val cosine = Cosine(sine)
    val secant = Secant(cosine)
    val cosecant = Cosecant(sine)

    val natLog = NaturalLogarithm(sine.accuracy)
    val logBaseTwo = LogarithmToBaseTwo(natLog)
    val logBaseThree = LogarithmToBaseThree(natLog)
    val logBaseFive = LogarithmToBaseFive(natLog)

    val funcSystem = FunctionSystem(cosine, secant, cosecant, logBaseTwo, logBaseThree, logBaseFive)

    val csvWriter = CSV()
    csvWriter.write("sine", sine, -2.0, 2.0, 0.1)
    csvWriter.write("cosine", cosine, -3.0, 3.0, 0.1)
    csvWriter.write("secant", secant, -3.0, 3.0, 0.1)
    csvWriter.write("cosecant", cosecant, -3.0, 3.0, 0.1)

    csvWriter.write("natLog", natLog, 0.0, 3.0, 0.1)
    csvWriter.write("logBaseTwo", logBaseTwo, 0.5, 2.0, 0.1)
    csvWriter.write("logBaseThree", logBaseThree, 0.2, 3.0, 0.1)
    csvWriter.write("logBaseFive", logBaseFive, 0.1, 6.0, 0.1)

    csvWriter.write("funcSystem", funcSystem, -0.7, 2.0, 0.1)
}
