class Evaluation_of_Postfix_Expression{

    // Using stack
    // Time complexity O(n) || Space complexity O(n)
    public static int evaluatePostFix(String S)
    {
        int len = S.length();
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<len; i++){
            char ch = S.charAt(i);
            
            // If operator
            if(!st.isEmpty() && (ch == '*' || ch == '/' || ch == '+' || ch == '-')){
                int operand2 = st.pop();
                int operand1 = st.pop();
                
                int result = 0;
                if(ch == '*'){
                    result = operand1 * operand2;
                }
                else if(ch == '/'){
                    result = operand1 / operand2;
                }
                else if(ch == '+'){
                    result = operand1 + operand2;
                }
                else if(ch == '-'){
                    result = operand1 - operand2;
                }
                
                st.push(result);
            }
            // If opearand
            else{
                st.push(Character.getNumericValue(ch));
            }
            
        }
        
        return st.pop();
    }

    public static void main(String args[]){

    }
}