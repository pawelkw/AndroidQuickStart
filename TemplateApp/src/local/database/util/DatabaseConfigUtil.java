package local.database.util;

import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

import app.template.model.TemplateModel;

public class DatabaseConfigUtil extends OrmLiteConfigUtil {

    private static final String CONFIG_FILE_PATH = "ormlite_config.txt";

    public static void main(String[] args) throws Exception {
        writeConfigFile(CONFIG_FILE_PATH);
    }
}