package com.example.tests

import android.content.Context
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
private const val FAKE_STRING = "HELLO WORLD"

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun readStringFromContext_LocalizedString() {
        // Given a mocked Context injected into the object under test...

        val mockContext = mockk<Context> {
            every { getString(R.string.hello_world) } returns FAKE_STRING
        }

        val myObjectUnderTest = ContextWrapper(mockContext)

        // ...when the string is returned from the object under test...
        val result: String = myObjectUnderTest.getTitle()

        // ...then the result should be the expected one.
        assertEquals(result, FAKE_STRING)
    }
}