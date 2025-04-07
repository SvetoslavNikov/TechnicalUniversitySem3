package Java.J_Design_Patterns.SingletonEx;

public class Singleton {
    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
    }
}

class Abc{
    private static Abc obj = new Abc();
    private Abc(){

    }

    public static Abc getInstance(){
        return obj;
    }
}
