package com.example.android.builditbigger;


import android.support.test.rule.ActivityTestRule;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;

/* Capturing an AsyncTask response using the latch/countdown pattern:
 * http://stackoverflow.com/questions/2321829/android-asynctask-testing-with-android-test-framework
 */
public class AsyncTaskTest  {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule
            = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void testAsyncTask() {
        onView(withId(R.id.initiateJoke)).perform(click());
        onView(withId(R.id.joke_text)).check(matches(not(withText(""))));
    }
}
