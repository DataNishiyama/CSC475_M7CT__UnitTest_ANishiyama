package csc475.hello.csc475_m7ct_unitconv_anishiyama

import org.junit.Assert.assertEquals
import org.junit.Test

class ConversionUtilsTest {

    @Test
    fun testFeetInchesToCm() {
        val result = feetInchesToCm(5.0, 10.0)
        println("Result of feetInchesToCm test: $result")
        assertEquals(177.8, result, 0.1)
    }

    @Test
    fun testKgToLbs() {
        val result = kgToLbs(50.0)
        println("Result of kgToLbs test: $result")
        assertEquals(110.23, result, 0.1)
    }

    private fun feetInchesToCm(feet: Double, inches: Double): Double {
        val totalInches = (feet * 12) + inches
        return totalInches * 2.54
    }

    private fun kgToLbs(kg: Double): Double {
        return kg * 2.20462
    }
}