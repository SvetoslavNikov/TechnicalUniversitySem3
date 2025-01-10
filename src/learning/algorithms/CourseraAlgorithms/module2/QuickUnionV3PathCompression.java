package learning.algorithms.CourseraAlgorithms.module2;

class QuickUnionV3PathCompression {
    int arr[];
    int sz[];

    public QuickUnionV3PathCompression(int n) {
        this.arr = new int[n];
        this.sz = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            sz[i] = 1;
        }


    }

    // 0 1 2 3 4 5 6 7 8 9
    // 0 1 9 4 9 6 6 7 8 9
    private int root(int n) {
        while (arr[n] != n) {
            arr[n] = arr[arr[n]];
            //tree can't get deeper than 2
            n = arr[n];
        }
        return n;
    }


    public void union(int a, int b) {
        int aroot = root(a);
        int broot = root(b);
        if (aroot == broot) return;
        if (sz[aroot] < sz[broot]) {
            arr[aroot] = broot;
            sz[broot] += sz[aroot];
        } else {
            arr[broot] = aroot;
            sz[aroot] += sz[broot];
        }
    }


    public boolean connected(int a, int b) {
        return root(a) == root(b);
    }


    public void printAllUnions() {
        System.out.print("index: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("union: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("tsize: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(sz[i] + " ");
        }
        System.out.println();
        System.out.println();
    }
}
