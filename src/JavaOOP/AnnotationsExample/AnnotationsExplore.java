package JavaOOP.AnnotationsExample;

import java.lang.annotation.Annotation;

public class AnnotationsExplore {
    public static void main(String[] args) {
        Cat myCat = new Cat("Steven", 10);
        Class<?> exploreMyCat = myCat.getClass();
        if(exploreMyCat.isAnnotationPresent(AnimalClass.class)){
            AnimalClass annot = exploreMyCat.getAnnotation(AnimalClass.class);
            System.out.println(annot.dangerous());
        }


    }

}
