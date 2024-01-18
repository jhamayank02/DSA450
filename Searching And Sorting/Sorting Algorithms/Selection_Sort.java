class Selection_Sort {
    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
	int  select(int arr[], int i)
	{
	    int n = arr.length;
        int min = i;
        
        for(int j=i+1; j<n; j++){
            if(arr[min] > arr[j]){
                min = j;
            }
        }
        
        return min;
	}
	
    // Time complexity O(n^2) || Space complexity O(1)
	void selectionSort(int arr[], int n)
	{
	    int ptr = 0;
	    
	    for(int i=0; i<n-1; i++){
	        int min = select(arr, i);
	        swap(arr, ptr, min);
	        ptr++;
	    }
	}

    public static void main(String[] args) {
        
    }
}
