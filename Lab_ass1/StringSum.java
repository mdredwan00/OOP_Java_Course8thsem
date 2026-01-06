import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.println("Enter first word:");
        String first = input.nextLine();

        System.out.println("Enter second word:");
        String second = input.nextLine();

       
        String combined = first + " " + second;

        
        int sum = 0;
        for (int i = 0; i < combined.length(); i++) {
            char ch = combined.charAt(i);
            sum = sum + (int) ch; 
        }
        System.out.println(combined);
        System.out.println(sum);

        input.close();
    }
}

