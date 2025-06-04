public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) return false;

        // Convert the number to a string
        String s = String.valueOf(x);
        int left = 0;
        int right = s.length() - 1;

        // Check if the string is equal to its reverse
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(121)); // true
        System.out.println(pn.isPalindrome(-121)); // false
        System.out.println(pn.isPalindrome(10)); // false
    }
}
