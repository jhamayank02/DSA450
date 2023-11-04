import java.util.LinkedList;
import java.util.Queue;

class First_negative_integer_in_every_window_of_size_k{
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        // Using Queue
        // Time complexity O(n) || Space complexity O(k)
        // Queue<Integer> q = new LinkedList<>();
        
        // int i = 0;
        // for(; i<K; i++){
        //     if(A[i] < 0){
        //         q.add(i);
        //     }
        // }
        
        // long ans[] = new long[N-K+1];
        // int index = 0;
        
        // for(; i<N; i++){
            
        //     if(!q.isEmpty()){
        //         ans[index] = A[q.peek()];
        //         index++;
        //     }
        //     else{
        //         ans[index] = 0;
        //         index++;
        //     }
            
        //     while(!q.isEmpty() && q.peek() < i-K+1){
        //         q.poll();
        //     }
            
        //     if(A[i] < 0){
        //         q.add(i);
        //     }
        // }
        
        // if(!q.isEmpty()){
        //     ans[index] = A[q.peek()];
        //     index++;
        // }
        // else{
        //     ans[index] = 0;
        //     index++;
        // }
        
        // return ans;


        // Optimal approach
        // Time complexity O(n) || Space complexity O(1)

        int negInd = 0;
        long ans[] = new long[N-K+1];
        int ind = 0;
        
        for(int i=K-1; i<N; i++){
            
            while((negInd < i) && (negInd <= i-K || A[negInd] >= 0)){
                negInd++;
            }
            
            if(A[negInd] < 0){
                ans[ind] = A[negInd];
                ind++;
            }
            else{
                ans[ind] = 0;
                ind++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        
    }
}
