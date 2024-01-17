class First_and_last_occurrences_of_x {

    public static int firstOccurence(int arr[], int n, int x){
        int first = -1;
        int low = 0;
        int high = n-1;
        int mid;
        
        while(low <= high){
            mid = low + (high-low)/2;
            
            if(arr[mid] == x){
                first = mid;
                high = mid - 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return first;
    }
    
    public static int lastOccurence(int arr[], int n, int x){
        int last = -1;
        int low = 0;
        int high = n-1;
        int mid;
        
        while(low <= high){
            mid = low + (high-low)/2;
            
            if(arr[mid] == x){
                last = mid;
                low = mid + 1;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return last;
    }
    
    // Using Binary Search
    // Time complexity O(logn) || Space complexity O(1)
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(firstOccurence(arr, n, x));
        ans.add(lastOccurence(arr, n, x));
        
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
