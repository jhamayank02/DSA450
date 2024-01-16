class Bubble_Sort{
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Time complexity O(n^2) || Space complexity O(1)
	public static void bubbleSort(int arr[], int n)
    {
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        
    }
}