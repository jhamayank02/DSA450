class Topological_sort {
    static int ind = 0;
    
    public static void dfs(int v, ArrayList<ArrayList<Integer>> adj, boolean visited[], int topo_sort[]){
        
        if(visited[v] == true){
            return;
        }
        visited[v] = true;
        
        for(int nbr : adj.get(v)){
            if(!visited[nbr]){
                dfs(nbr, adj, visited, topo_sort);
                topo_sort[ind] = nbr;
                ind--;
            }
        }
        
    }
    
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        // Using DFS
        // Time complexity O() || Space complexity O()
        boolean visited[] = new boolean[V];
        int topo_sort[] = new int[V];
        ind = V-1;
        
        for(int i=0; i<V; i++){
            if(!visited[i]){
                dfs(i, adj, visited, topo_sort);
                topo_sort[ind] = i;
                ind--;
            }
        }
        
        return topo_sort;
    }
    
    public static void main(String[] args) {
        
    }
}
