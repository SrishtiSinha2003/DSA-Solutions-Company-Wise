import java.util.HashMap;

public class LongestSubstring {
   public int lengthOfLongestSubstring(String s) {
        // HashMap to store the last index of each character
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        
        // Variables to keep track of the window's start and the maximum length
        int maxLength = 0;
        int start = 0;  // Left pointer of the window
        
        // Iterate through the string with the right pointer (end)
        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            
            // If the character is already in the window (seen before)
            if (charIndexMap.containsKey(currentChar)) {
                // Move the start to the right of the last occurrence of the character
                start = Math.max(start, charIndexMap.get(currentChar) + 1);
            }
            
            // Update the character's latest index in the map
            charIndexMap.put(currentChar, end);
            
            // Update the maximum length of the substring found so far
            maxLength = Math.max(maxLength, end - start + 1);
        }
        
        // Return the length of the longest substring without repeating characters
        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        String input = "abcabcbb"; // Example input
        int result = solution.lengthOfLongestSubstring(input);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}
