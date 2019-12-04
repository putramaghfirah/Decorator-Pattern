/**
 * @author Putra Maghfirah = 1708107010025
 * @since 2019
 * @version 1.0
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
