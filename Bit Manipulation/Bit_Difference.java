class Bit_Difference{

    public static int countBitsFlip(int a, int b){
        
        // Using And operator
        // Time complexity O(logn) || Space complexity O(1)
        int count = 0;
        
        while(a != 0 || b != 0){
            if(!((a & 1) == (b & 1))){
                count++;
            }
            a = a >> 1;
            b = b >> 1;
        }
        
        return count;
        
    }

    public static void main(String args[]){

    }
}