class Spirally_traversing_a_matrix{
    
    // Time complexity O(r*c) || Space complexity O(1)
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int left = 0, right = c-1, top = 0, bottom = r-1;
        
        while(left <= right && top <= bottom){
            
            // Top Row
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            
            // Right Col
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            
            // Bottom Row
            if(top <= bottom){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            // Left Col
            if(left <= right){
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return ans;
    }

    public static void main(String args[]){

    }
}