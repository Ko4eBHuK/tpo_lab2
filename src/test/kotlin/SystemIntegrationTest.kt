import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mockito.*
import java.util.stream.Stream
import org.junit.jupiter.api.TestInstance

import trigonometric.*
import logarithmic.*
import system.FunctionSystem

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SystemIntegrationTest {
    private val delta = 0.0001

    @BeforeEach
    fun setUp(){
        //trig
        `when`(cosineStub.calculate(0.0)).thenReturn(1.0)
        `when`(secantStub.calculate(0.0)).thenReturn(1.0)
        `when`(cosecantStub.calculate(0.0)).thenReturn(Double.POSITIVE_INFINITY)

        `when`(cosineStub.calculate(-0.123)).thenReturn(0.992445032135)
        `when`(secantStub.calculate(-0.123)).thenReturn(1.007612479905)
        `when`(cosecantStub.calculate(-0.123)).thenReturn(-8.150617542148)

        //log
        `when`(logBaseTwoStub.calculate(0.5)).thenReturn(-1.0)
        `when`(logBaseThreeStub.calculate(0.5)).thenReturn(-0.6309298)
        `when`(logBaseFiveStub.calculate(0.5)).thenReturn(-0.4306766)

        `when`(logBaseTwoStub.calculate(4.0)).thenReturn(2.0)
        `when`(logBaseThreeStub.calculate(4.0)).thenReturn(1.2618595)
        `when`(logBaseFiveStub.calculate(4.0)).thenReturn(0.8613531)
    }

    @ParameterizedTest
    @MethodSource("provideDoubles")
    fun systemIntegrationTest(expected: Double, value: Double){
        Assertions.assertEquals(expected, functionSystem.calculate(value), delta)
    }

    fun provideDoubles(): Stream<Arguments> = Stream.of(
            Arguments.of(Double.NEGATIVE_INFINITY, 0.0),
            Arguments.of(8.165784989919, -0.123),
            Arguments.of(9.771778, 0.5),
            Arguments.of(707.6973966, 4.0)
        )

    companion object{
        val cosineStub = mock(Cosine::class.java)
        val secantStub = mock(Secant::class.java)
        val cosecantStub = mock(Cosecant::class.java)
        val logBaseTwoStub = mock(LogarithmToBaseTwo::class.java)
        val logBaseThreeStub = mock(LogarithmToBaseThree::class.java)
        val logBaseFiveStub = mock(LogarithmToBaseFive::class.java)

        val functionSystem = FunctionSystem(cosineStub, secantStub, cosecantStub,
                                            logBaseTwoStub, logBaseThreeStub, logBaseFiveStub)
    }
}