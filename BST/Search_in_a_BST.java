public class Search_in_a_BST {
    
    // Time complexity O(n) || Space complexity O(n)
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        if(val < root.val){
            return searchBST(root.left, val);
        }
        else if(val > root.val){
            return searchBST(root.right, val);
        }
        else{
            return root;
        }
    }

    public static void main(String[] args) {
        
    }
}
