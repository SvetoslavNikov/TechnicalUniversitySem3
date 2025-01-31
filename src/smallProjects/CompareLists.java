package smallProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first list of values
        System.out.println("Enter values for the first list (type 'done' to finish):");
        List<String> list1 = readList(scanner);

        // Read second list of values
        System.out.println("Enter values for the second list (type 'done' to finish):");
        List<String> list2 = readList(scanner);

        // Compare the lists
        compareLists(list1, list2);

        scanner.close();
    }

    private static List<String> readList(Scanner scanner) {
        List<String> list = new ArrayList<>();
        String input;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("done")) {
            list.add(input);
        }
        return list;
    }

    private static void compareLists(List<String> list1, List<String> list2) {
        int size = Math.max(list1.size(), list2.size());
        boolean areEqual = true;

        for (int i = 0; i < size; i++) {
            String value1 = (i < list1.size()) ? list1.get(i) : null;
            String value2 = (i < list2.size()) ? list2.get(i) : null;

            if (!((value1 == null && value2 == null) || (value1 != null && value1.equals(value2)))) {
                areEqual = false;
                System.out.println("Difference at line " + (i + 1) + ": ");
                System.out.println("List1: " + value1);
                System.out.println("List2: " + value2);
            }
        }

        if (areEqual) {
            System.out.println("Both lists are equal.");
        } else {
            System.out.println("The lists are not identical.");
        }
    }
}
