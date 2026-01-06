import java.util.Scanner;
import java.util.Arrays;

public class MedianFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many numbers
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Step 2: Input numbers
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Sort the array
        Arrays.sort(arr);

        // Step 4: Find median
        int median;
        if (N % 2 == 1) {
            // Odd number of elements → middle element
            median = arr[N / 2];
        } else {
            // Even number of elements → average of two middle elements
            median = (arr[(N / 2) - 1] + arr[N / 2]) / 2;
        }

        // Step 5: Print median
        System.out.println("The median is " + median);

        sc.close();
    }
}

