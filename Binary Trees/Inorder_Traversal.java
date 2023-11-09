public class Inorder_Traversal {

    public void inorder(TreeNode root, List<Integer> inorderArr){
        if(root == null){
            return;
        }

        inorder(root.left, inorderArr);
        inorderArr.add(root.val);
        inorder(root.right, inorderArr);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        // Using Recursion
        // Time complexity O(n) || Space complexity O(n)
        // List<Integer> inorderArr = new ArrayList<Integer>();

        // inorder(root, inorderArr);

        // return inorderArr;

        
        // Using Iteration
        // Time complexity O(n) || Space complexity O(n)
        List<Integer> inorderArr = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode temp = root;

        while(temp != null || st.size() > 0){            
            
            while(temp != null){
                st.push(temp);
                temp = temp.left;
            }

            temp = st.pop();
            inorderArr.add(temp.val);

            temp = temp.right;
        }

        return inorderArr;
    }

    public static void main(String[] args) {
        
    }
}
