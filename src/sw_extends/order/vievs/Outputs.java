package sw_extends.order.vievs;

import sw_extends.order.models.Cargo;

public class Outputs {

    public static void getOutputsSimpleOrder(String orderName, String orderType, int quantityOrder, String weight,
                                             String cost) {
        String title = "Тип доставки: " + orderType + "\n"
                + "Наименование посылок: " + orderName + "\n"
                + "Количество посылок: " + quantityOrder + "\n"
                + "Общий вес посылок: " + weight + "(кг)" + "\n"
                + "Итоговая цена: " + cost + "(грн)";
        System.out.println(title);
    }

    public static void getOutputsComplexOrder(String orderName, String orderType, String deliveryType,
                                              int quantityOrder, String weight, String cost) {
        String title = "Тип доставки: " + orderType + "\n"
                + "Регион: " + deliveryType + "\n"
                + "Наименование посылок: " + orderName + "\n"
                + "Количество посылок: " + quantityOrder + "\n"
                + "Общий вес посылок: " + weight + "(кг)" + "\n"
                + "Итоговая цена: " + cost + "(грн)";
        System.out.println(title);
    }
}
