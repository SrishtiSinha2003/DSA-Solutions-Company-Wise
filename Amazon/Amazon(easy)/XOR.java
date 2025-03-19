public class XOR {
    public static void main(String[] args) {
        int nums[] = new int[3];
        nums[0] = 3;
        nums[1] = 0;
        nums[2] = 1;
        
        System.out.println(missingElement(nums));
    }
    public static int missingElement(int[] nums) {
        int xor = nums.length;
        for(int i=0; i<nums.length; i++){
            xor = xor ^ i;
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
