class Check_for_BST{
    class Pair{
        int min;
        int max;
        
        Pair(int min, int max){
            this.min = min;
            this.max = max;
        }
    }
    
    boolean checkBST(Node root, Pair range){
        if(root == null){
            return true;
        }
        
        if(root.data < range.max && root.data > range.min){
            boolean left = checkBST(root.left, new Pair(range.min, root.data));
            boolean right = checkBST(root.right, new Pair(root.data, range.max));
            
            return left && right;
        }
        
        return false;
    }
    
    // Time complexity O(n) || Space complexity O(n)
    boolean isBST(Node root)
    {
        return checkBST(root, new Pair(Integer.MIN_VALUE, Integer.MAX_VALUE));
    }

    public static void main(String[] args) {
        
    }
}
