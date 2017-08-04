package arjun.hanabiandroid;

import android.text.TextUtils;
import android.util.Log;

public class DebugUtil {
    private static final String LOG_TAG = "DebugUtil";
    private static final String LOG_TAG_XC = "xcxc";

    /**
     * Log a list of objects to the local debug log with a tag of "xcxc", easy to filter
     * <p>
     * This method is for debugging purposes only, and all calls should be removed before
     * committing code to master.
     *
     * @param log Objects to log
     */
    public static void logXc(Object... log) {
        Log.d(LOG_TAG_XC, TextUtils.join(" ", log));
    }

    public static void info(String tag, Object... log) {
        Log.i(tag, TextUtils.join(" ", log));
    }

    public static void log(Object... log) {
        Log.d(LOG_TAG, TextUtils.join(" ", log));
    }

    /**
     * Log an unexpected situation with contextual information.
     * <p>
     * This method WILL CRASH DEBUG builds, and SHOULD BE USED to track most unexpected scenarios.
     * <p>
     * Use this method from inside <code>try-catch</code> blocks to log events that you don't expect to happen.
     * Also use this to log other unexpected circumstances in code by passing in a new {@link RuntimeException}.
     *
     * @param tr
     * @param log
     */
    public static void logException(Throwable tr, Object... log) {
        log(log);
        Log.e(LOG_TAG, "Exception logged", tr);
    }

    public static void crash(RuntimeException ex, Object... log) {
        log(log);
        throw ex;
    }
}