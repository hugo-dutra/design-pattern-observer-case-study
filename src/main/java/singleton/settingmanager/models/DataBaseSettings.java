package singleton.settingmanager.models;

import java.util.Objects;

public class DataBaseSettings {
    private String host;
    private String port;
    private String user;
    private String password;
    private String databaseName;

    public static class Builder {
        private String host;
        private String port;
        private String user;
        private String password;
        private String databaseName;

        public Builder() {
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        public DataBaseSettings build() {
            DataBaseSettings dataBaseSettings = new DataBaseSettings();
            dataBaseSettings.host = this.host;
            dataBaseSettings.port = this.port;
            dataBaseSettings.user = this.user;
            dataBaseSettings.password = this.password;
            dataBaseSettings.databaseName = this.databaseName;
            return dataBaseSettings;
        }
    }

    public String getHost() {
        return this.host;
    }

    public String getPort() {
        return this.port;
    }

    public String getUser() {
        return this.user;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDatabaseName() {
        return this.databaseName;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {
        return "DataBaseSettings{" + "host=" + host + ", port=" + port + ", user=" + user + ", password=" + password + ", databaseName=" + databaseName + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!DataBaseSettings.class.isAssignableFrom(obj.getClass())) {
            return false;
        }

        final DataBaseSettings other = (DataBaseSettings) obj;

        if (!Objects.equals(this.host, other.host)) {
            return false;
        }

        if (!Objects.equals(this.port, other.port)) {
            return false;
        }

        if (!Objects.equals(this.user, other.user)) {
            return false;
        }

        if (!Objects.equals(this.password, other.password)) {
            return false;
        }

        return Objects.equals(this.databaseName, other.databaseName);
    }

}
