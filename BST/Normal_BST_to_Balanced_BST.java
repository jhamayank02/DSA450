class Normal_BST_to_Balanced_BST{
    
    void findInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        
        findInorder(root.left, inorder);
        inorder.add(root.data);
        findInorder(root.right, inorder);
    }
    
    Node inorderToBST(ArrayList<Integer> inorder, int s, int e){
        if(s>e){
            return null;
        }
        
        int mid = (s+e)/2;
        int midElem = inorder.get(mid);
        Node root = new Node(midElem);
        
        root.left = inorderToBST(inorder, s, mid-1);
        root.right = inorderToBST(inorder, mid+1, e);
        
        return root;
    }
    
    // Time complexity O(n) || Space complexity O(n)
    Node buildBalancedTree(Node root) 
    {
        ArrayList<Integer> inorder = new ArrayList<>();
        findInorder(root, inorder);
        
        return inorderToBST(inorder, 0, inorder.size()-1);
    }

    public static void main(String[] args) {
        
    }
}
