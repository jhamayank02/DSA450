class Copy_set_bits_in_a_range{

    public int solve(int x, int y, int l, int r){

        int temp = y;

        for(int i=l; i<=r; i++){
            // If y has set bit at this position
            if((temp & 1) == 1){
                x = x | 1;
            }

            temp = temp >> 1;
        }

        return x;
    }

    public static void main(String args[]){

    }
}