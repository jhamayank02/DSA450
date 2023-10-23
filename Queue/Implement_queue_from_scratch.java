// For enqueue(), dequeue(), isFull(), isEmpty()
// Time complexity O(1) || Space complexity O(1)

// For printQueue()
// Time complexity O(n) || Space complexity O(1)
class Queue{
    int size;
    int arr[];
    int front, rear;

    Queue(int size){
        this.size = size;
        arr = new int[size];
        front = rear = -1;
    }

    boolean isFull(){
        return rear >= size-1 ? true : false;
    }

    boolean isEmpty(){
        return front < 0 ? true : false;
    }

    void enqueue(int elem){
        if(!isFull()){
            if(front == -1){
                front = rear = 0;
            }
            else{
                rear++;
            }
            arr[rear] = elem;
        }
        else{
            System.out.println("Queue Overflow");
        }
    }

    void dequeue(){
        if(!isEmpty()){
            if(front == size-1){
                front = rear = -1;
            }
            else{
                front++;
            }
        }
        else{
            System.out.println("Queue Underflow");
        }
    }

    void printQueue(){
        if(isEmpty()){
            return;
        }
        for(int i=front; i<=rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class Implement_queue_from_scratch{
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.printQueue();
        q.dequeue();
        q.dequeue();
        q.printQueue();
        q.enqueue(6);
    }
}