import java.util.ArrayList;

class Value_equal_to_index_value {
    // Using linear search
    // Time complexity O(n) || Space complexity O(1)
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
            
            if(arr[i] == i+1){
                ans.add(i+1);
            }
            
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
