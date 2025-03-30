package Java.TestDrivenDevelopment;

public class MathUtils {
    //version 1
//    public double calculateAverage(double[] numbers){
//        double sum = 0;
//        for (double number : numbers){
//            sum += number;
//        }
//
//        double average = sum/numbers.length;
//        return average;
//    }
    //didn't pass the empty array

    //version 2
//    public double calculateAverage(double[] numbers){
//
//        if(numbers.length == 0){
//            throw new IllegalArgumentException("Do not insert empty array plsssss");
//        }
//
//        double sum = 0;
//        for (double number : numbers){
//            sum += number;
//        }
//
//        double average = sum/numbers.length;
//        return average;
//    }
    //didn't pass the null pointer

    //version 3
    public double calculateAverage(double[] numbers){
        if(numbers == null){
            throw new NullPointerException("Why you put array pointing to null??");
        }

        if(numbers.length == 0){
            throw new IllegalArgumentException("Do not insert empty array plsssss");
        }

        double sum = 0;
        for (double number : numbers){
            sum += number;
        }

        double average = sum/numbers.length;
        return average;
    }
}
