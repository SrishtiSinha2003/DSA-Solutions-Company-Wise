class Solution {
    public int numSub(String s) {
        long count = 0;
        long currentLength = 0;
        int MOD = 1_000_000_007;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                currentLength++;
                count = (count + currentLength) % MOD;
            } else {
                currentLength = 0;
            }
        }

        return (int) count;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "0110111";
        System.out.println(solution.numSub(s)); // Output: 9
    }
}
