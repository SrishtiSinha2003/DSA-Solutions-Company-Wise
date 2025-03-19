public class MergeSortedArray {
    public static void merge(int[] nums1, int[] nums2, int m, int n) {
            // Pointers for nums1, nums2, and the end of the merged array
            int i = m - 1; // Pointer for nums1's last element
            int j = n - 1; // Pointer for nums2's last element
            int k = m + n - 1; // Pointer for the last position in nums1
    
            // Merge in reverse order
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k] = nums1[i]; // Place larger value at the end
                    i--;
                } else {
                    nums1[k] = nums2[j]; // Place larger value at the end
                    j--;
                }
                k--; // Move to the next position
            }
    
            // If there are remaining elements in nums2, copy them over
            while (j >= 0) {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        } 
        public static void main(String[] args) {
            int m = 3, n = 3;
            int nums1[] = new int[6];
            int nums2[] = new int[3];
    
            nums1[0] = 1;
            nums1[1] = 2;
            nums1[2] = 3;
            nums1[3] = 0;
            nums1[4] = 0;
            nums1[5] = 0;
    
            nums2[0] = 2;
            nums2[1] = 5;
            nums2[2] = 6;
    
            merge(nums1, nums2, m, n);

            for(int i = 0; i< 6; i++) {
                System.out.println(nums1[i]+ " ");
            }
    }           
}