public class ReorganiseString {
    public String reorganizeString(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        int max = 0, letter = 0;
        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                max = counts[i];
                letter = i;
            }
        }
        if (max > (s.length() + 1) / 2) return "";

        char[] res = new char[s.length()];
        int idx = 0;
        while (counts[letter]-- > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
        }
        for (int i = 0; i < 26; i++) {
            while (counts[i]-- > 0) {
                if (idx >= s.length()) idx = 1;
                res[idx] = (char) (i + 'a');
                idx += 2;
            }
        }
        return new String(res);
    }
    public static void main(String[] args) {
        ReorganiseString rs = new ReorganiseString();
        String s = "aabbcc";
        System.out.println(rs.reorganizeString(s)); // Output: "abcabc" or similar valid arrangement
    }
}
