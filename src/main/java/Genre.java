public enum Genre {

    SPACE_CRIME("Space/crime crossover related"),
    SCI_FI("Fiction based on science or technology, often set in the distant future"),
    HORROR("Psychological drama or fiction, often involving elements of danger or threat");

    private final String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
