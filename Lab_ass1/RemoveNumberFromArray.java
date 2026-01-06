import java.util.Scanner;

public class RemoveNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input array size
        System.out.print("N = ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        // Step 2: Input array elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Input the element to remove
        System.out.print("Remove Element = ");
        int remove = sc.nextInt();

        // Step 4: Print original array
        System.out.println("Input array:");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 5: Count how many times the element occurs
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == remove) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found");
        } else {
            // Step 6: Create new array without the element
            int[] newArr = new int[N - count];
            int index = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] != remove) {
                    newArr[index++] = arr[i];
                }
            }

            // Step 7: Print new array
            System.out.println("New array:");
            for (int i = 0; i < newArr.length; i++) {
                System.out.print(newArr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

