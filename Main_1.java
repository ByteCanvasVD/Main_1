import java.util.Arrays;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = generateRandomArray(5000);
        System.out.println("Generated Random Array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.print("Enter the key element to search: ");
        int key = scanner.nextInt();

        int index = binarySearch(array, key);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        System.out.println(index != -1 ? "Element found at index: " + index : "Element not found in the array.");
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    private static int binarySearch(int[] array, int key) {
        int low = 0, high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (array[mid] == key) return mid;
            else if (array[mid] < key) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }