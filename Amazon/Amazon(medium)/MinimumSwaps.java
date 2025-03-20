public class MinimumSwaps {
    static int swap(String s){
        int cnt0 = 0, cnt1 = 0, miss0 = 0, miss1 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') {
                cnt0++;
            } else {
                cnt1++;
            }
        }
        if(Math.abs(miss1 - miss0) > 1) 
        return -1;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0'){
                miss0++; 
            } else {
                miss1++;
            }
        }
        if(cnt0 == cnt1) return Math.min(miss0, miss1);
        if(cnt0 > cnt1) return miss0;
        return miss1;
    }
    public static void main(String[] args) {
        String s = "0001100";
        System.out.println(swap(s));
    }
}
