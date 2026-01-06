import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array length
        System.out.print("N = ");
        int N = sc.nextInt();

        double[] arr = new double[N];

        // Step 2: Input array elements
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        // Step 3: Handle empty array
        if (N == 0) {
            System.out.println("New Array:");
            System.out.println("Removed elements: 0");
            sc.close();
            return;
        }

        // Step 4: Print new array without consecutive duplicates
        System.out.print("New Array: " + arr[0]); // Always print first element
        int removed = 0; // Count of removed elements

        for (int i = 1; i < N; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(" " + arr[i]); // Print only if not same as previous
            } else {
                removed++; // Count duplicates removed
            }
        }

        // Step 5: Print removed elements count
        System.out.println();
        System.out.println("Removed elements: " + removed);

        sc.close();
    }
}

