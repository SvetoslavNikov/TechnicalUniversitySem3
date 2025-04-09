package Java.J_Design_Patterns.Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealOrderTest {

    @Test
    void testFullMealOrder() {
        MealOrder order = new MealOrder.Builder()
                .setMainCourse("burger")
                .setSideDish("fries")
                .setDrink("cola")
                .setDessert("cake")
                .setSpecialInstructions("extra cheese")
                .build();

        assertEquals("burger", order.getMainCourse());
        assertEquals("fries", order.getSideDish());
        assertEquals("cola", order.getDrink());
        assertEquals("cake", order.getDessert());
        assertEquals("extra cheese", order.getSpecialInstructions());
    }

    @Test
    void testPartialMealOrder() {
        MealOrder order = new MealOrder.Builder()
                .setMainCourse("salad")
                .build();

        assertEquals("salad", order.getMainCourse());
        assertNull(order.getSideDish());
        assertNull(order.getDrink());
        assertNull(order.getDessert());
        assertNull(order.getSpecialInstructions());
    }
}
