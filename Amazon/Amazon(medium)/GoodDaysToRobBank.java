public class GoodDaysToRobBank{
    public static void robBank(int []security, int time) {
        int size = security.length;
        if(time == 0) {
            // Every day is a good day if time is 0
            for(int i = 0; i < size; i++) {
                System.out.println(i);
            }
            return;
        }
        int cntPre = 0, cntSuf = 0;

        for (int i = time; i < size - time; i++) {
            // Check for non-increasing pattern before current day
            cntPre = 0;
            for (int j = i - 1; j >= i - time; j--) {
                if (security[j] >= security[j + 1]) {
                    cntPre++;
                } else {
                    break;
                }
            }
            
            // Check for non-decreasing pattern after current day
            cntSuf = 0;
            for (int j = i + 1; j <= i + time; j++) {
                if (security[j] >= security[j - 1]) {
                    cntSuf++;
                } else {
                    break;
                }
            }

            // If both conditions are satisfied, print the day
            if (cntPre == time && cntSuf == time) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] security = {5, 3, 3, 3, 5, 6, 3};
        robBank(security, 2);
    }
}
