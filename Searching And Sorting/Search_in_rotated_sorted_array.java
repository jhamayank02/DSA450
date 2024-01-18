class Search_in_rotated_sorted_array {

    public int search(int[] arr, int target) {
        // Using Binary Search
        // Time complexity O(logn) || Space complexity O(1)
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid;
        int ind = -1;

        while(low <= high){
            mid = low + (high-low)/2;

            if(arr[mid] == target){
                ind = mid;
                return ind;
            }
            // Left part is sorted
            else if(arr[low] <= arr[mid]){
                // Left part contains the target
                if(arr[low] <= target && target <= arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            // Right part is sorted
            else{
                // Right part contains the target
                if(arr[mid] <= target && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }

        return ind;
    }
    
    public static void main(String[] args) {
        
    }   
}
