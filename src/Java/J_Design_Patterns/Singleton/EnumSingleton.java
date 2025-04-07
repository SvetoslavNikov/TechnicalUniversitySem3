package Java.J_Design_Patterns.Singleton;

//safest best practice is to use enum
public enum EnumSingleton{
    //default
    INSTANCE;
    //public static EnumSingleton getInstance(){}
    int i;
    public void showi(){
        System.out.println("EnumSingleton int i = " + i);
    }
}

class TestEnumSingleton{
    public static void main(String[] args) {
        EnumSingleton OBJ1 = EnumSingleton.INSTANCE;
        OBJ1.i = 5;
        OBJ1.showi();


        EnumSingleton obj2 = EnumSingleton.INSTANCE;
        obj2.i = 6;

        OBJ1.showi();//6, so we got only one instance

        //EnumSingleton obj3 = new EnumSingleton();

        //can't use NEW with enums because:
        //
        //singleton-like behavior: Enums ensure only one instance of each constant
        //
        //private constructor: The enum's constructor is automatically private
        //preventing direct instantiation
    }
}
