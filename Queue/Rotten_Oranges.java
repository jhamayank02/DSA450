import java.util.Queue;
import java.util.LinkedList;

class Info{
    int row, col, time;
    
    Info(int r, int c, int t){
        row = r;
        col = c;
        time = t;
    }
}

class Rotten_Oranges{
    boolean isValid(int x, int y, int n, int m, int grid[][], int visited[][]){
        if(x>=0 && x<n && y>=0 && y<m && grid[x][y] == 1 && visited[x][y] != 2){
            return true;
        }
        return false;
    }
     
    public int orangesRotting(int[][] grid)
    {
        // Using Queue
        // Time complexity O(n*m) || Space complexity O(n*m)
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Info> q = new LinkedList<>();
        int visited[][] = new int[n][m];
        int fresh_cnt = 0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    q.add(new Info(i, j, 0));
                    visited[i][j] = 2;
                }
                else if(grid[i][j] == 1){
                    fresh_cnt++;
                }
                visited[i][j] = 0;
            }
        }
        
        int dx[] = {0,1,0,-1};
        int dy[] = {-1,0,1,0};
        
        int max_time = 0;
        int rotten_cnt = 0;
        
        while(!q.isEmpty()){
            Info temp = q.poll();
            int x = temp.row;
            int y = temp.col;
            int t = temp.time;
            
            max_time = Math.max(t, max_time);
            
            for(int i=0; i<4; i++){
                int next_row = x + dx[i];
                int next_col = y + dy[i];
                
                if(isValid(next_row, next_col, n, m, grid, visited)){
                    q.add(new Info(next_row, next_col, t+1));
                    visited[next_row][next_col] = 2;
                    rotten_cnt++;
                }
            }
        }
        
        if(fresh_cnt != rotten_cnt){
            return -1;
        }
        
        return max_time;
    }

    public static void main(String[] args) {
        
    }
}
