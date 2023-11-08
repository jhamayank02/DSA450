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

        List<Integer> inorderArr = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode temp = root;
        st.push(temp);

        while(temp != null){
            if(temp.left == null){
                temp = st.pop();
                inorderArr.add(temp.val);

                if(temp.right != null){
                    temp = temp.right;
                    st.push(temp);
                }
                else if(!st.isEmpty()){
                    temp = st.pop();
                }
                else{
                    break;
                }
            }
            else{
                temp = temp.left;
                st.push(temp);
            }
        }

        return inorderArr;
    }

    public static void main(String[] args) {
        
    }
}
