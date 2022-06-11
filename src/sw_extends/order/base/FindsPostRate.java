package sw_extends.order.base;

import sw_extends.order.regions.Price_continent;
import sw_extends.order.regions.Price_region;

public interface FindsPostRate {
    double findsPostRate(int type, Price_region region, Price_continent continent);
}
