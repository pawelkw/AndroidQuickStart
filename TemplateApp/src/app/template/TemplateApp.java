package app.template;

import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;
import org.holoeverywhere.app.Application;

import app.template.util.L;

@ReportsCrashes(
        formKey = "",
        formUri = "https://crash.cloudant.com/acra-app_template/_design/acra-storage/_update/report",
        reportType = org.acra.sender.HttpSender.Type.JSON,
        httpMethod = org.acra.sender.HttpSender.Method.PUT,
        formUriBasicAuthLogin = "ossenthichationdeceddldi",
        formUriBasicAuthPassword = "HRvsLtTe2tN3ONjEPcq2JaFU"
)
public class TemplateApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            L.i("ACRA is disabled, because the app is running in debug mode. Crash reports will not be sent.");
        } else {
            L.i("ACRA is enabled. Crash reports will be gathered and sent to the specified endpoint.");
            ACRA.init(this);
        }
    }
}
