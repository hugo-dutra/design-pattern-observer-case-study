package singleton.gameresourcemanager.enums;

public enum ResourceType {
    GOLD("Gold"),
    WOOD("Wood"),
    ROCK("Rock");

    private final String name;

    ResourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
