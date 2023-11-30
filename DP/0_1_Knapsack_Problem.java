public class 0_1_Knapsack_Problem{

    static int solveRecursive(int ind, int n, int cap, int val[], int wt[]){
        if(ind+1 == n){
            if(cap >= wt[ind]){
                return val[ind];
            }
            return 0;
        }
        
        int notTake = solveRecursive(ind+1, n, cap, val, wt);
        int take = 0;
        if(wt[ind] <= cap){
            take = val[ind] + solveRecursive(ind+1, n, cap-wt[ind], val, wt);
        }
        
        return Math.max(take, notTake);
    }
    
    static int solveMemoization(int ind, int n, int cap, int val[], int wt[], int dp[][]){
        if(ind+1 == n){
            if(cap >= wt[ind]){
                return val[ind];
            }
            return 0;
        }
        
        if(dp[ind][cap] != -1){
            return dp[ind][cap];
        }
        
        int notTake = solveMemoization(ind+1, n, cap, val, wt, dp);
        int take = 0;
        if(wt[ind] <= cap){
            take = val[ind] + solveMemoization(ind+1, n, cap-wt[ind], val, wt, dp);
        }
        
        return dp[ind][cap] =  Math.max(take, notTake);
    }
    
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
        // Recursive Approach
        // Time complexity O(2^n) || Space complexity O(n)
        // return solveRecursive(0, n, W, val, wt);
        
        // DP
        // Memoization
        // Time complexity O(n*w) || Space complexity O(n*w)
        // int dp[][] = new int[n][W+1];
        // for(int arr[] : dp){
        //     Arrays.fill(arr, -1);
        // }
        
        // return solveMemoization(0,n,W,val,wt,dp);
        


        // Tabulation
        // Time complexity O(n*w) || Space complexity O(n*w)
        // int dp[][] = new int[n][W+1];
        
        // for(int i=0; i<=W; i++){
        //     if(wt[0] > i){
        //         dp[0][i] = 0;
        //     }
        //     else{
        //         dp[0][i] = val[0];
        //     }
        // }
        
        // for(int ind=1; ind<n; ind++){
        //     for(int cap=1; cap<=W; cap++){
                
        //         int notTake = dp[ind-1][cap];
                
        //         int take = 0;
        //         if(cap >= wt[ind]){
        //             take = val[ind] + dp[ind-1][cap-wt[ind]];
        //         }
                
        //         dp[ind][cap] = Math.max(take, notTake);
        //     }
        // }
        
        // return dp[n-1][W];
        
        
        // Space Optimized Tabulation
        // Time complexity O(n*w) || Space complexity O(w)
        int prev[] = new int[W+1];
        
        for(int i=0; i<=W; i++){
            if(wt[0] > i){
                prev[i] = 0;
            }
            else{
                prev[i] = val[0];
            }
        }
        
        for(int ind=1; ind<n; ind++){
            int curr[] = new int[W+1];
            for(int cap=1; cap<=W; cap++){
                
                int notTake = prev[cap];
                
                int take = 0;
                if(cap >= wt[ind]){
                    take = val[ind] + prev[cap-wt[ind]];
                }
                
                curr[cap] = Math.max(take, notTake);
            }
            prev = curr;
        }
        
        return prev[W];
    } 

    public static void main(String[] args) {
        
    }
}
