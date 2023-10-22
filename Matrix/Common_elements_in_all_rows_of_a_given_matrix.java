import java.util.ArrayList;
import java.util.HashMap;

class Common_elements_in_all_rows_of_a_given_matrix{

    public static ArrayList<Integer> findCommon(int arr[][], int rows, int cols){
        // Bruteforce Approach -> Using Map
        // Time complexity O(m*n) || Space complexity O(n)

        ArrayList<Integer> list = new ArrayList<>();
        // Add a element single time for one row (Don't add duplicates)
        // If any element will contain the frequency equal to the no. of rows (1 for each row) then add that in the common list
        HashMap<Integer, Integer> firstRow = new HashMap<>();

        for(int i=0; i<cols; i++){
            int elem = arr[0][i];

            if(!firstRow.containsKey(elem)){
                firstRow.put(elem, 1);
            }
        }

        for(int r=1; r<rows; r++){
            for(int c=0; c<cols; c++){
                int elem = arr[r][c];

                if(firstRow.containsKey(elem) && firstRow.get(elem) < r){
                    firstRow.put(elem, firstRow.get(elem)+1);
                }
            }
        }

        for(Integer key : firstRow.keySet()){
            if(firstRow.get(key) == rows-1){
                list.add(key);
            }
        }

        return list;
    }

    public static void main(String args[]){
        int arr[][] = {{1,2,1,4,8},
                       {3,7,8,5,1},
                       {8,7,7,3,1},
                       {8,1,2,7,9}};

        ArrayList<Integer> ans = findCommon(arr, arr.length, arr[0].length);
        System.out.println(ans);
    }
}