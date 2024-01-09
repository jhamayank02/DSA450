public class Union_of_two_arrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        // Using Hashmap
        // Time complexity O(n+m) || Space complexity O(n+m)
        // HashMap<Integer, Boolean> map = new HashMap<>();
        
        // for(int i=0; i<n; i++){
        //     map.put(a[i], true);
        // }
        
        // for(int i=0; i<m; i++){
        //     if(!map.containsKey(b[i])){
        //         map.put(b[i], true);
        //     }
        // }
        
        // return map.size();
        
        // Using Set
        // Time complexity O(n+m) || Space complexity O(n+m)
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            set.add(a[i]);
        }
        
        for(int i=0; i<m; i++){
            set.add(b[i]);
        }
        
        return set.size();
    }

    public static void main(String[] args) {
        
    }
}
