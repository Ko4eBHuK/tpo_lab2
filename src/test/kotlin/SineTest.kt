import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import trigonometric.Sine

internal class SineTest {
    private val accuracy = 0.0001
    private lateinit var sine: Sine
    private val delta = 0.001

    @BeforeEach
    fun setUp() {
        sine = Sine(accuracy)
    }

    @Test
    fun calculate() {
    }
}