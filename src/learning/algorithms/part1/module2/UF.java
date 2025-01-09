package learning.algorithms.part1.module2;

import java.util.LinkedList;

class UF {
    private int[] elements;
    private LinkedList<LinkedList<Integer>> unions;

    public UF(int n) {
        this.elements = new int[n];
        this.unions = new LinkedList<>();
    }

    public void union(int a, int b) {
        if (!connected(a, b)) {
            int unionWithA = findUnionWithN(a);
            int unionWithB = findUnionWithN(b);

            if (unionWithA >= 0 && unionWithB >= 0) {
                // Merge the two unions
                unions.get(unionWithA).addAll(unions.get(unionWithB));
                unions.remove(unionWithB);
            } else if (unionWithA >= 0) {
                // Add `b` to the union containing `a`
                unions.get(unionWithA).add(b);
            } else if (unionWithB >= 0) {
                // Add `a` to the union containing `b`
                unions.get(unionWithB).add(a);
            } else {
                // Create a new union
                LinkedList<Integer> newUnion = new LinkedList<>();
                newUnion.add(a);
                newUnion.add(b);
                unions.add(newUnion);
            }
        }
    }

    public void printAllUnions() {
        int unionNumber = 0;
        for (LinkedList<Integer> union : unions) {
            System.out.println("Union Number " + unionNumber++ + ": " + union);
        }
    }

    public boolean connected(int a, int b) {
        for (LinkedList<Integer> union : unions) {
            if (union.contains(a) && union.contains(b)) {
                System.out.println(a + " and " + b + " are connected.");
                return true;
            }
        }
        System.out.println(a + " and " + b + " are NOT connected.");
        return false;
    }

    public int findUnionWithN(int n) {
        for (int i = 0; i < unions.size(); i++) {
            LinkedList<Integer> union = unions.get(i);
            if (union.contains(n)) {
                System.out.println(n + " is in union number " + i);
                return i;
            }
        }
        return -1;
    }
}
