package javaLU.LinearDataStructures.Article.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerSorter {
    static class Customer {
        private String name;
        private int years;

        Customer(String name, int years) {
            this.name = name;
            this.years = years;
        }
        public String getName(){
            return this.name;
        }
    }

    public static void main(String[] args) {
        List<Customer> listOfCustomers = new ArrayList<>();
        listOfCustomers.add(new Customer("Adam", 18));
        listOfCustomers.add(new Customer("Caly", 19));
        listOfCustomers.add(new Customer("bob", 15));
        listOfCustomers.add(new Customer("darry", 21));



        Collections.sort(listOfCustomers, new Comparator<Customer>(){

            //Comparator is an Interface. Here we create an instance of it and an implementation of its only method
            @Override
            public int compare(Customer obj1, Customer obj2){
                return obj1.getName().toUpperCase()
                        .compareTo(obj2.getName().toUpperCase());
            }

            //Returns a Negative Integer: If the first object is less than the second.
            //
            //Returns Zero: If both objects are equal.
            //
            //Returns a Positive Integer: If the first object is greater than the second.
        });

        Collections.sort(listOfCustomers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {

                return o1.years ;
            }


        });

        for (Customer customer : listOfCustomers) {
            System.out.println(customer.name);
        }
    }
}
