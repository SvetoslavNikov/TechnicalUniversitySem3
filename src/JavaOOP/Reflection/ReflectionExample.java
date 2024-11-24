package JavaOOP.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) throws Exception{
        Cat myCat = new Cat("Littly Timy", 8);

        reflectFields(myCat);
        reflectMethods(myCat);

    }

    public static void reflectFields(Object obj) throws IllegalAccessException {
        System.out.println(obj.getClass());
        Class<?> examineMe = obj.getClass();
        Field[] fields = examineMe.getDeclaredFields();
       //fields[0].set(examineMe,"Svetoslav"); throws the exception
        fields[0].setAccessible(true);
        fields[0].set(obj, "Svetoslav");

        for (Field field: fields){
            if(field.trySetAccessible())
            System.out.println("Field Name: " + field.getName());
            System.out.println("Field Value: " + field.get(obj));
        }
        System.out.println("\n");
    }

    public static void reflectMethods(Object obj) throws InvocationTargetException, IllegalAccessException {
        Class<?> examineMyMethods = obj.getClass();
        Method[] methods = examineMyMethods.getDeclaredMethods();

        for (Method method: methods){
            System.out.println(method.getName());
            System.out.println(method.getParameterCount());

            if(0 == method.getParameterCount()) {
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }

}

