import java.util.*;
public class KthLargestElement {
    static int findKthLargestElement(int nums[], int k){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int x : nums){
            heap.add(x);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 12, 2, 11, 5};
        System.out.println(findKthLargestElement(arr, 3));
    }
}
