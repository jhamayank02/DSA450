class Preorder_Traversal{
    
    void findPreorder(TreeNode root, List<Integer> preorder){
        if(root == null){
            return;
        }

        preorder.add(root.val);
        findPreorder(root.left, preorder);
        findPreorder(root.right, preorder);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // List<Integer> preorder = new ArrayList<Integer>();

        // findPreorder(root, preorder);

        // return preorder;


        // Using Iteration
        // Time complexity O(n) || Space complexity O(n)
        List<Integer> preorder = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode temp = root;
        st.push(null);

        while(temp != null){
            preorder.add(temp.val);

            if(temp.right != null){
                st.push(temp.right);
            }
            if(temp.left != null){
                temp = temp.left;
            }
            else{
                temp = st.pop();
            }
        }

        return preorder;
    }

    public static void main(String[] args) {
        
    }
}
