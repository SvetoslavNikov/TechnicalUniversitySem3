package learning.algorithms.dataStructures.SAAlgorithm.saa2;
//pyramid three structure to one dimensional array, sorting it
// rules for a three structure to be a pyramid three structure
// both branches should have no more than one level difference in height/dept
// the bottom branches should not be bigger than the one above
// when we add new elements we start left to right

//the sorting of this structure has level of complexity big O n*logn or n/2*logn i am not sure

//Comparecment
public class noComparecmentSorting {
    public static void main(String[] args) {
        //how to sort an array without > < <= >=
        int[] a = {2,3,3,4,2,5,6};
        int[] b = new int[7];
        for(int i = 0; i < a.length; i++){
            b[a[i]]++;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.printf("%d idx = %d\n", i, b[i]);
        }
    }

}
