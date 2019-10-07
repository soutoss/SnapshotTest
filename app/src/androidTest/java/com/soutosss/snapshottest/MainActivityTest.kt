package com.soutosss.snapshottest

import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test


class MainActivityTest : SnapshotTest{

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java, true, false)

    @Test
    fun load_shouldDisplayActivityCorrectly() {
        val activity = activityRule.launchActivity(null)
        compareScreenshot(activity)
    }
}
