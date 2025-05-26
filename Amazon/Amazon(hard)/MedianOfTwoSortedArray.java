public class MedianOfTwoSortedArray {
    public static double medianSortedArray(int nums1[], int nums2[]) {
        int n = nums1.length;
        int m = nums2.length;
        
        if (n > m) {
            return medianSortedArray(nums2, nums1); // Ensure nums1 is the smaller array
        }
        
        int low = 0, high = n;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (n + m + 1) / 2 - partitionX;

            int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minX = (partitionX == n) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minY = (partitionY == m) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxX <= minY && maxY <= minX) {
                if ((n + m) % 2 == 0) {
                    return (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2.0;
                } else {
                    return Math.max(maxX, maxY);
                }
            } else if (maxX > minY) {
                high = partitionX - 1; // Move towards left in nums1
            } else {
                low = partitionX + 1; // Move towards right in nums1
            }
        }
        
        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(medianSortedArray(nums1, nums2)); // Output: 2.0

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println(medianSortedArray(nums3, nums4)); // Output: 2.5
    }
}
