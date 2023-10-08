class Power_of_2{

    // By calculating the power of 2
        // Time complexity O(logn) || Space complexity O(1)
        // long x = 0;
        
        // while((1 << x) < n){
        //     x++;
        // }
        
        // if((1 << x) == n){
        //     return true;
        // }
        
        // return false;
        
        
        
        // Using And and Not operator
        // Time complexity O(1) || Space complexity O(1)
        if(n==0){
            return false;
        }
        
        if((n & (~(n-1))) == n){
            return true;
        }
        
        return false;

    public static void main(String args[]){

    }
}