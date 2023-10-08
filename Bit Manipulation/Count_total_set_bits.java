class Count_total_set_bits{

    static int countSetBitsUtil(int n){
        int setBitsCount = 0;
        
        while(n > 0){
            setBitsCount += (n%2 == 0 ? 0 : 1);
            n /= 2;
        }
        
        return setBitsCount;
    }
    
    static int findLargestPowerOf2(int n){
        int x = 0;
        
        while((1 << x) <= n){
            x++;
        }
        
        return x-1;
    }
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // By calculating the binary representation of each number
        // Time complexity O(NlogN) || Space complexity O(1);
        // int totalSetBits = 0;
        // for(int i=1; i<=n; i++){
        //     totalSetBits += countSetBitsUtil(i);
        // }
        // return totalSetBits;
        
        if(n <= 0){
            return 0;
        }
        
        int x = findLargestPowerOf2(n);
        
        int totalSetBits = 0;
        // totalSetBits = ((int)Math.pow(2,x-1) * x) + (n - (int)Math.pow(2, x) + 1) + countSetBits(n - (int)Math.pow(2, x));
        
        totalSetBits = ((1<<(x-1)) * x) + (n - (1<<x) + 1) + countSetBits(n - (1<<x));        
        return totalSetBits;
    }

    public static void main(String args[]){

    }
}