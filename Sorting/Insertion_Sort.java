class Insertion_Sort {
    
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void insert(int arr[],int i){
        int j=i;
            
        while(j >= 1 && arr[j-1] > arr[j]){
            swap(arr, j-1, j);
            j--;
        }

    }
  
    // Time complexity O(n^2) || Space complexity O(1)
    public void insertionSort(int arr[], int n){
        for(int i=0; i<n; i++){
            insert(arr, i);
        }
    }

    public static void main(String[] args) {
        
    }
}
