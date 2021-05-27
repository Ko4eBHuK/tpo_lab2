import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.mockito.ArgumentMatchers.anyDouble
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

import kotlin.math.*
import trigonometric.*

class TrigFuncsIntegrationTest {

    private val delta = 0.001

    @ParameterizedTest
    @ValueSource(doubles = [0.0, -2*PI, -PI, -PI/4])
    fun testCosineIntegration(input: Double){
        val mockSine = mock(Sine::class.java)
        `when`(mockSine.calculate(anyDouble())).thenReturn(sin(input))

        val cosine = Cosine(mockSine)
        Assertions.assertEquals(cos(input), cosine.calculate(input), delta)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, Math.PI/4, Math.PI/2, Math.PI, -Math.PI/2, -Math.PI, -Math.PI/4])
    fun testSecantIntegration(input: Double){
        val mockCosine = mock(Cosine::class.java)
        `when`(mockCosine.calculate(anyDouble())).thenReturn(cos(input))

        val secant = Secant(mockCosine)
        Assertions.assertEquals(1/cos(input), secant.calculate(input), delta)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, Math.PI/4, Math.PI/2, Math.PI, -Math.PI/2, -Math.PI, -Math.PI/4])
    fun testCosecantIntegration(input: Double){
        val mockSine = mock(Sine::class.java)
        `when`(mockSine.calculate(anyDouble())).thenReturn(sin(input))

        val cosecant = Cosecant(mockSine)
        Assertions.assertEquals(1/sin(input), cosecant.calculate(input), delta)
    }
}