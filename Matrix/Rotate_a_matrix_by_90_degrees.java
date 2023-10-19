class Rotate_a_matrix_by_90_degrees{

    public static void reverse_row(int arr[], int n){
        int s = 0;
        int e = n-1;

        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotate(int arr[][], int N){

        // Reverse all the rows
        for(int r=0; r<N; r++){
            reverse_row(arr[r], N);
        }

        // Do the swappings
        int r = 0;
        int c = N-1;

        for(r=0; r<N-1; r++){
          for(c=1; c<N; c++){
            System.out.println(r + "," + c + " <-> " + c + "," + r);
          }  
        }
        
        
    }

    public static void main(String args[]){
        // int arr[][] = {{1,2},
        //                {3,4}};
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        rotate(arr, arr.length);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}