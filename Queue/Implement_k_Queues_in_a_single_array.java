class N_Queue{
    int n;
    int k;
    int free;
    int front[];
    int rear[];
    int next[];
    int arr[];

    N_Queue(int n, int k){
        this.n = n;
        this.k = k;
        free = 0;
        front = new int[k];
        rear = new int[k];
        next = new int[n];
        arr = new int[n];

        // Initialize front and rear array
        for(int i=0; i<k; i++){
            front[i] = rear[i] = -1;
        }

        // Initialize next array
        for(int i=0; i<n-1; i++){
            next[i] = i+1;
        }
        next[n-1] = -1;
    }

    // Time complexity O(1) || Space complexity O(1)
    void enqueue(int elem, int q){
        if(free == -1){
            System.out.println("Queue Overflow");
            return;
        }

        // If queue is empty
        if(front[q] == -1 && rear[q] == -1){
            front[q] = free;
            rear[q] = free;
        }
        else{
            next[rear[q]] = free;
            rear[q] = free;
        }

        arr[free] = elem;
        free = next[free];
    }

    // Time complexity O(1) || Space complexity O(1)
    void deque(int q){
        if(front[q] == -1){
            System.out.println("Queue Underflow");
            return;
        }

        // If queue contains one element
        if(front[q] == rear[q]){
            next[front[q]] = free;
            free = front[q];
            front[q] = rear[q] = -1;
        }

        // Else
        else{
            int nextFree = front[q];
            int prevFront = front[q];
            front[q] = next[front[q]];
            next[prevFront] = free;
            free = nextFree;
        }
    }
}

class Implement_k_Queues_in_a_single_array{
    public static void main(String args[]){
        N_Queue q = new N_Queue(6, 3);

        q.enqueue(1,0);
        q.enqueue(2,0);
        q.enqueue(3,0);
        q.enqueue(45,1);
        q.enqueue(87,2);
        q.enqueue(90,2);

        q.deque(1);
        q.deque(0);
        q.deque(0);
        q.deque(0);
        q.deque(0);
        q.deque(2);
        q.deque(2);
        q.deque(2);
    }
}