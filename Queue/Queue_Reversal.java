import java.util.Queue;
import java.util.Stack;

class Queue_Reversal{

    public void solve(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        
        int val = q.poll();
        solve(q);
        q.add(val);
    }
    
    public Queue<Integer> rev(Queue<Integer> q){
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // solve(q);
        
        // Using Stack
        // Time complexity O(n) || Space complexity O(n)
        Stack<Integer> st = new Stack<>();
        
        while(!q.isEmpty()){
            st.push(q.poll());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        return q;
    }

    public static void main(String args[]){

    }
}