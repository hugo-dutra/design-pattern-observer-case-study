package facades.smarthome.enums;

public enum EnumHouseMode {
    MOVE_THEATER("MOVE_THEATER"),
    PARTY("PARTY"),
    WAKE_UP("WAKE_UP"),
    SLEEP("SLEEP");
    private final String mode;

    EnumHouseMode(String mode) {
        this.mode = mode;
    }

    public String getMode() {
        return mode;
    }

}
