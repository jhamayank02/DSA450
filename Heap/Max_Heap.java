class MaxHeap{
    int arr[] = new int[100];
    int size = 0;

    MaxHeap(){
        arr[0] = -1;
    }

    void heapify(int arr[], int n, int i){
        int leftChild = 2 * i;
        int rightChild = 2 * i + 1;

        int largest = i;

        if(leftChild <= n && arr[largest] < arr[leftChild]){
            largest = leftChild;
        }
        if(rightChild <= n && arr[largest] < arr[rightChild]){
            largest = rightChild;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Time complexity O(logn)
    void insert(int data){
        size++;
        int index = size;
        arr[index] = data;

        // while(index > 1){
        //     int parent = index/2;

        //     if(arr[parent] < arr[index]){
        //         int temp = arr[parent];
        //         arr[parent] = arr[index];
        //         arr[index] = temp;
        //         index = parent;
        //     }
        //     else{
        //         return;
        //     }
        // }
        
        heapify(arr, size, 1);
    }

    void print(){
        System.out.print("Heap : ");
        for(int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

            if(leftChildInd <= size && arr[leftChildInd] > arr[index] || (rightChildInd <= size && arr[leftChildInd] > arr[rightChildInd])){
                int temp = arr[leftChildInd];
                arr[leftChildInd] = arr[index];
                arr[index] = temp;
                index = leftChildInd;
            }
            else if(rightChildInd <= size && arr[index] < arr[rightChildInd]){
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
}

public class Max_Heap {
    public static void main(String[] args) {
        MaxHeap m = new MaxHeap();

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
