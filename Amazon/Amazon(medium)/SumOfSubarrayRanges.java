public class SumOfSubarrayRanges {
    public static long Sum(int[] num) {
        int n = num.length;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            int minV = num[i];
            int maxV = num[i];
        for(int j = i; j < n; j++) {
            minV = Math.min(minV, num[j]);
            maxV = Math.max(maxV, num[j]);
            sum += maxV - minV;
        }
    }
    return sum;
}
    public static void main(String[] args) {
        int [] num = {1, 2, 3};
        System.out.println(Sum(num));
    }
}
