package Java.J_Design_Patterns.AbstractFactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UIFactoryTest {

    @Test
    void windowsFactoryCreatesWindowsComponents() {
        UIFactory factory = new WindowsUIFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        assertTrue(button instanceof WindowsButton);
        assertTrue(textField instanceof WindowsTextField);
    }

    @Test
    void macFactoryCreatesMacComponents() {
        UIFactory factory = new MacUIFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();

        assertTrue(button instanceof MacButton);
        assertTrue(textField instanceof MacTextField);
    }
}
