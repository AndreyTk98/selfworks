package sw_extends.order.calculations;

import sw_extends.order.base.CalcBaseOrderCost;
import sw_extends.order.base.CalcFastDeliveryCharge;
import sw_extends.order.base.FindsPostRate;
import sw_extends.order.regions.Price_continent;
import sw_extends.order.regions.Price_region;

public class Calc implements CalcBaseOrderCost, CalcFastDeliveryCharge, FindsPostRate {

    @Override
    public double calcCost(double[] weights, double price) {
        double allWeight;
        allWeight = 0;
        for (double i : weights) {
            allWeight += i;
        }
        return allWeight * price;
    }

    @Override
    public double calcFastOrderCost(double range) {
        double fastDeliveryCharge;
        if (range < 20) {
            fastDeliveryCharge = 0.05;
            return fastDeliveryCharge;
        } else if (range >= 20 & range < 50) {
            fastDeliveryCharge = 0.08;
            return fastDeliveryCharge;
        } else {
            fastDeliveryCharge = 0.1;
            return fastDeliveryCharge;
        }
    }

    @Override
    public double findsPostRate(int PostsType, Price_region region, Price_continent continent) {
        double postRate;
        postRate = 0;
        switch (PostsType) {
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

