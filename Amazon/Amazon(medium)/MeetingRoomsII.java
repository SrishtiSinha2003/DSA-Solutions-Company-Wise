import java.util.*;
public class MeetingRoomsII {
    public static int minRooms(int arr[][]){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int ans = 0;
        int cnt = 0;
        for(int[] i : arr) {
            map.put(i[0], map.getOrDefault(i[0], 0) + 1);
            map.put(i[1], map.getOrDefault(i[1], 0) - 1);
        }
        for(int i : map.values()){
            cnt += i;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[][] = {{0, 30}, {5, 10}, {15, 20}};
        System.out.println(minRooms(arr));
    }
}
