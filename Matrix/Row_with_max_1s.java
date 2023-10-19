class Row_with_max_1s{

    int rowWithMax1s(int arr[][], int n, int m) {
        // Time complexity O(r*c) || Space complexity O(1)
        //   int max_one_cnt = 0;
        //   int row = -1;
          
        //   for(int r=0; r<n; r++){
        //       for(int c=0; c<m; c++){
                  
        //           if(arr[r][c] == 1){
        //               int row_one_cnt = m - c;
        //               if(row_one_cnt > max_one_cnt){
        //                   max_one_cnt = row_one_cnt;
        //                   row = r;
        //               }
        //               break;
        //           }
                  
        //       }
        //   }
          
        //   return row;
        
        
        // Time complexity O(r+c) || Space complexity O(1)
        int col = m-1;
        int row_max_ones = -1;
        for(int r=0; r<n; r++){
            
            while(col >= 0 && arr[r][col] == 1){
                col = col-1;
                row_max_ones = r;
            }
            
        }
        
        return row_max_ones;
        
    }
}

    public static void main(String args[]){

    }
}