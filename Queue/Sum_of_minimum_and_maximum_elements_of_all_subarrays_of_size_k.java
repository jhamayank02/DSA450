import java.util.LinkedList;
import java.util.Queue;

class Sum_of_minimum_and_maximum_elements_of_all_subarrays_of_size_k{
 
    public static int solve(int arr[], int n, int k){
        Queue<Integer> min_q = new LinkedList<>();
        Queue<Integer> max_q = new LinkedList<>();
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            if(min > arr[i]){
                min = arr[i];
                if(min_q.size() > 0){
                    min_q.poll();
                }
                min_q.add(i);
            }
            if(max < arr[i]){
                max = arr[i];
                if(max_q.size() > 0){
                    max_q.poll();
                }
                max_q.add(i);
            }
        }

        for(int i=1; i<n; i++){
            System.out.println("min q " + min_q);
            System.out.println("max q " + max_q);
            System.out.println("---------------------");
            
            while(!min_q.isEmpty() && ((min_q.peek() < i-k+1) || (arr[min_q.peek()] > arr[i]))){
                min_q.poll();
            }
            min_q.add(i);
            
            while(!max_q.isEmpty() && ((max_q.peek() < i-k+1) || (arr[max_q.peek()] < arr[i]))){
                max_q.poll();
            }
            max_q.add(i);
            sum += (min_q.peek() + max_q.peek());
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = {2,5,-1,7,-3,-1,-2};

        System.out.println(solve(arr, arr.length, 4));
    }
}
