package sw_extends.order.calculations;

import sw_extends.order.base.CalcBaseOrderCost;
import sw_extends.order.base.CalcFastDeliveryCharge;
import sw_extends.order.base.FindsPostRate;
import sw_extends.order.regions.Price_continent;
import sw_extends.order.regions.Price_region;

public class Calc implements CalcBaseOrderCost, CalcFastDeliveryCharge, FindsPostRate {

    @Override
    public double calcCost(int allWeights, double price) {
        return allWeights * price;
    }

    @Override
    public double calcFastOrderCost(double range) {
        double fastDeliveryCharge;
        if (range < 2000) {
            fastDeliveryCharge = 0.05;
            return fastDeliveryCharge;
        } else if (range >= 2000 & range < 5000) {
            fastDeliveryCharge = 0.08;
            return fastDeliveryCharge;
        } else if (range >= 5000 & range <= 20000) {
            fastDeliveryCharge = 0.1;
            return fastDeliveryCharge;
        } else {
            System.out.println("Слишком далеко");
            return calcFastOrderCost(range);
        }
    }

    @Override
    public double findsPostRate(int type, Price_region region, Price_continent continent) {
        double postRate;
        postRate = 0;
        switch (type) {
            case 1 -> {
                switch (region) {
                    case INSIDE_THE_CITY -> postRate = Price_region.INSIDE_THE_CITY.getPriceRegion();
                    case INSIDE_THE_REGION -> postRate = Price_region.INSIDE_THE_REGION.getPriceRegion();
                    case INSIDE_THE_COUNTRY -> postRate = Price_region.INSIDE_THE_COUNTRY.getPriceRegion();
                }
            }
            case 2 -> {
                switch (continent) {
                    case EU -> postRate = Price_continent.EU.getPriceContinent();
                    case NORTH_AMERICA -> postRate = Price_continent.NORTH_AMERICA.getPriceContinent();
                    case SOUTH_AMERICA -> postRate = Price_continent.SOUTH_AMERICA.getPriceContinent();
                    case ASIA -> postRate = Price_continent.ASIA.getPriceContinent();
                    case AFRICA -> postRate = Price_continent.AFRICA.getPriceContinent();
                    case OTHER_EU_COUNTRIES -> postRate = Price_continent.OTHER_EU_COUNTRIES.getPriceContinent();
                }
            }
        }
        return postRate;
    }
}

