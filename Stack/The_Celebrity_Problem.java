class The_Celebrity_Problem{

    int celebrity(int M[][], int n)
    {   
        // Time complexity O(n^2) || Space complexity O(1)
        // Find the potential celebrity
        // Finding the i or row
        // int potentialCelebrity = -1;
        // for(int i=0; i<n; i++){
        //     boolean flag = false; // 1-found or not
        //     for(int j=0; j<n; j++){
        //         if(M[i][j] == 1){
        //             flag = true;
        //             break;
        //         }
        //     }
            
        //     if(flag == false){
        //         potentialCelebrity = i;
        //         break;
        //     }
        // }
        
        // if(potentialCelebrity == -1){
        //     return potentialCelebrity;
        // }
        
        // // Check whether the potential celebrity is actually a celebrity
        // // Checking if all the elements in column = i = potentialCelebrity is 1 except M[potentialCelebrity][potentialCelebrity]
        // for(int i=0; i<n; i++){
        //     if(i != potentialCelebrity && M[i][potentialCelebrity] != 1){
        //         return -1;
        //     }
        // }
        
        // return potentialCelebrity;
        
        
        // Using stack
        // Time complexity O(n) || Space complexity O(n)
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<n; i++){
            st.push(i);
        }
        
        while(st.size() > 1){
            int a = st.pop();
            int b = st.pop();
            
            // a knows b
            if(M[a][b] == 1){
                st.push(b);
            }
            // b knows a
            else if(M[b][a] == 1){
                st.push(a);
            }
        }
        
        if(st.isEmpty()){
            return -1;
        }
        int potentialCelebrity = st.pop();
        
        // Check row
        for(int c=0; c<n; c++){
            if(M[potentialCelebrity][c] == 1){
                return -1;
            }
        }
        
        // Check column
        for(int r=0; r<n; r++){
            if(r != potentialCelebrity && M[r][potentialCelebrity] != 1){
                return -1;
            }
        }
        
        return potentialCelebrity;
    }

    public static void main(String args[]){

    }
}