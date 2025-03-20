import java.util.*;
public class RottenOranges {
    public static int orangeRotting(int [][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int rows = grid.length, cols = grid[0].length;
        Queue<int []> queue = new LinkedList<>();
        int freshOranges = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 2){
                    queue.add(new int[]{i, j});
                } else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }
        if(freshOranges == 0) return 0;
        int countMin = 0, cnt = 0;
        int [][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                int [] point = queue.poll();
                for(int [] dir : dirs){
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    if(x >= 0 && x < rows && y >= 0 && y < cols && grid[x][y] == 1){
                        grid[x][y] = 2;
                        queue.add(new int[]{x, y});
                        cnt++;
                    }
                }
            }
            if(queue.size() > 0) countMin++;
        }
        return freshOranges == cnt ? countMin : -1;
    }
    public static void main(String[] args) {
        int [][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangeRotting(grid));
    }
}
