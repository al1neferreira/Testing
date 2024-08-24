package com.example.tests

import junit.framework.TestCase.assertEquals
import org.junit.Test

class QuoteTest {
    @Test
    fun writeQuote(){
        val string1= "Hello"
        val string2 = "World"
        val result = "$string1 $string2"
        assertEquals("Hello World", result)
    }

    @Test
    fun testConcatenation() {
        val str1 = "Hello"
        val str2 = " World"
        val result = "$str1$str2"
        assertEquals("Hello World", result)
    }


}