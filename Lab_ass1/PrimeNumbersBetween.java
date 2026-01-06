import java.util.Scanner;

public class PrimeNumbersBetween {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.println("Enter first number:");
        int first = input.nextInt();

        System.out.println("Enter second number:");
        int second = input.nextInt();

        // Make sure first is smaller than second
        int start, end;
        if (first < second) {
            start = first;
            end = second;
        } else {
            start = second;
            end = first;
        }

        int count = 0; // to count how many prime numbers we find

        // Loop through all numbers between start and end
        for (int i = start + 1; i < end; i++) {
            if (isPrime(i)) {
                count = count + 1;
            }
        }

        System.out.println("There are " + count + " prime numbers between " + first + " and " + second + ".");

        input.close();
    }

    // This method checks if a number is prime or not
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // numbers 0 and 1 are not prime
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) { // if divisible by i, not prime
                return false;
            }
        }

        return true; // number is prime
    }
}
