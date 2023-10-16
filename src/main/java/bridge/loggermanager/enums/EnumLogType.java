package bridge.loggermanager.enums;

public enum EnumLogType {
    TXT("TXT"),
    JSON("JSON");

    private final String type;

    EnumLogType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
