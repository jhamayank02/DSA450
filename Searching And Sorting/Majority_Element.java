class Majority_Element {

    static int majorityElement(int a[], int n)
    {
        // Using Moore's Voting Algorithm
        // Time complexity O(n) || Space complexity O(1)
        int elem = 0;
        int cnt = 0;
        
        for(int i=0; i<n; i++){
            
            if(cnt == 0){
                elem = a[i];
            }
            
            // At first iteration, this will never be true, as (1 <= N <= 10^7)
            if(elem == a[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        
        if(cnt <= 0){
            return -1;
        }
        
        cnt = 0;
        
        for(int i=0; i<n; i++){
            if(a[i] == elem){
                cnt++;
            }
        }
        
        return (cnt > n/2) ? elem : -1;
    }
    
    public static void main(String[] args) {
        
    }
}
