public class Kth_largest_element_in_BST {
    
    int k;
    
    int solve(Node root){
        if(root == null){
            return -1;
        }
        
        int right = solve(root.right);
        if(right != -1){
            return right;
        }
        
        k--;
        if(k == 0){
            return root.data;
        }
        
        int left = solve(root.left);
        if(left != -1){
            return left;
        }
        
        return -1;
    }
    
    Node findSuccessor(Node root){
        Node succ = root.right;
        
        while(succ != null && succ.left != root && succ.left != null){
            succ = succ.left;
        }
        
        return succ;
    }
    
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        // Using reverse inorder traversal
        // Time complexity O(n) || Space complexity O(n)
        // k = K;
        
        // return solve(root);
        
        
        // Using morris reverse inorder traversal
        // Time complexity O(n) || Space complexity O(1)
        Node curr = root;
        
        while(curr != null){
            if(curr.right == null){
                K--;
                if(K == 0){
                    return curr.data;
                }
                curr = curr.left;
            }
            else{
                Node succ = findSuccessor(curr);
                if(succ.left == null){
                    succ.left = curr;
                    curr = curr.right;
                }
                else{
                    K--;
                    if(K == 0){
                        return curr.data;
                    }
                    succ.left = null;
                    curr = curr.left;
                }
            }
        }
        
        return -1;
                    
    }

    public static void main(String[] args) {
        
    }
}
