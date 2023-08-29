package sw_extends.order.vievs;

import sw_extends.order.regions.Price_continent;
import sw_extends.order.utilits.validation.ValidateIntValue;

import java.util.Scanner;

public class ContinentsType {

    private Price_continent choose;
    private String deliveryRegion;

    private int makeSwitchContinents() {
        Scanner scanner = new Scanner(System.in);
        String title = """
                Выбрана доставка по миру
                Выберите регион доставки:
                1 - Азия
                2 - Африка
                3 - Страны Евросоюза
                4 - Страны Европы не входящие в ЕС
                5 - Северная Америка
                6 - Южная Америка
                """;
        System.out.println(title);
        int titleType = 1;
        return ValidateIntValue.validateIntValue(scanner, titleType);

    }

    public void doSwitchContinents() {
        switch (makeSwitchContinents()) {
            case 1 -> {
                choose = Price_continent.ASIA;
                deliveryRegion = Price_continent.ASIA.getNameContinent();
            }
            case 2 -> {
                choose = Price_continent.AFRICA;
                deliveryRegion = Price_continent.AFRICA.getNameContinent();
            }
            case 3 -> {
                choose = Price_continent.EU;
                deliveryRegion = Price_continent.EU.getNameContinent();
            }
            case 4 -> {
                choose = Price_continent.OTHER_EUROPEAN_COUNTRIES;
                deliveryRegion = Price_continent.OTHER_EUROPEAN_COUNTRIES.getNameContinent();
            }
            case 5 -> {
                choose = Price_continent.NORTH_AMERICA;
                deliveryRegion = Price_continent.NORTH_AMERICA.getNameContinent();
            }
            case 6 -> {
                choose = Price_continent.SOUTH_AMERICA;
                deliveryRegion = Price_continent.SOUTH_AMERICA.getNameContinent();
            }
        }
    }

    public Price_continent getChoose() {
        return choose;
    }

    public String getDeliveryRegion() {
        return deliveryRegion;
    }
}
