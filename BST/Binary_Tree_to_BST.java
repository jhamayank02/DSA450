class Binary_Tree_to_BST{
    
    void findInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        
        findInorder(root.left, inorder);
        inorder.add(root.data);
        findInorder(root.right, inorder);
    }
    
    void replace(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        
        replace(root.left, inorder);
        
        int n = inorder.size();
        root.data = inorder.get(n-1);
        inorder.remove(n-1);
        
        replace(root.right, inorder);
    }
    
    // Using Inorder Traversal
    // Time complexity O(nlogn) || Space complexity O(n)
    Node binaryTreeToBST(Node root)
    {
       ArrayList<Integer> inorder = new ArrayList<>();
       
       findInorder(root, inorder);
       
       Collections.sort(inorder, Collections.reverseOrder());
       
       replace(root, inorder);
       
       return root;
    }

    public static void main(String[] args) {
        
    }
}
