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
        }
        else{
            System.out.println("Stack Overflow");
        }
    }

    int pop(){
        if(!isEmpty()){
            int elem = arr[top];
            top--;
            return elem;
        }
        else{
            System.out.println("Stack Underflow");
            return -1;
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

class Design_a_stack_with_find_middle_operation{
    // Time complexity O(n/2) || Spce complexity O(n/2)
    static int findMiddle(Stack st, int size){
        if(size == 0){
            return -1;
        }

        int mid = size%2 == 0 ? size/2 : (size/2) + 1;

        int arr[] = new int[mid+1];
        int ind = 1;

        while(ind <= mid){
            int elem = st.pop();
            arr[ind] = elem;
            ind++;
        }

        ind--;
        int middleElement = arr[ind];

        while(ind >= 1){
            st.push(arr[ind]);
            ind--;
        }

        return middleElement;
    }

    public static void main(String args[]){
        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(findMiddle(st, st.size));
    }
}