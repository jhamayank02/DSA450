public class Gold_Mine_Problem {
    
    // Using Recursion
    // Time complexity O(3^m) || Space complexity O(m)
    static int solveRecursive(int r, int c, int n, int m, int M[][]){
        if(r < 0 || r >= n || c >= m){
            return 0;
        }
        
        int curr = M[r][c];
        
        int right_up = solveRecursive(r-1, c+1, n, m, M);
        int right = solveRecursive(r, c+1, n, m, M);
        int right_down = solveRecursive(r+1, c+1, n, m, M);
        
        return curr + Math.max(right_up, Math.max(right, right_down));
    }
    
    // Using Memoization
    // Time complexity O(n*m) || Space complexity O(n*m)
    static int solveMemoization(int r, int c, int n, int m, int M[][], int dp[][]){
        if(r < 0 || r >= n || c >= m){
            return 0;
        }
        
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        
        int curr = M[r][c];
        
        int right_up = solveMemoization(r-1, c+1, n, m, M, dp);
        int right = solveMemoization(r, c+1, n, m, M, dp);
        int right_down = solveMemoization(r+1, c+1, n, m, M, dp);
        
        return dp[r][c] = curr + Math.max(right_up, Math.max(right, right_down));
    }
    
    // Using Tabulation
    // Time complexity O(n*m) || Space complexity O(n*m)
    static int solveTabulation(int n, int m, int M[][]){
        int dp[][] = new int[n][m];
        int max = Integer.MIN_VALUE;
        
        // Last col
        for(int r=0; r<n; r++){
            dp[r][m-1] = M[r][m-1];
            max = Math.max(max, dp[r][m-1]);
        }
        
        // First row
        // for(int c=m-2; c>=0; c--){
        //     dp[0][c] = M[0][c] + dp[0][c+1];
        // }
        
        for(int c=m-2; c>=0; c--){
            for(int r=0; r<n; r++){
                
                if(r-1>=0 && c+1<m){
                    dp[r][c] = Math.max(dp[r][c], dp[r-1][c+1]);
                }
                if(c+1<m){
                    dp[r][c] = Math.max(dp[r][c], dp[r][c+1]);
                }
                if(r+1<n && c+1<m){
                    dp[r][c] = Math.max(dp[r][c], dp[r+1][c+1]);
                }
                
                dp[r][c] += M[r][c];
                max = Math.max(max, dp[r][c]);
            }
        }
        
        if(max == Integer.MIN_VALUE){
            return 0;
        }
        
        return max;
    }
    
    static int maxGold(int n, int m, int M[][])
    {
        // Using Recursion
        // Time complexity O(n * 3^m) || Space complexity O(m)
        // int max = Integer.MIN_VALUE;
        
        // for(int i=0; i<n; i++){
        //     max = Math.max(max, solveRecursive(i, 0, n, m, M));
        // }
        
        // return max;
        
        
        
        // Using Memoization
        // Time complexity O(n * m) || Space complexity O(n * m)
        // int dp[][] = new int[n][m];
        // int max = Integer.MIN_VALUE;
        
        // for(int arr[] : dp){
        //     Arrays.fill(arr, -1);
        // }
        
        // for(int i=0; i<n; i++){
        //     max = Math.max(max, solveMemoization(i, 0, n, m, M, dp));
        // }
        
        // return max;
        
        // Using Tabulation
        // Time complexity O(n * m) || Space complexity O(n * m)
        return solveTabulation(n, m, M);
    }
    
    public static void main(String[] args) {
        
    }
}
