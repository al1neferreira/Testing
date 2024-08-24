package com.example.tests

import android.content.Intent
import android.widget.Button
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf

@Suppress("DEPRECATION")
@RunWith(RobolectricTestRunner::class)
class WelcomeActivityTest {
    @Test
    fun checkingLogin(){
        Robolectric.buildActivity(WelcomeActivity::class.java).use { controller ->
            controller.setup() // Moves the Activity to the RESUMED state

            val activity = controller.get()
            activity.findViewById<Button>(R.id.btn_login).performClick()

            val expectedIntent = Intent(activity, LoginActivity::class.java)
            val actual = shadowOf(RuntimeEnvironment.application).nextStartedActivity
            assertEquals(expectedIntent.component, actual.component)
        }
    }
}