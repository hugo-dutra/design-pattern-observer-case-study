package singleton.settingmanager.interfaces;

import singleton.settingmanager.models.DataBaseSettings;

public interface ConfigManager {
    DataBaseSettings loadDatabaseSettings();
    DataBaseSettings getDatabaseSettings();
    void setDatabaseSettings(DataBaseSettings dataBaseSettings);
    DataBaseSettings updateDatabaseSettings(DataBaseSettings dataBaseSettings);
}
