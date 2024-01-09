public class Sort_an_array_of_0s_1s_and_2s {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void sort012(int a[], int n)
    {
        // By counting the number of 0s, 1s and 2s
        // Time complexity O(n) || Space complexity O(1)
        // int zeroCnt = 0;
        // int oneCnt = 0;
        // int twoCnt = 0;
        
        // for(int i=0; i<n; i++){
        //     if(a[i] == 0){
        //         zeroCnt++;
        //     }
        //     else if(a[i] == 1){
        //         oneCnt++;
        //     }
        //     else{
        //         twoCnt++;
        //     }
        // }
        
        // int ind = 0;
        
        // while(zeroCnt > 0){
        //     a[ind] = 0;
        //     ind++;
        //     zeroCnt--;
        // }
        // while(oneCnt > 0){
        //     a[ind] = 1;
        //     ind++;
        //     oneCnt--;
        // }
        // while(twoCnt > 0){
        //     a[ind] = 2;
        //     ind++;
        //     twoCnt--;
        // }
        
        // Using 3 pointers low, mid and high
        // Time complexity O(n) || Space complexity O(1)
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high){
            if(a[mid] == 1){
                mid++;
            }
            else if(a[mid] == 0){
                swap(a, low, mid);
                low++;
                mid++;
            }
            else if(a[mid] == 2){
                swap(a, mid, high);
                high--;
            }
        }  
    }
    
    public static void main(String[] args) {
        
    }
}
