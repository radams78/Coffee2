public class Grinder {
    public GroundCoffee grind(CoffeeBean coffeeBean, int quantityCoffee) {
        return new GroundCoffee(coffeeBean.toString(), quantityCoffee);
    }
}
