package factory.games.enums;

public enum EnumEnemy {
    ZOMBIE("ZOMBIE"),
    SKULL("SKULL"),
    GHOST("GHOST");

    private final String enemy;

    EnumEnemy(String enemy) {
        this.enemy = enemy;
    }

    public String getEnemy() {
        return enemy;
    }
}
