import java.util.Arrays;

// Time complexity O(1) || Space complexity O(n+k)
class Stack{
    int arr[];
    int top[];
    int next[];
    int freeSpot;

    Stack(int n, int k){
        freeSpot = 0;
        arr = new int[n];
        next = new int[n];
        top = new int[k];

        // Initialize top array
        Arrays.fill(top, -1);

        // Initialize next array
        for(int i=0; i<n-1; i++){
            next[i] = i+1;
        }
        next[n-1] = -1;
    }

    int push(int x, int m){
        int index = freeSpot;

        if(freeSpot == -1){
            return -1;
        }

        freeSpot = next[index];
        arr[index] = x;
        next[index] = top[m-1];
        top[m-1] = index;

        return index;
    }

    int pop(int m){
        if(top[m-1] == -1){
            return -1;
        }
        int index = top[m-1];
        top[m-1] = next[index];
        next[index] = freeSpot;
        freeSpot = index;

        return arr[index];
    }
}

class Implement_k_stacks_in_a_single_array{
    public static void main(String args[]){
        Stack st = new Stack(6, 3);

        System.out.println(st.push(10,1));
        System.out.println(st.push(20,1));
        System.out.println(st.push(30,2));
        System.out.println(st.pop(1));
        System.out.println(st.pop(2));
    }
}