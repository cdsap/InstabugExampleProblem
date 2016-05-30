package com.example.ivillar.exampleroboproblem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */

@Config(constants = BuildConfig.class, sdk = 21, packageName = "com.example.ivillar.exampleroboproblem")
@RunWith(RobolectricGradleTestRunner.class)
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
}