package app.template.util;

import android.util.Log;

public class L {

    private enum LogState {
        WARN, INFO, ERROR, ALL
    }

    public static final LogState CURRENT_STATE = LogState.ALL;

    public static void e(final String msg) {

        switch (CURRENT_STATE) {
            case ALL:
            case INFO:
            case WARN:
            case ERROR:

                final Throwable t = new Throwable();
                final StackTraceElement[] elements = t.getStackTrace();

                final String callerClassName = elements[1].getClassName();
                final String callerMethodName = elements[1].getMethodName();

                Log.e(callerClassName, "[" + callerMethodName + "] " + msg);
        }
    }

    public static void w(final String msg) {

        switch (CURRENT_STATE) {
            case ALL:
            case INFO:
            case WARN:

                final Throwable t = new Throwable();
                final StackTraceElement[] elements = t.getStackTrace();

                final String callerClassName = elements[1].getClassName();
                final String callerMethodName = elements[1].getMethodName();

                Log.w(callerClassName, "[" + callerMethodName + "] " + msg);
        }
    }

    public static void i(final String msg) {

        switch (CURRENT_STATE) {
            case ALL:
            case INFO:

                final Throwable t = new Throwable();
                final StackTraceElement[] elements = t.getStackTrace();

                final String callerClassName = elements[1].getClassName();
                final String callerMethodName = elements[1].getMethodName();

                Log.d(callerClassName, "[" + callerMethodName + "] " + msg);
        }
    }

}