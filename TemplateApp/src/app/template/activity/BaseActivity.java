package app.template.activity;

import com.j256.ormlite.android.apptools.OpenHelperManager;

import org.holoeverywhere.app.Activity;

import app.template.database.DatabaseHelper;

public class BaseActivity extends Activity {
    private DatabaseHelper databaseHelper = null;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (databaseHelper != null) {
            OpenHelperManager.releaseHelper();
            databaseHelper = null;
        }
    }

    protected DatabaseHelper getHelper() {
        if (databaseHelper == null) {
            databaseHelper =
                    OpenHelperManager.getHelper(this, DatabaseHelper.class);
        }
        return databaseHelper;
    }
}
