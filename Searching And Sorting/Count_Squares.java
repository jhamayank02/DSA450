class Count_Squares {
    static int countSquares(int N) {
        // Time complexity O(sqrt(n)) || Space complexity O(1)
        int count = 0;
        
        for(int i=1; i<Math.sqrt(N); i++){
            // if((i*i) < N){
            //     count++;
            // }

            // OR
            for(int i=1; i<Math.sqrt(N); i++){
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        
    }
}
