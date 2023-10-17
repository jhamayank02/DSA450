class Search_a_2D_Matrix{
    
    // Time complexity O(m+n) || Space complexity O(1)
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Find the row in which the element can be present
        int possibleRow = -1;

        for(int i=0; i<rows; i++){
            if(target <= matrix[i][cols-1]){
                possibleRow = i;
                break;
            }
        }
        if(possibleRow == -1){
            possibleRow = rows-1;
        }

        // Find the element in the possible row
        for(int i=0; i<cols; i++){
            if(target == matrix[possibleRow][i]){
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]){

    }
}