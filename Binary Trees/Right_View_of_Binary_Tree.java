import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Right_View_of_Binary_Tree{
    void findRightView(TreeNode root, int level, List<Integer> rightView){
        if(root == null){
            return;
        }

        if(level == rightView.size()){
            rightView.add(root.val);
        }

        findRightView(root.right, level+1, rightView);
        findRightView(root.left, level+1, rightView);
    }

    public List<Integer> rightSideView(TreeNode root) {
        // Recursive Solution - Using Level Order Traversal
        // Time complexity O(n) || Space complexity O(n)
        // List<Integer> rightView = new ArrayList<Integer>();

        // findRightView(root, 0, rightView);

        // return rightView;

        // Iterative Solution - Using Level Order Traversal
        // Time complexity O(n) || Space complexity O(n)
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> rightView = new ArrayList<Integer>();
        if(root == null){
            return rightView;
        }
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();

                if(i==0){
                    rightView.add(curr.val);
                }

                if(curr.right != null){
                    q.add(curr.right);
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
            }
        }

        return rightView;
    }

    public static void main(String[] args) {
        
    }
}
