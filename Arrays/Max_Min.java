class Max_Min {
    // Time complexity O(n) || Space complexity O(1)
    public static int findSum(int A[],int N) 
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<N; i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }
        
        return min+max;
    }

    public static void main(String[] args) {
        
    }
}
