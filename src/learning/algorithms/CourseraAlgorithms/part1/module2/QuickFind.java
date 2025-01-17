package learning.algorithms.CourseraAlgorithms.part1.module2;
class QuickFind{

    int arr[];
    public QuickFind(int n) {
        this.arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }


    public void union(int a, int b) {
        //a = 1 b = 4
        // 1 2 3 4 5 6
        // 1 1 3 3 5 5
        int aId = arr[a];
        //1

        int bId = arr[b];
        //3

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == bId){
                arr[i] = aId;
            }
        }
        //max 2N operations
        //1 2 3 4 5 6
        //6 6 6 6 5 6

        //1 2 3 4 5 6
        //5 5 5 5 5 5
    }


    public boolean connected(int a, int b) {
        return arr[a] == arr[b];
    }


    public void printAllUnions() {
        System.out.print("index: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.print("union: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
