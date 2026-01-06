import java.util.Scanner;
public class OddPositiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int min = 0;
        int max = 0;

        System.out.println("Enter 10 numbers:");

        for (int i = 1; i <= 10; i++) {
            int num = input.nextInt();

            // Check if number is positive and odd
            if (num > 0 && num % 2 != 0) {
                sum = sum + num;
                count = count + 1;

                if (count == 1) {
                    // first valid number → set min and max
                    min = num;
                    max = num;
                } else {
                    if (num < min) {
                        min = num;
                    }
                    if (num > max) {
                        max = num;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("No odd positive numbers found");
        } else {
            double average = (double) sum / count;

            System.out.println("Sum = " + sum);
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            System.out.println("Average = " + average);
        }

        input.close();
    }
}

