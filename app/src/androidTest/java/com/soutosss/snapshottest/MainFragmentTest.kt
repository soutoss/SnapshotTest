package com.soutosss.snapshottest

import androidx.fragment.app.Fragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainFragmentTest : SnapshotTest {

    @Test
    fun load_shouldRenderCorrectly() {
        val scenario = launchFragmentInContainer<MainFragment>()
        var fragment: Fragment? = null
        scenario.onFragment {
            fragment = it
        }

        compareScreenshot(fragment!!)

    }
}