package learning.algorithms.CourseraAlgorithms.module2;

class MyQuickFind {
    int arr[];

    public MyQuickFind(int n) {
        this.arr = new int[n];
    }
    //1 2 3 4 5 6
    //0 0 0 0 0 0

    //union 5,6
    //1 2 3 4 5 6
    //0 0 0 0 5 5
    public void union(int a, int b) {
        if (arr[a] == 0 && arr[b] == 0) {
            arr[a] = a;
            arr[b] = a;
        } else if (arr[a] != 0 && arr[b] == 0) {
            arr[b] = arr[a];
        } else if (arr[a] == 0 && arr[b] != 0) {
            arr[a] = arr[b];
        } else if (arr[a] != 0 && arr[b] != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == b) {
                    arr[i] = arr[a];
                }
            }
        }
    }

    public boolean connected(int a, int b){
        if(arr[a] == b || arr[b]==a){
            return true;
        } else{
            return false;
        }
    }

    public void printAllUnions(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
