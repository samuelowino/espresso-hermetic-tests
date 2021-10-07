package org.aplus.espresso_hermetic_tests

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityInstrumentedTest {

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun helloWorldVisible_Test() {
        onView(withId(R.id.hello_world_text_view))
            .check(matches(isDisplayed()))
    }

    @Test
    fun helloWorldTextViewContentText_Test(){
        onView(withId(R.id.hello_world_text_view))
            .check(matches(withText("Neo")))
    }

    @Test
    fun hideButtonDisplayed_Test(){
        onView(withId(R.id.hide_message_button))
            .check(matches(isDisplayed()))
    }

    @Test
    fun showButtonDisplayed_Test(){
        onView(withId(R.id.show_message_button))
            .check(matches(isDisplayed()))
    }

    @Test
    fun hideButtonText_Test(){
        onView(withId(R.id.hide_message_button))
            .check(matches(withText("Hide Character Title")))
    }

    @Test
    fun showButtonText_Test(){
        onView(withId(R.id.show_message_button))
            .check(matches(withText("Show New Character")))
    }

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("org.aplus.espresso_hermetic_tests", appContext.packageName)
    }
}