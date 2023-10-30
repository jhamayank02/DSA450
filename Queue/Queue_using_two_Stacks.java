import java.util.Stack;

class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    //Function to push an element in queue by using 2 stacks.
    // Time complexity O(1) || Space complexity O(1)
    void Push(int x)
    {
	   s1.push(x);
    }
	
    
    //Function to pop an element from queue by using 2 stacks.
    // Time complexity O(n) || Space complexity O(1)
    int Pop()
    {
	   if(s1.isEmpty()){
	       return -1;
	   }
	   
	   while(s1.size() > 1){
	       int top = s1.pop();
	       s2.push(top);
	   }
	   
	   int poppedElem = s1.pop();
	   
	   while(s2.size() > 0){
	       int top = s2.pop();
	       s1.add(top);
	   }
	   
	   return poppedElem;
    }
}

class Queue_using_two_Stacks{
    public static void main(String args[]){

    }
}