package singleton.gameresourcemanager.enums;

public enum ResourceType {
    GOLD("GOLD"),
    WOOD("WOOD"),
    ROCK("ROCK");

    private final String name;

    ResourceType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
