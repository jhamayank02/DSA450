import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

class Left_View_of_Binary_Tree{

    void solve(Node root, int level, ArrayList<Integer> leftViewArr){
        if(root == null){
            return;
        }
        
        if(level == leftViewArr.size()){
            leftViewArr.add(root.data);
        }
        
        solve(root.left, level+1, leftViewArr);
        solve(root.right, level+1, leftViewArr);
    }
    
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        
        // Recursive Solution - Using Level Order Traversal
        // Time complexity O(n) || Space complexity O(n)
        // ArrayList<Integer> leftViewArr = new ArrayList<>();
        
        // solve(root, 0, leftViewArr);
        
        // return leftViewArr;
        
        
        // Iterative Solution - Using Level Order Traversal
        // Time complexity O(n) || Space complexity O(n)
        ArrayList<Integer> leftViewArr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root == null){
            return leftViewArr;
        }
        q.add(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                Node front = q.poll();
                
                // Current level's first node
                if(i==0){
                    leftViewArr.add(front.data);
                }
                
                if(front.left != null){
                    q.add(front.left);
                }
                if(front.right != null){
                    q.add(front.right);
                }
            }
        }
        
        return leftViewArr;
    }
    
    public static void main(String[] args) {
        
    }
}
