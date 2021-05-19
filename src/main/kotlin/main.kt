import trigonometric.*
import logarithmic.*
import system.FunctionSystem


fun main(args: Array<String>) {
    val csvWriter = CSV()

    val sine = Sine(0.000001)
    csvWriter.write("sine", sine, -0.03, 2.0, 0.01)

    val cosine = Cosine(0.0001)
    csvWriter.write("cosine", cosine, -0.03, 0.08, 0.01)

    val secant = Secant(0.0001)
    csvWriter.write("secant", secant, -0.03, 0.08, 0.01)

    val cosecant = Cosecant(0.0001)
    csvWriter.write("cosecant", cosecant, -0.3, 0.8, 0.1)

    val natLog = NaturalLogarithm(0.0000001)
    csvWriter.write("natLog", natLog, 0.0, 3.0, 0.01)

    val logBaseTwo = LogarithmToBaseTwo(0.0001)
    csvWriter.write("logBaseTwo", logBaseTwo, 0.5, 2.0, 0.1)

    val logBaseThree = LogarithmToBaseThree(0.00001)
    csvWriter.write("logBaseThree", logBaseThree, 0.2, 3.0, 0.1)

    val logBaseFive = LogarithmToBaseFive(0.00000000001)
    csvWriter.write("logBaseFive", logBaseFive, 0.1, 6.0, 0.1)

    val funcSystem = FunctionSystem(0.0001)
    csvWriter.write("funcSystem", funcSystem, -0.7, 2.0, 0.1)

}
