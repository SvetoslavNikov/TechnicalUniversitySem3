package learning.algorithms.CourseraAlgorithms.module2;

class QuickUnionV1 {
    //The Problem with this implementation is that
    //the tree structure can become too tall
    //resulting in N complexity in the root method
    int arr[];
    public QuickUnionV1(int n) {
        this.arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 9 4 9 6 6 7 8 9
    private int root(int n){
        while(arr[n] != n) n = arr[n];
        return n;
    }


    public void union(int a, int b) {
        arr[root(a)] = root(b);
    }


    public boolean connected(int a, int b) {
        return root(a) == root(b);
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
