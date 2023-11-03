import java.util.LinkedList;
import java.util.Queue;

class Distance_of_nearest_cell_having_1{

    class Pair{
        int row, col;
        
        Pair(int r, int c){
            row = r;
            col = c;
        }
    }
    
    class Info{
        int row, col, steps;
        
        Info(int r, int c, int s){
            row = r;
            col = c;
            steps = s;
        }
    }
    
    boolean isValid(int x, int y, int n, int m, int grid[][], boolean visited[][]){
        if(x>=0 && x<n && y>=0 && y<m && grid[x][y]!=1 && visited[x][y]==false){
            return true;
        }
        return false;
    }
    
    //Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid)
    {
        // Bruteforce Approach
        // Time complexity O(n^2 * m^2) || Space complexity O(n*m)
        
        // int n = grid.length;
        // int m = grid[0].length;
        // int ans[][] = new int[n][m];
        // Queue<Pair> q = new LinkedList<>();
        
        // for(int r=0; r<n; r++){
        //     for(int c=0; c<m; c++){
        //         if(grid[r][c] == 1){
        //             q.add(new Pair(r,c));
        //         }
        //     }
        // }
        
        // for(int r=0; r<n; r++){
        //     for(int c=0; c<m; c++){
        //         if(grid[r][c] == 0){
        //             int distance = Integer.MAX_VALUE;
        //             int q_size = q.size();
                    
        //             for(int i=0; i<q_size; i++){
        //                 Pair temp = q.poll();
                        
        //                 distance = Math.min(distance, (Math.abs(r-temp.row)+Math.abs(c-temp.col)));
                        
        //                 q.add(temp);
        //             }
                    
        //             ans[r][c] = distance;
        //         }
        //         else{
        //             ans[r][c] = 0;
        //         }
        //     }
        // }
        
        // return ans;
        
        
        // Using BFS
        // Time complexity O(n*m) || Space complexity O(n*m)
        int n = grid.length;
        int m = grid[0].length;
        
        int ans[][] = new int[n][m];
        boolean visited[][] = new boolean[n][m];
        Queue<Info> q = new LinkedList<>();
        
        for(int r=0; r<n; r++){
            for(int c=0; c<m; c++){
                if(grid[r][c] == 1){
                    q.add(new Info(r, c, 0));
                    visited[r][c] = true;
                }
                else{
                    visited[r][c] = false;
                }
            }
        }
        
        while(!q.isEmpty()){
            Info temp = q.poll();
            int r = temp.row;
            int c = temp.col;
            int steps = temp.steps;
            
            int dx[] = {0,0,1,-1};
            int dy[] = {1,-1,0,0};
            
            for(int i=0; i<4; i++){
                int nx = r + dx[i];
                int ny = c + dy[i];
                
                if(isValid(nx, ny, n, m, grid, visited)){
                    q.add(new Info(nx, ny, steps+1));
                    ans[nx][ny] = steps+1;
                    visited[nx][ny] = true;
                }
            }
        }
        
        return ans;   
    }
    
    public static void main(String[] args) {
        
    }
}
