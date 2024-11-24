package JavaOOP.AnnotationsExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class AnnotationsExplore {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat myCat = new Cat("Steven", 10);
        Class<?> exploreMyCat = myCat.getClass();

        //class annotation
        if (exploreMyCat.isAnnotationPresent(AnimalClass.class)) {
            AnimalClass annot = exploreMyCat.getAnnotation(AnimalClass.class);
            System.out.println(annot.dangerous());
        }
        System.out.println("\n");


        //method annotation
        for (Method method : exploreMyCat.getDeclaredMethods()) {
            System.out.println();
            if (method.isAnnotationPresent(RunThisMethod.class)) {
                RunThisMethod annot = method.getAnnotation(RunThisMethod.class);
                method.setAccessible(true);
                for (int i = 0; i < annot.times(); i++) {
                    if (Modifier.isStatic(method.getModifiers()) &&
                            method.getParameterCount() == 1 &&
                            method.getParameterTypes()[0].equals(String.class)) {
                        method.invoke(null, "HI BABY");

                    } else {
                        // Handle instance methods
                        if (method.getParameterCount() == 0) {
                            System.out.println(method.invoke(myCat));
                        } else {
                            System.out.println("Non-static method with parameters is not supported in this example.");
                        }
                    }
                }
            }
        }
        System.out.println("\n");

        //Fields
        for(Field field: exploreMyCat.getDeclaredFields()){
            if(field.isAnnotationPresent(ImportantField.class)){
                System.out.println(field.getName());
            }
        }
    }


}


