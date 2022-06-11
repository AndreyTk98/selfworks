package sw_extends.order.regions;

public enum Price_continent {

    ASIA(0.15),
    AFRICA(0.2),
    EU(0.5),
    OTHER_EU_COUNTRIES(0.1),
    NORTH_AMERICA(0.25),
    SOUTH_AMERICA(0.22);

    private final double priceContinent;

    Price_continent(double priceContinent) {
        this.priceContinent = priceContinent;
    }

    public double getPriceContinent() {
        return this.priceContinent;
    }
}
