class Non_Repeating_Numbers{
    
    // Using XOR operation
    // Time complexity O(n) || Space complexity O(1)
    public int[] singleNumber(int[] nums)
    {
        int n = nums.length;
        int xor = 0;
        
        // Step 1: Find the XOR of all the numbers
        for(int i=0; i<n; i++){
            xor ^= nums[i];
        }
        
        // Step 2: Find the first set bit(i.e 1) int XOR obtained
        int setBitPos = 0;
        while(xor != 0){
            setBitPos++;
            if((xor & 1) == 1){
                break;
            }
            xor = xor >> 1;
        }
        
        // Step 3: Divide the numbers in two lists
        ArrayList<Integer> list1 = new ArrayList<>(); // Will contain numbers with bit 1 at setBitPos
        ArrayList<Integer> list2 = new ArrayList<>(); // Will contain numbers with bit 0 at setBitPos
        
        int xor_list_1 = 0; // XOR of list 1's elements
        int xor_list_2 = 0; // XOR of list 2's elements
        for(int i=0; i<n; i++){
            int elem = nums[i];
            if(((elem >> (setBitPos-1)) & 1) == 1){
                list1.add(elem);
                xor_list_1 ^= elem;
            }
            else{
                list2.add(elem);
                xor_list_2 ^= elem;
            }
        }
        
        
        int ans[] = new int[2];
        if(xor_list_1>xor_list_2){
            ans[0] = xor_list_2;
            ans[1] = xor_list_1;
        }
        else{
            ans[0] = xor_list_1;
            ans[1] = xor_list_2;
        }
        
        return ans;
        
    }

    public static void main(String args[]){

    }
}