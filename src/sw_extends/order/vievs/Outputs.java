package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;

public class Outputs {

    public static void getOutputsSimpleOrder (String orderName, String orderType, int quantityOrder, double weight,
                                              double cost) {
        String title = "Тип доставки: " + orderType + "\n"
                + "Наименование посылок: " + orderName + "\n"
                + "Количество посылок: " + quantityOrder + "\n"
                + "Общий вес посылок: " + weight + "\n"
                + "Итоговая цена: " + cost;
        System.out.println(title);
    }
    public static void getOutputsComplexOrder (String orderName, String orderType, String deliveryType,
                                               int quantityOrder, double weight, double cost) {
        String title = "Тип доставки: " + orderType + deliveryType + "\n"
                + "Наименование посылок: " + orderName + "\n"
                + "Количество посылок" + quantityOrder + "\n"
                + "Общий вес посылок" + weight + "\n"
                + "Итоговая цена: " + cost;
        System.out.println(title);
    }
}
