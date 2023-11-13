class Delete_Node_in_a_BST{
    
    // Time complexity O(n) || Space complexity O(n)
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }

        if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else{
            // No child
            if(root.left == null && root.right == null){
                return null;
            }
            // Single child
            else if(root.left != null && root.right == null){
                return root.left;
            }
            else if(root.left == null && root.right != null){
                return root.right;
            }
            // Two child
            else{
                // Find inorder predecessor
                TreeNode temp = root.right;
                TreeNode pred;

                while(temp != null && temp.left != null){
                    temp = temp.left;
                }

                pred = temp;
                root.val = pred.val;
                root.right = deleteNode(root.right, pred.val);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        
    }
}
