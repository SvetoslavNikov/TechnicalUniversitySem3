package learning.algorithms.CourseraAlgorithms.part1.module2;

class test {
    public static void main(String[] args) {
        QuickUnionV2Weighting union_find = new QuickUnionV2Weighting(6);
        union_find.union(1,2);
        union_find.printAllUnions();

        union_find.union(3,4);
        union_find.printAllUnions();

        union_find.union(2,3);
        union_find.printAllUnions();

        union_find.connected(1,4);
    }
}
