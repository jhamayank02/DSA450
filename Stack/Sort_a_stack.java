class Sort_a_stack{

    public void solve(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        
        int val = s.pop();
        solve(s);
        
        int arr[] = new int[s.size()];
        int i = 0;
        while(!s.isEmpty() && s.peek() > val){
            arr[i] = s.pop();
            i++;
        }
        s.push(val);
        
        i--;
        while(i>=0){
            s.push(arr[i]);
            i--;
        }
        
    }
    
    public static void sortedInsert(Stack<Integer> s, int x){
        if(s.isEmpty() || s.peek() < x){
            s.push(x);
            return;
        }
        
        int val = s.pop();
        sortedInsert(s, x);
        s.push(val);
    }
    
	public Stack<Integer> sort(Stack<Integer> s)
	{
        // Time complexity O(n^2) || Space complexity O(n+n)
	   // solve(s);


        // Time complexity O(n^2) || Space complexity O(n+n)
	   if(s.isEmpty()){
	       return s;
	   }
	   
	   int val = s.pop();
	   sort(s);
	   sortedInsert(s, val);
	   return s;
	}

    public static void main(String args[]){

    }
}