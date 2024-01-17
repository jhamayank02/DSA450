class Heap_Sort {

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void heapify(int arr[], int n, int i){
        int largest = i;
        int left_child = 2*i+1;
        int right_child = 2*i+2;

        if(left_child < n && arr[left_child] > arr[largest]){
            largest = left_child;
        }

        if(right_child < n && arr[right_child] > arr[largest]){
            largest = right_child;
        }

        if(largest != i){
            swap(arr, largest, i);
            heapify(arr, n, largest);
        }
    }

    public static int delete(int arr[], int n){
        if(n <= 0){
            return -1;
        }

        int lastElem = arr[n-1];
        int deletedElem = arr[0];
        arr[0] = lastElem;
        n--;

        heapify(arr, n, 0);

        return deletedElem;
    }

    public static void build_heap(int arr[], int n){
        for(int i=n/2; i>=0; i--){
            heapify(arr, n, i);
        }
    }

    public static void heapsort(int arr[], int n){
        build_heap(arr, n);

        int size = arr.length;
        int i = size-1;

        while(size > 0){
            int elem = delete(arr, size);
            size--;
            arr[i] = elem;
            i--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,10,3,5,1};

        heapsort(arr, arr.length);

        // delete(arr, arr.length);
        // delete(arr, arr.length);

        for(int elem: arr){
            System.out.print(elem + " ");
        }
        System.out.println();
    }    
}
