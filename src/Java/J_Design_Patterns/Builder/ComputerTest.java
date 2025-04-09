
package Java.J_Design_Patterns.Builder;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ComputerTest{
    @Test
    public void testComputerBuilder(){
        Computer computer = new Computer.Builder()
                .ram("32GB DDR5")
                .storage("1TB")
                .graphicsCard("5090")
                .motherboard("ASUS TUF")
                .build();

        assertEquals("32GB DDR5", computer.getRam());
        assertEquals("1TB", computer.getStorage());
        assertEquals("5090", computer.getGraphicsCard());
        assertEquals("ASUS TUF", computer.getMotherboard());
    }
}
