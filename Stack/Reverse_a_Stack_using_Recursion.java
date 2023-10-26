import java.util.Stack;

class Reverse_a_Stack_using_Recursion{

    // Using Recursion
    // Time complexity O(n) || Space complexity O(n)
    public static void insertAtBottom(Stack<Integer> st, int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }

        int val = st.pop();
        insertAtBottom(st, x);
        st.push(val);
    }

    // Using Recursion
    // Time complexity O(n) || Space complexity O(n)
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }

        int val = st.pop();
        reverse(st);
        insertAtBottom(st, val);
    }

    public static void main(String args[]){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}