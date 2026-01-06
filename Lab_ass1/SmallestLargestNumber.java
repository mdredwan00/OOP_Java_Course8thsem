import java.util.Scanner;

public class SmallestLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Step 1: Read 5 numbers
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Assume the first element is both smallest and largest
        int smallest = arr[0];
        int largest = arr[0];
        int smallPos = 0;
        int largePos = 0;

        // Step 3: Check each number
        for (int i = 1; i < 5; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largePos = i;
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallPos = i;
            }
        }

        // Step 4: Print results
        System.out.println("The largest number " + largest + " was found at location " + largePos + ".");
        System.out.println("The smallest number " + smallest + " was found at location " + smallPos + ".");

        sc.close();
    }
}

