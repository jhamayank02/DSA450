import java.util.Stack;

class Number_of_1_Bits{

    static void findBinary(int N, Stack<Integer> st){
        int num = N;
        
        while(num != 0){
            st.push(num%2);
            num /= 2;
        }
    }
    
    static int setBits(int N) {
        
        // Using Stack
        // Time complexity O(logn) || Space complexity O(logn)
        // Stack<Integer> st = new Stack<>();
        // findBinary(N, st);
        
        // int count = 0;
        // while(!st.isEmpty()){
        //     int top = st.pop();
        //     if(top == 1){
        //         count++;
        //     }
        // }
        
        
        // Using Right shift and And operator
        // Time complexity O(logn) || Space complexity O(1)
        int count = 0;
        while(N != 0){
            System.out.println((N&1));
            if((N & 1) == 1){
                count++;
            }
            N = N >> 1;
        }
        
        return count;
    }

    public static void main(String args[]){

    }
}