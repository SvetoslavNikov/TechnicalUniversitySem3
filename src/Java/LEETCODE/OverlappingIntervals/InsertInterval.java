package Java.LEETCODE.OverlappingIntervals;
import java.util.*;
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] arr) {
        List<int[]> ls = new ArrayList<>();
        boolean inserted = false;

        for (int[] interval : intervals) {
            if (interval[1] < arr[0]) {
                ls.add(interval);
            } else if (interval[0] > arr[1]) {
                if (!inserted) {
                    ls.add(arr);
                    inserted = true;
                }
                ls.add(interval);
            } else {
                // Merge overlapping
                arr[0] = Math.min(arr[0], interval[0]);
                arr[1] = Math.max(arr[1], interval[1]);
            }
        }

        if (!inserted) {
            ls.add(arr);
        }

        return ls.toArray(new int[ls.size()][]);
    }


}

























