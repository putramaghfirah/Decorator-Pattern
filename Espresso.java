/**
 * @author Putra Maghfirah = 1708107010025
 * @since 2019
 * @version 1.0
 */
public class Espresso extends Beverage {
    Beverage bev;

    public Espresso() {
        description = "Espresso";
    }

    public Espresso(Beverage bev) {
        this.bev = bev;
        description = "Espresso";
    }

    public double cost() {
        try {
            return 1.99 + bev.cost();
        } catch (Exception e) {
            return 1.99;
        }
    }
}
