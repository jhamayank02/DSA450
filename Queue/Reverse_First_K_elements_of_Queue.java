class Reverse_First_K_elements_of_Queue{

    void reverse(int arr[]){
        int s = 0;
        int e = arr.length - 1;
        
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // Using 2 arrays
        // Time complexity O(n) || Space complexity O(n)
        // int n = q.size();
        // int arr1[] = new int[k];
        // int arr2[] = new int[n-k];
        
        // for(int i=0; i<k; i++){
        //     arr1[i] = q.remove();
        // }
        
        // reverse(arr1);
        
        // for(int i=0; i<n-k; i++){
        //     arr2[i] = q.remove();
        // }
        
        // for(int i=0; i<k; i++){
        //     q.add(arr1[i]);
        // }
        
        // for(int i=0; i<n-k; i++){
        //     q.add(arr2[i]);
        // }
        
        // return q;
        
        
        // Using stack
        // Time complexity O(n) || Space complexity O(k)
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        
        for(int i=0; i<k; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        for(int i=0; i<n-k; i++){
            q.add(q.poll());
        }
        
        return q;
        
        
    }

    public static void main(String args[]){

    }
}