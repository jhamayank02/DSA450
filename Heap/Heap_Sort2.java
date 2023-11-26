class Heap_Sort2{
    void heapify(int arr[], int n, int i){
        if(i >= n){
            return;
        }

        int smallest = i;
        int left = 2*i + 1;
        int right = left + 1;

        if(left < n && arr[smallest] > arr[left]){
            smallest = left;
        }
        if(right < n && arr[smallest] > arr[right]){
            smallest = right;
        }

        if(smallest != i){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

            heapify(arr, n, smallest);
        }
    }

    void buildHeap(int arr[], int n){
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
    }
    
    // Sorts the array in descending order
    // Time complexity O(nlogn) || Space complexity O(1)
    public void heapSort(int[] nums) {
        int n = nums.length;
        buildHeap(nums, n);

        while(n>0){
            int temp = nums[0];
            nums[0] = nums[n-1];
            nums[n-1] = temp;
            n--;

            heapify(nums, n, 0);
        }
    }
    public static void main(String[] args) {
        
    }
}
