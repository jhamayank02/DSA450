import java.util.ArrayList;
import java.util.Stack;

class Insert_at_the_bottom_of_the_stack{
    public static void insertAtBottom(Stack<Integer> st, int x){
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // if(st.isEmpty()){
        //     st.push(x);
        //     return;
        // }

        // int val = st.pop();
        // insertAtBottom(st, x);
        // st.push(val);

        // Using auxiliary array
        // Time complexity O(n) || Space complexity O(n)
        ArrayList<Integer> arr = new ArrayList<>();

        while(!st.isEmpty()){
            arr.add(st.pop());
        }

        st.push(x);

        for(int i=arr.size()-1; i>=0; i--){
            st.add(arr.get(i));
        }
    }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        insertAtBottom(st, 5);
        System.out.println(st);
    }
}