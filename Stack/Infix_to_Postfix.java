class Infix_to_Postfix{

    // Using stack
    // Time complexity O(n) || Space complexity O(n)
    public static String infixToPostfix(String exp) {
        int len = exp.length();
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        
        for(int i=0; i<len; i++){
            char ch = exp.charAt(i);
            
            // If operator
            if(ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '('){
                
                if(st.isEmpty()){
                    st.push(ch);
                    continue;
                }
                char top = st.peek();
                
                while(ch == '^' && top == '^'){
                    postfix.append(st.pop());
                    if(st.isEmpty()){
                        break;
                    }
                    top = st.peek();
                }
                
                while((ch == '*' || ch == '/') && (top == '*' || top == '/' || top == '^')){
                    postfix.append(st.pop());
                    if(st.isEmpty()){
                        break;
                    }
                    top = st.peek();
                }
                
                while((ch == '+' || ch == '-') && (top == '*' || top == '/' || top == '^' || top == '+' || top == '-')){
                    postfix.append(st.pop());
                    if(st.isEmpty()){
                        break;
                    }
                    top = st.peek();
                }
                
                st.push(ch);
                
            }
            // If ')'
            else if(ch == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    char top = st.pop();
                    postfix.append(top);
                }
                st.pop();
            }
            // If operand
            else{
                postfix.append(ch);
            }
        }
        
        while(!st.isEmpty()){
            postfix.append(st.pop());
        }
        
        return postfix.toString();
    }

    public static void main(String args[]){

    }
}