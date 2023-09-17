package chainOfResponsability.logger.enums;

public enum LogLevel {
    INFO("INFO"),
    DEBUG("DEBUG"),
    ERROR("ERROR"),
    WARNING("WARN");

    private final String displayName;

    LogLevel(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
