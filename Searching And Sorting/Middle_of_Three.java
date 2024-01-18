class Middle_of_Three {
    
    // Time complexity O(1) || Space complexity O(1)
    int middle(int A, int B, int C){
        if(A>B){
            if(B>C){
                return B;
            }
            else if(A>C){
                return C;
            }
            else{
                return A;
            }
        }
        else{
            if(A>C){
                return A;
            }
            else if(B>C){
                return C;
            }
            else{
                return B;
            }
        }
    }

    public static void main(String[] args) {
        
    }
}
