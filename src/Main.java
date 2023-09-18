import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int arrayLength = scan.nextInt();
        int[] list = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter the " + (i + 1) + ". element: ");
            list[i] = scan.nextInt();
        }

        // Sort the array
        Arrays.sort(list);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(list));
    }
}
