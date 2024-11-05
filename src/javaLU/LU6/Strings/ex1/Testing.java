package javaLU.LU6.Strings.ex1;

public class Testing {
    public static char[] method1(char[] arr){
        arr[0] = 'A';
        return arr;
    }

    public static String method2(String a){
        a.replace("Nikov","Svetoslav");
        return a;
    }
    public static void main(String[] args) {
        char[] arr = {'a','b','c'};
        System.out.println(method1(arr));
        System.out.println(arr);

        String c = "Nikov";
        method2(c);
        System.out.println(c);
        /* String Buffer

        StringBuffer a = new StringBuffer();
        System.out.println("Capacity: " + a.capacity());
        a.append(3);
        a.append(true);
        char[] arr = {'a','b','c'};
        a.append(arr);
        StringBuffer b = new StringBuffer("STRINGBUFFER B");
        a.append(b);
        System.out.println(a.compareTo(b));
        System.out.println(a);
        System.out.println(a.insert(2,"INSERTION"));//insert starting at index 2
        System.out.println(a.capacity());*/

        /*long startTime = System.currentTimeMillis();
        String x = "a";
        for (int i = 0; i < 1000000; i++) {
            x += "a";
        }
        long endTime = System.currentTimeMillis();
        long total = endTime - startTime;
        System.out.println("DONE in: " +  total);
        +1min
        */

        /*long startTime = System.currentTimeMillis();
        StringBuffer x = new StringBuffer("a");
        for (int i = 0; i < 1000000; i++) {
            x.append("a");
        }
        long endTime = System.currentTimeMillis();
        long total = endTime - startTime;
        System.out.println("DONE in: " +  total);
        0.017 seconds - 17 milliseconds
        5000 thousand times faster */

    }
}
