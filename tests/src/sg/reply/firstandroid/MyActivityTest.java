package sg.reply.firstandroid;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class sg.reply.firstandroid.MyActivityTest \
 * sg.reply.firstandroid.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase<MyActivity> {

    public MyActivityTest() {
        super("sg.reply.firstandroid", MyActivity.class);
    }

}
