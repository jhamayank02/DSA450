class Length_of_the_Longest_Valid_Substring{

    static int findMaxLen(String S) {
        // Using Stack
        // Time complexity O(n) || Space complexity O(n)
        // Stack<Integer> st = new Stack<>();
        // int n = S.length();
        // int maxLen = 0;
        
        // st.push(-1);
        // for(int i=0; i<n; i++){
        //     char ch = S.charAt(i);
            
        //     if(ch == '('){
        //         st.push(i);
        //     }
        //     else{
        //         if(!st.isEmpty()){
        //             st.pop();
        //         }
                
        //         if(!st.isEmpty()){
        //             int len = i - st.peek();
        //             maxLen = Math.max(maxLen, len);
        //         }
        //         else{
        //             st.push(i);
        //         }
        //     }
        // }
        
        // return maxLen;
        
        
        
        // Using loop
        // Time complexity O(n) || Space complexity O(1)
        int n = S.length();
        int open = 0;
        int close = 0;
        int maxLen = 0;
        
        for(int i=0; i<n; i++){
            char ch = S.charAt(i);
            
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            
            if(open == close){
                int len = open + close;
                maxLen = Math.max(maxLen, len);
            }
            else if(close > open){
                open = close = 0;
            }
        }
        
        open = close = 0;
        
        for(int i=n-1; i>=0; i--){
            char ch = S.charAt(i);
            
            if(ch == '('){
                open++;
            }
            else{
                close++;
            }
            
            if(open == close){
                int len = open + close;
                maxLen = Math.max(maxLen, len);
            }
            else if(open > close){
                open = close = 0;
            }
        }
        
        return maxLen;
    }

    public static void main(String args[]){

    }
}