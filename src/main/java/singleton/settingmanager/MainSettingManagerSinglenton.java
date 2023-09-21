package singleton.settingmanager;

import singleton.settingmanager.implementations.ConfigManagerImpl;
import singleton.settingmanager.interfaces.ConfigManager;
import singleton.settingmanager.models.DataBaseSettings;

public class MainSettingManagerSinglenton {
    public static void main(String[] args) {

        ConfigManager configManager = ConfigManagerImpl.getInstance();
        DataBaseSettings dataBaseSettings = configManager.getDatabaseSettings();

        System.out.println("Database settings: \n");
        System.out.println("Host: " + dataBaseSettings.getHost());
        System.out.println("Port: " + dataBaseSettings.getPort());
        System.out.println("User: " + dataBaseSettings.getUser());
        System.out.println("Password: " + dataBaseSettings.getPassword());
        System.out.println("Database name: " + dataBaseSettings.getDatabaseName());

        System.out.println("\nUpdating database settings...\n");
        dataBaseSettings.setHost("Host: " + dataBaseSettings.getHost() + " updated");
        dataBaseSettings.setPort("Port: " + dataBaseSettings.getPort() + " updated");
        dataBaseSettings.setUser("User: " + dataBaseSettings.getUser() + " updated");
        dataBaseSettings.setPassword("Password: " + dataBaseSettings.getPassword() + " updated");
        dataBaseSettings.setDatabaseName("Database name: " + dataBaseSettings.getDatabaseName() + " updated");


        System.out.println("Database settings: \n");
        System.out.println("Host: " + dataBaseSettings.getHost());
        System.out.println("Port: " + dataBaseSettings.getPort());
        System.out.println("User: " + dataBaseSettings.getUser());
        System.out.println("Password: " + dataBaseSettings.getPassword());
        System.out.println("Database name: " + dataBaseSettings.getDatabaseName());

    }
}
