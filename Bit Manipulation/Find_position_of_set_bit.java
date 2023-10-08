class Find_position_of_set_bit{

    static int findPosition(int N) {
        // Using Left shift and And operator
        // Time complexity O(logn) || Space complexity O(1)
        int countSetBits = 0;
        int setBitPos = 0;
        
        while(N > 0){
            if((N & 1) == 1){
                countSetBits++;
            }
            N = N >> 1;
            setBitPos++;
        }
        
        if(countSetBits > 1 || countSetBits == 0){
            return -1;
        }
        return setBitPos;
    }

    public static void main(String args[]){

    }
}