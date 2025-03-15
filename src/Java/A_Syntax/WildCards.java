package Java.A_Syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCards {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        // can't list.add(3);
        list = new ArrayList<Integer>();

        List<String> list1 = new ArrayList<>();
        //can't list1 = new ArrayList<Integer>();
        sumNums(new ArrayList<>(Arrays.asList(5,6.023)));



        //this doesnt work
        // addToList(new ArrayList<Double>(Arrays.asList(6.34,5.34)));

        //but this does. here maybe its list of Objects or Numbers
        addToList(new ArrayList<>(Arrays.asList(6.34,5.34)));

    }

    //upper bound
    public static void sumNums(List<? extends Number> list){
        double sum = 0;
        for(Number n : list){
            sum = sum + n.doubleValue();
        }
        System.out.println(sum);
    }

    //lower bound
    public static void addToList(List<? super Integer> list){
        //the type must be T superclass to T
        System.out.println(list.get(0).getClass());
        list.add(42);
    }
}
