import java.util.*;

public class KclosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            if (minHeap.size() < k) {
                minHeap.add(arr[i]);
            } else {
                if (Math.abs(arr[i] - x) < Math.abs(minHeap.peek() - x)) {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }
            }
        }
        List<Integer> result = new ArrayList<>(minHeap);
        Collections.sort(result); 
        return result;  
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(findClosestElements(arr, 4, 3));
    }
}