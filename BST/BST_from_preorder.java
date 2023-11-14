class BST_from_preorder{
    
    int findNextGreater(int arr[], int i, int j, int val){
        for(int k=i; k<=j; k++){
            if(arr[k] > val){
                return k;
            }
        }

        return j+1;
    }

    TreeNode constructBST(int[] preorder, int s, int e){
        if(s > e){
            return null;
        }

        int currVal = preorder[s];
        TreeNode root = new TreeNode(currVal);

        int g = findNextGreater(preorder, s+1, e, currVal);

        root.left = constructBST(preorder, s+1, g-1);
        root.right = constructBST(preorder, g, e);

        return root;
    }

    public TreeNode bstFromPreorder(int[] preorder) {
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        int n = preorder.length;
        return constructBST(preorder, 0, n-1);
    }

    public static void main(String[] args) {
        
    }
}
