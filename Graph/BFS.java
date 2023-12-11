class BFS {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[V];
        q.add(0);
        visited[0] = true;
        
        // for(int i=0; i<V; i++){
        // Time complexity O(E+V) || Space complexity O(V)
           while(!q.isEmpty()) {
               int front = q.poll();
               bfs.add(front);
               
               for(int adjElem : adj.get(front)){
                   if(visited[adjElem] == false){
                       q.add(adjElem);
                       visited[adjElem] = true;
                   }
               }
           }
        // }
        
        
        return bfs;
    }
    
    public static void main(String[] args) {
        
    }
}
