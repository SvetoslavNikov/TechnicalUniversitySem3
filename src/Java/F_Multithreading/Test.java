package Java.F_Multithreading;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        ArrayConstruction arrConstr = new ArrayConstruction();
        PrintingThread printingThr = new PrintingThread(arrConstr);
        SortingThread sortingThr = new SortingThread(arrConstr);
        arrConstr.create();
        arrConstr.print();
        System.out.println();
        System.out.println("After construction");
        printingThr.start();
        sortingThr.run();
        System.out.println("After Sorting");
        arrConstr.print();


    }
}
class ArrayConstruction {
    int[] array = new int[1500];

    public ArrayConstruction() {
        for (int i = this.array.length - 1; i >= 0; i--) {
            this.array[i] = i;

        }
    }

    public void create() {
        int i;
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("Creation finished");
    }

    public void print() {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
class PrintingThread extends Thread {
    ArrayConstruction arrConstr;

    public PrintingThread(ArrayConstruction arrConstr) {
        this.arrConstr = arrConstr;
    }

    @Override
    public void run() {
        arrConstr.print();
    }
}
class SortingThread extends Thread {
    private ArrayConstruction arrConstr;

    public SortingThread(ArrayConstruction arrConstr) {
        this.arrConstr = arrConstr;
    }

    @Override
    public void run() {
        Arrays.sort(arrConstr.array);
    }

}
