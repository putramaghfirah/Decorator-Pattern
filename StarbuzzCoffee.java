/**
 * @author Putra Maghfirah = 1708107010025
 * @since 2019
 * @version 1.0
 */
public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        beverage = new Espresso(beverage);
        System.out.println("Double " + beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Espresso();
        beverage2 = new Espresso(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println("Double " + beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new Espresso();
        beverage3 = new Espresso(beverage3);
        beverage3 = new Oreo(beverage3);
        beverage3 = new Milk(beverage3);
        System.out.println("Double " + beverage3.getDescription() + " $" + beverage3.cost());

    }
}
