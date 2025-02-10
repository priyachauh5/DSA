import java.util.*;

public class DigitToLetterMapping {
    
    // Create a mapping from digit to letters based on the phone keypad
    static Map<Character, String> digitToLetters = new HashMap<>();
    
    static {
        digitToLetters.put('2', "ABC");
        digitToLetters.put('3', "DEF");
        digitToLetters.put('4', "GHI");
        digitToLetters.put('5', "JKL");
        digitToLetters.put('6', "MNO");
        digitToLetters.put('7', "PQRS");
        digitToLetters.put('8', "TUV");
        digitToLetters.put('9', "WXYZ");
    }

    
    
    public static void main(String[] args) {
        char digit = '2'; // For example, digit '2' maps to "ABC"
        String mappedLetters = digitToLetters.get(digit); // Get the corresponding letters
        
        if (mappedLetters != null) {
            System.out.println("The letters for digit " + digit + " are: " + mappedLetters);
        } else {
            System.out.println("Invalid digit.");
        }
    }
}
