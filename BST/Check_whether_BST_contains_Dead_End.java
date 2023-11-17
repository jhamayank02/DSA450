class Check_whether_BST_contains_Dead_End{
    static class Pair{
        int min, max;
        
        Pair(int min, int max){
            this.min = min;
            this.max = max;
        }
    }
    
    static boolean solve(Node root, Pair p){
        if(root == null){
            return false;
        }
        if(p.min == p.max){
            return true;
        }
        
        boolean left = solve(root.left, new Pair(p.min, root.data-1));
        boolean right = solve(root.right, new Pair(root.data+1, p.max));
        
        return left || right;
    }
    
    public static boolean isDeadEnd(Node root)
    {
        // Time complexity O(n) || Space complexity O(n)
        return solve(root, new Pair(1, Integer.MAX_VALUE));
    }

    public static void main(String[] args) {
        
    }
}
