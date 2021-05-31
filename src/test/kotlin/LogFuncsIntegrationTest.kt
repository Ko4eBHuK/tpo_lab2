import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`

import kotlin.math.*
import logarithmic.*

class LogFuncsIntegrationTest {

    private val delta = 0.0001
    private lateinit var mockNatLog: NaturalLogarithm

    @BeforeEach
    fun setUp(){
        mockNatLog = mock(NaturalLogarithm::class.java)

        `when`(mockNatLog.calculate(0.0)).thenReturn(Double.NEGATIVE_INFINITY)
        `when`(mockNatLog.calculate(0.5)).thenReturn(-0.693141805599)
        `when`(mockNatLog.calculate(1.0)).thenReturn(0.0)
        `when`(mockNatLog.calculate(8.0)).thenReturn(2.079441541698)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 1.0, 8.0])
    fun testLogBaseTwoIntegration(input: Double){
        `when`(mockNatLog.calculate(2.0)).thenReturn(0.693141805599)

        val logBaseTwo = LogarithmToBaseTwo(mockNatLog)

        Assertions.assertEquals(log(input, 2.0), logBaseTwo.calculate(input), delta)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 1.0, 8.0])
    fun testLogBaseThreeIntegration(input: Double){
        `when`(mockNatLog.calculate(3.0)).thenReturn(1.098612288668)

        val logBaseThree = LogarithmToBaseThree(mockNatLog)

        Assertions.assertEquals(log(input, 3.0), logBaseThree.calculate(input), delta)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 1.0, 8.0])
    fun testLogBaseFiveIntegration(input: Double){
        `when`(mockNatLog.calculate(5.0)).thenReturn(1.609439124341)

        val logBaseFive = LogarithmToBaseFive(mockNatLog)

        Assertions.assertEquals(log(input, 5.0), logBaseFive.calculate(input), delta)
    }
}
