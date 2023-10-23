// For push(), pop(), peek(), isFull(), isEmpty()
// Time complexity O(1) || Space complexity O(1)
class Stack{
    int top;
    int arr[];
    int size;

    Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    boolean isFull(){
        return top >= size-1 ? true : false;
    }

    boolean isEmpty(){
        return top < 0 ? true : false;
    }

    void push(int elem){
        if(!isFull()){
            top++;
            arr[top] = elem;
            System.out.println("Pushed " + elem);
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    void pop(){
        if(!isEmpty()){
            int elem = arr[top];
            top--;
            System.out.println("Popped " + elem);
        }
        else{
            System.out.println("Stack Underflow");
        }
    }

    void peek(){
        if(!isEmpty()){
            int elem = arr[top];
            System.out.println(elem);
        }
        else{
            System.out.println("Stack Underflow");
        }
    }
}

class Implement_stack_from_scratch{

    public static void main(String args[]){
        Stack st = new Stack(5);
        st.pop();
        st.push(1);
        st.push(2);
        st.peek();
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.pop();
        st.peek();
    }
}