class Sorted_matrix{

    int[][] sortedMatrix(int N, int Mat[][]) {
        // Time complexity O(N^2 + N^2logN^2) || Space complexity O(2N^2)
        int arr[] = new int[N*N];
        
        int ind = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                arr[ind] = Mat[i][j];
                ind++;
            }
        }
        
        Arrays.sort(arr);
        
        int ans[][] = new int[N][N];
        ind = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                ans[i][j] = arr[ind];
                ind++;
            }
        }
        
        return ans;
    }

    public static void main(String args[]){

    }
}