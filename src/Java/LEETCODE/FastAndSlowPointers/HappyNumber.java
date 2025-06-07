package Java.LEETCODE.FastAndSlowPointers;
import java.util.*;
public class HappyNumber {
    public static void main(String[] args){
        System.out.println(1234%10 + " " + -10/10);
    }

    public static boolean HappyN(int n){
        Set<Integer> set = new HashSet<>();
        while(true){
            if(set.contains(n)){
                return false;
            }

            set.add(n);

        }
    }

    public int SumofSqueresOfDigits(int n){
        int result = 0;
        while(true){
            int i = n%10;
            if(i==0){
                return result;
            }

            result = result + i*i;
            n = n/10;
        }
    }
}
