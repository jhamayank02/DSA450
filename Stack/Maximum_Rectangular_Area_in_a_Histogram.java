import java.util.Stack;

class Maximum_Rectangular_Area_in_a_Histogram{

    public static void prevSmaller(long arr[], long ans[], long n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        for(int i=0; i<n; i++){
            long current = arr[i];

            while(st.peek() != -1 && arr[st.peek()] >= current){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
    }
    
    public static void nextSmaller(long arr[], long ans[], long n){
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        for(int i=(int)n-1; i>=0; i--){
            long current = arr[i];

            while(st.peek() != -1 && arr[st.peek()] >= current){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(i);
        }
    }
    
    // Time complexity O(n) || Space complexity O(n)
    public static long getMaxArea(long hist[], long n) 
    {
        long nextSmallerArr[] = new long[(int)n];
        nextSmaller(hist, nextSmallerArr, n);
        
        long prevSmallerArr[] = new long[(int)n];
        prevSmaller(hist, prevSmallerArr, n);
        
        long maxArea = 0;
        for(int i=0; i<n; i++){
            
            if(nextSmallerArr[i] == -1){
                nextSmallerArr[i] = n;
            }
            
            long width = nextSmallerArr[i] - prevSmallerArr[i] - 1;
            long length = hist[i];
            
            long area = length * width;
            maxArea = Math.max(area, maxArea);
        }
        
        return maxArea;
    }

    public static void main(String args[]){

    }
}