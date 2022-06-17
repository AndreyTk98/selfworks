package sw_extends.order.regions;

public enum Price_continent {

    ASIA(0.15, "Азия"),
    AFRICA(0.2, "Африка"),
    EU(0.5, "Страны Евросоюза"),
    OTHER_EU_COUNTRIES(0.1, "Остальные страны Европы"),
    NORTH_AMERICA(0.25, "Северная Америка"),
    SOUTH_AMERICA(0.22, "Южная Америка");

    private final double priceContinent;
    private final String nameContinent;

    Price_continent(double priceContinent, String nameContinent) {
        this.priceContinent = priceContinent;
        this.nameContinent = nameContinent;
    }

    public double getPriceContinent() {
        return this.priceContinent;
    }

    public String getNameContinent() {
        return this.nameContinent;
    }
}
