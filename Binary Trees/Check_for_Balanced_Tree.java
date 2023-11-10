class Check_for_Balanced_Tree{
    class Pair{
        int height;
        boolean balanced;
        
        Pair(int h, boolean b){
            height = h;
            balanced = b;
        }
    }
    
    Pair checkBalanced(Node root){
        if(root == null){
            return new Pair(0, true);
        }
        
        Pair left = checkBalanced(root.left);
        Pair right = checkBalanced(root.right);
        
        int heightDiff = Math.abs(left.height - right.height);
        int maxHeight = left.height > right.height ? left.height : right.height;
        
        if(left.balanced == true && right.balanced == true){
            if(heightDiff <= 1){
                return new Pair(maxHeight+1, true);
            }
        }
        
        return new Pair(maxHeight+1, false);
    }
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {   
        // Recursive solution
        // Time complexity O(n) || Space complexity O(n)
	    return checkBalanced(root).balanced;
    }
}
