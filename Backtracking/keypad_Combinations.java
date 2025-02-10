import java.util.*;

public class KeypadCombinations {

    // Mapping digits to corresponding letters on a telephone keypad
    private static final String[] MAPPING = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    // Method to generate combinations
    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        
        if (digits == null || digits.isEmpty()) {
            return result;  // return empty list if input is empty
        }
        
        // Start the recursive backtracking function
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }

    // Helper method to perform backtracking
    private static void backtrack(String digits, int index, StringBuilder current, List<String> result) {
        // If the current string reaches the length of digits, add it to the result
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        // Get the letters that the current digit can represent
        String letters = MAPPING[digits.charAt(index) - '0'];
        
        // Try each letter for the current digit
        for (char letter : letters.toCharArray()) {
            current.append(letter);  // add the letter to the current combination
            backtrack(digits, index + 1, current, result);  // move to the next digit
            current.deleteCharAt(current.length() - 1);  // remove the last added letter for backtracking
        }
    }

    public static void main(String[] args) {
        // Example input
        String digits1 = "23";
        String digits2 = "2";
        String digits3 = "";
        
        // Print results
        System.out.println("Combinations for " + digits1 + ": " + letterCombinations(digits1));
        System.out.println("Combinations for " + digits2 + ": " + letterCombinations(digits2));
        System.out.println("Combinations for empty string: " + letterCombinations(digits3));
    }
}
