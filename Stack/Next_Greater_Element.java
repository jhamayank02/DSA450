class Next_Greater_Element{

    // Using stack
    // Time complexity O(n) || Space complexity O(n)
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> st = new Stack<>();
        long ans[] = new long[n];
        
        for(int i=n-1; i>=0; i--){
            long current = arr[i];
            
            if(st.isEmpty()){
                ans[i] = -1;
                st.push(current);
            }

            else{
                
                if(!st.isEmpty() && current < st.peek()){
                    ans[i] = st.peek();
                    st.push(current);
                }
                else{
                    while(!st.isEmpty() && current >= st.peek()){
                        st.pop();
                    }
                    
                    if(st.isEmpty()){
                        ans[i] = -1;
                    }
                    else{
                        ans[i] = st.peek();
                    }
                    
                    st.push(current);
                }
                
            }
        }
        
        return ans;
    } 

    public static void main(String args[]){

    }
}