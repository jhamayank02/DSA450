class CircularQueue{
    int size;
    public int front, rear;
    int arr[];

    CircularQueue(int size){
        this.size = size;
        front =  -1;
        rear = -1;
        arr = new int[size];
    }

    // Time complexity O(1) || Space complexity O(1)
    boolean isFull(){
        if((front == 0 && rear == size-1) || (rear == (front-1) % (size-1))){
            return true;
        }
        return false;
    }

    // Time complexity O(1) || Space complexity O(1)
    boolean isEmpty(){
        if(front == -1 && rear == -1){
            return true;
        }
        return false;
    }

    // Time complexity O(1) || Space complexity O(1)
    void enqueue(int x){
        if(isFull()){
            return;
        }

        if(front == -1 && rear == -1){
            front = rear = 0;
        }
        // else if(rear == size-1){
        //     rear = 0;
        // }
        // else{
        //     rear = rear+1;
        // }
        else{
            rear = (rear+1)%size;
        }
        arr[rear] = x;
    }

    // Time complexity O(1) || Space complexity O(1)
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow!!!");
            return;
        }

        int poppedElem = arr[front];
        if(front == rear){
            front = rear = -1;
        }
        // else if(front == size-1){
        //     front = 0;
        // }
        // else{
        //     front = front+1;
        // }
        else{
            front = (front+1)%size;
        }

        System.out.println(poppedElem);
    }

    // Time complexity O(n) || Space complexity O(1)
    void printQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!");
            return;
        }

        if(rear >= front){
            for(int i = front; i <= rear; i++)
            {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
 
        else{
            for(int i = front; i < size; i++)
            {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
    
            for(int i = 0; i <= rear; i++)
            {
                System.out.print(arr[i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Implement_a_Circular_Queue{
    public static void main(String args[]){
        CircularQueue q = new CircularQueue(5);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.printQueue();

        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(9);
        q.printQueue();
        q.dequeue();
        q.enqueue(9);
        q.printQueue();
    }
}