public class NumberOfSubstringsWithOnly1 {
    public int countSubstrings(String s) {
        int count = 0;
        int currentLength = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                currentLength++;
                count += currentLength;
            } else {
                currentLength = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfSubstringsWithOnly1 solution = new NumberOfSubstringsWithOnly1();
        String s = "00110011";
        int result = solution.countSubstrings(s);
        System.out.println(result);
    }
}
