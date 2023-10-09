import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Power_Set{
    public static void recursive(List<String> power_set, String str, int ind, int n, String subSeq) {
        if(ind >= n){
            if(subSeq.equals("")){
                return;
            }
            power_set.add(subSeq);
            return;
        }
        
        String take = subSeq + str.charAt(ind);
        String not_take = subSeq;
        
        recursive(power_set, str, ind+1, n, take);
        recursive(power_set, str, ind+1, n, not_take);
    }
    
    public List<String> AllPossibleStrings(String s)
    {
        // Using Bit Manipulation
        // Time complexity O(2^n * n) + O(2^n log 2^n) == O(n * 2^n) || Space complexity O(1)
        
        // List<String> power_set = new ArrayList<String>();
        
        // int str_len = s.length();
        // int set_len = (int)Math.pow(2, str_len);
        
        // // Starting the loop from 1 as we don't want the empty subsequence
        // for(int i=1; i<set_len; i++){
            
        //     int j = i;
        //     int bitPos = 0;
        //     StringBuilder subSeq = new StringBuilder("");
            
        //     while(j > 0){
        //         // If set bit
        //         if((j & 1) == 1){
        //             subSeq.append(s.charAt(bitPos));
        //         }
                
        //         j = j >> 1;
        //         bitPos++;
        //     }
            
        //     power_set.add(subSeq.toString());
        // }
        
        // Collections.sort(power_set);
        // return power_set;
        
        
        
        
        // Using Bit Manipulation
        // Time complexity O(2^n) + O(2^n log 2^n) == O(2^n log 2^n) || Space complexity O(n)
        List<String> power_set = new ArrayList<String>();
        recursive(power_set, s, 0, s.length(), "");
        
        Collections.sort(power_set);
        return power_set;
    }

    public static void main(String args[]){

    }
}