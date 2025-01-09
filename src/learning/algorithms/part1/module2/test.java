package learning.algorithms.part1.module2;

import java.util.LinkedList;

class test {
    public static void main(String[] args) {
        UF union_find = new UF(6);
        union_find.union(1,2);
        union_find.printAllUnions();

        union_find.union(3,4);
        union_find.printAllUnions();

        union_find.union(2,3);
        union_find.printAllUnions();

        union_find.connected(1,4);
    }
}
