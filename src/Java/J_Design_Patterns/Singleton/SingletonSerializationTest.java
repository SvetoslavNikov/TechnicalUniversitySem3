package Java.J_Design_Patterns.Singleton;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertSame;

public class SingletonSerializationTest {

    @Test
    public void testSingletonSerialization() throws Exception {
        DoubleCheckedLockingSingleton instance1 = DoubleCheckedLockingSingleton.getInstance();
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("serializedSingleton.obj"));
        out.writeObject(instance1);
        out.close();

        ObjectInputStream input = new ObjectInputStream(new FileInputStream("serializedSingleton.obj"));
        DoubleCheckedLockingSingleton instance2 = (DoubleCheckedLockingSingleton) input.readObject();
        input.close();

        assertSame(instance1, instance2, "Singleton IS NOT broken, Congrats");
    }
}
