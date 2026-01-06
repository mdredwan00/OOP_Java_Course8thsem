import java.util.Scanner;

public class IdentityMatrixSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input matrix size
        System.out.print("Enter the size of the matrix (N): ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        // Step 2: Input matrix elements
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Step 3: Check if it's an identity matrix
        boolean isIdentity = true; // flag

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j && matrix[i][j] != 1) {
                    isIdentity = false;
                    break; // stop inner loop
                }
                if (i != j && matrix[i][j] != 0) {
                    isIdentity = false;
                    break; // stop inner loop
                }
            }
            if (!isIdentity) {
                break; // stop outer loop
            }
        }

        // Step 4: Print result
        if (isIdentity) {
            System.out.println("Identity Matrix");
        } else {
            System.out.println("Not an Identity Matrix");
        }

        sc.close();
    }
}

