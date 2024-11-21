package JavaOOP.Solid.LiskovSubstitionPrinciple;

public class Incorrect {
//The problem arises from the fact that
// the Penguin class overrides the fly() method in a way that breaks the expected behavior for all Bird objects.
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();
        BirdCommand.letThemFly(sparrow,penguin);

    }
}

class BirdCommand {
    public static void letThemFly(Bird... bird) {
        for (Bird birdy : bird) {
            birdy.fly();
        }
    }
}
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Penguin extends Bird {
    @Override
    public void fly() {
        // Penguins can't fly, this violates LSP
        throw new UnsupportedOperationException("Penguins can't fly");
    }
}



