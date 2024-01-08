class Cyclically_rotate_an_array_by_one {
    // Time complexity O(n) || Space complexity O(1)
    public void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        
        arr[0] = last;
    }

    public static void main(String[] args) {
        
    }
}
