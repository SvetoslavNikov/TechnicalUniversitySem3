package Java.LEETCODE;

public class RandomStuff {
    public static void main(String[] args){
        int start = 0;
        int end = 30;
        fizzBuzz(start, end);
    }

    private static void fizzBuzz(int start, int end){
        for(int i = start; i < end; i++){
            if(i%15==0){
                System.out.println("FizzBuzz");
            } else if(i%5==0){
                System.out.println("Fizz");
            } else if(i%3==0){
                System.out.println("Buzz");
            }
        }
    }

    private static void mergeOverlappingIntervals(int[][] arr){
        //arr[] = [[7, 8], [1, 5], [2, 4], [4, 6]]
        //return [[1, 6], [7, 8]]

        //Input: arr[] = [[1, 3], [2, 4], [3, 8], [9, 10]]
        //Output: [[1, 4], [6, 8], [9, 10]]

        // we have a set
        // array goes in the nums of it are stored in the set


    }
}
