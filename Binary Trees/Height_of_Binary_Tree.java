class Heightof_Binary_Tree{
    // Using Recursion
    // Time complexity O(n) || Space complexity O(height of the tree)
    int height(Node node) 
    {
        if(node == null){
            return 0;
        }
        
        int left_height = height(node.left);
        int right_height = height(node.right);
        
        return 1 + Math.max(left_height, right_height);
    }
}
