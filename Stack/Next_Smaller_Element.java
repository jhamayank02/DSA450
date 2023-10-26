import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

class Next_Smaller_Element{

    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){

        // Bruteforce approach -> Using 2 nested loops
        // Time complexity O(n^2) || Space complexity O(n)
        // ArrayList<Integer> ans = new ArrayList<>();
        
        // for(int i=0; i<n; i++){
        //     boolean flag = false;
        //     for(int j=i+1; j<n; j++){
        //         if(arr.get(i) > arr.get(j)){
        //             flag = true;
        //             ans.add(arr.get(j));
        //             break;
        //         }
        //     }

        //     if(flag == false){
        //         ans.add(-1);
        //     }
        // }

        // return ans;


        // Using stack
        // Time complexity O(n) || Space complexity O(n)
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=n-1; i>=0; i--){
            int current = arr.get(i);

            if(st.isEmpty()){
                ans.add(-1);
                st.push(current);
            }
            else if(!st.isEmpty() && (st.peek() < current)){
                ans.add(st.peek());
                st.push(current);
            }
            else{
                while(!st.isEmpty() && (st.peek() >= current)){
                    st.pop();
                }
                if(st.isEmpty()){
                    ans.add(-1);
                }
                else{
                    ans.add(st.peek());
                }
                st.push(current);
            }
        }

        Collections.reverse(ans);
        return ans;
    }

    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(1);

        System.out.println(nextSmallerElement(arr, arr.size()));
    }
}