import java.util.PriorityQueue;
import java.util.Collections;

class Kth_element_in_Matrix{

    public static int countLessOrEqual(int mat[][], int x){
        int n = mat[0].length;
        int cnt = 0;
        int c = n-1;
        
        for(int r=0; r<n; r++){
            while(c>=0 && mat[r][c] > x){
                c--;
            }
            cnt += (c+1);
        }
        
        return cnt;
    }

    public static int kthSmallest(int[][]mat,int n,int k)
	{
	    // Using Max Heap
	    // Time complexity O(n^2 * logk) || Space complexity O(k)
        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // for(int r=0; r<n; r++){
        //     for(int c=0; c<n; c++){
        //         if(maxHeap.size() < k){
        //            maxHeap.add(mat[r][c]); 
        //         }
        //         else{
        //             if(mat[r][c] < maxHeap.peek()){
        //                 maxHeap.poll();
        //                 maxHeap.add(mat[r][c]);
        //             }
        //         }
        //     }
        // }
        
        // return maxHeap.peek();

        // Using Binary Search
        // Time complexity O() || Space complexity O(1)
        int min = mat[0][0];
        int max = mat[n-1][n-1];
        int ans = 0;
        
        while(min <= max){
            int mid = (min+max)/2;
            if(countLessOrEqual(mat, mid) >= k){
                ans = mid;
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        
        return ans;
    }

    public static void main(String args[]){

    }
}