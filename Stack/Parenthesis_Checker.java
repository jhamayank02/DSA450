class Parenthesis_Checker{

    static boolean ispar(String x)
    {
        // Using Stack
        // Time complexity O(n) || Space complexity O(n)
        int len = x.length();
        
        if(len % 2 != 0){
            return false;
        }
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<len; i++){
            
            char ch = x.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                
                char top = st.peek();
                if(!((top == '{' && ch == '}') || (top == '(' && ch == ')') || (top == '[' && ch == ']'))){
                    return false;
                }
                st.pop();
            }
            
        }
        
        if(st.isEmpty()){
            return true;
        }
        
        return false;
    }

    public static void main(String args[]){

    }
}