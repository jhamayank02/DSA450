class Postorder_Traversal{
    
    void findPostorder(TreeNode root, List<Integer> postorder){
        if(root == null){
            return;
        }

        findPostorder(root.left, postorder);
        findPostorder(root.right, postorder);
        postorder.add(root.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // List<Integer> postorder = new ArrayList<Integer>();

        // findPostorder(root, postorder);

        // return postorder;

        // Using Iteration
        // Time complexity O(n) || Space complexity O(n)
        List<Integer> postorder = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode temp = root;
        st.push(null);
        // st.push(temp);

        while(temp != null || st.size() > 0){
            
            if(temp == null)

            if(temp.right != null){
                st.push(temp.right);
            }

            st.push(temp);

            temp = temp.left;
        }

        return postorder;
    }

    public static void main(String[] args) {
        
    }
}
