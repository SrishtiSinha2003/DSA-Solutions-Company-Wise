public class Palindrome {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int original = x;   
        if (x < 0) return false; // Negative numbers are not palindromes
        while (x > 0) {
            int digit = x % 10; // Get the last digit
            rev = rev * 10 + digit; // Build the reversed number
            x /= 10; // Remove the last digit from x
        }
        return rev == original; // Check if the reversed number is equal to the original
    }
    public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        int x = 121;
        System.out.println(solution.isPalindrome(x)); // Output: true
    }
}
