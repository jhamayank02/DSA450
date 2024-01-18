class Find_Missing_And_Repeating{

    int[] findTwoElement(int arr[], int n) {
        // Time complexity O(n) || Space complexity O(1)
        int ans[] = new int[2];
        
        for(int i=0; i<n; i++){
            
            int ind = Math.abs(arr[i]) - 1;
            
            // Not visited
            if(arr[ind] > 0){
                arr[ind] = -arr[ind];
            }
            // Visited
            else if(arr[ind] < 0){
                // Repeating no.
                ans[0] = ind+1;
            }
            
        }
        
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                // Missing no.
                ans[1] = i+1;
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
}
