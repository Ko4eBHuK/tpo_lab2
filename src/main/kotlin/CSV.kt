import java.io.File

class CSV {

    fun write(funName: String, function: Function, start: Double, finish: Double, step: Double) {
        val writer = File("src/main/resources/$funName.csv").bufferedWriter()

        writer.write("x,f(x)")
        writer.newLine()

        var x = start
        var funVal: Double
        while(x <= finish){
            funVal = function.calculate(x)
            writer.write(String.format("%.8f", x) + "," + String.format("%.8f", funVal))
            writer.newLine()
            x += step
        }

        writer.close()
    }
}
