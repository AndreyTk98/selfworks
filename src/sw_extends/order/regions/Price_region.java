package sw_extends.order.regions;

public enum Price_region {

    INSIDE_THE_CITY(0.03, "По Городу"),
    INSIDE_THE_REGION(0.05, "По области"),
    INSIDE_THE_COUNTRY(0.08, "По стране");

    private final double priceRegion;
    private final String nameRegion;

    Price_region(double priceRegion, String nameRegion) {
        this.priceRegion = priceRegion;
        this.nameRegion = nameRegion;
    }

    public double getPriceRegion() {
        return this.priceRegion;
    }
    public String getNameRegion() {
        return this.nameRegion;
    }

}
