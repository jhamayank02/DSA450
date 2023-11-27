public class k_largest_elements {
    int[] kLargest(int[] arr, int n, int k) {
        
        // Using Max Heap
        // Time complexity O(nlogn) || Space complexity O(n)
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // // Time complexity O(nlogn) || Space complexity O(1)
        // for(int i=0; i<n; i++){
        //     pq.add(arr[i]);
        // }
        
        // int ans[] = new int[k];
        
        // // Time complexity O(klogn) || Space complexity O(1)
        // for(int i=0; i<k; i++){
        //     ans[i] = pq.poll();
        // }
        
        // return ans;
        
        // Using Min Heap
        // Time complexity O(klogk + (n-k)logk) ~= O(nlogk) || Space complexity O(k)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        
        for(int i=k; i<n; i++){
            if(pq.peek() < arr[i]){
                pq.remove();
                pq.add(arr[i]);
            }
        }
        
        int ans[] = new int[k];
        int i = k-1;
        while(i >= 0){
            ans[i] = pq.remove();
            i--;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
