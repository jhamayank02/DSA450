class Reverse_a_string_using_Stack{

    public String reverse(String S){
        // Using stack
        // Time complexity O(n) || Space complexity O(n)
        StringBuilder reversed = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int len = S.length();
        
        for(int i=0; i<len; i++){
            char ch = S.charAt(i);
            st.push(ch);
        }
        
        while(!st.isEmpty()){
            char ch = st.peek();
            st.pop();
            reversed.append(ch);
        }
        
        return reversed.toString();
    }

    public static void main(String args[]){

    }
}