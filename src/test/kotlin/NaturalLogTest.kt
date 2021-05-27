import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import kotlin.math.*
import logarithmic.NaturalLogarithm

class NaturalLogTest {
    private val accuracy = 0.000001
    private lateinit var natLog: NaturalLogarithm
    private val delta = 0.001

    @BeforeEach
    fun setUp() {
        natLog = NaturalLogarithm(accuracy)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 1.0, 2.71828, E, 2*E])
    fun natLogTest(input: Double){
        Assertions.assertEquals(ln(input), natLog.calculate(input), delta)
    }
}