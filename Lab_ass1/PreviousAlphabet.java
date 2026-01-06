import java.util.Scanner;

public class PreviousAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a word in small letters
        System.out.println("Enter a word (in small letters):");
        String word = input.nextLine();

        String result = ""; // to store the new word

        // Go through each letter in the word
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Only handle lowercase letters a–z
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a') {
                    // If letter is 'a', previous letter should be 'z'
                    result = result + 'z';
                } else {
                    // Otherwise, go to previous letter in alphabet
                    result = result + (char)(ch - 1);
                }
            } else {
                // If it's not a small letter, just keep it same
                result = result + ch;
            }
        }

        // Print the result
        System.out.println(result);

        input.close();
    }
}

