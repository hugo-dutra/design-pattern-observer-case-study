package singleton.logger.enums;

public enum LogLevelEnum {
    INFO("INFO"),
    DEBUG("DEBUG"),
    ERROR("ERROR"),
    WARNING("WARNING");

    private String logLevel;

    LogLevelEnum(String logLevel) {
        this.logLevel = logLevel;
    }
    public String getLogLevel() {
        return this.logLevel;
    }
}
