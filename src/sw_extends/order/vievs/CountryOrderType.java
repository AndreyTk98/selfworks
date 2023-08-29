package sw_extends.order.vievs;

import sw_extends.order.regions.Price_region;
import sw_extends.order.utilits.validation.ValidateIntValue;

import java.util.Scanner;

public class CountryOrderType {
    private Price_region choose;
    private String deliveryRegion;

    private int makeSwitchCountryOrderType() {
        Scanner scanner = new Scanner(System.in);
        String title = """
                Выбрана частная почта внутри страны
                Выберите масштаб доставки:
                1 - По Городу
                2 - По области
                3 - По стране
                """;
        System.out.println(title);
        return ValidateIntValue.validateIntValue(scanner, 1);
    }

    public void doSwitchCountryOrderType() {
        switch (makeSwitchCountryOrderType()) {
            case 1 -> {
                choose = Price_region.INSIDE_THE_CITY;
                deliveryRegion = Price_region.INSIDE_THE_CITY.getNameRegion();
            }
            case 2 -> {
                choose = Price_region.INSIDE_THE_REGION;
                deliveryRegion = Price_region.INSIDE_THE_REGION.getNameRegion();
            }
            case 3 -> {
                choose = Price_region.INSIDE_THE_COUNTRY;
                deliveryRegion = Price_region.INSIDE_THE_COUNTRY.getNameRegion();
            }
        }
    }

    public Price_region getChoose() {
        return choose;
    }

    public String getDeliveryRegion() {
        return deliveryRegion;
    }
}
