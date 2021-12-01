import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCoffeeApp {
    class MockCoffeeMachine implements ICoffeeMachine {
        public boolean brewed = false;

        @Override
        public Coffee brewFilterCoffee() {
            brewed = true;
            return new Coffee();
        }
    }

    @Test
    public void testBrewCoffee() {
        MockCoffeeMachine m = new MockCoffeeMachine();
        CoffeeApp app = new CoffeeApp(m);
        try {
            Coffee c = app.prepareCoffee();
        } catch (CoffeeException e) {
            assertEquals(0, 1);
        }

        assertTrue(m.brewed);
    }
}
