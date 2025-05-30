public class RaceCar {
    public static int racecar(int target) {
        int[] dp = new int[target + 1];

        for (int i = 1; i <= target; i++) {
            dp[i] = Integer.MAX_VALUE;
            int k = 1;
            while ((1 << k) - 1 < i) {
                k++;
            }

            // Case 1: exact match with (2^k - 1)
            if ((1 << k) - 1 == i) {
                dp[i] = k;
                continue;
            }

            // Case 2: overshoot, then reverse
            for (int j = 0; j < k - 1; j++) {
                int pos1 = (1 << (k - 1)) - 1; // forward
                int pos2 = (1 << j) - 1;       // back after reverse
                dp[i] = Math.min(dp[i], (k - 1) + 1 + j + 1 + dp[i - pos1 + pos2]);
            }

            // Case 3: exact overshoot and reverse
            dp[i] = Math.min(dp[i], k + 1 + dp[(1 << k) - 1 - i]);
        }

        return dp[target];
    }
    public static void main(String[] args) {
        int target = 3; // Example target
        System.out.println("Minimum number of instructions to reach target " + target + ": " + racecar(target));
    }
}