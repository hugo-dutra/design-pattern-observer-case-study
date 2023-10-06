package factory.fruitss.fruits;

public enum EnumFruits {
    APPLE("APPLE"),
    AVOCADO("AVOCADO"),
    ORANGE("ORANGE");

    private final String fruitName;

    EnumFruits(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }
}
