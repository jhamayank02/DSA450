class Flood_Fill {
    public void solve(int image[][], int m, int n, int sr, int sc, int color, int oldColor, boolean visited[][]){
        if(sr < 0 || sr >= m || sc < 0 || sc >= n || visited[sr][sc] == true){
            return;
        }
        visited[sr][sc] = true;

        if(image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc] = color;

        int dx[] = {0,0,-1,1};
        int dy[] = {-1,1,0,0};

        for(int i=0; i<4; i++){
            int nx = sr + dx[i];
            int ny = sc + dy[i];

            solve(image, m, n, nx, ny, color, oldColor, visited);
        }
    }

    class Cell{
        int r, c;

        Cell(int r, int c){
            this.r = r;
            this.c = c;
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        

        // Using DFS
        // Time complexity O() || Space complexity O()
        // int m = image.length;
        // int n = image[0].length;
        // int oldColor = image[sr][sc];
        // boolean visited[][] = new boolean[m][n];
        // for(boolean arr[] : visited){
        //     Arrays.fill(arr, false);
        // }

        // solve(image, m, n, sr, sc, color, oldColor, visited);

        // return image;



        // Using BFS
        // Time complexity O() || Space complexity O()
        int m = image.length;
        int n = image[0].length;
        int oldColor = image[sr][sc];
        Queue<Cell> q = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        for(boolean arr[] : visited){
            Arrays.fill(arr, false);
        }
        
        q.add(new Cell(sr, sc));
        while(!q.isEmpty()){

            Cell curr = q.poll();
            int curr_x = curr.r;
            int curr_y = curr.c;
            image[curr_x][curr_y] = color;

            int dx[] = {0,0,-1,1};
            int dy[] = {-1,1,0,0};

            for(int i=0; i<4; i++){
                int nx = curr_x + dx[i];
                int ny = curr_y + dy[i];
                
                if(nx >= 0 && nx < m && ny >= 0 && ny < n && visited[nx][ny] == false && image[nx][ny] == oldColor){
                    visited[nx][ny] = true;
                    q.add(new Cell(nx, ny));
                }
            }
        }

        return image;
    }

    public static void main(String[] args) {
        
    }    
}
