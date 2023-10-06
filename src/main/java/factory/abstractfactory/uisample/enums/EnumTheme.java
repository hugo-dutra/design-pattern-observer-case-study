package factory.abstractfactory.uisample.enums;

public enum EnumTheme {
    BLACK("BLACK"),
    WHITE("WHITE");

    private final String theme;

    EnumTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

}
