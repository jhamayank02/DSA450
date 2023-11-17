class Replace_every_element_with_the_least_greater_element_on_its_right{
    public static ArrayList<Integer> findLeastGreater(int n, int[] arr) {
        // Using TreeSet
        // Time complexity O(nlogn) || Space complexity O(n)
        TreeSet<Integer> s = new TreeSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=n-1; i>=0; i--){
            s.add(arr[i]);
            
            Integer nextGreater = s.higher(arr[i]);
            
            if(nextGreater == null){
                arr[i] = -1;
                continue;
            }
            
            arr[i] = nextGreater;
        }
        
        for(int elem : arr){
            ans.add(elem);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
