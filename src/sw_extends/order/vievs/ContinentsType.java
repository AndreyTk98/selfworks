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
        return ValidateIntValue.validateIntValue(scanner, 1);

    }

    public void doSwitchContinents() {
        switch (makeSwitchContinents()) {
            case 1 -> {
                choose = Price_continent.ASIA;
                deliveryRegion = "Азия";
            }
            case 2 -> {
                choose = Price_continent.AFRICA;
                deliveryRegion = "Африка";
            }
            case 3 -> {
                choose = Price_continent.EU;
                deliveryRegion = "Страны Евросоюза";
            }
            case 4 -> {
                choose = Price_continent.OTHER_EUROPEAN_COUNTRIES;
                deliveryRegion = "Страны Европы не входящие в ЕС";
            }
            case 5 -> {
                choose = Price_continent.NORTH_AMERICA;
                deliveryRegion = "Северная Америка";
            }
            case 6 -> {
                choose = Price_continent.SOUTH_AMERICA;
                deliveryRegion = "Южная Америка";
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
