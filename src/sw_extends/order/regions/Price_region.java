package sw_extends.order.regions;

public enum Price_region {

    INSIDE_THE_CITY(0.03),
    INSIDE_THE_REGION(0.05),
    INSIDE_THE_COUNTRY(0.08);

    private final double priceRegion;

    Price_region(double priceRegion) {
        this.priceRegion = priceRegion;
    }

    public double getPriceRegion() {
        return this.priceRegion;
    }
}
