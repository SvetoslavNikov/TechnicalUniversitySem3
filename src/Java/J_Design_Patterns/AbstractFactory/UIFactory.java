package Java.J_Design_Patterns.AbstractFactory;

//Abstract Factory pattern solves the problem of creating entire product families
// without specifying
// their concrete classes. It ensures that client code works with
// compatible product objects from the same family, promoting consistency among products.
class Test{
    public static void main(String[] args) {
        UIFactory factory = new WindowsUIFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        button.render();
        textField.show();


        factory = new MacUIFactory();
        button = factory.createButton();
        textField = factory.createTextField();
        button.render();
        textField.show();
    }
}
public interface UIFactory {
    Button createButton();
    TextField createTextField();
}

class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public TextField createTextField() {
        return new WindowsTextField();
    }
}

class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
    @Override
    public TextField createTextField() {
        return new MacTextField();
    }
}


interface Button {
    void render();
}

interface TextField {
    void show();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering windows Button");
    }
}

class WindowsTextField implements TextField {
    @Override
    public void show() {
        System.out.println("Displaying a windows text field");
    }
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering mac beautiful button");
    }
}

class MacTextField implements TextField {
    @Override
    public void show() {
        System.out.println("Displaying the round corners TextField");
    }
}





















