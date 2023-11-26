class Heap_Sort1{

    void buildHeap(int arr[], int n)
    {
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
    }                                                              
 
    void heapify(int arr[], int n, int i)
    {
        if(i >= n){
            return;
        }
        int left = 2*i+1;
        int right = left + 1;
        
        int largest = i;
        
        if(left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapify(arr, n, largest);
        }
    }
    
    // Sorts the array in increasing order
    // Time complexity O(nlogn) || Space complexity O(1)
    public void heapSort(int arr[], int n)
    {
        buildHeap(arr, n);
        
        int size = n;
        
        while(size > 1){
            int temp = arr[size-1];
            arr[size-1] = arr[0];
            arr[0] = temp;
            size--;
            heapify(arr, size, 0);
        }
    }

    public static void main(String[] args) {
        
    }
}
