class Kth_smallest_element {
    // Using Max Heap
    // Time complexity O((n-k)logk) || Space complexity O(k)
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=l; i<l+k; i++){
            maxHeap.add(arr[i]);
        }
        
        for(int i=l+k; i<=r; i++){
            if(maxHeap.peek() > arr[i]){
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        
    }    
}
