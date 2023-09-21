package singleton.settingmanager.implementations;

import singleton.settingmanager.interfaces.ConfigManager;
import singleton.settingmanager.models.DataBaseSettings;

public class ConfigManagerImpl implements ConfigManager {
    private static ConfigManagerImpl instance;
    private DataBaseSettings dataBaseSettings;

    private ConfigManagerImpl() {
        dataBaseSettings = null;
        instance = null;
    }

    @Override
    public DataBaseSettings loadDatabaseSettings() {
        System.out.println("Loading database settings from file...");
        return new DataBaseSettings.Builder()
                .databaseName("test")
                .host("localhost")
                .password("1234")
                .port("3306")
                .user("root")
                .build();
    }

    @Override
    public DataBaseSettings getDatabaseSettings() {
        System.out.println("Getting database settings...");
        dataBaseSettings = this.loadDatabaseSettings();
        return dataBaseSettings;
    }

    @Override
    public void setDatabaseSettings(DataBaseSettings dataBaseSettings) {
        System.out.println("Setting database settings...");
        this.dataBaseSettings = dataBaseSettings;
    }

    @Override
    public DataBaseSettings updateDatabaseSettings(DataBaseSettings dataBaseSettings) {
        System.out.println("Updating database settings...");
        this.dataBaseSettings = dataBaseSettings;
        return this.dataBaseSettings;
    }

    public static synchronized ConfigManagerImpl getInstance() {
        if (instance == null) {
            instance = new ConfigManagerImpl();
        }
        return instance;
    }
}
