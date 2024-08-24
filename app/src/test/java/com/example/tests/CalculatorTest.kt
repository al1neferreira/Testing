package com.example.tests

import junit.framework.TestCase.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun testAddition(){
        val calculator = Calculator()
        val result = calculator.add(2,3)
        assertEquals(5, result)
    }
}