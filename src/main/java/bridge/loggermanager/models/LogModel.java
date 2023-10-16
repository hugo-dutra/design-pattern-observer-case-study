package bridge.loggermanager.models;

import bridge.loggermanager.enums.EnumLogType;

import java.time.LocalDateTime;

public class LogModel {
    private final String message;
    private final EnumLogType type;
    private final LocalDateTime date;

    public LogModel(String message, EnumLogType type) {
        this.message = message;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    public String getMessage() {
        return this.message;
    }

    public EnumLogType getType() {
        return this.type;
    }

    public LocalDateTime getDate() {
        return this.date;
    }
}
