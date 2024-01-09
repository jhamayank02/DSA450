public class Kadanes_Algorithm {
    long maxSubarraySum(int arr[], int n){
        // Find maximum subarray sum
        // Using Kadane's algorithm
        // Time complexity O(n) || Space complexity O(1)
        long maxi = Long.MIN_VALUE;
        long sum = 0;
        
        for(int i=0; i<n; i++){
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        
        return maxi;
        
    }
}
