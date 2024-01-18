class Quick_sort {
   
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Time complexity O(nlogn) || Space complexity O(logn) (Recursive stack space)
    static void quickSort(int arr[], int low, int high)
    {
        if(low < high){
            int partitionIndex = partition(arr, low, high);
            
            quickSort(arr, low, partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = low;
        int i = low;
        int j = high;
        
        while(i < j){
            
            while(i <= high-1 && arr[i] <= arr[pivot]){
                i++;
            }
            
            while(j >= low+1 && arr[j] > arr[pivot]){
                j--;
            }
            
            
            if(i < j){
                swap(arr, i, j);
            }
        }
        
        swap(arr, pivot, j);
        
        return j;
    } 

    public static void main(String[] args) {
    
   } 
}
