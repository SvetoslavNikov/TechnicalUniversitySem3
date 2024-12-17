package learning.javaBasics.exercisingBasics.exerseBasics2;

import java.util.Arrays;
import java.util.Scanner;

// 1
class ex1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Array elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// 2
class ex2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }

    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
}

// 3
class ex3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int maxNumber = findMaxNumber(numbers);
        System.out.println("Maximum number: " + maxNumber);
    }

    private static int findMaxNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

// 4
class ex4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}


// 5
class ex5 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};
        sortByLength(strings);
        System.out.println("Sorted strings by length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }

    private static void sortByLength(String[] arr) {
        Arrays.sort(arr);
    }
}

// 6
class ex6 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int target = 8;
        int index = findElement(numbers, target);
        System.out.println("Element found at index: " + index);
    }

    private static int findElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

// 7
class ex7 {
    public static void main(String[] args) {
        int[] numbers = {5, -2, 8, -1, 9, 3, -4, 2};
        countPositiveNegative(numbers);
    }

    private static void countPositiveNegative(int[] arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
    }
}

// 8
class ex8 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        findCommonElements(array1, array2);
    }

    private static void findCommonElements(int[] arr1, int[] arr2) {
        System.out.print("Common elements: ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}

// 9
class ex9 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        reverseArray(numbers);
        System.out.println("Reversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}

// 10
class ex10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 4, 2, 5};
        int targetNumber = 2;
        int[] newArray = removeElement(numbers, targetNumber);
        System.out.println("Array without target element:");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] removeElement(int[] arr, int target) {
        int newSize = 0;
        for (int num : arr) {
            if (num != target) {
                newSize++;
            }
        }
        int[] newArray = new int[newSize];
        int index = 0;
        for (int num : arr) {
            if (num != target) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }
}

// 11
class ex11 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        sortArray(numbers);
        System.out.println("Sorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// 12
class ex12 {
    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "apple"};
        boolean hasRepeats = checkForRepeats(strings);
        System.out.println("Array has repeating elements: " + hasRepeats);
    }

    private static boolean checkForRepeats(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }
}

// 13
class ex13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1};
        boolean isPalindrome = checkPalindrome(numbers);
        System.out.println("Array is a palindrome: " + isPalindrome);
    }

    private static boolean checkPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

// 14
class ex14 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int rotations = 2;
        rotateArray(numbers, rotations);
        System.out.println("Rotated array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

// 15
class ex15 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};
        int secondLargest = findSecondLargest(numbers);
        System.out.println("Second largest number: " + secondLargest);
    }

    private static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
}

// 16
class ex16 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        int[] union = findUnion(array1, array2);
        int[] intersection = findIntersection(array1, array2);
        System.out.println("Union: ");
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println("\nIntersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int[] findUnion(int[] arr1, int[] arr2) {
        int[] union = new int[arr1.length + arr2.length];
        int index = 0;
        for (int num : arr1) {
            union[index++] = num;
        }
        for (int num : arr2) {
            if (!contains(union, num, index)) {
                union[index++] = num;
            }
        }
        return Arrays.copyOf(union, index);
    }

    private static int[] findIntersection(int[] arr1, int[] arr2) {
        int[] intersection = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;
        for (int num : arr1) {
            if (contains(arr2, num, arr2.length)) {
                intersection[index++] = num;
            }
        }
        return Arrays.copyOf(intersection, index);
    }

    private static boolean contains(int[] arr, int target, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}