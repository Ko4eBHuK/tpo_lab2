import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

import kotlin.math.*
import trigonometric.Sine

internal class SineTest {
    private val accuracy = 0.0001
    private lateinit var sine: Sine
    private val delta = 0.001

    @BeforeEach
    fun setUp() {
        sine = Sine(accuracy)
    }

    @ParameterizedTest
    @ValueSource(doubles = [0.0, 0.5, 2*PI, PI / 2, -3 * PI / 2, -1.0])
    fun testSine(input: Double){
        Assertions.assertEquals(sin(input), sine.calculate(input), delta)
    }
}