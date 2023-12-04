class Coin_Change{
    public long countRecursive(int i, int sum, int n, int coins[]){
        if(sum == 0){
            return 1;
        }
        if(i >= n){
            return 0;
        }
        
        long take = 0;
        if(coins[i] <= sum){
            take = countRecursive(i, sum-coins[i], n, coins);
        }
        
        long not_take = countRecursive(i+1, sum, n, coins);
        
        return (take + not_take);
    }
    
    public long countMemoization(int i, int sum, int n, int coins[], long dp[][]){
        if(sum == 0){
            return 1;
        }
        if(i >= n){
            return 0;
        }
        
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }
        
        long take = 0;
        if(coins[i] <= sum){
            take = countMemoization(i, sum-coins[i], n, coins, dp);
        }
        
        long not_take = countMemoization(i+1, sum, n, coins, dp);
        
        return dp[i][sum] = (take + not_take);
    }
    
    public long solveTabulation(int coins[], int sum, int n){
        long dp[][] = new long[n][sum+1];
        
        for(int i=0; i<=sum; i++){
            if(i % coins[0] == 0){
                dp[0][i] = 1;
            }
        }
        
        for(int ind=1; ind<n; ind++){
            for(int tar=0; tar<=sum; tar++){
                
                long take = 0;
                if(coins[ind] <= tar){
                    take = dp[ind][tar-coins[ind]];
                }
                
                long not_take = dp[ind-1][tar];
                
                dp[ind][tar] = take + not_take;
            }
        }
        
        return dp[n-1][sum];
    }
    
    public long solveTabulationOptimized(int coins[], int sum, int n){
        long prev[] = new long[sum+1];
        
        for(int i=0; i<=sum; i++){
            if(i % coins[0] == 0){
                prev[i] = 1;
            }
        }
        
        for(int ind=1; ind<n; ind++){
            
            long curr[] = new long[sum+1];
            
            for(int tar=0; tar<=sum; tar++){
                
                long take = 0;
                if(coins[ind] <= tar){
                    take = curr[tar-coins[ind]];
                }
                
                long not_take = prev[tar];
                
                curr[tar] = take + not_take;
            }
            prev = curr;
        }
        
        return prev[sum];
    }
    
    public long count(int coins[], int N, int sum){
        // Using Recursion
        // Time complexity O(2^n) || Space complexity O(n)
        // return countRecursive(0, sum, N, coins);
        
        // Using Memoization
        // Time complexity O(n*sum) || Space complexity O(n*sum)
        // long dp[][] = new long[N][sum+1];
        // for(long arr[] : dp){
        //     Arrays.fill(arr, -1);
        // }
        
        // return countMemoization(0, sum, N, coins, dp);
        

        
        // Using Tabulation
        // Time complexity O(n*sum) || Space complexity O(n*sum)
        // return solveTabulation(coins, sum, N);
        

        
        // Using Tabulation (Space Optimized)
        // Time complexity O(n*sum) || Space complexity O(sum)
        return solveTabulationOptimized(coins, sum, N);
    }
    
    public static void main(String[] args) {
        
    }
}
