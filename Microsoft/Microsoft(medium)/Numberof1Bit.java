public class Numberof1Bit {
    public int hammingWeight(int n) {
        int count = 0;
        for(int i=0; i < 32; i++) {
            if((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Numberof1Bit solution = new Numberof1Bit();
        int n = 11; // Example input
        int result = solution.hammingWeight(n);
        System.out.println("Number of 1 bits in " + n + " is: " + result); // Output: 3
    }
    
}