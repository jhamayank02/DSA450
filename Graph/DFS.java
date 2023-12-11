class DFS{

    // Time complexity O(v+e) || Space complexity O(v)
    public ArrayList<Integer> dfs(int s, int V, ArrayList<ArrayList<Integer>> adj, boolean visited[], ArrayList<Integer> ans){
        
        visited[s] = true;
        ans.add(s);
        
        for(int adjElem : adj.get(s)){
            if(!visited[adjElem]){
                dfs(adjElem, V, adj, visited, ans);
            }
        }
        
        return ans;
    }
    
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean visited[] = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();
        
        return dfs(0, V, adj, visited, ans);
        
    }
    
    public static void main(String[] args) {
        
    }
}
