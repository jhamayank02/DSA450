import java.util.Queue;
import java.util.LinkedList;

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    //Function to push an element into stack using two queues.
    // Time complexity O(1) || Space complexity O(1)
    void push(int a)
    {
	    q1.add(a);
    }
    
    //Function to pop an element from stack using two queues. 
    // Time complexity O(n) || Space complexity O(1)
    int pop()
    {
        if(q1.size() == 0){
            return -1;
        }
        
	    while(q1.size() > 1){
	        q2.add(q1.poll());
	    }
	    int poppedElem = q1.poll();
	    while(q2.size() > 0){
	        q1.add(q2.poll());
	    }
    } 
}

class Stack_using_two_queues{
    public static void main(String args[]){

    }
}