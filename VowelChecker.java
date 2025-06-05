import java.util.*;

public class VowelChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        try {
            checkForVowels(input);
            System.out.println("The string contains at least one vowel.");
        } catch (NoVowelException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkForVowels(String str) throws NoVowelException {
        for (char ch : str.toCharArray()) {
            if (isVowel(ch)) {
                return;
            }
        }
        throw new NoVowelException("No vowels found in the string.");
    }

    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}

class NoVowelException extends Exception {
    public NoVowelException(String message) {
        super(message);
    }
}
