public class SignOfProductOfArray {
    public int arraySign(int[] nums) {
        int negativeCount = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0; // If any number is zero, product is zero
            } else if (num < 0) {
                negativeCount++; // Count negative numbers
            }
        }
        return (negativeCount % 2 == 0) ? 1 : -1; // Even count of negatives means positive product, odd means negative
    }
    public static void main(String[] args) {
        SignOfProductOfArray solution = new SignOfProductOfArray();
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        System.out.println(solution.arraySign(nums)); // Output: 1
    }
}
