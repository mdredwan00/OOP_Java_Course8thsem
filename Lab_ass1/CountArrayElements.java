import java.util.Scanner;

public class CountArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size input
        System.out.print("N = ");
        int n = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array elements input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count occurrences using nested loops
        boolean[] visited = new boolean[n]; // To mark counted elements

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue; // Skip if already counted
            }

            int count = 1; // At least one occurrence
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; // Mark as counted
                }
            }

            System.out.println(arr[i] + " - " + count + " times");
        }

        sc.close();
    }
}

