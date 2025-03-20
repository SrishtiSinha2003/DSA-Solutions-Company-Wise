import java.util.*;
public class CourseSchedule {
    public static boolean canFinish(int n, int[][] prerequisties) {
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[n];
        int[] indegree = new int[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            adj[i] = new ArrayList<>();
        }
        for(int[] pre : prerequisties){
            adj[pre[1]].add(pre[0]);
            indegree[pre[0]]++;
        }
        for(int i = 0; i < n; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }
        int count = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            count++;
            for(int next : adj[curr]){
                indegree[next]--;
                if(indegree[next] == 0){
                    q.add(next);
                }
            }
        }
        return count == n;
    }
    public static void main(String[] args) {
        int n = 4;
        int [][] arr = new int[4][2];
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 2;
        arr[1][1] = 0;
        arr[2][0] = 3;
        arr[2][1] = 1;
        arr[3][0] = 3;
        arr[3][1] = 2;
        System.out.println(canFinish(n, arr));
    }
}
