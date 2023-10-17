class Median_in_a_row_wise_sorted_Matrix{

    int upperBound(int arr[], int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        
        return ans;
    }
    
    int countSmallerEqls(int matrix[][], int x){
        int cnt = 0;
        int rows = matrix.length;
        
        for(int i=0; i<rows; i++){
            cnt += upperBound(matrix[i], x);
        }
        
        return cnt;
    }
    
    // Using Binary Search
    // Time complexity O(log(2000) * r * log c) || Space complexity O(1)
    int median(int matrix[][], int R, int C) {
         int low = Integer.MAX_VALUE;
         int high = Integer.MIN_VALUE;
         
         for(int i=0; i<R; i++){
             low = Math.min(low, matrix[i][0]);
             high = Math.max(high, matrix[i][C-1]);
         }
         
         int req = (R*C)/2;
         
         while(low <= high){
             
            int mid = (low + high) / 2;
            int smallerEqls = countSmallerEqls(matrix, mid);
            
            if(smallerEqls <= req){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
             
         }
         
         return low;
    }

    public static void main(String args[]){

    }
}