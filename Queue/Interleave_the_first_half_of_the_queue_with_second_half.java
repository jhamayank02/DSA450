import java.util.Queue;
import java.util.LinkedList;

class Interleave_the_first_half_of_the_queue_with_second_half{

    public static void solve(Queue<Integer> q){
        // Using array
        // Time complexity O(n) || Space complexity O(n)
        int half = q.size()/2;
        int size = q.size();
        int firstHalf[] = new int[half];
        int secondHalf[] = new int[half+1]; // 1 extra for cases where q size is odd

        for(int i=1; i<=half; i++){
            firstHalf[i-1] = q.poll();
        }

        int j = 0;
        while(!q.isEmpty()){
            secondHalf[j] = q.poll();
            j++;
        }

        int i = 0;
        j = 0;
        while(q.size() != size){
            if(i+1<=half){
                q.add(firstHalf[i]);
                i++;
            }

            if(q.size() == size){
                break;
            }
            q.add(secondHalf[j]);
            j++;
        }


        // Using Queue
        // Time complexity O(n) || Space complexity O(n/2)
        // if(q.size() <= 1){
        //     return;
        // }

        // int half = q.size()/2;

        // Queue<Integer> temp_q = new LinkedList<>();
        
        // for(int i=1; i<=half; i++){
        //     temp_q.add(q.poll());
        // }

        // while(!temp_q.isEmpty()){
        //     q.add(temp_q.poll());
        //     q.add(q.peek());
        //     q.poll();
        // }
    }

    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(6);

        System.out.println(q);
        solve(q);
        System.out.println(q);
    }
}