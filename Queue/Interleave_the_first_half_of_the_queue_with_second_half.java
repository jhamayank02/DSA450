import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

class Interleave_the_first_half_of_the_queue_with_second_half{

    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        
        // Using Array
        // Time complexity O(n) || Space complexity O(n)
        // int firstHalf[] = new int[N/2];
        // int secondHalf[] = new int[N/2];
        
        // for(int i=0; i<N/2; i++){
        //     firstHalf[i] = q.poll();
        // }
        
        // for(int i=0; i<N/2; i++){
        //     secondHalf[i] = q.poll();
        // }
        
        // ArrayList<Integer> ans = new ArrayList<>();
        // for(int i=0; i<N/2; i++){
        //     ans.add(firstHalf[i]);
        //     ans.add(secondHalf[i]);
        // }
        
        // return ans;


        
        // Using Queue
        // Time complexity O(n) || Space complexity O(n)
        // Queue<Integer> temp_q = new LinkedList<>();
        
        // int half = N/2;
        // for(int i=1; i<=half; i++){
        //     temp_q.add(q.poll());
        // }
        
        // while(!temp_q.isEmpty()){
        //     q.add(temp_q.poll());
        //     q.add(q.peek());
        //     q.poll();
        // }
        
        // ArrayList<Integer> ans = new ArrayList<>();
        // while(!q.isEmpty()){
        //     ans.add(q.poll());
        // }
        
        // return ans;



        // Using Stack
        // Time complexity O(n) || Space complexity O(n)
        Stack<Integer> st = new Stack<>();
        int half = N/2;
        
        for(int i=0; i<half; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        for(int i=0; i<half; i++){
            q.add(q.peek());
            q.poll();
        }
        
        for(int i=0; i<half; i++){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.peek());
            q.poll();
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        
        return ans;
    }

    public static void main(String args[]){

    }
}