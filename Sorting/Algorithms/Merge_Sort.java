class Merge_Sort {
    void merge(int arr[], int l, int m, int r)
    {
         int size1 = m-l+1;
         int size2 = r-m;
         
         int left[] = new int[size1];
         int right[] = new int[size2];
         
         for(int i=0; i<size1; i++){
             left[i] = arr[l+i];
         }
         
         for(int i=0; i<size2; i++){
             right[i] = arr[m+1+i];
         }
         
         int i = 0;
         int j = 0;
         int ptr = l;
         
         while(i<size1 && j<size2){
             if(left[i] < right[j]){
                 arr[ptr++] = left[i++];
             }
             else{
                 arr[ptr++] = right[j++];
             }
         }
         
         while(i<size1){
             arr[ptr++] = left[i++];
         }
         while(j<size2){
             arr[ptr++] = right[j++];
         }
    }
    
    void mergeSort(int arr[], int l, int r)
    {
        if(l < r){
            int mid = l + (r-l)/2;
            
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            
            merge(arr, l, mid, r);
        }
    }

    public static void main(String[] args) {
        
    }
}
