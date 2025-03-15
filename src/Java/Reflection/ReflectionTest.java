package Java.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Animal1 animal = new Animal1("Leo",4);

        Method[] methods = animal.getClass().getDeclaredMethods();
        System.out.println(methods[1].getDeclaringClass());
        for(Method method: methods){
            System.out.println(method.getReturnType() + " " + method.getName() + "( " +
                      " )");
            method.setAccessible(true);

            if(method.getName().equals("setAge")) {
                System.out.println(method.invoke(animal, 5));
            } else {
                System.out.println(method.invoke(animal));
            }
        }
        //class Java.Reflection.Animal1
        //void setAge(  )
        //null
        //void makeSound(  )
        //Some generic animal sound
        //null
        //int getAge(  )
        //5
        //void PUBLIC_STATIC_method(  )
        //I AM PUBLIC STATIC METHOD??
        //null
        //void PRIVATE_STATIC_method(  )
        //i am private static method
        //null
        //void PRIVATE_method(  )
        //I AM PRIVATE METHOD
        //null
        //class java.lang.String getName(  )
        //Leo




        //Field stuff test
        Field[] animalFields = animal.getClass().getDeclaredFields();
        for(Field field : animalFields){
            System.out.println(field.getName());
            field.setAccessible(true);
            if(field.getName().equals("name")){
                field.set(animal,"Jhonyy");
            }
            System.out.println(field.get(animal));
            System.out.println(field.getType());
            System.out.println(field.getDeclaringClass());
        }
        //name
        //Jhonyy
        //class java.lang.String
        //class Java.Reflection.Animal1
        //age
        //4
        //int
        //class Java.Reflection.Animal1
    }
}
