import java.util.Deque;
import java.util.ArrayDeque;

class Implement_Stack_and_Queue_using_Deque{

    static class Stack{
        Deque<Integer> deque = new ArrayDeque<>();

        // Time complexity O(1) || Space complexity O(1)
        int pop(){
            if(deque.size() == 0){
                return -1;
            }
            return deque.removeLast();
        }

        // Time complexity O(1) || Space complexity O(1)
        void push(int x){
            deque.addLast(x);
        }
    }

    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}