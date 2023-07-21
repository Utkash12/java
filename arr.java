import java.util.HashMap;

public class arr {
    public static void main(String[] args) {
        String inputString = "aabbccdeeff";

        // Find and print non-repeating characters
        String nonRepeatingChars = findNonRepeatingCharacters(inputString);
        System.out.println("Non-repeating characters: " + nonRepeatingChars);
    }

    public static String findNonRepeatingCharacters(String str) {
        HashMap<Character, Integer> charFrequencyMap = new HashMap<>();

        // Count the frequency of each character in the string
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        StringBuilder nonRepeatingChars = new StringBuilder();

        // Find non-repeating characters and add them to the result
        for (char ch : str.toCharArray()) {
            if (charFrequencyMap.get(ch) == 1) {
                nonRepeatingChars.append(ch);
            }
        }

        return nonRepeatingChars.toString();
    }
}
