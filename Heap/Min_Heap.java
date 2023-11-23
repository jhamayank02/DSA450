class MinHeap{
    int arr[] = new int[100];
    int size = 0;

    MinHeap(){
        arr[0] = -1;
    }

    void heapify(int arr[], int n, int i){
        if(i <= 1){
            return;
        }

        int parent = i/2;

        if(arr[parent] > arr[i]){
            int temp = arr[parent];
            arr[parent] = arr[i];
            arr[i] = temp;
            heapify(arr, n, parent);
        }
        else{
            return;
        }
    }

    // Time complexity O(logn)
    void insert(int data){
        size++;
        int index = size;
        arr[index] = data;

        // while(index > 1){
        //     int parent = index/2;
            
        //     if(arr[parent] > arr[index]){
        //         int temp = arr[index];
        //         arr[index] = arr[parent];
        //         arr[parent] = temp;
        //         index = parent;
        //     }
        //     else{
        //         return;
        //     }
        // }

        heapify(arr, size, index);
    }

    // Time complexity O(logn)
    void delete(){
        if(size == 0){
            System.out.println("Heap Underflow");
            return;
        }

        arr[1] = arr[size];
        size--;
        int index = 1;

        while(index <= size){
            int leftChildInd = 2 * index;
            int rightChildInd = 2 * index + 1;

            if(leftChildInd <= size && arr[leftChildInd] < arr[index] || (rightChildInd <= size && arr[rightChildInd] > arr[leftChildInd])){
                int temp = arr[leftChildInd];
                arr[leftChildInd] = arr[index];
                arr[index] = temp;
                index = leftChildInd;
            }
            else if(rightChildInd <= size && arr[rightChildInd] < arr[index]){
                int temp = arr[rightChildInd];
                arr[rightChildInd] = arr[index];
                arr[index] = temp;
                index = rightChildInd;
            }
            else{
                return;
            }
        }
    }
    
    void print(){
        System.out.print("Heap : ");
        for(int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Min_Heap {
    public static void main(String[] args) {
        MinHeap m = new MinHeap();

        m.insert(45);
        m.insert(60);
        m.insert(55);
        m.insert(50);
        m.insert(70);

        m.print();

        m.delete();
        m.print();

        m.delete();
        m.print();
    }
}
