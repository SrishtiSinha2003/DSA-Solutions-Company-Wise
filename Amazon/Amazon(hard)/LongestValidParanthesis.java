public class LongestValidParanthesis {
    public static int longestValidParentheses(String s) {
        int maxLength = 0;
        int[] dp = new int[s.length()];

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + (i - dp[i - 1] >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
                maxLength = Math.max(maxLength, dp[i]);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "(()())"; // Example input
        System.out.println("Longest valid parentheses length: " + longestValidParentheses(s));
    }
}
