import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.mockito.ArgumentMatchers.anyDouble
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

import kotlin.math.*
import logarithmic.*
import org.junit.jupiter.api.BeforeAll

class LogFuncsIntegrationTest {

    private val delta = 0.001
    private lateinit var mockNatLog: NaturalLogarithm

    @BeforeAll
    fun setUp(){
        mockNatLog = mock(NaturalLogarithm::class.java)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, -2*PI, -PI, -PI/4])
    fun testLogBaseTwoIntegration(input: Double){
        val mockNatLog = mock(NaturalLogarithm::class.java)
        `when`(mockNatLog.calculate(anyDouble())).thenReturn(ln(input))

        val logBaseTwo = LogarithmToBaseTwo(mockNatLog)
        Assertions.assertEquals(log(input, 2.0), logBaseTwo.calculate(input), delta)
    }
}