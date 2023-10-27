import java.util.Stack;

class Expression_contains_redundant_bracket_or_not{

    public static boolean containsOrNot(String str){
        int n = str.length();
        Stack<Character> st = new Stack<>();

        for(int i=0; i<n; i++){
            char ch = str.charAt(i);

            if(ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                if(st.peek() != '('){
                    while(!st.isEmpty() && st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        // String str = "(a+b)";
        String str = "(a+b/c)";

        System.out.println(containsOrNot(str));
    }
}