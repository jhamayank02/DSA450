import java.util.Stack;

class Design_a_Stack_that_supports_getMin{

    // Time complexity O(1) || Space complexity O(1)
    int mini = Integer.MAX_VALUE;
	public void push(int a,Stack<Integer> s)
	{
	    if(s.isEmpty()){
	        mini = a;
	        s.push(a);
	    }
	    else if(a < mini){
	        int val = 2*a - mini;
	        mini = a;
	        s.push(val);
	    }
	    else{
	        s.push(a);
	    }
	    
	}
	public int pop(Stack<Integer> s)
        {
            if(s.isEmpty()){
                return -1;
            }
            else if(s.peek() < mini){
                int val = 2*mini - s.peek();
                mini = val;
                return val;
            }
            else{
                return s.pop();
            }
	}
	public int min(Stack<Integer> s)
        {
            if(s.isEmpty()){
                return -1;
            }
           return mini;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           return s.isEmpty();
	}

    public static void main(String args[]){

    }
}