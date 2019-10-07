package com.soutosss.snapshottest

import android.app.Activity
import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTestAndroidx : SnapshotTest {

    @Test
    fun load_shouldDisplayActivityCorrectly() {
        val scenario = ActivityScenario.launch<MainActivity>(MainActivity::class.java)
        var activity: Activity? = null

        scenario.onActivity {
            activity =  it
        }

        compareScreenshot(activity!!)
    }
}
