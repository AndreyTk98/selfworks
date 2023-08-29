package sw_extends.order.calculations;

import sw_extends.order.base.*;
import sw_extends.order.regions.Price_continent;
import sw_extends.order.regions.Price_region;

public class Calc implements CalcAllWeight, CalcCourierDeliveryRate, FindsCountryPostRateCost,
        CalcFinalDeliveryCost, FindsContinentsPostRateCost, CalcCost {

    @Override
    public double calcAllWeight(double [] weights) {
        double allWeight = 0;
        for (double i : weights) {
            allWeight += i;
        }
        return allWeight;
    }

    @Override
    public double calcCost(double allWeight, double price) {
        return allWeight * price;
    }

    @Override
    public double calcCourierOrderCountryRate(double range) {
        double fastDeliveryRate;
        if (range <= 5) {
            fastDeliveryRate = 0.5;
            return fastDeliveryRate;
        } else if (range > 5 & range <= 25) {
            fastDeliveryRate = 0.8;
            return fastDeliveryRate;
        } else {
            fastDeliveryRate = 0.10;
            return fastDeliveryRate;
        }
    }

    @Override
    public double findsCountryPostRate(Price_region region) {
        double postRate;
        postRate = 0;
        switch (region) {
            case INSIDE_THE_CITY -> postRate = Price_region.INSIDE_THE_CITY.getPriceRegion();
            case INSIDE_THE_REGION -> postRate = Price_region.INSIDE_THE_REGION.getPriceRegion();
            case INSIDE_THE_COUNTRY -> postRate = Price_region.INSIDE_THE_COUNTRY.getPriceRegion();
        }
        return postRate;
    }

    public double findContinentsPostRate(Price_continent continent) {
        double postRate;
        postRate = 0;
        switch (continent) {
            case EU -> postRate = Price_continent.EU.getPriceContinent();
            case NORTH_AMERICA -> postRate = Price_continent.NORTH_AMERICA.getPriceContinent();
            case SOUTH_AMERICA -> postRate = Price_continent.SOUTH_AMERICA.getPriceContinent();
            case ASIA -> postRate = Price_continent.ASIA.getPriceContinent();
            case AFRICA -> postRate = Price_continent.AFRICA.getPriceContinent();
            case OTHER_EUROPEAN_COUNTRIES -> postRate =
                    Price_continent.OTHER_EUROPEAN_COUNTRIES.getPriceContinent();
        }
        return postRate;
    }
    @Override
    public double calcFinalDeliveryCost(double Cost, double rate) {
        return (Cost * rate) + Cost;
    }
}

