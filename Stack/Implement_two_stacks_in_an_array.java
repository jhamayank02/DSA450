// For push1(), pop1(), push2(), pop2()
// Time complexity O(1) || Space complexity O(1)
class twoStacks
{
    int arr[];
    int size;
    int top1, top2;
    twoStacks()
    {
        size = 100; 
        arr = new int[100]; 
        top1 = -1; 
        top2 = size;
    }
    //Function to push an integer into the stack1.
    void push1(int x)
    {
     if(top1 < top2 - 1){
         top1++;
         arr[top1] = x;
     }
    }
    //Function to push an integer into the stack2.
    void push2(int x)
    {
        if(top2 > top1 - 1){
            top2--;
            arr[top2] = x;
        }
    }
    //Function to remove an element from top of the stack1.
    int pop1()
    {   
        int popped = -1;
        if(top1 >= 0){
            popped = arr[top1];
            top1--;
        }
        
        return popped;
    }
    //Function to remove an element from top of the stack2.
    int pop2()
    {   
        int popped = -1;
        if(top2 <= size-1){
            popped = arr[top2];
            top2++;
        }
        
        return popped;
    }
}

class Implement_two_stacks_in_an_array{

    public static void main(String args[]){

    }
}