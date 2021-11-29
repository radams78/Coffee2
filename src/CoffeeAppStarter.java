import java.util.HashMap;
import java.util.Map;

public class CoffeeAppStarter {
    public static void main(String[] args) {
/*        Map<CoffeeSelection, CoffeeBean> beans = new HashMap<>();
        beans.put(CoffeeSelection.ESPRESSO, new CoffeeBean(
                "My favorite espresso bean", 1000));
        beans.put(CoffeeSelection.FILTER_COFFEE, new CoffeeBean(
                "My favorite filter coffee bean", 1000)); */

        Map<CoffeeSelection, GroundCoffee> coffee = new HashMap<>();
        coffee.put(CoffeeSelection.ESPRESSO, new GroundCoffee(
                "Ground espresso", 1000));
        coffee.put(CoffeeSelection.FILTER_COFFEE, new GroundCoffee(
                "Ground filter coffee", 1000));
        // get a new CoffeeMachine object
        BasicCoffeeMachine machine = new BasicCoffeeMachine(coffee);
        // Instantiate CoffeeApp
        CoffeeApp app = new CoffeeApp(machine);
        // brew a fresh coffee
        try {
            app.prepareCoffee();
        } catch (CoffeeException e) {
            e.printStackTrace();
        }
    }
}